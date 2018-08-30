package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Contact;

public interface ContactService {

    int updateContact(Contact contact);

    int deleteContact(Contact contact);

    String getContact(Contact contact,String searchContent,  int pageNum, int pageSize,String orderBy);

    int addContact(Contact contact);
}
