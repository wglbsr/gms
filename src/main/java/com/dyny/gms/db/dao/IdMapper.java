package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Id;
import com.dyny.gms.db.pojo.IdExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IdMapper {
    long countByExample(IdExample example);

    int deleteByExample(IdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Id record);

    int insertSelective(Id record);

    List<Id> selectByExample(IdExample example);

    Id selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Id record, @Param("example") IdExample example);

    int updateByExample(@Param("record") Id record, @Param("example") IdExample example);

    int updateByPrimaryKeySelective(Id record);

    int updateByPrimaryKey(Id record);
}