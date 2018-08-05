package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ApTime;
import com.dyny.gms.db.pojo.ApTimeExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApTimeMapper {
    long countByExample(ApTimeExample example);

    int deleteByExample(ApTimeExample example);

    int insert(ApTime record);

    int insertSelective(ApTime record);

    List<ApTime> selectByExample(ApTimeExample example);

    int updateByExampleSelective(@Param("record") ApTime record, @Param("example") ApTimeExample example);

    int updateByExample(@Param("record") ApTime record, @Param("example") ApTimeExample example);
}