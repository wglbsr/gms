package com.dyny.gms.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CommonMapper {

    List<HashMap<String, Object>> selectByPrimaryKey(@Param("table") String tableName, @Param("pk_name") String pk_name, @Param("pk_value") String pk_value);
}