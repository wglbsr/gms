package com.dyny.gms.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dyny.gms.db.pojo.Users;
@Mapper
public interface UsersMapper {
	
	public Users getByNameAndPass(@Param("username")String username, @Param("password")String password);
	
	public int add(Users users);
	
	public int updatePass(@Param("password")String password, @Param("username")String userName);
}
