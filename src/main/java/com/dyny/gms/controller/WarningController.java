package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.WarningType;
import com.dyny.gms.service.WarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:wanggl
 * @date:2018-10-23
 * @version:1.0.0
 */
@RestController
public class WarningController extends BaseController {
    @Autowired
    WarningService warningService;

    //getWarningTypeCnt  getWaningTypeList  createWarningType updateWarningType  deleteWarningType
    @RequestMapping(value = "/getWarningTypeCnt", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String selectActionCount(@RequestParam(name = "generatorNo") String generatorNo) {
        return super.getSuccessResult(warningService.getWarningTypeCnt(generatorNo));
    }

    @RequestMapping(value = "/getWarningTypeList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getWaningTypeList(@RequestParam(name = "id", required = false, defaultValue = "0") int id,
                                    @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize) {
        return warningService.getWarningTypeList(id,pageNum, pageSize);
    }

    @RequestMapping(value = "/createWarningType", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String createWarningType(@RequestBody WarningType warningType) {
        return super.getSuccessResult(warningService.createWarningType(warningType));
    }

    @RequestMapping(value = "/updateWarningType", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateWarningType(@RequestBody WarningType warningType) {
        return super.getSuccessResult(warningService.updateWarningType(warningType));
    }

    @RequestMapping(value = "/deleteWarningType", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteWarningType(@RequestParam(name = "id") int id) {
        return super.getSuccessResult(warningService.deleteWarningType(id));
    }


    @RequestMapping(value = "/checkWarningType", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkWarningType(@RequestParam(name = "warningType") int warningType) {
        return super.getSuccessResult(warningService.checkWarningType(warningType));
    }

    @RequestMapping(value = "/warningCode", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkWarningCode(@RequestParam(name = "warningCode") String warningCode) {
        return super.getSuccessResult(warningService.checkWarningCode(warningCode));
    }
}
