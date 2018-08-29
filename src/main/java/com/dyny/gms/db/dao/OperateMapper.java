package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Operate;
import com.dyny.gms.db.pojo.OperateExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OperateMapper {
    long countByExample(OperateExample example);

    int deleteByExample(OperateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operate record);

    int insertBatch(List<Operate> list);

    int insertSelective(Operate record);

    int selectMaxExeIdByMachNo(String machNo);

    List<Operate> selectByExample(OperateExample example);

    Operate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByExample(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByPrimaryKeySelective(Operate record);

    int updateByPrimaryKey(Operate record);
}