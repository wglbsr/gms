package com.dyny.gms.db.cachce;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.utils.CommonUtil;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-18
 * @version:1.0.0
 */
public interface CacheDao {

    public void set(String key, String value);

    public void set(String key, Object value);

    public String get(String key);

    public <T> T get(String key, Class<T> targetClass);

    public void delete(List<String> keyList);

    public void delete(String key);

    public boolean contains(String key);
}
