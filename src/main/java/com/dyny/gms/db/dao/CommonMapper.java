package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.GeneratorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface CommonMapper {

    List<HashMap<String, Object>> selectByPrimaryKey(@Param("table") String tableName, @Param("pk_name") String pk_name, @Param("pk_value") String pk_value);
}