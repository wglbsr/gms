package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class GeneratorServiceImpl implements GeneratorService {

//    @Autowired
//    GeneratorMapper generatorMapper;

    @Override
    public List getGeneratorByCondition(Map<String, Object> condition) {
        String useType = (String) condition.get("use_type");
        String status = (String) condition.get("user_cus");
        return null;
    }

    @Override
    public List getGeneratorDetail(String generatorNo) {
        return null;//generatorMapper.getGeneratorDetail(generatorNo);
    }
}
