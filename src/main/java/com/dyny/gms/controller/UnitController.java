package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Unit;
import com.dyny.gms.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnitController extends BaseController {

    @Autowired
    UnitService unitService;


    @RequestMapping(value = "/getUnit", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUnit(@RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                          @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                          @RequestParam(name = "unitNo", required = false, defaultValue = "") String unitNo,
                          @RequestParam(name = "searchContent", required = false, defaultValue = "") String searchContent,
                          @RequestParam(name = "orderBy", required = false, defaultValue = "id") String orderBy,
                          @RequestParam(name = "customerNo", required = true) String customerNo) {
        Unit unit = new Unit();
        unit.setCustomerNo(customerNo);
        unit.setUnitNo(unitNo);
        return unitService.getUnit(unit, searchContent, pageNum, pageSize, orderBy);
    }

    //getUnitByUnitIdList
    @RequestMapping(value = "/getUnitByUnitIdList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUnitByUnitIdList(@RequestBody List<Integer> unitIdList) {
        return super.getSuccessResult(unitService.getUnitByUnitIdList(unitIdList));
    }

    @RequestMapping(value = "/updateUnit", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateUnit(@RequestBody Unit unit) {
        return super.getSuccessResult(unitService.updateUnit(unit));
    }


    @RequestMapping(value = "/deleteUnit", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteUnit(@RequestBody Unit unit) {
        return super.getSuccessResult(unitService.deleteUnit(unit));
    }


    @RequestMapping(value = "/insertUnit", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertUnit(@RequestBody Unit unit) {
        return super.getSuccessResult(unitService.addUnit(unit));
    }

}
