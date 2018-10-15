package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.BasisExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BasisMapper {
    long countByExample(BasisExample example);

    int deleteByExample(BasisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Basis record);

    int insertSelective(Basis record);

    List<Basis> selectByExample(BasisExample example);

    Basis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Basis record, @Param("example") BasisExample example);

    int updateByExample(@Param("record") Basis record, @Param("example") BasisExample example);

    int updateByPrimaryKeySelective(Basis record);

    int updateByPrimaryKey(Basis record);

    List selectByOffset(@Param("offset") int offset, @Param("machNo") String machNo,@Param("samplingInterval") int samplingInterval,//samplingInterval
                               @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}