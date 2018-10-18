package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
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
    private CacheService cacheService;

    @RequestMapping("/set")
    public String set(@RequestParam(name = "key") String key,
                      @RequestParam(name = "value") String value) {
        cacheService.setCache(key, value);
        return "1";
    }

    @RequestMapping("/get")
    public String get(@RequestParam(name = "key") String key) {
        return cacheService.getStringCache(key);
    }
}
