package com.dyny.gms.controller;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.db.pojo.Users;
import com.dyny.gms.service.UserService;
import com.dyny.gms.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String login(@RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password) {
        List<User> users = userService.getUserListByUsernameAndPsw(username, password);
        return super.getSuccessResult(users);
    }


    @RequestMapping(value = "/getAllMyChildrenCustomerNo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getAllMyChildrenCustomerNo(@RequestParam(value = "customerNo", required = true) String customerNo) {
        return super.getSuccessResult(userService.getAllChildrenCusNo(customerNo));
    }

    @RequestMapping(value = "/getAllMyChildren", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getAllMyChildren(@RequestParam(value = "customerNo", required = true) String customerNo) {
        return super.getSuccessResult(userService.getAllChildren(customerNo));
    }


    @RequestMapping(value = "/userRegister", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String userRegister(@RequestBody User user) {
        return super.getSuccessResult(userService.userRegister(user));
    }


    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkUsername(@RequestParam(value = "username", required = true) String username) {
        User user = userService.getUserByUsername(username);
        return super.getSuccessResult(user == null ? 0 : 1);
    }


    @RequestMapping(value = "/changePassword", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String changePassword(@RequestParam(value = "username", required = true) String username,
                                 @RequestParam(value = "oldPassword", required = true) String oldPassword,
                                 @RequestParam(value = "newPassword", required = true) String newPassword) {
        return super.getSuccessResult(userService.changePassword(username, oldPassword, newPassword));
    }


    /**
     * @return
     */
    private String getToken() {
        //1.生成token
        //2.保存到缓存

        return "";
    }


}
