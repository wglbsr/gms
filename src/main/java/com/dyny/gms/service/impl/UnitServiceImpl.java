package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UnitMapper;
import com.dyny.gms.db.pojo.Unit;
import com.dyny.gms.db.pojo.UnitExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.UnitService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public String getUnit(Unit unit, String searchContent, int pageNum, int pageSize, String orderBy) {
        UnitExample example = new UnitExample();
        if (Tool.StringUtil.validStr(searchContent)) {//模糊查找模式
            example.or().andUnitNameLike(searchContent).andCustomerNoEqualTo(unit.getCustomerNo());
            example.or().andUnitNoLike(searchContent).andCustomerNoEqualTo(unit.getCustomerNo());
        } else {//精确查找模式
            if (Tool.StringUtil.validStr(unit.getUnitNo())) {
                example.or().andUnitNoEqualTo(unit.getUnitNo()).andCustomerNoEqualTo(unit.getCustomerNo());
            }
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = unitMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addUnit(Unit unit) {
        return unitMapper.insertSelective(unit);
    }
}
