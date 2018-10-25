package com.dyny.gms.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CommonMapper {

    List select(@Param("table") String tableName, @Param("name") String pk_name, @Param("value") String value);

    List execute(@Param("sql") String sql);

}