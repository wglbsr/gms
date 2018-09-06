package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;
import com.dyny.gms.db.pojo.StationForPage;

import java.util.List;

public interface StationService {

    int deleteStation(String stationNo);

    int updateStation(Station station, StationExample stationExample);

    int updateStation(Station station);

    int checkStationNo(String stationNo);

    int addStation(StationForPage station);

    String getStationListByCondition(Station station, int pageNum, int pageSize);

    String getStationListByUsercus(String customerNo,String searchContent, int pageNum, int pageSize, String orderBy);

    String getStationListByContactId(String customerNo, List<Integer> ContactId, int pageNum, int pageSize, String orderBy);

    StationForPage getStationByStationNo(String stationNo);

    int updateStationForPage(StationForPage station);

    int deleteContactStationRelByStationNo(String stationNo);

    int logicDeleteStation(String stationNo);
}
