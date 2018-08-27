package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UnitMapper;
import com.dyny.gms.db.pojo.Unit;
import com.dyny.gms.db.pojo.UnitExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.UnitService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UnitServiceImpl extends BaseService implements UnitService {
    @Autowired
    UnitMapper unitMapper;

    @Override
    public int updateUnit(Unit unit) {
        return unitMapper.updateByPrimaryKey(unit);
    }

    @Override
    public int deleteUnit(Unit unit) {
        return unitMapper.deleteByPrimaryKey(unit.getId());
    }

    @Override
    public String getUnit(Unit unit, int pageNum, int pageSize) {
        UnitExample example = new UnitExample();
        UnitExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(unit.getCustomerNo());
        Page page = PageHelper.startPage(pageNum, pageSize);
        int total = (int) page.getTotal();
        List result = unitMapper.selectByExample(example);
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addUnit(Unit unit) {
        return unitMapper.insert(unit);
    }
}
