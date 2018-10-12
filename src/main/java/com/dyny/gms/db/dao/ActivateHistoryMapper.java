package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ActivateHistory;
import com.dyny.gms.db.pojo.ActivateHistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ActivateHistoryMapper {
    long countByExample(ActivateHistoryExample example);

    int deleteByExample(ActivateHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivateHistory record);

    int insertSelective(ActivateHistory record);

    List<ActivateHistory> selectByExample(ActivateHistoryExample example);

    ActivateHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivateHistory record, @Param("example") ActivateHistoryExample example);

    int updateByExample(@Param("record") ActivateHistory record, @Param("example") ActivateHistoryExample example);

    int updateByPrimaryKeySelective(ActivateHistory record);

    int updateByPrimaryKey(ActivateHistory record);

    int insertBatch(List<ActivateHistory> activateHistoryList);
}