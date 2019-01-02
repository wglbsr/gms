package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.db.pojo.UserConfig;
import com.dyny.gms.service.UserConfigService;
import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    @Autowired
    UserConfigService userConfigService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password) {
        return super.getSuccessResult(userService.login(username, password));
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String logout(@RequestParam(value = UserService.TOKEN_NAME) String token) {
        return super.getSuccessResult(userService.logout(token));
    }


    @RequestMapping(value = "/getAllMyChildrenCustomerNo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getAllMyChildrenCustomerNo(@RequestParam(value = "customerNo") String customerNo) {
        return super.getSuccessResult(userService.getAllChildrenCusNo(customerNo));
    }

    @RequestMapping(value = "/getAllMyChildren", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getAllMyChildren(@RequestParam(value = "customerNo") String customerNo) {
        return super.getSuccessResult(userService.getAllChildren(customerNo));
    }


    @RequestMapping(value = "/getNextLevelUser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getNextLevelUser(@RequestParam(value = "customerNo") String customerNo) {
        return super.getSuccessResult(userService.getNextLevelUser(customerNo));
    }


    @RequestMapping(value = "/userRegister", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String userRegister(@RequestBody User user) {
        return super.getSuccessResult(userService.userRegister(user));
    }


    @RequestMapping(value = "/getUserConfig", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getConfig(@RequestParam("username") String username) {
        return super.getSuccessResult(userConfigService.select(username));
    }

    @RequestMapping(value = "/updateUserConfig", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateConfig(@RequestBody UserConfig userConfig) {
        return super.getSuccessResult(userConfigService.update(userConfig));
    }


    @RequestMapping(value = "/getUserByUserNo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUserByUserNo(@RequestParam(value = "userNo") String userNo) {
        return super.getSuccessResult(userService.getUserByUserNo(userNo));
    }

    @RequestMapping(value = "/deleteUserByUserNo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteUserByUserNo(@RequestParam(value = "userNo") String userNo) {
        return super.getSuccessResult(userService.deleteUserByUserNo(userNo));
    }


    @RequestMapping(value = "/checkUsername", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkUsername(@RequestParam(value = "username") String username) {
        User user = userService.getUserByUsername(username);
        return super.getSuccessResult(user == null ? 0 : 1);
    }


    @RequestMapping(value = "/changePassword", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String changePassword(@RequestParam(value = "username") String username,
                                 @RequestParam(value = "oldPassword") String oldPassword,
                                 @RequestParam(value = "newPassword") String newPassword) {
        return super.getSuccessResult(userService.changePassword(username, oldPassword, newPassword));
    }

//getUserListByCustomerNoAndLevel


    @RequestMapping(value = "/getUserListByCustomerNoAndLevel", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUserListByCustomerNoAndLevel(@RequestParam(value = "level") int level,
                                                  @RequestParam(value = "pageNum", required = false, defaultValue = "0") int pageNum,
                                                  @RequestParam(value = "pageSize", required = false, defaultValue = "0") int pageSize,
                                                  @RequestParam(value = "searchContent", required = false, defaultValue = "") String searchContent,
                                                  @RequestParam(value = "customerNo") String customerNo) {
        return userService.getUserListByCustomerNoAndLevel(customerNo, level, searchContent, pageNum, pageSize);
    }


}
