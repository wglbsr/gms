package com.dyny.gms.db.dao;

import com.dyny.gms.annotation.Intercepted;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StationMapper {
    long countByExample(StationExample example);

    int deleteByExample(StationExample example);//批量

    int deleteByPrimaryKey(Integer id);//批量

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);//批量

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);//批量

    int updateByPrimaryKeySelective(Station record);//单个

    int updateByPrimaryKey(Station record);//批量

    int updateBatchByStationNo(List<Station> stationList);//批量

    int insertBatch(List<Station> stationList);//批量


}