package com.dyny.gms.controller;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.utils.MD5Util;
import com.dyny.gms.db.pojo.Users;
import com.dyny.gms.service.UsersService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * project controller
 *
 * @author zhangmx
 */
@Deprecated
@Controller
@RequestMapping(value="/ems/users",produces = {"application/json;charset=UTF-8"})
public class UsersController {

    private final Logger log = Logger.getLogger(UsersController.class);

    @Autowired
    private UsersService service;

    @RequestMapping(value="/login.do",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(HttpServletRequest request,
                            HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Users users = service.getByNameAndPass(username,  MD5Util.GetMD5By32(password));
            if (null == users) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "用户名或密码错误");
                return resultMap;
            }
            if (99 == users.getState()) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "用户账号已停用");
                return resultMap;
            }
            String userCus = users.getUsercus();
            if(userCus==null){
                userCus="";
            }
            resultMap.put("username", users.getUsername());
            resultMap.put("userlevel", users.getUserlevel());
            resultMap.put("usercus", userCus);
            resultMap.put("result", "true");
        } catch (Exception e){
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }


}
