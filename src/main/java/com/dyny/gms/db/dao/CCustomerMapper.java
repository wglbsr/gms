package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.CCustomer;
import com.dyny.gms.db.pojo.CCustomerExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CCustomerMapper {
    long countByExample(CCustomerExample example);

    int deleteByExample(CCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CCustomer record);

    int insertSelective(CCustomer record);

    List<CCustomer> selectByExample(CCustomerExample example);

    CCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CCustomer record, @Param("example") CCustomerExample example);

    int updateByExample(@Param("record") CCustomer record, @Param("example") CCustomerExample example);

    int updateByPrimaryKeySelective(CCustomer record);

    int updateByPrimaryKey(CCustomer record);
}