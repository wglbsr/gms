package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.BasisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasisMapper {
    long countByExample(BasisExample example);

    int deleteByExample(BasisExample example);

    int insert(Basis record);

    int insertSelective(Basis record);

    List<Basis> selectByExample(BasisExample example);

    int updateByExampleSelective(@Param("record") Basis record, @Param("example") BasisExample example);

    int updateByExample(@Param("record") Basis record, @Param("example") BasisExample example);
}