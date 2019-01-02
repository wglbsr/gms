package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.UserConfigMapper;
import com.dyny.gms.db.pojo.UserConfig;
import com.dyny.gms.service.UserConfigService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lane
 * @Date: 2019-01-02 09:33
 * @Description:
 * @Version 1.0.0
 */
@Service
public class UserConfigServiceImpl implements UserConfigService {
    @Autowired
    UserConfigMapper userConfigMapper;

    @Override
    public boolean insert(UserConfig userConfig) {

        return userConfigMapper.insert(userConfig) > 0;
    }

    @Override
    public boolean update(UserConfig userConfig) {
        return userConfigMapper.updateByPrimaryKeySelective(userConfig) > 0;
    }

    @Override
    public UserConfig select(String username) {
        return userConfigMapper.selectByPrimaryKey(username);
    }
}
