package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;

import java.util.List;

public interface StationService {

    int deleteStation(String stationNo);

    int updateStation(Station station, StationExample stationExample);

    int updateStation(Station station);

    int checkStationNo(String stationNo);

    int addStation(Station station);

    String getStationListByCondition(Station station, int pageNum, int pageSize);

    String getStationListByUsercus(String customerNo, int pageNum, int pageSize,String orderBy);

    String getStationListByContactId(String customerNo, List<Integer> ContactId, int pageNum, int pageSize, String orderBy);

}
