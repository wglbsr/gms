package com.dyny.gms.db.cachce.impl;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.utils.CommonUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @author:wanggl
 * @date:2018-10-18
 * @version:1.0.0
 */
@Repository
public class RedisDaoImpl implements CacheDao {
    private static Logger logger = Logger.getLogger(RedisDaoImpl.class);


    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public void set(String key, String value) {
        ValueOperations<String, String> operations = this.redisTemplate.opsForValue();
        operations.set(key, value);
        logger.info("插入缓存**key:" + key + ",value:" + value);
    }

    @Override
    public void update(String key, Object value, Class targetClass) {
        if (redisTemplate.hasKey(key)) {
            this.set(key, value, targetClass);
        }
    }

    @Override
    public void update(String key, Object value) {
        if (redisTemplate.hasKey(key)) {
            logger.info("更新缓存:" + key);
            this.set(key, value);
        }
    }

    @Override
    public void set(String key, String value, Class targetClass) {
        this.set(targetClass.getSimpleName() + key, value);
    }

    @Override
    public void set(String key, Object value) {
        if (value != null) {
            this.set(key, JSONObject.toJSONString(value));
        }
    }

    /**
     * @param key
     * @param value
     * @param targetClass 注意只是类名没有包名
     */
    @Override
    public void set(String key, Object value, Class targetClass) {
        if (value != null) {
            this.set(targetClass.getSimpleName() + key, JSONObject.toJSONString(value));
        }
    }

    @Override
    public String get(String key) {
        if (this.redisTemplate.hasKey(key)) {
            ValueOperations<String, String> operations = this.redisTemplate.opsForValue();
            return operations.get(key);
        } else {
            return null;
        }
    }

    @Override
    public <T> T get(String key, Class<T> targetClass) {
        String strValue = this.get(key);
        if (CommonUtil.String.validStr(strValue)) {
            return JSONObject.parseObject(strValue, targetClass);
        } else {
            return null;
        }
    }

    @Override
    public <T> List<T> getList(String key, Class<T> targetClass) {
        String strValue = this.get(key);
        if (CommonUtil.String.validStr(strValue)) {
            return JSONObject.parseArray(strValue, targetClass);
        } else {
            return null;
        }
    }

    @Override
    public <T> List<T> getList(String key, Class<T> targetClass, boolean autoPrefix) {
        if (autoPrefix) {
            return this.getList(targetClass.getSimpleName() + key, targetClass);
        } else {
            return this.getList(key, targetClass);
        }
    }

    @Override
    public <T> T get(String key, Class<T> targetClass, boolean autoPrefix) {
        if (autoPrefix) {
            return this.get(targetClass.getSimpleName() + key, targetClass);
        } else {
            return this.get(key, targetClass);
        }
    }

    @Override
    public Long delete(Set<String> keyList) {
        logger.info("批量清除缓存数量:" + keyList.size());
        return this.redisTemplate.delete(keyList);
    }

    @Override
    public int delete(String key) {
        logger.info("清除缓存:" + key);
        return this.redisTemplate.delete(key) ? 1 : 0;
    }

    @Override
    public int delete(String key, String className) {
        return this.delete(className + key);
    }

    @Override
    public Long deleteAll() {
        return this.deleteByPattern("*");
    }

    @Override
    public Long deleteByPattern(String pattern) {
        Set<String> keys = this.getKeys(pattern);
        return this.delete(keys);
    }

    @Override
    public boolean contains(String key) {
        return this.redisTemplate.hasKey(key);
    }

    @Override
    public Set<String> getKeys(String pattern) {
        return this.redisTemplate.keys(pattern);
    }

}
