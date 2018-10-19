package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.pojo.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:wanggl
 * @date:2018-10-19
 * @version:1.0.0
 */
@RestController
public class SystemConfigController extends BaseController {
    @Autowired
    CacheDao cacheDao;

    @RequestMapping(value = "/clearAllCache", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String clearAllCache() {
        return super.getSuccessResult(cacheDao.deleteAll());
    }

    @RequestMapping(value = "/getCacheKeys", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getCacheKeys(@RequestParam(value = "pattern", required = false, defaultValue = "*") String pattern) {
        return super.getSuccessResult(cacheDao.getKeys(pattern));
    }
}
