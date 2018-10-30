package com.dyny.gms.service.impl;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.LoginHistoryMapper;
import com.dyny.gms.db.dao.UserMapper;
import com.dyny.gms.db.pojo.LoginHistory;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.db.pojo.UserExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.UserService;
import com.dyny.gms.utils.CommonUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    LoginHistoryMapper loginHistoryMapper;
    @Autowired
    CacheDao cacheDao;

    @Override
    public int changePassword(String username, String oldPassword, String newPassword) {
        UserExample example = new UserExample();
        User user = new User();
        example.or().andUserNoEqualTo(username).andUserPassEqualTo(super.MD5(oldPassword));
        user.setUserPass(super.MD5(newPassword));
        return userMapper.updateByExampleSelective(user, example);
    }

    @Override
    public List<User> getUserByUserNo(String userNo) {
        UserExample example = new UserExample();
        example.or().andUserNoEqualTo(userNo);
        return userMapper.selectByExample(example);
    }

    @Override
    public int userRegister(User user) {
        user.setCreateTime(new Date());
        String password = user.getUserPass();
        user.setUserPass(super.MD5(password));
        return userMapper.insert(user);
    }


    /**
     * 逻辑删除
     *
     * @param userNo
     * @return
     */
    @Override
    public int deleteUserByUserNo(String userNo) {
        if (!StringUtils.isEmpty(userNo)) {
            User user = new User();
            UserExample userExample = new UserExample();
            userExample.or().andUserNoEqualTo(userNo);
            user.setDeleted(true);
            user.setModifyTime(new Date());
            return userMapper.updateByExampleSelective(user, userExample);
        } else {
            return 0;
        }
    }

    @Override
    public int saveLoginLog(LoginHistory loginHistory) {
        return loginHistoryMapper.insert(loginHistory);
    }

    @Value("${system.login.timeout}")
    private int loginTimeout;

    @Override
    public Map login(String username, String password) {
        List<User> userList = this.getUserListByUsernameAndPsw(username, password);
        String token = "";
        Map result = new HashMap();
        if (userList != null && userList.size() == 1) {
            Date date = new Date();
            String content = username + password + date.getTime();
            token = super.MD5(content);
            User user = userList.get(0);
            user.setUserPass("");
            cacheDao.set(token, user, loginTimeout, TimeUnit.MINUTES);
            result.put("AUTH_TOKEN", token);
            result.put("userLevel", user.getUserLevel());
            result.put("customerNo", user.getUserCus());
            result.put("usercus", user.getUserCus());
            result.put("user_cus", user.getUserCus());
        }
        return result;
    }

    @Override
    public int logout(String token) {
        return cacheDao.delete(token);
    }

    @Override
    public User getUserFromCache(String token) {
        return cacheDao.get(token, User.class);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectByPrimaryKey(username);
    }

    @Override
    public String getUserListByCustomerNoAndLevel(String customerNo, int level, String searchContent, int pageNum, int pageSize) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        UserExample.Criteria criteria2 = userExample.createCriteria();
        if (level >= super.ADMIN_LEVEL) {
            criteria1.andUserLevelLessThanOrEqualTo(level);
            criteria2.andUserLevelLessThanOrEqualTo(level);
        } else {
            criteria1.andUserCusEqualTo(customerNo).andUserLevelLessThanOrEqualTo(level);
            criteria2.andUserCusEqualTo(customerNo).andUserLevelLessThanOrEqualTo(level);
        }
        if (!StringUtils.isEmpty(searchContent)) {
            criteria1.andUserNoLike(super.appendLike(searchContent));
            criteria2.andUsernameCnLike(super.appendLike(searchContent));
        }
        userExample.or(criteria2);
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<User> result = userMapper.selectByExample(userExample);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
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
            if (!StringUtils.isEmpty(user.getUserCus()) && user.getUserCus().equals(parentNo)) {
                userCustomerNoList.add(user.getUserCus());
                break;
            }
        }
        super.getAllChildrenCusNo(parentNo, users, userCustomerNoList);
        return userCustomerNoList;
    }

    @Override
    public List<User> getNextLevelUser(String customerNo) {
        UserExample example = new UserExample();
        example.or().andParentCusNoEqualTo(customerNo);
        return userMapper.selectByExample(example);
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
            if (!StringUtils.isEmpty(user.getUserCus()) && user.getUserCus().equals(parentNo)) {
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
