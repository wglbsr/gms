package com.dyny.gms.controller.commonController;

import com.dyny.gms.service.EnumerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnumerationController extends BaseController {
    @Autowired
    EnumerationService enumerationService;


    @RequestMapping(value = "getEnumList")
    public String getEnumList() {
        return super.getSuccessResult(enumerationService.getEnumList());
    }

}
