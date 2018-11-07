package com.dyny.gms.service.impl;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.*;
import com.dyny.gms.db.pojo.*;
import com.dyny.gms.db.pojo.custom.StationForPage;
import com.dyny.gms.exportEntity.StationImportEntity;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.service.StationService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class StationServiceImpl extends BaseService implements StationService {
    private final Logger logger = Logger.getLogger(StationServiceImpl.class);


    //service
    @Autowired
    GeneratorService generatorService;
    @Autowired
    ContactService contactService;

    //mapper
    @Autowired
    StationMapper stationMapper;
    @Autowired
    ContactStationRelMapper contactStationRelMapper;
    @Autowired
    GeneratorMapper generatorMapper;
    @Autowired
    ContactMapper contactMapper;
    @Autowired
    GeneratorStationRelMapper generatorStationRelMapper;
    @Autowired
    CacheDao cacheDao;

    /**
     * 取消关联单位和基站,批量操作后缓存中的数据将会有问题
     * 该方法暂时没有用上
     * @param unitId
     * @param stationNo 该参数不传则认为所有该单位的基站都不再关联
     * @return
     */
    @Override
    public int disrelateStationToUnit(int unitId, String stationNo) {
        if (unitId <= 0) {
            return 0;
        }
        //.将该基站关联的联系人置空

        //.将基站的单位id置为空或0
        Station station = new Station();
        StationExample example = new StationExample();
        station.setUnitId(0);
        if (!StringUtils.isEmpty(stationNo)) {
            example.or().andUnitIdEqualTo(unitId).andStationNoEqualTo(stationNo);
        } else {
            example.or().andUnitIdEqualTo(unitId);
        }
        int result = stationMapper.updateByExampleSelective(station, example);
        return result;
    }


    @Override
    public int updateStation(Station station) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(station.getStationNo());
        example.or(criteria);
        int result = stationMapper.updateByExample(station, example);
        if (result > 0) {
            cacheDao.update(station.getStationNo(), station, Station.class);
        }
        return result;
    }

    /**
     * 根据联系人id获取基站
     *
     * @param customerNo
     * @param contactIdList
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    @Override
    public String getStationListByContactId(String customerNo, List<Integer> contactIdList, int pageNum, int pageSize, String orderBy) {
        StationExample stationExample = new StationExample();
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelExample.or().andContactIdIn(contactIdList).andDeletedEqualTo(false);
        List<ContactStationRel> contactStationRels = contactStationRelMapper.selectByExample(contactStationRelExample);
        if (contactStationRels == null || contactStationRels.size() == 0) {
            return super.getSuccessResult(null, pageNum, pageSize, 0);
        }
        List stationNos = new ArrayList();
        for (ContactStationRel temp : contactStationRels) {
            stationNos.add(temp.getStationNo());
        }
        stationExample.or().andStationNoIn(stationNos).andCustomerNoEqualTo(customerNo);
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = stationMapper.selectByExample(stationExample);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public StationForPage getStationByStationNo(String stationNo) {
        StationExample stationExample = new StationExample();
        stationExample.or().andStationNoEqualTo(stationNo);
        List<Station> result = stationMapper.selectByExample(stationExample);
        StationForPage stationForPage = null;
        if (result.size() > 0) {
            Station station = result.get(0);
            String stationStr = JSONObject.toJSONString(station);
            stationForPage = JSONObject.parseObject(stationStr, StationForPage.class);
        }
        //获取该基站关联下的联系人
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelExample.or().andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        List<ContactStationRel> contactStationRels = contactStationRelMapper.selectByExample(contactStationRelExample);
        List<Integer> contactIdList = new ArrayList<>();
        for (ContactStationRel temp : contactStationRels) {
            int contactId = temp.getContactId();
            contactIdList.add(contactId);
        }
        stationForPage.setContactIdList(contactIdList);
        return stationForPage;
    }


    /**
     * 检查基站编号是否重复
     *
     * @param stationNo
     * @return
     */
    @Override
    public long checkStationNo(String stationNo) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(stationNo);
        long cnt = stationMapper.countByExample(example);
        return cnt;
    }

    @Override
    public String getWithoutGeneratorStationList(String customerNo, int level, String searchContent, int pageNum, int pageSize, String orderBy) {
        GeneratorStationRelExample generatorStationRelExample = new GeneratorStationRelExample();
        generatorStationRelExample.or().andDeletedEqualTo(false).andStationNoIsNotNull();
        List<GeneratorStationRel> generatorStationRelList = generatorStationRelMapper.selectByExample(generatorStationRelExample);
        List<String> relatedGeneratorStationNoList = generatorStationRelList.stream().map(GeneratorStationRel::getStationNo).collect(Collectors.toList());
        StationExample stationExample = new StationExample();
        if (level >= this.ADMIN_LEVEL && StringUtils.isEmpty(customerNo)) {
            if (!StringUtils.isEmpty(searchContent)) {
                stationExample.or().andStationNoNotIn(relatedGeneratorStationNoList).andStationNoLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
                stationExample.or().andStationNoNotIn(relatedGeneratorStationNoList).andStationNameLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
                stationExample.or().andStationNoNotIn(relatedGeneratorStationNoList).andStationAddressLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
            } else {
                stationExample.or().andStationNoNotIn(relatedGeneratorStationNoList).andDeletedEqualTo(false);
            }
        } else {
            if (!StringUtils.isEmpty(searchContent)) {
                stationExample.or().andCustomerNoEqualTo(customerNo).andStationNoNotIn(relatedGeneratorStationNoList).andStationNoLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
                stationExample.or().andCustomerNoEqualTo(customerNo).andStationNoNotIn(relatedGeneratorStationNoList).andStationNameLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
                stationExample.or().andCustomerNoEqualTo(customerNo).andStationNoNotIn(relatedGeneratorStationNoList).andStationAddressLike(super.appendLike(searchContent)).andDeletedEqualTo(false);
            } else {
                stationExample.or().andCustomerNoEqualTo(customerNo).andStationNoNotIn(relatedGeneratorStationNoList).andDeletedEqualTo(false);
            }
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = stationMapper.selectByExample(stationExample);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    /**
     * 从缓存中查找基站信息,没有则直接查数据库
     *
     * @param stationNo
     * @return
     */
    @Override
    public Station getStationDataFromCache(String stationNo) {
        if (StringUtils.isEmpty(stationNo)) {
            return null;
        }
        //1.查找缓存
        Station station = cacheDao.get(stationNo, Station.class, true);
        //2.为空则查找数据库
        if (station == null) {
            station = this.getStationByStationNo(stationNo);
            if (station != null) {
                cacheDao.set(stationNo, station, Station.class);
            }
        }
        return station;
    }

    /**
     * 删除基站(逻辑删除)
     *
     * @param stationNo
     * @return
     */
    @Override
    public int deleteStationAndOtherData(String stationNo) {
        int cnt = 0;
        //1.删除联系人-基站关联表的相关记录
        cnt += this.deleteContactStationRelByStationNo(stationNo);

        //2.已关联的油机需要取消关联
        cnt += generatorService.disrelateGeneratorWithStationByStationNo(stationNo);

        //3.删除基站
//        cnt += this.logicDeleteStation(stationNo);//逻辑删除
        cnt += this.deleteStation(stationNo);//暂时使用物理删除

        return cnt;
    }


    /**
     * .删除联系人-基站关联表的相关记录
     *
     * @param stationNo
     * @return
     */
    @Override
    public int deleteContactStationRelByStationNo(String stationNo) {
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelExample.or().andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        ContactStationRel contactStationRel = new ContactStationRel();
        contactStationRel.setDeleted(true);
        return contactStationRelMapper.updateByExampleSelective(contactStationRel, contactStationRelExample);
    }

    @Override
    public int importStationFromExcelFile(File file, String customerNo) {
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        long start = new Date().getTime();
        List<StationImportEntity> importList = ExcelImportUtil.importExcel(file, StationImportEntity.class, params);
        List<String> stationNoTotal = importList.stream().map(StationImportEntity::getStationNo).collect(Collectors.toList());//java8语法
        List<Station> updateList = new ArrayList<>();
        if (stationNoTotal.size() > 0) {
            StationExample stationExample = new StationExample();
            stationExample.or().andStationNoIn(stationNoTotal).andDeletedEqualTo(false);
            updateList = stationMapper.selectByExample(stationExample);
        }
        List<Station> insertList = new ArrayList<>();
        List<String> stationNoUpdate = updateList.stream().map(Station::getStationNo).collect(Collectors.toList());//java8语法
        updateList.clear();
        for (StationImportEntity temp : importList) {
            Station station = new Station();
            station.setStationName(temp.getStationName());
            station.setStationNo(temp.getStationNo());
            station.setStationAddress(temp.getStationAddress());
            station.setRemark(temp.getRemark());
            station.setStationLatitude(temp.getStationLatitude());
            station.setStationLongitude(temp.getStationLongitude());
            station.setStationType(temp.getStationType());
            if (stationNoUpdate != null && stationNoUpdate.contains(temp.getStationNo())) {
                station.setModifyTime(new Date());
                updateList.add(station);
            } else {
                station.setDeleted(false);
                station.setCustomerNo(customerNo);
                station.setCreateTime(new Date());
                insertList.add(station);
            }
        }
        int cnt = 0;
        int updateSize = updateList.size();
        int insertSize = insertList.size();
        if (updateSize > 1) {
            int lastTimeCnt = updateSize % this.MAX_SQL_SIZE;
            int times = (updateSize / this.MAX_SQL_SIZE);
            if (lastTimeCnt > 0) {
                times++;
            }
            //因为sql长度有限制,因此需要分批插入,每次最多插入MAX_SQL_SIZE条
            for (int i = 0; i < times; i++) {
                int startIndex = i * this.MAX_SQL_SIZE;
                int endIndex = i * this.MAX_SQL_SIZE + ((times - 1) == i ? lastTimeCnt : this.MAX_SQL_SIZE);
                List temp = updateList.subList(startIndex, endIndex - 1);
                cnt += stationMapper.updateBatchByStationNo(temp);
            }
        } else if (updateSize == 1) {
            cnt += stationMapper.updateBatchByStationNo(updateList);
        }
        if (insertSize > 1) {
            int lastTimeCnt = insertSize % this.MAX_SQL_SIZE;
            int times = (insertSize / this.MAX_SQL_SIZE);
            if (lastTimeCnt > 0) {
                times++;
            }
            //因为sql长度有限制,因此需要分批插入,每次最多插入MAX_SQL_SIZE条
            for (int i = 0; i < times; i++) {
                int startIndex = i * this.MAX_SQL_SIZE;
                int endIndex = i * this.MAX_SQL_SIZE + ((times - 1) == i ? lastTimeCnt : this.MAX_SQL_SIZE);
                List temp = insertList.subList(startIndex, endIndex - 1);
                cnt += stationMapper.insertBatch(temp);
            }
        } else if (insertSize == 1) {
            cnt += stationMapper.insertBatch(insertList);
        }
        return cnt;
    }

    @Override
    public int logicDeleteStation(String stationNo) {
        Station station = new Station();
        station.setDeleted(true);
        station.setModifyTime(new Date());
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(stationNo);
        return stationMapper.updateByExampleSelective(station, example);
    }

    @Override
    public int deleteStation(String stationNo) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(stationNo);
        int result = stationMapper.deleteByExample(example);
        if (result > 0) {
            cacheDao.delete(stationNo);
        }
        return result;
    }

    @Override
    public List getStationByStationNoList(List<String> stationNoList) {
        if (stationNoList.size() == 0) {
            return null;
        }
        StationExample stationExample = new StationExample();
        stationExample.or().andStationNoIn(stationNoList);
        return stationMapper.selectByExample(stationExample);
    }


    /**
     * 根据用户编号获得基站列表,代码太臃肿,需要改善
     *
     * @param customerNo
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    @Override
    public String getStationListByUsercus(String customerNo, int level, String searchContent, int pageNum, int pageSize, String orderBy) {
        StationExample example = new StationExample();
        if (level >= this.ADMIN_LEVEL) {
            if (!StringUtils.isEmpty(searchContent)) {
                example.or().andDeletedEqualTo(false).andStationNoLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationAddressLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andRemarkLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationNameLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationLatitudeLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationLongitudeLike(super.appendLike(searchContent));
            } else {
                example.or().andDeletedEqualTo(false);
            }
        } else {
            if (!StringUtils.isEmpty(searchContent)) {
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andStationNoLike(super.appendLike(searchContent));
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andStationAddressLike(super.appendLike(searchContent));
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andRemarkLike(super.appendLike(searchContent));
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andStationNameLike(super.appendLike(searchContent));
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andStationLatitudeLike(super.appendLike(searchContent));
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false).andStationLongitudeLike(super.appendLike(searchContent));
            } else {
                example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false);
            }
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(this.getOrderByClause(orderBy));
        List result = stationMapper.selectByExample(example);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }


    private String getOrderByClause(String orderBy) {
        Map<String, String> propertyMapColumn = new HashMap<String, String>();
        propertyMapColumn.put("stationName", "s_station_name");
        propertyMapColumn.put("stationNo", "s_station_No");
        propertyMapColumn.put("stationAddress", "s_station_address");
        propertyMapColumn.put("stationLongitude", "s_station_longitude");
        propertyMapColumn.put("stationLatitude", "s_station_latitude");
        Set<String> keySet = propertyMapColumn.keySet();
        for (String temp : keySet) {
            if (orderBy.contains(temp)) {
                return orderBy.replace(temp, propertyMapColumn.get(temp));
            }
        }
        return orderBy;
    }


    /**
     * 更新基站信息
     *
     * @param station
     * @param example
     * @return
     */
    @Override
    public int updateStation(Station station, StationExample example) {
        return stationMapper.updateByExample(station, example);
    }


    /**
     * 更新基站信息
     *
     * @param station
     * @return
     */
    @Override
    public int updateStationForPage(StationForPage station) {
        String stationNo = station.getStationNo();
        List<Integer> contactIds1 = station.getContactIdList();
        List<Integer> contactIds2 = contactService.getContactByStationNo(stationNo, true);
        List<Integer> crossIdList = new ArrayList<>();
        for (Integer temp1 : contactIds1) {
            for (Integer temp2 : contactIds2) {
                if (temp1.intValue() == temp2.intValue()) {
                    crossIdList.add(temp1);
                }
            }
        }
        contactIds1.removeAll(contactIds2);//需要插入的
        contactIds2.removeAll(contactIds1);//需要删除的,同时包含无需改变的值，所以下方需要去掉无需改变的值
        //逻辑删除
        ContactStationRel contactStationRelForDelete = new ContactStationRel();
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelForDelete.setDeleted(true);
        contactStationRelForDelete.setModifyTime(new Date());
        contactIds2.removeAll(crossIdList);//去掉无需改变的值
        if (contactIds2.size() > 0) {
            contactStationRelExample.or().andStationNoEqualTo(stationNo).andContactIdIn(contactIds2).andDeletedEqualTo(false);
            contactStationRelMapper.updateByExampleSelective(contactStationRelForDelete, contactStationRelExample);
        }
        //插入
        for (Integer temp : contactIds1) {
            ContactStationRel contactStationRel = new ContactStationRel();
            contactStationRel.setContactId(temp);
            contactStationRel.setStationNo(stationNo);
            contactStationRel.setDeleted(false);
            contactStationRel.setCreateTime(new Date());
            contactStationRelMapper.insert(contactStationRel);
        }
        //更新其他信息
        return this.updateStation(station);

    }


    /**
     * 添加基站
     *
     * @param StationForPage
     * @return
     */
    @Override
    public int addStation(StationForPage stationForPage) {
        List<Integer> contactIdList = stationForPage.getContactIdList();
        stationForPage.setCreateTime(new Date());
        int cnt = stationMapper.insertSelective(stationForPage);
        int cnt2 = 0;
        if(contactIdList!=null){
            for (Integer contactId : contactIdList) {
                ContactStationRel contactStationRel = new ContactStationRel();
                contactStationRel.setContactId(contactId);
                contactStationRel.setStationNo(stationForPage.getStationNo());
                contactStationRel.setCreateTime(new Date());
                contactStationRel.setDeleted(false);
                cnt2 += contactStationRelMapper.insert(contactStationRel) > 0 ? 1 : 0;
            }
        }
        return cnt + cnt2;
    }


    /**
     * 根据条件获得基站
     * 目前只支持基站编号
     *
     * @param station
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public String getStationListByCondition(Station station, int pageNum, int pageSize) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(station.getCustomerNo());
        example.or(criteria);
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = stationMapper.selectByExample(example);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

//    @Autowired
//    RegionMapper regionMapper;
//
//    public void insertRegion() throws IOException {
//        List<String> valuesStr = CommonUtil.File.fileRead("C:\\Users\\wglbs\\OneDrive\\德远能源\\insert.sql");
//        for (String temp : valuesStr) {
//            String[] tempStrList = temp.split(",");
//            if (tempStrList.length == 3) {
//                Region region = new Region();
//                region.setAddressId(Integer.valueOf(tempStrList[0]));
//                region.setName(tempStrList[1]);
//                logger.info("插入:"+tempStrList[1]);
//                region.setParentAddressId(Integer.valueOf(tempStrList[2]));
//                regionMapper.insert(region);
//            }
//        }
//    }
}
