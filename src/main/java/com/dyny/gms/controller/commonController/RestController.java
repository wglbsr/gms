package com.dyny.gms.controller.commonController;

import com.dyny.gms.db.dao.CommonMapper;
import com.dyny.gms.service.UserService;
import com.dyny.gms.utils.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/rest_api", produces = {"application/json;charset=UTF-8"})
public class RestController extends BaseController {
    @Autowired
    CommonMapper commonMapper;
    @Autowired
    UserService userService;

    @GetMapping(value = "/{dataObjectName}")
    @ResponseBody
    public Object retrieveData(@PathVariable("dataObjectName") String dataObjectName,
                               @RequestParam(name = "name") String name,
                               @RequestParam(name = "value") String value) {
        return commonMapper.select(dataObjectName, name, value);
    }


    @PostMapping(value = "/executeSql")
    @ResponseBody
    public Object exeSql(@RequestParam(name = "sql") String sql,
                         @RequestParam(name = "username", required = false, defaultValue = "") String username,
                         @RequestParam(name = "password", required = false, defaultValue = "") String password) {
        if (StringUtils.isEmpty(sql)) {
            return super.getErrorMsg("没有sql语句");
        }
        if (this.isModify(sql)) {
            List userList = userService.getUserListByUsernameAndPsw(username, password);
            if (userList == null || userList.size() == 0) {
                return super.getErrorMsg("密码错误!");
            } else {
                return super.getSuccessResult(commonMapper.executeModify(sql));
            }
        }
        return super.getSuccessResult(commonMapper.executeSelect(sql));
    }

    private boolean isModify(String sql) {
        return CommonUtil.String.contains(sql, "update", "insert", "delete", "merge");
    }
}
