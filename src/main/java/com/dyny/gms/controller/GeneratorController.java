package com.dyny.gms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratorController {


    @RequestMapping(value = "/generators", method = RequestMethod.POST)
    public String hello(@RequestParam(value = "id", required = false) Integer id) {



        return "hello";
    }
}
