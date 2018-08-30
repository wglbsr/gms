package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.ContactMapper;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.db.pojo.ContactExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public String getContact(Contact contact, String searchContent, int pageNum, int pageSize, String orderBy) {
        ContactExample example = new ContactExample();
        if (Tool.StringUtil.validStr(searchContent)) {//模糊查找模式
            example.or().andContactNameLike(super.appendLike(searchContent)).andCustomerNoEqualTo(contact.getCustomerNo());
            example.or().andContactPhoneLike(super.appendLike(searchContent)).andCustomerNoEqualTo(contact.getCustomerNo());
        } else {
            example.or().andCustomerNoEqualTo(contact.getCustomerNo());
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = contactMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addContact(Contact contact) {
        return contactMapper.insertSelective(contact);
    }
}
