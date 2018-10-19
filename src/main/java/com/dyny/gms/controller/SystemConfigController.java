package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.cachce.CacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
