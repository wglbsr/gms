package com.dyny.gms.db.pojo;

import java.util.List;

/**
 * 该类是方便页面使用
 */
public class StationForPage extends Station {


    public List<Integer> getContactIdList() {
        return contactIdList;
    }

    public void setContactIdList(List<Integer> contactIdList) {
        this.contactIdList = contactIdList;
    }

    private List<Integer> contactIdList = null;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    private List<Contact> contactList = null;

}