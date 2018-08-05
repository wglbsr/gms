package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.OffTime;
import com.dyny.gms.db.pojo.OffTimeExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OffTimeMapper {
    long countByExample(OffTimeExample example);

    int deleteByExample(OffTimeExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(OffTime record);

    int insertSelective(OffTime record);

    List<OffTime> selectByExample(OffTimeExample example);

    OffTime selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") OffTime record, @Param("example") OffTimeExample example);

    int updateByExample(@Param("record") OffTime record, @Param("example") OffTimeExample example);

    int updateByPrimaryKeySelective(OffTime record);

    int updateByPrimaryKey(OffTime record);
}