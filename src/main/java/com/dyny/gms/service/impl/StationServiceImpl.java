package com.dyny.gms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.dao.ContactMapper;
import com.dyny.gms.db.dao.ContactStationRelMapper;
import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.dao.StationMapper;
import com.dyny.gms.db.pojo.*;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.service.StationService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StationServiceImpl extends BaseService implements StationService {
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

    @Override
    public int updateStation(Station station) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(station.getStationNo());
        example.or(criteria);
        return stationMapper.updateByExample(station, example);
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
    public int checkStationNo(String stationNo) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(stationNo);
        return (int) stationMapper.countByExample(example);
    }

    /**
     * 删除基站(逻辑删除)
     *
     * @param stationNo
     * @return
     */
    @Override
    public int deleteStation(String stationNo) {
        int cnt = 0;
        //1.删除联系人-基站关联表的相关记录
        cnt += this.deleteContactStationRelByStationNo(stationNo);

        //2.已关联的油机需要取消关联
        cnt += generatorService.disrelateGeneratorWithStationByStationNo(stationNo);

        //3.删除基站
        cnt += this.logicDeleteStation(stationNo);

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
    public int logicDeleteStation(String stationNo) {
        Station station = new Station();
        station.setDeleted(true);
        station.setModifyTime(new Date());
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(stationNo);
        return stationMapper.updateByExampleSelective(station, example);
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
            if (Tool.StringUtil.validStr(searchContent)) {
                example.or().andDeletedEqualTo(false).andStationNoLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationAddressLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andRemarkLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationNameLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationLatitudeLike(super.appendLike(searchContent));
                example.or().andDeletedEqualTo(false).andStationLongitudeLike(super.appendLike(searchContent));
            } else {
                example.or().andDeletedEqualTo(false);
            }
        }else{
            if (Tool.StringUtil.validStr(searchContent)) {
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
        page.setOrderBy(orderBy);
        List result = stationMapper.selectByExample(example);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
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
        for (Integer contactId : contactIdList) {
            ContactStationRel contactStationRel = new ContactStationRel();
            contactStationRel.setContactId(contactId);
            contactStationRel.setStationNo(stationForPage.getStationNo());
            contactStationRel.setCreateTime(new Date());
            contactStationRel.setDeleted(false);
            cnt2 += contactStationRelMapper.insert(contactStationRel) > 0 ? 1 : 0;
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
}
