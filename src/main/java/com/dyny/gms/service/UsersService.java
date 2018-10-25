package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Users;

@Deprecated
public interface UsersService {

    Users getByNameAndPass(String username, String password);


}
