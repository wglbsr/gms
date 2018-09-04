package com.dyny.gms.service;

import com.dyny.gms.db.pojo.User;

import java.util.List;

public interface UserService {
    List<String> getAllChildrenCusNo(String parentNo);

    List<User> getAllChildren(String parentNo);

    User getUserByUsername(String username);

    List<User> getUserListByUsernameAndPsw(String username, String password);

    int userRegister(User user);

    int changePassword(String username, String oldPassword, String newPassword);

}
