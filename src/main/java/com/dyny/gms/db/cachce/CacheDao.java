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

    void update(String key, Object value);


    String get(String key);

    <T> T get(String key, Class<T> targetClass);

    <T> T get(String key, Class<T> targetClass, boolean autoPrefix);

    Long delete(Set<String> keyList);

    Long deleteAll();

    Long deleteByPattern(String pattern);

    int delete(String key);


    boolean contains(String key);

    Set<String> getKeys(String pattern);


}
