package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.service.BasisService;
import com.dyny.gms.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class GeneratorController extends BaseController {
    @Autowired
    GeneratorService generatorService;
    @Autowired
    BasisService basisService;

    /**
     * 获得油机详情
     *
     * @param machNo
     * @return
     */
    @RequestMapping(value = "/getGeneratorDetail", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorDetail(@RequestParam(name = "mach_no") String machNo) {
        return super.getSuccessResult(generatorService.getGeneratorDetailFromCache(machNo));
    }


    /**
     * 根据客户编号获得油机
     *
     * @param cusNo
     * @return
     */
    @RequestMapping(value = "/getGeneratorByCusNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorByCusNo(@RequestParam(name = "user_cus") String cusNo) {
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
     * 更新油机信息
     *
     * @param generatorList
     * @return
     */
    @RequestMapping(value = "/updateGeneratorList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateGeneratorList(@RequestBody List<Generator> generatorList) {
        return super.getSuccessResult(generatorService.updateGenerator(generatorList));
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
    public String getGeneratorForStation(@RequestParam(name = "stationNo") String stationNo,
                                         @RequestParam(name = "searchContent", required = false, defaultValue = "") String searchContent,
                                         @RequestParam(name = "user_cus") String user_cus) {
        return super.getSuccessResult(generatorService.getGeneratorForStation(stationNo, user_cus, searchContent));
    }


    /**
     * 获得指定客户编号的油机,条件为该基站的编号或者基站编号为空
     *
     * @param stationNo
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/changeBootVoltage", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String changeBootVoltage(@RequestParam(name = "generatorNoList[]") List<String> generatorNoList,
                                    @RequestParam(name = "bootVoltage") BigDecimal bootVoltage) {
        return super.getSuccessResult(generatorService.changeBootVoltage(generatorNoList, bootVoltage));
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
                                             @RequestParam(name = "machNo") String machNo,
                                             @RequestParam(name = "relate") boolean relate,
//                                             @RequestParam(name = "contactIdList") List<Integer> contactIdList,
                                             @RequestParam(name = "user_cus") String user_cus) {
        return super.getSuccessResult(generatorService.relateGeneratorWithStation(machNo, stationNo, user_cus, relate, new ArrayList<Integer>()));//暂时不需要选择油机操作人员
    }


    /**
     * 效率不高!!!!!!!!!!但基站与油机通常是1对1,应该不会超过1对3,因此性能差别应该不大
     *
     * @param stationNo
     * @param machNoList
     * @param relate
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/relateGeneratorListWithStation", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String relateGeneratorListWithStation(@RequestParam(name = "stationNo", required = false, defaultValue = "") String stationNo,
                                                 @RequestParam(name = "machNoList[]") List<String> machNoList,
                                                 @RequestParam(name = "relate") boolean relate,
                                                 @RequestParam(name = "user_cus") String user_cus) {
        int cnt = 0;
        for (String temp : machNoList) {
            cnt += generatorService.relateGeneratorWithStation(temp, stationNo, user_cus, relate, new ArrayList<Integer>());
        }
        return super.getSuccessResult(cnt);//暂时不需要选择油机操作人员
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
            @RequestParam(name = "status") String status,
            @RequestParam(name = "user_cus") String user_cus) {
        return super.getSuccessResult(generatorService.getGeneratorNumByStatus(status, user_cus));
    }

    /**
     * 获得各个状态的油机数量,status参数暂时没有用上
     *
     * @param status
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/activateGenerator", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String activateGenerator(
            @RequestParam(name = "generatorNoList[]") List<String> generatorNoList,
            @RequestParam(name = "username", required = false, defaultValue = "") String username,
            @RequestParam(name = "activate") boolean activate) {
        return super.getSuccessResult(generatorService.activateGenerator(generatorNoList, activate, username));
    }


    /**
     * 获得各个状态的油机数量,status参数暂时没有用上
     *
     * @param status
     * @param user_cus
     * @return
     */
    @RequestMapping(value = "/getActivateLog", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getActivateLog(
            @RequestParam(name = "keyWord") String keyWord,
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
            @RequestParam(name = "startTimestamp", required = false, defaultValue = "") long startTimestamp,
            @RequestParam(name = "endTimestamp", required = false, defaultValue = "") long endTimestamp) {
        return generatorService.getActivateLog(keyWord, startTimestamp, endTimestamp, pageNum, pageSize);
    }


    @RequestMapping(value = "/getBasisInfo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getFuelInfo(
            @RequestParam(name = "offset") int offset,
            @RequestParam(name = "machNo") String machNo,
            @RequestParam(name = "samplingInterval", required = false, defaultValue = "3600") int samplingInterval,
            @RequestParam(name = "startTimestamp", required = false, defaultValue = "") long startTimestamp,
            @RequestParam(name = "endTimestamp", required = false, defaultValue = "") long endTimestamp) throws ParseException {
        return super.getSuccessResult(basisService.getBasisByOffset(offset, machNo, samplingInterval, startTimestamp, endTimestamp));
    }

    @RequestMapping(value = "/cache/setBasis", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setBasisInfo(@RequestBody Basis basis) {
        return generatorService.saveGeneratorData(basis, false) + "";
    }

    @RequestMapping(value = "/cache/getBasis", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getBasisInfo(@RequestParam(name = "generatorNo") String generatorNo) {
        return super.getSuccessResult(basisService.getBasisFromCache(generatorNo));
    }

    @RequestMapping(value = "/setBasisToCacheAndDB", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setBasisToCacheAndDB(@RequestBody Basis basis) {
        return generatorService.saveGeneratorData(basis, true) + "";
    }


    @RequestMapping(value = "/getGeneratorStatusData", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getGeneratorStatusData(@RequestParam(name = "generatorNo") String generatorNo) {
        return super.getSuccessResult(generatorService.getGeneratorStatusData(generatorNo));
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
