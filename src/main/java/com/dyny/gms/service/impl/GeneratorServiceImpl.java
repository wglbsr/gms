package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorContactRelMapper;
import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.dao.GeneratorStationRelMapper;
import com.dyny.gms.db.pojo.*;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class GeneratorServiceImpl extends BaseService implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;
    @Autowired
    GeneratorStationRelMapper generatorStationRelMapper;
    @Autowired
    GeneratorContactRelMapper generatorContactRelMapper;


    @Autowired
    ContactService contactService;

    /**
     * 根据基站编号和客户编号获取油机
     *
     * @param stationNo
     * @param cusNo
     * @return
     */
    @Override
    public List getGeneratorForStation(String stationNo, String cusNo) {
        GeneratorExample example = new GeneratorExample();
        GeneratorExample.Criteria criteria = example.createCriteria();
        criteria.andStNoEqualTo(stationNo).andCusNoEqualTo(cusNo);
        example.or().andStNoEqualTo("").andCusNoEqualTo(cusNo);
        example.or().andStNoIsNull().andCusNoEqualTo(cusNo);
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
            if (!Tool.StringUtil.validStr(stationNo)) {
                return 0;
            }
            criteria.andStNoEqualTo(stationNo);
            //.讲油机的基站编码置空
            generator.setStNo("");

            //.将油机-基站关联表中的记录逻辑删除
            this.logicDeleteGeneratorStationTable(machNo, stationNo);

            //.将油机-联系人关联表中的相关记录逻辑删除
            this.logicDeleteGeneratorContactTable(machNo, contactIdList);


        } else {
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
        if (!Tool.StringUtil.validStr(machNo)) {
            return 0;
        }
        int cnt = 0;
        for (Integer contactId : contactIdList) {
            GeneratorContactRel generatorContactRel = new GeneratorContactRel();
            generatorContactRel.setContactId(contactId);
            generatorContactRel.setCreateTime(new Date());
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
        if (Tool.StringUtil.validStr(machNo, stationNo)) {
            GeneratorStationRel generatorStationRel = new GeneratorStationRel();
            generatorStationRel.setDeleted(false);
            generatorStationRel.setGeneratorNo(machNo);
            generatorStationRel.setStationNo(stationNo);
            generatorStationRel.setCreateTime(new Date());
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
        if (Tool.StringUtil.validStr(machNo, stationNo)) {
            generatorStationRelExample.or().andGeneratorNoEqualTo(machNo).andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        } else if (Tool.StringUtil.validStr(stationNo) && !Tool.StringUtil.validStr(machNo)) {
            generatorStationRelExample.or().andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        } else if (!Tool.StringUtil.validStr(stationNo) && Tool.StringUtil.validStr(machNo)) {
            generatorStationRelExample.or().andGeneratorNoEqualTo(machNo).andDeletedEqualTo(false);
        } else {
            return 0;
        }
        generatorStationRel.setDeleted(true);
        generatorStationRel.setModifyTime(new Date());
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
        if (contactIdList == null || contactIdList.size() == 0 || Tool.StringUtil.validStr(machNo)) {
            return 0;
        }
        GeneratorContactRelExample generatorContactRelExample = new GeneratorContactRelExample();
        generatorContactRelExample.or().andContactIdIn(contactIdList).andGeneratorNoEqualTo(machNo);
        GeneratorContactRel generatorContactRel = new GeneratorContactRel();
        generatorContactRel.setDeleted(true);
        generatorContactRel.setModifyTime(new Date());
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
        if (Tool.StringUtil.validStr(stationNo, generatorNo)) {
            generatorExample.or().andStNoEqualTo(stationNo).andMachNoEqualTo(generatorNo);
        } else if (Tool.StringUtil.validStr(stationNo) && !Tool.StringUtil.validStr(generatorNo)) {
            generatorExample.or().andStNoEqualTo(stationNo);
        } else if (!Tool.StringUtil.validStr(stationNo) && Tool.StringUtil.validStr(generatorNo)) {
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
    public int logicDeleteGeneratorContactByStationNo(String stationNo) {
        if (!Tool.StringUtil.validStr(stationNo)) {
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
            generatorContactRel.setModifyTime(new Date());
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
        return generatorMapper.updateByPrimaryKey(generator);
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
