package com.dyny.gms.db.dao;

import com.dyny.gms.db.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Deprecated
@Mapper
public interface UsersMapper {

    public Users getByNameAndPass(@Param("username") String username, @Param("password") String password);

    public int add(Users users);

    public int updatePass(@Param("password") String password, @Param("username") String userName);
}
