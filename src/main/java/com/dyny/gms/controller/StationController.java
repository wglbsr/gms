package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StationController extends BaseController {
    @Autowired
    StationService stationService;


    @RequestMapping(value = "/getStationList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationList(@RequestParam(name = "user_cus", required = true) String usercus,
                                 @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                 @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize) {
        return stationService.getStationListByUsercus(usercus, pageNum, pageSize, orderBy);
    }

    @RequestMapping(value = "/addStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addGenerator(@RequestBody Station Station) {
        return super.getSuccessResult(stationService.addStation(Station));
    }

    @RequestMapping(value = "/updateStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateGenerator(@RequestBody Station Station) {
        return super.getSuccessResult(stationService.updateStation(Station));
    }

    @RequestMapping(value = "/deleteStationByStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteGenerator(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.deleteStation(stationNo));
    }


    @RequestMapping(value = "/getStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationNo() {
        return "";
    }

    @RequestMapping(value = "/checkStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.checkStationNo(stationNo));
    }

}
