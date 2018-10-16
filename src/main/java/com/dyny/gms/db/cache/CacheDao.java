package com.dyny.gms.db.cache;

/**
 * @author:wanggl
 * @date:2018-10-16
 * @version:1.0.0
 */
public interface CacheDao {
    void set(String key, String value);
    String get(String key);

}
