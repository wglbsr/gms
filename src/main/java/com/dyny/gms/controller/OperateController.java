package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Operate;
import com.dyny.gms.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/insertTimerOperateList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertTimerOperateList(@RequestParam(name = "machineNo") List<String> operateList,
                                         @RequestParam(name = "machineNo") int start,
                                         @RequestParam(name = "machineNo") String cmd) {
        return super.getSuccessResult(operateService.insertTimerOperateList(operateList, start, cmd));
    }


    @RequestMapping(value = "/getOperateList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getOperateList(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getOperateList(operate));
    }

    @RequestMapping(value = "/getTimerOperateList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getTimerOperateList(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getTimerOperateList(operate));
    }


    @RequestMapping(value = "/adjustTimeBtMachNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String adjustTimeBtMachNo(@RequestParam(name = "machineNo") String machineNo, @RequestParam(name = "username") String username) {
        return super.getSuccessResult(operateService.adjustTimeBtMachNo(machineNo, username));
    }


    @RequestMapping(value = "/getOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getOperate(operate));
    }

    @RequestMapping(value = "/getMaxOperateExeId", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getMaxOperateExeId(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.getMaxOperateExeId(operate));
    }

    @RequestMapping(value = "/deleteAllTimerOperateByMachineNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteAllTimerOperateByMachineNo(@RequestParam(name = "machineNo", required = true) String machineNo) {
        return super.getSuccessResult(operateService.deleteAllTimerOperateByMachineNo(machineNo));
    }

    @RequestMapping(value = "/deleteAllTimerOperateByMachineNoList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteAllTimerOperateByMachineNoList(@RequestParam(name = "machineNoList[]", required = true) List<String> machineNoList) {
        return super.getSuccessResult(operateService.deleteAllTimerOperateByMachineNoList(machineNoList));
    }


    @RequestMapping(value = "/deleteOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.deleteOperate(operate));
    }


    @RequestMapping(value = "/updateOperate", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateOperate(@RequestBody Operate operate) {
        return super.getSuccessResult(operateService.deleteOperate(operate));
    }


}
