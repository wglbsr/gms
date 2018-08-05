package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.CUserMapper;
import com.dyny.gms.db.pojo.CUser;
import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CUserMapper cUserMapper;

    @Override
    public List<CUser> getAllUser() {
        List<CUser> users = new ArrayList<CUser>();

        CUser fromDb = cUserMapper.selectByPrimaryKey(1);
        users.add(fromDb);
        return users;
    }
}
