package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.GeneratorStationRel;
import com.dyny.gms.db.pojo.GeneratorStationRelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GeneratorStationRelMapper {
    long countByExample(GeneratorStationRelExample example);

    int deleteByExample(GeneratorStationRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GeneratorStationRel record);

    int insertSelective(GeneratorStationRel record);

    List<GeneratorStationRel> selectByExample(GeneratorStationRelExample example);

    GeneratorStationRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GeneratorStationRel record, @Param("example") GeneratorStationRelExample example);

    int updateByExample(@Param("record") GeneratorStationRel record, @Param("example") GeneratorStationRelExample example);

    int updateByPrimaryKeySelective(GeneratorStationRel record);

    int updateByPrimaryKey(GeneratorStationRel record);
}