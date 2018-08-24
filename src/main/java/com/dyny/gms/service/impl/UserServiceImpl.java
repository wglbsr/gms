package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UserMapper;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.db.pojo.UserExample;
import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<String> getAllChildrenCusNo(String parentNo) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> users = userMapper.selectByExample(example);
        return null;
    }

    private static void getAllChildrenCusNo(String parentCusNo, List<User> users, List<String> target) {

        Iterator it = users.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            String userCus = user.getParentCusNo();
            if (userCus.equals(parentCusNo)) {
                it.remove();
                target.add(userCus);
                users.remove(user);
                getAllChildrenCusNo(userCus, users, target);
            }
        }
    }

    public static void main(String args[]) {
        List<String> target = new ArrayList<String>();
        List<User> list = new ArrayList<User>();
    }
}
