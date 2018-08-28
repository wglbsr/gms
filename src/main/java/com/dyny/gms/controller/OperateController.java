package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Operate;
import com.dyny.gms.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperateController extends BaseController {

    @Autowired
    OperateService operateService;

    @RequestMapping(value = "/insertOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.insertOperate(operate));
    }


    @RequestMapping(value = "/insertOperateList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertOperateList(@RequestBody List<Operate> operateList) {
        return super.getSuccessResult(operateService.insertOperate(operateList));
    }

    @RequestMapping(value = "/getOperateList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getOperateList(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getOperateList(operate));
    }


    @RequestMapping(value = "/getOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getOperate(operate));
    }

    @RequestMapping(value = "/deleteOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.deleteOperate(operate));
    }


}
