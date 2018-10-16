package com.dyny.gms.service;


import com.alibaba.fastjson.JSONObject;

public interface CacheService {

    void initCache();

    void setCache(String key, Object value);

    void setCache(String key, String value);

    JSONObject getJSONCache(String key);

    Object getObjectCache(String key);

    String getStringCache(String key);

}
