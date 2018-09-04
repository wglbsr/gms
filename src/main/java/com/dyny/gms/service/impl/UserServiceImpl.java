package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UserMapper;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.db.pojo.UserExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.UserService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public int changePassword(String username, String oldPassword, String newPassword) {
        UserExample example = new UserExample();
        User user = new User();
        example.or().andUserNoEqualTo(username).andUserPassEqualTo(super.MD5(oldPassword));
        user.setUserPass(super.MD5(newPassword));
        return userMapper.updateByExampleSelective(user, example);
    }

    @Override
    public int userRegister(User user) {
        user.setCreateTime(new Date());
        String password = user.getUserPass();
        int maxId = userMapper.selectMaxId() + 1;
        String parentCusNo = user.getParentCusNo();
        if (!Tool.StringUtil.validStr(parentCusNo)) {
            String temp = System.currentTimeMillis() + "";//
            user.setUserCus(temp.substring(temp.length() - 3, temp.length()));
        } else {
            user.setUserCus(parentCusNo + maxId);
        }
        user.setUserPass(super.MD5(password));
        return userMapper.insert(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    /**
     * 获取所有子节点，只获取客户编号
     *
     * @param parentNo
     * @return
     */
    @Override
    public List<String> getAllChildrenCusNo(String parentNo) {
        UserExample example = new UserExample();
        List<User> users = userMapper.selectByExample(example);
        List<String> userCustomerNoList = new ArrayList<>();
        for (User user : users) {
            if (Tool.StringUtil.validStr(user.getUserCus()) && user.getUserCus().equals(parentNo)) {
                userCustomerNoList.add(user.getUserCus());
                break;
            }
        }
        super.getAllChildrenCusNo(parentNo, users, userCustomerNoList);
        return userCustomerNoList;
    }

    /**
     * @param parentNo
     * @return
     */
    @Override
    public List<User> getAllChildren(String parentNo) {
        UserExample example = new UserExample();
        List<User> users = userMapper.selectByExample(example);
        List<User> userList = new ArrayList<>();
        for (User user : users) {
            if (Tool.StringUtil.validStr(user.getUserCus()) && user.getUserCus().equals(parentNo)) {
                userList.add(user);
            }
        }
        super.getAllChildren(parentNo, users, userList);
        return userList;
    }

    @Override
    public List<User> getUserListByUsernameAndPsw(String username, String password) {
        UserExample example = new UserExample();
        example.or().andUserNoEqualTo(username).andUserPassEqualTo(super.MD5(password));
        return userMapper.selectByExample(example);
    }


}
