package com.dyny.gms.service;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.Generator;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface GeneratorService {

    int updateGenerator(List<Generator> generator);

    List getGenerator(Map<String, Object> condition, boolean fullInfo);

    Generator getGeneratorDetail(String generatorNo);

    int updateGenerator(Generator generator);

    int deleteGeneratorByGeneratorNo(String generatorNo);

    int addGenerator(Generator generator);

    List getGeneratorForStation(String stationNo, String cusNo, String searchContent);

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

    int generatorRegister(Generator generator);

    int changeBootVoltage(List<String> generatorNoList, BigDecimal startVoltage);

    int activateGenerator(List<String> generatorNoList, boolean activate, String username);

    int saveActivateLog(List<String> generatorNoList, boolean activate, String username,String customerNo);

    String getActivateHistory(String keyWord, int level, String generatorNo, String customerNo, int activate, int pageNum, int pageSize, long startDate, long endDate) throws ParseException;

    int saveGeneratorData(Basis basis);

    String getGeneratorDataFromCache(String generatorNo);

    List<String> getAllGeneratorNo();

    void saveGeneratorNoToCache();
}
