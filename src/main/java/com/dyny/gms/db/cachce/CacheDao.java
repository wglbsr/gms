package com.dyny.gms.db.cachce;

import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-18
 * @version:1.0.0
 */
public interface CacheDao {

    public void set(String key, String value);

    public void set(String key, String value, Class classNamePrefix);

    public void set(String key, Object value);

    public void set(String key, Object value, Class classNamePrefix);

    public String get(String key);

    public <T> T get(String key, Class<T> targetClass);

    public <T> T get(String key, Class<T> targetClass, boolean autoPrefix);


    public void delete(List<String> keyList);

    public void delete(String key);

    public boolean contains(String key);
}
