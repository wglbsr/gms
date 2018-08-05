package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ApLank;
import com.dyny.gms.db.pojo.ApLankExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApLankMapper {
    long countByExample(ApLankExample example);

    int deleteByExample(ApLankExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(ApLank record);

    int insertSelective(ApLank record);

    List<ApLank> selectByExample(ApLankExample example);

    ApLank selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") ApLank record, @Param("example") ApLankExample example);

    int updateByExample(@Param("record") ApLank record, @Param("example") ApLankExample example);

    int updateByPrimaryKeySelective(ApLank record);

    int updateByPrimaryKey(ApLank record);
}