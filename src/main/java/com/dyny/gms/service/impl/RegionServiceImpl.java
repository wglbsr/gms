package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.RegionMapper;
import com.dyny.gms.db.pojo.RegionExample;
import com.dyny.gms.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionMapper regionMapper;


    @Override
    public List getRegionByParent(int parentId) {
        RegionExample example = new RegionExample();
        example.or().andParentAddressIdEqualTo(parentId);
        return regionMapper.selectByExample(example);
    }
}
