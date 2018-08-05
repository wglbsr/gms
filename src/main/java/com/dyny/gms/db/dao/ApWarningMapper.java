package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ApWarning;
import com.dyny.gms.db.pojo.ApWarningExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApWarningMapper {
    long countByExample(ApWarningExample example);

    int deleteByExample(ApWarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApWarning record);

    int insertSelective(ApWarning record);

    List<ApWarning> selectByExample(ApWarningExample example);

    ApWarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApWarning record, @Param("example") ApWarningExample example);

    int updateByExample(@Param("record") ApWarning record, @Param("example") ApWarningExample example);

    int updateByPrimaryKeySelective(ApWarning record);

    int updateByPrimaryKey(ApWarning record);
}