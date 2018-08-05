package com.dyny.gms.controller;

import com.dyny.gms.db.pojo.CUser;
import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        System.out.println("hello");
        return "hello";

    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<CUser> getAllUser(Integer offset, Integer limit) {

        return userService.getAllUser();

    }
}
