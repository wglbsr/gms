package com.dyny.gms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.cache.CacheDao;
import com.dyny.gms.service.CacheService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wanggl
 * @date:2018-10-09
 * @version:1.0.0
 */
@Service
public class CacheServiceImpl implements CacheService {
    private static Logger logger = Logger.getLogger(CacheServiceImpl.class);
    @Autowired
    CacheDao cacheDao;


    @Override
    public void initCache() {
        this.initSystemConfig();
    }

    @Override
    public void setCache(String key, Object value) {
    }

    @Override
    public void setCache(String key, String value) {
        cacheDao.set(key, value);
    }

    @Override
    public JSONObject getJSONCache(String key) {
        return null;
    }

    @Override
    public Object getObjectCache(String key) {
        return null;
    }

    @Override
    public String getStringCache(String key) {
        return cacheDao.get(key);
    }

    private void initSystemConfig() {

//        logger.info("正常执行缓存加载任务initSystemConfig..........");
    }
}
