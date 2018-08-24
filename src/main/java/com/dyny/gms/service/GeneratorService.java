package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Generator;

import java.util.List;
import java.util.Map;

public interface GeneratorService {

    public List getGenerator(Map<String, Object> condition, boolean fullInfo);


    public Generator getGeneratorDetail(String generatorNo);

    public int updateGenerator(Generator generator);

    public int deleteGenerator(String generatorNo);

    public int addGenerator(Generator generator);

    public List getGeneratorForStation(String stationNo, String cusNo);

    int relateGeneratorWithStation(String machNo,String stationNo,String CusNo,boolean relateFlag);
}
