package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.service.LankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class LankController extends BaseController {
    @Autowired
    LankService lankService;


    /**
     * 二十三.	发电记录功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getLankLog", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getActiveElecLog(@RequestParam(name = "keyWord", required = false, defaultValue = "") String keyWord,
                                   @RequestParam(name = "customerNo", required = true) String customerNo,
                                   @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                   @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                                   @RequestParam(name = "startDate", required = false, defaultValue = "0") long startDate,
                                   @RequestParam(name = "endDate", required = false, defaultValue = "0") long endDate) throws ParseException {
        return lankService.getLank(customerNo, keyWord, pageNum, pageSize, startDate, endDate);
    }


    @RequestMapping(value = "/refuelManually", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String refuelManually(@RequestParam(name = "generatorNo", required = true) String generatorNo,
                                 @RequestParam(name = "refuelVolume", required = true) float refuelVolume
                                 ) throws ParseException {
        return super.getSuccessResult(lankService.refuelManually(generatorNo,refuelVolume));
    }
}
