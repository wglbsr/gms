package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.ContactMapper;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.db.pojo.ContactExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactServiceImpl extends BaseService implements ContactService {
    @Autowired
    ContactMapper contactMapper;

    @Override
    public int updateContact(Contact contact) {
        return contactMapper.updateByPrimaryKey(contact);
    }

    @Override
    public int deleteContact(Contact contact) {
        return contactMapper.deleteByPrimaryKey(contact.getId());
    }

    @Override
    public String getContact(Contact contact, int pageNum, int pageSize) {
        ContactExample example = new ContactExample();
        ContactExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(contact.getStationNo());
        criteria.andUnitIdEqualTo(contact.getUnitId());
        Page page = PageHelper.startPage(pageNum, pageSize);
        int total = (int) page.getTotal();
        List result = contactMapper.selectByExample(example);
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addContact(Contact contact) {
        return contactMapper.insert(contact);
    }
}
