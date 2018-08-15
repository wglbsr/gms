package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Enumeration;
import com.dyny.gms.db.pojo.EnumerationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EnumerationMapper {
    long countByExample(EnumerationExample example);

    int deleteByExample(EnumerationExample example);

    int insert(Enumeration record);

    int insertSelective(Enumeration record);

    List<Enumeration> selectByExample(EnumerationExample example);

    int updateByExampleSelective(@Param("record") Enumeration record, @Param("example") EnumerationExample example);

    int updateByExample(@Param("record") Enumeration record, @Param("example") EnumerationExample example);
}