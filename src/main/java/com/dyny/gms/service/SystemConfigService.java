package com.dyny.gms.service;

import com.dyny.gms.db.pojo.SystemConfig;

/**
 * @author:wanggl
 * @date:2018-10-22
 * @version:1.0.0
 */
public interface SystemConfigService {
    static String SYSTEM_CONFIG_CACHE = "SystemConfig";


    SystemConfig getConfig();

    int updateConfig(SystemConfig systemConfig);

    int createConfig(SystemConfig systemConfig);

    int initMybatisInterceptorCache();

}
