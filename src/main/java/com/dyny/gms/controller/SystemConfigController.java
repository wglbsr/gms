package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.SystemConfig;
import com.dyny.gms.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wanggl
 * @date:2018-10-22
 * @version:1.0.0
 */
@RestController
public class SystemConfigController extends BaseController {

    @Autowired
    private SystemConfigService systemConfigService;

    @RequestMapping(value = "/getConfig", produces = {"application/json;charset=UTF-8"})
    public String getConfig() {
        return super.getSuccessResult(systemConfigService.getConfig());
    }

    @RequestMapping(value = "/updateConfig", produces = {"application/json;charset=UTF-8"})
    public String updateConfig(@RequestBody SystemConfig systemConfig) {
        return super.getSuccessResult(systemConfigService.updateConfig(systemConfig));
    }

    @RequestMapping(value = "/insertConfig", produces = {"application/json;charset=UTF-8"})
    public String insertConfig(@RequestBody SystemConfig systemConfig) {
        return super.getSuccessResult(systemConfigService.createConfig(systemConfig));
    }

    @RequestMapping(value = "/initBootCache", produces = {"application/json;charset=UTF-8"})
    public String initBootCache() {
        return super.getSuccessResult(systemConfigService.initMybatisInterceptorCache());
    }
}
