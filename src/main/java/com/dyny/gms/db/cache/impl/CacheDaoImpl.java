package com.dyny.gms.db.cache.impl;

import com.dyny.gms.db.cache.CacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * @author:wanggl
 * @date:2018-10-16
 * @version:1.0.0
 */
@Repository
public class CacheDaoImpl implements CacheDao {
    @Autowired
    StringRedisTemplate template;

    @Override
    public void set(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value);
    }

    @Override
    public String get(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }
}
