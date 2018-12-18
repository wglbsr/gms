package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.service.SiteService;
import com.dyny.gms.service.UserService;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

@Deprecated
@Controller
@RequestMapping(value = "/ems/site", produces = {"application/json;charset=UTF-8"})
public class SiteController extends BaseController {
    private final Logger log = Logger.getLogger(SiteController.class);
    @Autowired
    private SiteService service;

    /**
     * 五.	全站地图功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getGeneratorLocation.do")
    @ResponseBody
    public String getGeneratorLocation(@RequestParam(name = "user_cus", required = false, defaultValue = "") String user_cus,
                                       @RequestParam(name = "mach_no", required = false, defaultValue = "") String mach_no,
                                       @RequestParam(name = "keyWord", required = false, defaultValue = "") String keyWord,
                                       @RequestParam(name = "activate", required = false, defaultValue = "true") boolean activate,
                                       @RequestParam(name = "inactivate", required = false, defaultValue = "true") boolean inactivate) {
        return super.getSuccessResult(service.getGeneratorLocation(user_cus, mach_no, activate, inactivate, keyWord));
    }


    @RequestMapping(value = "/exportGenerateTable", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String exportGenerateTable(@RequestParam(name = "user_cus", required = false, defaultValue = "") String user_cus,
                                      @RequestParam(name = "mach_no", required = false, defaultValue = "") String mach_no,
                                      @RequestParam(name = "startDate", required = false, defaultValue = "0") long startDate,
                                      @RequestParam(name = "endDate", required = false, defaultValue = "0") long endDate) throws FileNotFoundException, IOException {
        String fileName = service.getGenerateLogFile(user_cus, mach_no, startDate, endDate);
        return super.getSuccessResult(fileName);
    }


    @Value("${export.excel}")
    private String excelPath;

    @GetMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam(name = "fileName") String fileName) throws IOException {
        File file = new File(excelPath + "/" + fileName);
        if (!file.exists()) {
            return null;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }


    /**
     * 十四.	查询启动电压功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getStartVoltage.do", method = RequestMethod.POST)
    @ResponseBody
    public String getStartVoltage(@RequestParam(name = "mach_no") String mach_no) {
        return super.getSuccessResult(service.getStartVoltage(mach_no));
    }

    /**
     * 十五.	设定启动电压功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/modifyStartVoltage.do", method = RequestMethod.POST)
    @ResponseBody
    public String modifyStartVoltage(@RequestParam(name = "mach_no") String mach_no,
                                     @RequestParam(name = "changeVoltage") BigDecimal changeVoltage) {
        return super.getSuccessResult(service.modifyStartVoltage(changeVoltage, mach_no));
    }

    /**
     * 十六.	(1)查询保养时间功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getCareTime.do", method = RequestMethod.POST)
    @ResponseBody
    public String getCareTime(@RequestParam(name = "mach_no") String mach_no) {
        return super.getSuccessResult(service.getCareTime(mach_no));
    }


    /**
     * 十七.	(1)设定停机功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getStopTime.do", method = RequestMethod.POST)
    @ResponseBody
    public String getStopTime(@RequestParam(name = "mach_no") String mach_no) {
        return super.getSuccessResult(service.getStopTime(mach_no));
    }


    /**
     * 二十三.	发电记录功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getGenerateLog.do", method = RequestMethod.POST)
    @ResponseBody
    public String getActiveElecLog(@RequestParam(name = "mach_no", required = false, defaultValue = "") String mach_no,
                                   @RequestParam(name = "user_cus") String user_cus,
                                   @RequestParam(name = "allOfIt", required = false, defaultValue = "false") boolean allOfIt,//是否查找所有的实际发电记录(包括有效无效)
                                   @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                   @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                                   @RequestParam(name = "startDate", required = false, defaultValue = "0") long startDate,
                                   @RequestParam(name = "endDate", required = false, defaultValue = "0") long endDate) {
        return service.getGenerateLog(user_cus, mach_no, pageNum, pageSize, startDate, endDate, allOfIt);
    }


    /**
     * 二十六.	移动油机运行情况（全部）
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getMachineNumByStatus.do", method = RequestMethod.POST)
    @ResponseBody
    public String getMachineNumByStatus(@RequestParam(name = "user_cus") String user_cus,
                                        @RequestParam(name = "activate", required = false, defaultValue = "true") boolean activate,
                                        @RequestParam(name = "inactivate", required = false, defaultValue = "true") boolean inactivate) {
        return super.getSuccessResult(service.getMachineNum(user_cus, activate, inactivate));
    }

    @Autowired
    UserService userService;

    /**
     * 三十一.	移动油机查询
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/searchMachine.do", method = RequestMethod.POST)
    @ResponseBody
    public String searchMachine(@RequestParam(name = "user_cus") String user_cus,
                                @RequestParam(name = "state", required = false, defaultValue = "") String state,
                                @RequestParam(name = "st_state", required = false, defaultValue = "") String st_state,
                                @RequestParam(name = "mach_type", required = false, defaultValue = "") String mach_type,
                                @RequestParam(name = "fuel_type", required = false, defaultValue = "") String fuel_type,
                                @RequestParam(name = "Acity_electricity", required = false, defaultValue = "") String Acity_electricity,
                                @RequestParam(name = "generate_status", required = false, defaultValue = "") String generateStatus,
                                @RequestParam(name = "expr1", required = false, defaultValue = "-1") int expr1,
                                @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                                @RequestParam(name = "offlineType", required = false, defaultValue = "-1") int offlineType,
                                @RequestParam(name = "activate", required = false, defaultValue = "true") boolean activate,
                                @RequestParam(name = "inactivate", required = false, defaultValue = "true") boolean inactivate,
                                @RequestParam(name = "content", required = false, defaultValue = "") String content,
                                @RequestParam(name = "orderBy", required = false, defaultValue = "mach_no") String orderBy,
                                @RequestParam(name = "use_type", required = false, defaultValue = "") String use_type) {
        return service.searchMachine(user_cus, state, st_state, mach_type, fuel_type, Acity_electricity, content, generateStatus, expr1, use_type, activate, inactivate,offlineType, pageNum, pageSize, orderBy);

    }

    /**
     * 三十二.	启动功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/startMachine.do", method = RequestMethod.POST)
    @ResponseBody
    public String startMachine(@RequestParam(name = "mach_no") String mach_no,
                               @RequestParam(name = "user_no") String user_no) {
        return super.getSuccessResult(service.startMachine(mach_no, user_no));
    }

    /**
     * 三十三.	熄火功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/offMachine.do", method = RequestMethod.POST)
    @ResponseBody
    public String offMachine(@RequestParam(name = "mach_no") String mach_no,
                             @RequestParam(name = "user_no") String user_no) {
        return super.getSuccessResult(service.offMachine(mach_no, user_no));
    }


    /**
     * 三十五.	保护模式切换功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/changeProtectModel.do", method = RequestMethod.POST)
    @ResponseBody
    public String changeProtectModel(@RequestParam(name = "mach_no") String mach_no,
                                     @RequestParam(name = "modelflag") String modelflag,
                                     @RequestParam(name = "user_no") String user_no) {
        //84 05 AA AA AA AA AA 52 16
        String code = "84 05 AA AA AA AA AA 52 16";
        if (modelflag.equals("6")) {
            code = "84 05 A0 A0 A0 A0 A0 32 16";//"84 05 02 00 00 02 00 20 16";
        }
        return super.getSuccessResult(service.changeModel(mach_no, Integer.valueOf(modelflag), code, user_no));
    }


    /**
     * 39.	移动油机交流主数据明细
     *
     * @param request
     * @param response
     * @return
     */
    @Deprecated
    @RequestMapping(value = "/getSiteDetailed1.do", method = RequestMethod.POST)
    @ResponseBody
    public String getSiteDetailed1(@RequestParam(name = "mach_no") String mach_no) {
        return super.getSuccessResult(service.getSiteDetailed1(mach_no));
    }


    /**
     * 四十一.	警报信息查询明细
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getSiteWarningList.do", method = RequestMethod.POST)
    @ResponseBody
    public String getSiteWarningList(@RequestParam(name = "user_cus") String user_cus,
                                     @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                     @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                                     @RequestParam(name = "alarmType", required = false, defaultValue = "0") int alarmType,
                                     @RequestParam(name = "startDate", required = false, defaultValue = "0") int startDate,
                                     @RequestParam(name = "endDate", required = false, defaultValue = "0") int endDate) {
        return service.getSiteWarningList(user_cus, pageNum, pageSize, alarmType, startDate, endDate);
    }

}
