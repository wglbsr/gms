package com.dyny.gms.controller;

import com.dyny.gms.service.SiteService;
import com.dyny.gms.service.impl.SiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneratorController extends BaseController {


    @RequestMapping(value = "/generators", method = RequestMethod.POST)
    public String getGeneratorByCondition(@RequestParam(value = "id", required = false) Integer id) {




        return super.getSuccessResult(null);
    }
}
