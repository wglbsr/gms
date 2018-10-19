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

    int deleteByPrimaryKey(String machNo);//需要单个更新

    int insert(Generator record);

    int insertSelective(Generator record);

    List<Generator> selectByExample(GeneratorExample example);

    Generator selectByPrimaryKey(String machNo);

    int updateByExampleSelective(@Param("record") Generator record, @Param("example") GeneratorExample example);//需要批量更新

    int updateByExample(@Param("record") Generator record, @Param("example") GeneratorExample example);//需要批量更新

    int updateByPrimaryKeySelective(Generator record);//需要单个更新

    int updateByPrimaryKey(Generator record);//需要批量更新


    /******************手动添加*************************/
    int calculateGenerateTimeToMach();

    int calculateGenerateTimeToApTime();

    int updateByPrimaryKeySelectiveBatch(List<Generator> records);//需要批量更新

    List<String> getAllGeneratorNo();
}