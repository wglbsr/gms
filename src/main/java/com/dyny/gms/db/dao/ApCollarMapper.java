package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ApCollar;
import com.dyny.gms.db.pojo.ApCollarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApCollarMapper {
    long countByExample(ApCollarExample example);

    int deleteByExample(ApCollarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApCollar record);

    int insertSelective(ApCollar record);

    List<ApCollar> selectByExample(ApCollarExample example);

    ApCollar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApCollar record, @Param("example") ApCollarExample example);

    int updateByExample(@Param("record") ApCollar record, @Param("example") ApCollarExample example);

    int updateByPrimaryKeySelective(ApCollar record);

    int updateByPrimaryKey(ApCollar record);
}