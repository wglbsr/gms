package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Warning;
import com.dyny.gms.db.pojo.WarningType;

import java.util.List;
import java.util.Map;

/**
 * @author:wanggl
 * @date:2018-10-23
 * @version:1.0.0
 */
public interface WarningService {
    String CACHE_WARNING_TYPE_LIST_KEY = "WarningTypeList";

    List<Warning> getRealTimeAlarmInfo(String customerNo);

    List<Map> getWarningTypeCnt(String generatorNo);

    String getWarningTypeList(int id, int pageNum, int pageSize);

    int createWarningType(WarningType warningType);

    int updateWarningType(WarningType warningType);

    int deleteWarningType(int warningType);

    void loadWarningTypeToCache();

    List<WarningType> getAllWarningType();

    //checkWarningType checkWarningCode
    int checkWarningType(int warningType);

    int checkWarningCode(String warningCode);

}
