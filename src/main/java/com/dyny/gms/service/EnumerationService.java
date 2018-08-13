package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Enumeration;

import java.util.List;

public interface EnumerationService {

    public List<Enumeration> getEnumList();
    public List<Enumeration> getEnumList(String enumKey);

}
