package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class GeneratorController extends BaseController {
    @Autowired
    GeneratorService generatorService;

    /**
     * 获得油机详情
     *
     * @param machNo
     * @return
     */
    @RequestMapping(value = "/getGeneratorDetail", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorDetail(@RequestParam(name = "mach_no", required = true) String machNo) {
        return super.getSuccessResult(generatorService.getGeneratorDetail(machNo));
    }


    /**
     * 根据客户编号获得油机
     *
     * @param cusNo
     * @return
     */
    @RequestMapping(value = "/getGeneratorByCusNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorByCusNo(@RequestParam(name = "user_cus", required = true) String cusNo) {
        return super.getSuccessResult(generatorService.getGeneratorDetail(cusNo));
    }

    /**
     * 更新油机信息
     *
     * @param generator
     * @return
     */
    @RequestMapping(value = "/updateGenerator", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateGenerator(@RequestBody Generator generator) {
        if (generator != null) {
            return super.getSuccessResult(generatorService.updateGenerator(generator));
        } else {
            return super.getErrorMsg("请输入机器编号");
        }
    }


    /**
     * 获得指定客户编号的油机,条件为该基站的编号或者基站编号为空
     *
     * @param stationNo
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/getGeneratorForStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorForStation(@RequestParam(name = "stationNo", required = true) String stationNo, @RequestParam(name = "user_cus", required = true) String user_cus) {
        return super.getSuccessResult(generatorService.getGeneratorForStation(stationNo, user_cus));
    }


    /**
     * 关联/取消关联油机
     *
     * @param stationNo
     * @param machNo
     * @param relate
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/relateGeneratorWithStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String relateGeneratorWithStation(@RequestParam(name = "stationNo", required = false, defaultValue = "") String stationNo,
                                             @RequestParam(name = "machNo", required = true) String machNo,
                                             @RequestParam(name = "relate", required = true) boolean relate,
//                                             @RequestParam(name = "contactIdList", required = true) List<Integer> contactIdList,
                                             @RequestParam(name = "user_cus", required = true) String user_cus) {
        return super.getSuccessResult(generatorService.relateGeneratorWithStation(machNo, stationNo, user_cus, relate, new ArrayList<Integer>()));//暂时不需要选择油机操作人员
    }


    /**
     * 获得各个状态的油机数量,status参数暂时没有用上
     *
     * @param status
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/getGeneratorNumByStatus", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorNumByStatus(
            @RequestParam(name = "status", required = true) String status,
            @RequestParam(name = "user_cus", required = true) String user_cus) {
        return super.getSuccessResult(generatorService.getGeneratorNumByStatus(status, user_cus));
    }

    /**
     * 获得各个状态的油机数量,status参数暂时没有用上
     *
     * @param status
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/generatorRegister", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String generatorRegister(@RequestBody Generator generator) {

        return super.getSuccessResult(generatorService.generatorRegister(generator));
    }


}
