package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GeneratorController extends BaseController {
    @Autowired
    GeneratorService generatorService;


    @RequestMapping(value = "/getGeneratorDetail", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorDetail(@RequestParam(name = "mach_no", required = true) String machNo) {
        return super.getSuccessResult(generatorService.getGeneratorDetail(machNo));
    }

    @RequestMapping(value = "/getGeneratorByCusNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorByCusNo(@RequestParam(name = "user_cus", required = true) String cusNo) {
        return super.getSuccessResult(generatorService.getGeneratorDetail(cusNo));
    }

    @RequestMapping(value = "/updateGenerator", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateGenerator(@RequestBody Generator generator) {
        if (generator != null) {
            return super.getSuccessResult(generatorService.updateGenerator(generator));
        } else {
            return super.getErrorMsg("请输入机器编号");
        }
    }

    @RequestMapping(value = "/getGeneratorForStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorForStation(@RequestParam(name = "stationNo", required = true) String stationNo, @RequestParam(name = "user_cus", required = true) String user_cus) {
        return super.getSuccessResult(generatorService.getGeneratorForStation(stationNo, user_cus));
    }


    @RequestMapping(value = "/relateGeneratorWithStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String relateGeneratorWithStation(@RequestParam(name = "stationNo", required = false, defaultValue = "") String stationNo,
                                             @RequestParam(name = "machNo", required = true) String machNo,
                                             @RequestParam(name = "relate", required = true) boolean relate,
                                             @RequestParam(name = "user_cus", required = true) String user_cus) {
        return super.getSuccessResult(generatorService.relateGeneratorWithStation(machNo, stationNo, user_cus, relate));
    }


}
