package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationForPage;
import com.dyny.gms.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StationController extends BaseController {
    @Autowired
    StationService stationService;


    @RequestMapping(value = "/getStationList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationList(@RequestParam(name = "customerNo", required = true) String customerNo,
                                 @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                 @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize) {
        return stationService.getStationListByUsercus(customerNo, pageNum, pageSize, orderBy);
    }


    @RequestMapping(value = "/getStationListByContactId", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationListByContactId(@RequestParam(name = "contactIdList", required = true) String contactIdListStr,
                                            @RequestParam(name = "customerNo", required = true) String customerNo,
                                            @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                            @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
                                            @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize) {
        List<Integer> contactIdList = new ArrayList<Integer>();
        String[] contactIdListStrArr = contactIdListStr.split(",");
        for (String temp : contactIdListStrArr) {
            contactIdList.add(Integer.valueOf(temp));
        }
        return stationService.getStationListByContactId(customerNo, contactIdList, pageNum, pageSize, orderBy);
    }


    @RequestMapping(value = "/addStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String addStation(@RequestBody StationForPage stationForPage) {
        return super.getSuccessResult(stationService.addStation(stationForPage));
    }

    @RequestMapping(value = "/updateStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateStation(@RequestBody Station Station) {
        return super.getSuccessResult(stationService.updateStation(Station));
    }

    @RequestMapping(value = "/deleteStationByStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteStationByStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.deleteStation(stationNo));
    }

    @RequestMapping(value = "/getStationByStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationByStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.getStationByStationNo(stationNo));
    }

    @RequestMapping(value = "/checkStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.checkStationNo(stationNo));
    }

}
