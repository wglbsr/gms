package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Contact;

import java.util.List;

public interface ContactService {

    int updateContact(Contact contact);

    int deleteContact(Contact contact);

    int deleteContactByIdList(List<Integer> contactIdList);

    String getContact(Contact contact, String searchContent, int pageNum, int pageSize, String orderBy);

    int addContact(Contact contact);

    List getContactByStationNo(String stationNo,boolean justId);

    String getContactByUnitId(int unitId, String searchContent, int pageNum, int pageSize, String orderBy);

    Contact getContactByUnitId(int contactId);
}
