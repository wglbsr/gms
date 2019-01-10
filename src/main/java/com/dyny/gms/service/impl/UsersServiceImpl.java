package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UsersMapper;
import com.dyny.gms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dyny.gms.db.pojo.Users;
@Deprecated
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper mapper;

    @Override
    public Users getByNameAndPass(String username, String password) {
        // TODO Auto-generated method stub
        return mapper.getByNameAndPass(username, password);
    }


}
