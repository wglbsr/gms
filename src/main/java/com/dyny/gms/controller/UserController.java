package com.dyny.gms.controller;

import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id", required = false) Integer id) {
        System.out.println("hello");
        return "hello 这是一个中文字符串";

    }

//    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
//    public List<CUser> getAllUser(@RequestParam(value = "id", required = false) Integer id) {
//        return userService.getAllUser();
//
//    }
}
