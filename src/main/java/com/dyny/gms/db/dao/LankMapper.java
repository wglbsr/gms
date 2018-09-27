package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Lank;
import com.dyny.gms.db.pojo.LankExample;
import java.util.List;

import com.dyny.gms.db.pojo.LankForPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LankMapper {
    long countByExample(LankExample example);

    int deleteByExample(LankExample example);

    int insert(Lank record);

    int insertSelective(Lank record);

    List<Lank> selectByExample(LankExample example);

    int updateByExampleSelective(@Param("record") Lank record, @Param("example") LankExample example);

    int updateByExample(@Param("record") Lank record, @Param("example") LankExample example);

    List<LankForPage> selectByCustomerNoAndKeyWord(@Param("startDate") long startDate, @Param("endDate") long endDate, @Param("customerNo") String customerNo, @Param("keyWord") String keyWord);

}