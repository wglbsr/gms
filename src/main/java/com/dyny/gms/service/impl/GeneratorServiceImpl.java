package com.dyny.gms.service.impl;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.*;
import com.dyny.gms.db.pojo.*;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.utils.CommonUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GeneratorServiceImpl extends BaseService implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;
    @Autowired
    GeneratorStationRelMapper generatorStationRelMapper;
    @Autowired
    GeneratorContactRelMapper generatorContactRelMapper;
    @Autowired
    ActivateHistoryMapper activateHistoryMapper;
    @Autowired
    StationMapper stationMapper;
    @Autowired
    ContactService contactService;
    @Autowired
    CacheDao cacheDao;
    @Autowired
    BasisMapper basisMapper;

    /**
     * 根据基站编号和客户编号获取油机
     *
     * @param stationNo
     * @param cusNo
     * @return
     */
    @Override
    public List getGeneratorForStation(String stationNo, String cusNo, String searchContent) {
        GeneratorExample example = new GeneratorExample();
        example.or().andStNoEqualTo(stationNo).andCusNoEqualTo(cusNo).andMachNoLike(super.appendLike(searchContent));
        example.or().andStNoIsNull().andCusNoEqualTo(cusNo).andMachNoLike(super.appendLike(searchContent));
        example.or().andStNoEqualTo("").andCusNoEqualTo(cusNo).andMachNoLike(super.appendLike(searchContent));
        example.or().andStNoEqualTo(stationNo).andCusNoEqualTo(cusNo).andMachNameLike(super.appendLike(searchContent));
        example.or().andStNoIsNull().andCusNoEqualTo(cusNo).andMachNameLike(super.appendLike(searchContent));
        example.or().andStNoEqualTo("").andCusNoEqualTo(cusNo).andMachNameLike(super.appendLike(searchContent));
        return generatorMapper.selectByExample(example);
    }

    @Override
    public List getGeneratorByStationNo(String stationNo) {
        GeneratorExample example = new GeneratorExample();
        example.or().andStNoEqualTo(stationNo);
        return generatorMapper.selectByExample(example);
    }

    @Override
    public int getGeneratorNumByStatus(String customerNo, String status) {
        GeneratorExample example = new GeneratorExample();
        GeneratorExample.Criteria criteria = example.createCriteria();
        criteria.andCusNoEqualTo(customerNo);
        return (int) generatorMapper.countByExample(example);
    }

    /**
     * 关联油机
     *
     * @param machNo
     * @param stationNo
     * @param cusNo
     * @param relateFlag
     * @return
     */
    @Override
    public int relateGeneratorWithStation(String machNo, String stationNo, String cusNo, boolean relateFlag, List<Integer> contactIdList) {
        Generator generator = new Generator();
        GeneratorExample example = new GeneratorExample();
        GeneratorExample.Criteria criteria = example.createCriteria();
        criteria.andCusNoEqualTo(cusNo).andMachNoEqualTo(machNo);
        //判断是关联还是取消关联
        if (!relateFlag) {
            if (!CommonUtil.String.validStr(stationNo)) {
                return 0;
            }
            criteria.andStNoEqualTo(stationNo);
            //.将油机的基站编码置空
            generator.setStNo("");

            //.将油机-基站关联表中的记录逻辑删除
            this.logicDeleteGeneratorStationTable(machNo, stationNo);

            //.将油机-联系人关联表中的相关记录逻辑删除
            this.logicDeleteGeneratorContactTable(machNo, contactIdList);


        } else {
            //判断油机是否已经关联到基站,如果是则将油机-基站关联表中相关的记录逻辑删除
            this.logicDeleteGeneratorStationTable(machNo, stationNo);

            //.保存在油机-基站关联表中，方便以后查看
            this.insertToGeneratorStationTable(machNo, stationNo);

            //.保存在油机-联系人关联表中
            this.insertToGeneratorContactTable(stationNo, contactIdList);

            //.将油机的基站编号改为目标基站
            generator.setStNo(stationNo);
        }
        return generatorMapper.updateByExampleSelective(generator, example);
    }

    /**
     * 插入油机-联系人关联表
     *
     * @param machNo
     * @param contactIdList
     * @return
     */
    @Override
    public int insertToGeneratorContactTable(String machNo, List<Integer> contactIdList) {
        if (!CommonUtil.String.validStr(machNo)) {
            return 0;
        }
        int cnt = 0;
        for (Integer contactId : contactIdList) {
            GeneratorContactRel generatorContactRel = new GeneratorContactRel();
            generatorContactRel.setContactId(contactId);
            generatorContactRel.setCreateTime(new java.util.Date());
            generatorContactRel.setDeleted(false);
            generatorContactRel.setGeneratorNo(machNo);
            cnt += generatorContactRelMapper.insert(generatorContactRel);
        }
        return cnt;
    }


    /**
     * 插入油机-基站关联表
     *
     * @param machNo
     * @param stationNo
     * @return
     */
    @Override
    public int insertToGeneratorStationTable(String machNo, String stationNo) {
        if (CommonUtil.String.validStr(machNo, stationNo)) {
            GeneratorStationRel generatorStationRel = new GeneratorStationRel();
            generatorStationRel.setDeleted(false);
            generatorStationRel.setGeneratorNo(machNo);
            generatorStationRel.setStationNo(stationNo);
            generatorStationRel.setCreateTime(new java.util.Date());
            return generatorStationRelMapper.insert(generatorStationRel);
        } else {
            return 0;
        }
    }

    /**
     * 逻辑删除油机-基站关联表
     *
     * @param machNo
     * @param stationNo
     * @return
     */
    @Override
    public int logicDeleteGeneratorStationTable(String machNo, String stationNo) {
        GeneratorStationRel generatorStationRel = new GeneratorStationRel();
        GeneratorStationRelExample generatorStationRelExample = new GeneratorStationRelExample();
        if (CommonUtil.String.validStr(machNo, stationNo)) {
            generatorStationRelExample.or().andGeneratorNoEqualTo(machNo).andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        } else if (CommonUtil.String.validStr(stationNo) && !CommonUtil.String.validStr(machNo)) {
            generatorStationRelExample.or().andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        } else if (!CommonUtil.String.validStr(stationNo) && CommonUtil.String.validStr(machNo)) {
            generatorStationRelExample.or().andGeneratorNoEqualTo(machNo).andDeletedEqualTo(false);
        } else {
            return 0;
        }
        generatorStationRel.setDeleted(true);
        generatorStationRel.setModifyTime(new java.util.Date());
        return generatorStationRelMapper.updateByExampleSelective(generatorStationRel, generatorStationRelExample);
    }


    /**
     * 逻辑删除油机-联系人关联表
     *
     * @param machNo
     * @param contactIdList
     * @return
     */
    @Override
    public int logicDeleteGeneratorContactTable(String machNo, List<Integer> contactIdList) {
        if (contactIdList == null || contactIdList.size() == 0 || CommonUtil.String.validStr(machNo)) {
            return 0;
        }
        GeneratorContactRelExample generatorContactRelExample = new GeneratorContactRelExample();
        generatorContactRelExample.or().andContactIdIn(contactIdList).andGeneratorNoEqualTo(machNo);
        GeneratorContactRel generatorContactRel = new GeneratorContactRel();
        generatorContactRel.setDeleted(true);
        generatorContactRel.setModifyTime(new java.util.Date());
        return generatorContactRelMapper.updateByExample(generatorContactRel, generatorContactRelExample);
    }


    /**
     * 取消关联某个基站下的所有油机,多用在删除基站功能
     *
     * @param stationNo
     * @return
     */
    @Override
    public int disrelateGeneratorWithStationByStationNo(String stationNo) {
        //1.油机-联系人关联表逻辑删除
        this.logicDeleteGeneratorContactByStationNo(stationNo);
        //2.将油机-基站关联表中的记录逻辑删除
        int cnt = this.logicDeleteGeneratorStationTable("", stationNo);
        //3.将油机的stationNo置空
        return cnt > 0 ? this.setEmptyStationNo("", stationNo) : 0;
    }

    /**
     * 将目标油机的基站标号置空
     *
     * @param generatorNo
     * @param stationNo
     * @return
     */
    @Override
    public int setEmptyStationNo(String generatorNo, String stationNo) {
        Generator generator = new Generator();
        generator.setStNo("");
        GeneratorExample generatorExample = new GeneratorExample();
        if (CommonUtil.String.validStr(stationNo, generatorNo)) {
            generatorExample.or().andStNoEqualTo(stationNo).andMachNoEqualTo(generatorNo);
        } else if (CommonUtil.String.validStr(stationNo) && !CommonUtil.String.validStr(generatorNo)) {
            generatorExample.or().andStNoEqualTo(stationNo);
        } else if (!CommonUtil.String.validStr(stationNo) && CommonUtil.String.validStr(generatorNo)) {
            generatorExample.or().andMachNoEqualTo(generatorNo);
        } else {
            return 0;
        }
        return generatorMapper.updateByExampleSelective(generator, generatorExample);
    }

    @Override
    public List getGenerator(Map<String, Object> condition, boolean fullInfo) {
        String useType = (String) condition.get("use_type");
        String status = (String) condition.get("user_cus");
        return null;
    }

    @Override
    public int generatorRegister(Generator generator) {
        generator.setCreatTime(new java.util.Date());
        generator.setActivated(true);
        generator.setDeleted(false);
        generator.setTotalGenerateCnt(0);
        generator.setTotalGenerateTime(0);
        List<String> generatorNoList = new ArrayList<>();
        generatorNoList.add(generator.getMachNo());
        //保存激活记录
        this.saveActivateLog(generatorNoList, true, null, generator.getCusNo());
        return generatorMapper.insert(generator);
    }

    @Override
    public int changeBootVoltage(List<String> generatorNoList, BigDecimal startVoltage) {
        if (generatorNoList == null || generatorNoList.size() == 0) {
            return 0;
        }
        GeneratorExample generatorExample = new GeneratorExample();
        generatorExample.or().andMachNoIn(generatorNoList);
        Generator generator = new Generator();
        generator.setStartVoltage(startVoltage);
        return generatorMapper.updateByExampleSelective(generator, generatorExample);
    }

    @Override
    public int activateGenerator(List<String> generatorNoList, boolean activate, String username) {
        if (generatorNoList == null || generatorNoList.size() == 0) {
            return 0;
        }
        //1.激活/停用油机
        GeneratorExample generatorExample = new GeneratorExample();
        generatorExample.or().andMachNoIn(generatorNoList);
        Generator generator = new Generator();
        generator.setActivated(activate);
        int result = generatorMapper.updateByExampleSelective(generator, generatorExample);
        //2.保存到激活/停用历史表
        this.saveActivateLog(generatorNoList, activate, username, generator.getCusNo());
        return result;
    }

    @Override
    public int saveActivateLog(List<String> generatorNoList, boolean activate, String username, String customerNo) {
        if (generatorNoList == null || generatorNoList.size() == 0) {
            return 0;
        }
        GeneratorExample generatorExample = new GeneratorExample();
        generatorExample.or().andMachNoIn(generatorNoList);
        List<Generator> generatorList = generatorMapper.selectByExample(generatorExample);
        List<String> stationNoList = generatorList.stream().map(Generator::getStNo).collect(Collectors.toList());
        StationExample stationExample = new StationExample();
        List<Station> stationList = new ArrayList<>();
        if (stationNoList != null && stationNoList.size() > 0) {
            stationExample.or().andStationNoIn(stationNoList);
            stationList = stationMapper.selectByExample(stationExample);
        }
        List<ActivateHistory> activateHistoryList = new ArrayList<>();
        for (Generator generatorTemp : generatorList) {
            ActivateHistory activateHistory = new ActivateHistory();
            String stationNo = generatorTemp.getStNo();
            activateHistory.setCreateTime(new java.util.Date());
            activateHistory.setActivated(activate);
            activateHistory.setGeneratorNo(generatorTemp.getMachNo());
            activateHistory.setGeneratorName(generatorTemp.getMachName());
            if (CommonUtil.String.validStr(username)) {
                activateHistory.setUsername(username);
            }
            if (CommonUtil.String.validStr(customerNo)) {
                activateHistory.setCustomerNo(customerNo);
            }
            if (CommonUtil.String.validStr(stationNo)) {
                activateHistory.setStationNo(stationNo);
                for (Station stationTemp : stationList) {
                    if (stationTemp.getStationNo().equals(stationNo)) {
                        activateHistory.setStationName(stationTemp.getStationName());
                        break;
                    }
                }
            }
            activateHistoryList.add(activateHistory);
        }
        if (activateHistoryList.size() == 0) {
            return 0;
        }
        return activateHistoryMapper.insertBatch(activateHistoryList);
    }

    /**
     * ***未完成
     * 建议直接编写sql,减少代码量
     *
     * @param keyWord
     * @param level
     * @param generatorNo
     * @param customerNo
     * @param activate
     * @param pageNum
     * @param pageSize
     * @param startTimestamp
     * @param endTimestamp
     * @return
     * @throws ParseException
     */
    @Override
    public String getActivateHistory(String keyWord, int level, String generatorNo, String customerNo, int activate, int pageNum, int pageSize, long startTimestamp, long endTimestamp) throws ParseException {
        ActivateHistoryExample activateHistoryExample = new ActivateHistoryExample();
        java.util.Date startDate = CommonUtil.Date.timestampToDate(startTimestamp);
        java.util.Date endDate = CommonUtil.Date.timestampToDate(endTimestamp);
        if (level >= super.ADMIN_LEVEL) {
            if (CommonUtil.String.validStr(keyWord)) {
                activateHistoryExample.or().andGeneratorNoLike(super.appendLike(keyWord)).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andGeneratorNameLike(super.appendLike(keyWord)).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andStationNoLike(super.appendLike(keyWord)).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andStationNameLike(super.appendLike(keyWord)).andCreateTimeBetween(startDate, endDate);
            }
        } else if (level < super.ADMIN_LEVEL) {
            if (CommonUtil.String.validStr(keyWord)) {
                activateHistoryExample.or().andGeneratorNoLike(super.appendLike(keyWord)).andCustomerNoEqualTo(customerNo).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andGeneratorNameLike(super.appendLike(keyWord)).andCustomerNoEqualTo(customerNo).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andStationNoLike(super.appendLike(keyWord)).andCustomerNoEqualTo(customerNo).andCreateTimeBetween(startDate, endDate);
                activateHistoryExample.or().andStationNameLike(super.appendLike(keyWord)).andCustomerNoEqualTo(customerNo).andCreateTimeBetween(startDate, endDate);
            }
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<ActivateHistory> activateHistoryList = activateHistoryMapper.selectByExample(activateHistoryExample);
        int total = (int) page.getTotal();
        return super.getSuccessResult(activateHistoryList, pageNum, pageSize, total);
    }

    @Override
    public int saveGeneratorData(Basis basis) {
        //1.保存到缓存/
        //1.1 方案1:直接保存basis
        //1.2 方案2:翻译成原来的视图再保存
        cacheDao.set(basis.getMachNo(), basis);


        //2.保存到DB
        return basisMapper.insert(basis);
    }

    @Override
    public String getGeneratorDataFromCache(String generatorNo) {
        //注意需要分页
        Basis basis = cacheDao.get(generatorNo, Basis.class);


        //2.油机
        //2.1查找缓存,存在则跳过2.2,2.3
        //2.2查找数据库
        //2.3保存到缓存
        cacheDao.get(generatorNo);
        GeneratorExample generatorExample = new GeneratorExample();
        generatorExample.or().andMachNoEqualTo(generatorNo);
        List<Generator> generatorList = generatorMapper.selectByExample(generatorExample);
        Generator generator = generatorList.get(0);

        //3.基站
        String stationNo = generator.getStNo();
        List<Station> stationList = null;
        if (CommonUtil.String.validStr(stationNo)) {
            StationExample stationExample = new StationExample();
            stationExample.or().andStationNoEqualTo(stationNo);
            stationList = stationMapper.selectByExample(stationExample);
        }
        if (stationList != null && stationList.size() > 0) {
            Station station = stationList.get(0);
        }

        //涉及的表c_mach,C_basis,t_station


        //1.查找缓存


        return null;
    }

    /**
     * 从缓存中查找油机资料,没有则从数据库中查找
     * @param generatorNo
     * @return
     */
    @Override
    public Generator getGeneratorDetailFromCache(String generatorNo) {
        Generator generator = cacheDao.get(generatorNo, Generator.class);
        if (generator == null) {
            generator = this.getGeneratorDetail(generatorNo);
        }
        return generator;
    }

    @Override
    public List<String> getAllGeneratorNo() {
        return generatorMapper.getAllGeneratorNo();
    }

    /**
     * 保存油机编号到缓存，实用性待观察
     */
    @Override
    public void saveGeneratorNoToCache() {
        List<String> generatorNoList = this.getAllGeneratorNo();
        cacheDao.set("generatorNoList", generatorNoList);
    }

    @Override
    public int logicDeleteGeneratorContactByStationNo(String stationNo) {
        if (!CommonUtil.String.validStr(stationNo)) {
            return 0;
        }
        int cnt = 0;
        //获取该基站下的油机
        List<Generator> generators = this.getGeneratorByStationNo(stationNo);
        List<String> generatorIds = new ArrayList<>();
        for (Generator generator : generators) {
            generatorIds.add(generator.getMachNo());
        }
        if (generatorIds.size() > 0) {
            GeneratorContactRel generatorContactRel = new GeneratorContactRel();
            generatorContactRel.setDeleted(true);
            generatorContactRel.setModifyTime(new java.util.Date());
            GeneratorContactRelExample generatorContactRelExample = new GeneratorContactRelExample();
            generatorContactRelExample.or().andGeneratorNoIn(generatorIds).andDeletedEqualTo(false);
            cnt = generatorContactRelMapper.updateByExampleSelective(generatorContactRel, generatorContactRelExample);
        }
        return cnt;
    }


    @Override
    public Generator getGeneratorDetail(String generatorNo) {
        return generatorMapper.selectByPrimaryKey(generatorNo);
    }

    @Override
    public int updateGenerator(Generator generator) {
        return generatorMapper.updateByPrimaryKeySelective(generator);
    }

    @Override
    public int updateGenerator(List<Generator> generatorList) {
        return generatorMapper.updateByPrimaryKeySelectiveBatch(generatorList);
    }

    @Override
    public int deleteGeneratorByGeneratorNo(String generatorNo) {
        return generatorMapper.deleteByPrimaryKey(generatorNo);
    }

    @Override
    public int addGenerator(Generator generator) {
        return generatorMapper.insert(generator);
    }
}
