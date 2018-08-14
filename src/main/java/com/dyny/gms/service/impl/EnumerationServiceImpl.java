package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.EnumerationMapper;
import com.dyny.gms.db.pojo.Enumeration;
import com.dyny.gms.db.pojo.EnumerationExample;
import com.dyny.gms.service.EnumerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnumerationServiceImpl implements EnumerationService {
    @Autowired
    EnumerationMapper enumMmapper;


    @Override
    public List<Enumeration> getEnumList() {
        EnumerationExample example = new EnumerationExample();
        EnumerationExample.Criteria criteria = example.createCriteria();
        criteria.andColumnKeyIsNotNull();
        return enumMmapper.selectByExample(example);//enumMmapper.selectAllEnumeration();
    }

    @Override
    public List<Enumeration> getEnumList(String enumKey) {
        return null;
    }
}
