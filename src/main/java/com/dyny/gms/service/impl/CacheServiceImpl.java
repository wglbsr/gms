package com.dyny.gms.service.impl;

import com.dyny.gms.service.CacheService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author:wanggl
 * @date:2018-10-09
 * @version:1.0.0
 */
@Service
public class CacheServiceImpl implements CacheService {
    private static Logger logger = Logger.getLogger(CacheServiceImpl.class);

    @Override
    public void initCache() {
        this.initSystemConfig();
    }

    private void initSystemConfig() {
        logger.info("正常执行缓存加载任务initSystemConfig..........");
    }
}
