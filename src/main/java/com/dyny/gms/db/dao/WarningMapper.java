package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Warning;
import com.dyny.gms.db.pojo.WarningExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarningMapper {
    long countByExample(WarningExample example);

    int deleteByExample(WarningExample example);

    int insert(Warning record);

    int insertSelective(Warning record);

    List<Warning> selectByExample(WarningExample example);

    int updateByExampleSelective(@Param("record") Warning record, @Param("example") WarningExample example);

    int updateByExample(@Param("record") Warning record, @Param("example") WarningExample example);



    /*************************************************************************************************/
    List<Map> selectActionCount(@Param("generatorNo") String generatorNo);
}