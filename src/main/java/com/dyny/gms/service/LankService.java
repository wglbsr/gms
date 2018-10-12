package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Lank;

import java.text.ParseException;
import java.util.List;

public interface LankService {
    String getLank(String customerNo, String keyWord, int pageNum, int pageSize, long startDate, long endDate) throws ParseException;

    int refuelManually(String generatorNo,float refuelVolumeno);

}
