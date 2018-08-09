package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.SiteMapper;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class GeneratorServiceImpl implements GeneratorService {

    @Override
    public List getGeneratorByCondition(Map<String, Object> condition) {
        String useType = (String) condition.get("use_type");
        String status = (String) condition.get("user_cus");
        return null;
    }
}
