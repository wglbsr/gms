package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.CBasis1;
import com.dyny.gms.db.pojo.CBasis1Example;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CBasis1Mapper {
    long countByExample(CBasis1Example example);

    int deleteByExample(CBasis1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CBasis1 record);

    int insertSelective(CBasis1 record);

    List<CBasis1> selectByExample(CBasis1Example example);

    CBasis1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CBasis1 record, @Param("example") CBasis1Example example);

    int updateByExample(@Param("record") CBasis1 record, @Param("example") CBasis1Example example);

    int updateByPrimaryKeySelective(CBasis1 record);

    int updateByPrimaryKey(CBasis1 record);
}