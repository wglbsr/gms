package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;

public interface StationService {

    int deleteStation(String stationNo);

    int updateStation(Station station, StationExample stationExample);

    int updateStation(Station station);


    int addStation(Station station);

    String getStationListByCondition(Station station, int pageNum, int pageSize);

    String getStationListByUsercus(String customerNo, int pageNum, int pageSize,String orderBy);

}
