package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.CStation;
import com.dyny.gms.db.pojo.CStationExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CStationMapper {
    long countByExample(CStationExample example);

    int deleteByExample(CStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CStation record);

    int insertSelective(CStation record);

    List<CStation> selectByExample(CStationExample example);

    CStation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CStation record, @Param("example") CStationExample example);

    int updateByExample(@Param("record") CStation record, @Param("example") CStationExample example);

    int updateByPrimaryKeySelective(CStation record);

    int updateByPrimaryKey(CStation record);
}