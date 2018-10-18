package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.cachce.CacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wanggl
 * @date:2018-10-16
 * @version:1.0.0
 */
@RestController
public class CacheController extends BaseController {


    @Autowired
    private CacheDao cacheDao;

    @RequestMapping("/cache/set")
    public String set(@RequestParam(name = "key") String key,
                      @RequestParam(name = "value") String value) {
        cacheDao.set(key, value);
        return "1";
    }

    @RequestMapping("/cache/get")
    public String get(@RequestParam(name = "key") String key) {
        return cacheDao.get(key);
    }
}
