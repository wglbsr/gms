package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    @Autowired
    GeneratorMapper generatorMapper;

    @Override
    public List getGenerator(Map<String, Object> condition,boolean fullInfo) {
        String useType = (String) condition.get("use_type");
        String status = (String) condition.get("user_cus");
        return null;
    }

    @Override
    public Generator getGeneratorDetail(String generatorNo) {
        return generatorMapper.selectByPrimaryKey(generatorNo);//generatorMapper.getGeneratorDetail(generatorNo);
    }

    @Override
    public int updateGenerator(Generator generator) {
        return 0;
    }

    @Override
    public int deleteGenerator(String generatorNo) {
        return 0;
    }

    @Override
    public int addGenerator(Generator generator) {
        return 0;
    }
}
