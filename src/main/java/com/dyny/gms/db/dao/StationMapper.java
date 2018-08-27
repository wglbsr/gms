package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StationMapper {
    long countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);
}