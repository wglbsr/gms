package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Unit;

import java.util.List;


public interface UnitService {

    int updateUnit(Unit unit);

    int deleteUnit(Unit unit);

    String getUnit(Unit unit, String searchContent, int pageNum, int pageSize, String orderBy);

    int addUnit(Unit unit);

    List getUnitByUnitIdList(List<Integer> unitIdList);


}
