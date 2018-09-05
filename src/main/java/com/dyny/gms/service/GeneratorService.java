package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Generator;

import java.util.List;
import java.util.Map;

public interface GeneratorService {

    public List getGenerator(Map<String, Object> condition, boolean fullInfo);


    public Generator getGeneratorDetail(String generatorNo);

    public int updateGenerator(Generator generator);

    public int deleteGeneratorByGeneratorNo(String generatorNo);

    public int addGenerator(Generator generator);

    public List getGeneratorForStation(String stationNo, String cusNo);

    int relateGeneratorWithStation(String machNo, String stationNo, String CusNo, boolean relateFlag, List<Integer> contactId);

    int getGeneratorNumByStatus(String customerNo, String status);

    int disrelateGeneratorWithStationByStationNo(String stationNo);

    int insertToGeneratorContactTable(String machNo, List<Integer> contactIdList);

    int insertToGeneratorStationTable(String machNo, String stationNo);

    int logicDeleteGeneratorStationTable(String machNo, String stationNo);

    int logicDeleteGeneratorContactTable(String machNo, List<Integer> contactIdList);

    int setEmptyStationNo(String generatorNo, String stationNo);

    int logicDeleteGeneratorContactByStationNo(String stationNo);

    List getGeneratorByStationNo(String stationNo);

}
