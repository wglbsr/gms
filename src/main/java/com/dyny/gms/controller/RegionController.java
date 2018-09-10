package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController extends BaseController {

    @Autowired
    RegionService regionService;

    @RequestMapping(value = "/getRegionByParent", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getRegionByParent(@RequestParam(value = "parentId", required = false, defaultValue = "0") int parentId) {
        return super.getSuccessResult(regionService.getRegionByParent(parentId));
    }

}
