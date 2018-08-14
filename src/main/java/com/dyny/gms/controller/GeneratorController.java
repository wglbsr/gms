package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.service.GeneratorService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class GeneratorController extends BaseController {
    @Autowired
    GeneratorService generatorService;


    @RequestMapping(value = "/getGeneratorDetail", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorDetail(HttpServletRequest request,
                                     HttpServletResponse response) {
        String machNo = request.getParameter("mach_no");
        if (Tool.StringUtil.validStr(machNo)) {
            return super.getSuccessResult(generatorService.getGeneratorDetail(machNo));
        } else {
            return super.getErrorMsg("请输入机器编号");
        }
    }
}
