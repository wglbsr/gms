package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.ContactStationRel;
import com.dyny.gms.db.pojo.ContactStationRelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ContactStationRelMapper {
    long countByExample(ContactStationRelExample example);

    int deleteByExample(ContactStationRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContactStationRel record);

    int insertSelective(ContactStationRel record);

    List<ContactStationRel> selectByExample(ContactStationRelExample example);

    ContactStationRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContactStationRel record, @Param("example") ContactStationRelExample example);

    int updateByExample(@Param("record") ContactStationRel record, @Param("example") ContactStationRelExample example);

    int updateByPrimaryKeySelective(ContactStationRel record);

    int updateByPrimaryKey(ContactStationRel record);
}