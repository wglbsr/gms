package com.dyny.gms.service;

import com.dyny.gms.db.pojo.UserConfig;

/**
 * @Auther: lane
 * @Date: 2019-01-02 09:32
 * @Description:
 * @Version 1.0.0
 */
public interface UserConfigService {


    boolean insert(UserConfig userConfig);

    boolean update(UserConfig userConfig);

    UserConfig select(String username);

}
