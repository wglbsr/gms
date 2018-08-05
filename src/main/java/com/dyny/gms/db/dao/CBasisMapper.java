package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.CBasis;
import com.dyny.gms.db.pojo.CBasisExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CBasisMapper {
    long countByExample(CBasisExample example);

    int deleteByExample(CBasisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CBasis record);

    int insertSelective(CBasis record);

    List<CBasis> selectByExample(CBasisExample example);

    CBasis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CBasis record, @Param("example") CBasisExample example);

    int updateByExample(@Param("record") CBasis record, @Param("example") CBasisExample example);

    int updateByPrimaryKeySelective(CBasis record);

    int updateByPrimaryKey(CBasis record);
}