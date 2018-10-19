package com.dyny.gms.db.cachce;

import java.util.Set;

/**
 * @author:wanggl
 * @date:2018-10-18
 * @version:1.0.0
 */
public interface CacheDao {

    void set(String key, String value);

    void set(String key, String value, Class classNamePrefix);

    void set(String key, Object value);

    void set(String key, Object value, Class classNamePrefix);

    void update(String key, Object value, Class targetClass);

    String get(String key);

    <T> T get(String key, Class<T> targetClass);

    <T> T get(String key, Class<T> targetClass, boolean autoPrefix);

    Long delete(Set<String> keyList);

    int delete(String key);

    Long deleteAll();

    boolean contains(String key);

    Set<String> getKeys(String pattern);


}
