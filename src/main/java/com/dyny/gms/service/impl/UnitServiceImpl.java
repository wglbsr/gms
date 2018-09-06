package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.ContactMapper;
import com.dyny.gms.db.dao.UnitMapper;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.db.pojo.ContactExample;
import com.dyny.gms.db.pojo.Unit;
import com.dyny.gms.db.pojo.UnitExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
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
    @Autowired
    ContactMapper contactMapper;

    @Override
    public int updateUnit(Unit unit) {
        return unitMapper.updateByPrimaryKey(unit);
    }

    @Override
    public int deleteUnit(Unit unit) {
        UnitExample unitExample = new UnitExample();
        unitExample.or().andIdEqualTo(unit.getId());
        unit.setId(null);
        unit.setDeleted(true);
        unitMapper.updateByExampleSelective(unit, unitExample);
        return 0;
    }

    @Override
    public String getUnit(Unit unit, String searchContent, int pageNum, int pageSize, String orderBy) {
        UnitExample example = new UnitExample();
        if (Tool.StringUtil.validStr(searchContent)) {//模糊查找模式
            example.or().andUnitNameLike(super.appendLike(searchContent)).andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
            example.or().andUnitNoLike(super.appendLike(searchContent)).andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
            example.or().andUnitAddressLike(super.appendLike(searchContent)).andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
            example.or().andRemarkLike(super.appendLike(searchContent)).andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
        } else {//精确查找模式
            if (Tool.StringUtil.validStr(unit.getUnitNo())) {
                example.or().andUnitNoEqualTo(unit.getUnitNo()).andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
            } else {
                example.or().andCustomerNoEqualTo(unit.getCustomerNo()).andDeletedEqualTo(false);
            }
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = unitMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addUnit(Unit unit) {
        return unitMapper.insertSelective(unit);
    }

    @Override
    public List getUnitByUnitIdList(List<Integer> unitIdList) {
        UnitExample example = new UnitExample();
        example.or().andIdIn(unitIdList).andDeletedEqualTo(false);
        return unitMapper.selectByExample(example);
    }
}
