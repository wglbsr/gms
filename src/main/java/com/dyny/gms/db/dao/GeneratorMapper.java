package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.GeneratorExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GeneratorMapper {
    long countByExample(GeneratorExample example);

    int deleteByExample(GeneratorExample example);

    int deleteByPrimaryKey(String machNo);

    int insert(Generator record);

    int insertSelective(Generator record);

    List<Generator> selectByExample(GeneratorExample example);

    Generator selectByPrimaryKey(String machNo);

    int updateByExampleSelective(@Param("record") Generator record, @Param("example") GeneratorExample example);

    int updateByExample(@Param("record") Generator record, @Param("example") GeneratorExample example);

    int updateByPrimaryKeySelective(Generator record);

    int updateByPrimaryKey(Generator record);

    int calculateGenerateTime();
}