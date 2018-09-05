package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.GeneratorContactRel;
import com.dyny.gms.db.pojo.GeneratorContactRelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GeneratorContactRelMapper {
    long countByExample(GeneratorContactRelExample example);

    int deleteByExample(GeneratorContactRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GeneratorContactRel record);

    int insertSelective(GeneratorContactRel record);

    List<GeneratorContactRel> selectByExample(GeneratorContactRelExample example);

    GeneratorContactRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GeneratorContactRel record, @Param("example") GeneratorContactRelExample example);

    int updateByExample(@Param("record") GeneratorContactRel record, @Param("example") GeneratorContactRelExample example);

    int updateByPrimaryKeySelective(GeneratorContactRel record);

    int updateByPrimaryKey(GeneratorContactRel record);
}