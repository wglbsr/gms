package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ApOperate;
import com.dyny.gms.db.pojo.ApOperateExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ApOperateMapper {
    long countByExample(ApOperateExample example);

    int deleteByExample(ApOperateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApOperate record);

    int insertSelective(ApOperate record);

    List<ApOperate> selectByExample(ApOperateExample example);

    ApOperate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApOperate record, @Param("example") ApOperateExample example);

    int updateByExample(@Param("record") ApOperate record, @Param("example") ApOperateExample example);

    int updateByPrimaryKeySelective(ApOperate record);

    int updateByPrimaryKey(ApOperate record);
}