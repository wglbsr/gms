package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.WarningType;
import com.dyny.gms.db.pojo.WarningTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WarningTypeMapper {
    long countByExample(WarningTypeExample example);

    int deleteByExample(WarningTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarningType record);

    int insertSelective(WarningType record);

    List<WarningType> selectByExample(WarningTypeExample example);

    WarningType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarningType record, @Param("example") WarningTypeExample example);

    int updateByExample(@Param("record") WarningType record, @Param("example") WarningTypeExample example);

    int updateByPrimaryKeySelective(WarningType record);

    int updateByPrimaryKey(WarningType record);
}