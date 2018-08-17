package com.dyny.gms.controller.commonController;

import com.dyny.gms.db.dao.CommonMapper;
import com.dyny.gms.db.pojo.CommonPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Map;

@Controller
@RequestMapping(value = "/rest_api", produces = {"application/json;charset=UTF-8"})
public class RestController extends BaseController {
    @Autowired
    CommonMapper commonMapper;

    @GetMapping(value = "/{dataObjectName}")
    @ResponseBody
    public String retrieveData(@PathVariable("dataObjectName") String dataObjectName, @RequestParam Map<String, String> params) {
        String pk_name = params.get("pk_name");
        String pk_value = params.get("pk_value");
        return super.getSuccessResult(commonMapper.selectByPrimaryKey(dataObjectName, pk_name, pk_value));
    }

    private Object getMapper(String mapperName) {
        return null;
    }
}
