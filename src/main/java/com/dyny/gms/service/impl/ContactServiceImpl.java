package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.ContactMapper;
import com.dyny.gms.db.dao.ContactStationRelMapper;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.db.pojo.ContactExample;
import com.dyny.gms.db.pojo.ContactStationRel;
import com.dyny.gms.db.pojo.ContactStationRelExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.ContactService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ContactServiceImpl extends BaseService implements ContactService {
    @Autowired
    ContactMapper contactMapper;
    @Autowired
    ContactStationRelMapper contactStationRelMapper;

    @Override
    public int updateContact(Contact contact) {
        return contactMapper.updateByPrimaryKey(contact);
    }

    @Override
    public int deleteContactByIdList(List<Integer> contactIdList) {
        ContactExample example = new ContactExample();
        example.or().andIdIn(contactIdList);
        Contact contact = new Contact();
        contact.setDeleted(true);
        return contactMapper.updateByExampleSelective(contact, example);
    }

    /**
     * 逻辑删除,将deleted标志置为1(true)
     *
     * @param contact
     * @return
     */
    @Override
    public int deleteContact(Contact contact) {
        contact.setDeleted(true);
        return contactMapper.updateByPrimaryKeySelective(contact);
    }

    /**
     * @param stationNo
     * @param justId    是否只返回id
     * @return
     */
    @Override
    public List getContactByStationNo(String stationNo, boolean justId) {
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelExample.or().andStationNoEqualTo(stationNo).andDeletedEqualTo(false);
        List<ContactStationRel> contactStationRels = contactStationRelMapper.selectByExample(contactStationRelExample);
        List<Integer> contactIdList = new ArrayList<>();
        for (ContactStationRel temp : contactStationRels) {
            contactIdList.add(temp.getContactId());
        }
        if (justId) {
            return contactIdList;
        }
        ContactExample contactExample = new ContactExample();
        contactExample.or().andIdIn(contactIdList).andDeletedEqualTo(false);
        return contactMapper.selectByExample(contactExample);
    }

    @Override
    public Contact getContactByUnitId(int contactId) {
        return contactMapper.selectByPrimaryKey(contactId);
    }

    @Override
    public String getContact(Contact contact, String searchContent, int pageNum, int pageSize, String orderBy) {
        ContactExample example = new ContactExample();
        if (!StringUtils.isEmpty(searchContent)) {//模糊查找模式
            example.or().andContactNameLike(super.appendLike(searchContent)).andCustomerNoEqualTo(contact.getCustomerNo()).andDeletedEqualTo(false);
            example.or().andContactPhoneLike(super.appendLike(searchContent)).andCustomerNoEqualTo(contact.getCustomerNo()).andDeletedEqualTo(false);
            example.or().andRemarkLike(super.appendLike(searchContent)).andCustomerNoEqualTo(contact.getCustomerNo()).andDeletedEqualTo(false);
        } else {
            example.or().andCustomerNoEqualTo(contact.getCustomerNo()).andDeletedEqualTo(false);
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = contactMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }


    @Override
    public String getContactByUnitId(int unitId, String searchContent, int pageNum, int pageSize, String orderBy) {
        ContactExample example = new ContactExample();
        example.or().andUnitIdEqualTo(unitId).andDeletedEqualTo(false);
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = contactMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int addContact(Contact contact) {
        contact.setCreateTime(new Date());
        contact.setDeleted(false);
        return contactMapper.insertSelective(contact);
    }
}
