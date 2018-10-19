package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.CacheMethod;
import com.dyny.gms.db.pojo.CacheMethodExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CacheMethodMapper {
    long countByExample(CacheMethodExample example);

    int deleteByExample(CacheMethodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CacheMethod record);

    int insertSelective(CacheMethod record);

    List<CacheMethod> selectByExample(CacheMethodExample example);

    CacheMethod selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CacheMethod record, @Param("example") CacheMethodExample example);

    int updateByExample(@Param("record") CacheMethod record, @Param("example") CacheMethodExample example);

    int updateByPrimaryKeySelective(CacheMethod record);

    int updateByPrimaryKey(CacheMethod record);
}