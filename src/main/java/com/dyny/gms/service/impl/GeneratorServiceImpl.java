package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.GeneratorExample;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;

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
    public int relateGeneratorWithStation(String machNo, String stationNo, String cusNo, boolean relateFlag) {
        Generator generator = new Generator();
        GeneratorExample example = new GeneratorExample();
        GeneratorExample.Criteria criteria = example.createCriteria();
        criteria.andCusNoEqualTo(cusNo).andMachNoEqualTo(machNo);
        if (!relateFlag) {
            if (!Tool.StringUtil.validStr(stationNo)) {
                return 0;
            }
            criteria.andStNoEqualTo(stationNo);
            generator.setStNo("");
        } else {
            generator.setStNo(stationNo);
        }
        return generatorMapper.updateByExampleSelective(generator, example);
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
