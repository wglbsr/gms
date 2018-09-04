package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.dao.GeneratorStationRelMapper;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.GeneratorExample;
import com.dyny.gms.db.pojo.GeneratorStationRel;
import com.dyny.gms.db.pojo.GeneratorStationRelExample;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;
    @Autowired
    GeneratorStationRelMapper generatorStationRelMapper;

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
    public int relateGeneratorWithStation(String machNo, String stationNo, String cusNo, boolean relateFlag) {
        Generator generator = new Generator();
        GeneratorExample example = new GeneratorExample();
        GeneratorExample.Criteria criteria = example.createCriteria();
        GeneratorStationRel generatorStationRel = new GeneratorStationRel();
        criteria.andCusNoEqualTo(cusNo).andMachNoEqualTo(machNo);
        //判断是关联还是取消关联
        if (!relateFlag) {
            if (!Tool.StringUtil.validStr(stationNo)) {
                return 0;
            }
            criteria.andStNoEqualTo(stationNo);
            generator.setStNo("");
            //.将关联表中的记录逻辑删除
            GeneratorStationRelExample generatorStationRelExample = new GeneratorStationRelExample();
            generatorStationRelExample.or().andGeneratorNoEqualTo(machNo);
            generatorStationRel.setDeleted(true);
            generatorStationRel.setModifyTime(new Date());
            generatorStationRelMapper.updateByExampleSelective(generatorStationRel, generatorStationRelExample);
        } else {
            //.保存在关联表中，方便以后查看
            generatorStationRel.setDeleted(false);
            generatorStationRel.setGeneratorNo(machNo);
            generatorStationRel.setStationNo(stationNo);
            generatorStationRel.setCreateTime(new Date());
            generatorStationRelMapper.insert(generatorStationRel);
            //.将油机的基站编号改为目标基站
            generator.setStNo(stationNo);
        }
        return generatorMapper.updateByExampleSelective(generator, example);
    }

    @Override
    public int disrelateGeneratorWithStationByStationNo(String stationNo) {
        //.将关联表中的记录逻辑删除
        GeneratorStationRel generatorStationRel = new GeneratorStationRel();
        GeneratorStationRelExample generatorStationRelExample = new GeneratorStationRelExample();
        generatorStationRelExample.or().andStationNoEqualTo(stationNo);
        generatorStationRel.setDeleted(true);
        generatorStationRel.setModifyTime(new Date());
        generatorStationRelMapper.updateByExampleSelective(generatorStationRel, generatorStationRelExample);
        //.将油机的stationNo置空
        Generator generator = new Generator();
        GeneratorExample generatorExample = new GeneratorExample();
        generator.setStNo("");
        generatorExample.or().andStNoEqualTo(stationNo);
        generatorMapper.updateByExampleSelective(generator, generatorExample);
        return 0;
    }

    @Override
    public List getGenerator(Map<String, Object> condition, boolean fullInfo) {
        String useType = (String) condition.get("use_type");
        String status = (String) condition.get("user_cus");
        return null;
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
    public int deleteGenerator(String generatorNo) {
        return generatorMapper.deleteByPrimaryKey(generatorNo);
    }

    @Override
    public int addGenerator(Generator generator) {
        return generatorMapper.insert(generator);
    }
}
