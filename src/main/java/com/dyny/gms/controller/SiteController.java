package com.dyny.gms.controller;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.service.SiteService;
import com.dyny.gms.utils.Tool;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


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
    @RequestMapping(value = "/getAllMap.do")
    @ResponseBody
    public String getAllMap(HttpServletRequest request,
                            HttpServletResponse response) {
        String user_cus = request.getParameter("user_cus");
        return super.getSuccessResult(service.getAllMap(user_cus));
    }


    @RequestMapping(value = "/exportGenerateTable", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String exportGenerateTable(@RequestParam(name = "user_cus", required = true) String user_cus,
                                      @RequestParam(name = "mach_no", required = true) String mach_no,
                                      @RequestParam(name = "startDate", required = false, defaultValue = "0") long startDate,
                                      @RequestParam(name = "endDate", required = false, defaultValue = "0") long endDate) throws FileNotFoundException, IOException {
        String fileName = service.getGenerateLogFile(user_cus,mach_no, startDate, endDate);

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
    public JSONObject getStartVoltage(HttpServletRequest request,
                                      HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            Map<String, Object> data = service.getStartVoltage(mach_no);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject modifyStartVoltage(HttpServletRequest request,
                                         HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String changeVoltage = request.getParameter("changeVoltage");
        try {
            BigDecimal changeVoltage_decimal = new BigDecimal(changeVoltage);
            int result = service.modifyStartVoltage(changeVoltage_decimal, mach_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "修改失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject getCareTime(HttpServletRequest request,
                                  HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            Map<String, Object> data = service.getCareTime(mach_no);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 十六.(2)设定保养时间功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/modifyCareTime.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject modifyCareTime(HttpServletRequest request,
                                     HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String currentServiceTime = request.getParameter("currentServiceTime ");
        try {
            BigDecimal currentServiceTime_decimal = new BigDecimal(currentServiceTime);
            int result = service.modifyCareTime(currentServiceTime_decimal, mach_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "修改失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject getStopTime(HttpServletRequest request,
                                  HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            Map<String, Object> data = service.getStopTime(mach_no);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 十七.(2)设定停机功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/modifyStopTime.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject modifyStopTime(HttpServletRequest request,
                                     HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String currentStopTime = request.getParameter("currentStopTime");
        try {
            BigDecimal currentStopTime_decimal = new BigDecimal(currentStopTime);
            int result = service.modifyStopTime(currentStopTime_decimal, mach_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "修改失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 十八.	查看地图位置功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getMapByStationId.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getMapByStationId(HttpServletRequest request,
                                        HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String stationId = request.getParameter("stationId");
        try {
            Map<String, Object> data = service.getMapByStationId(stationId);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 十九.	站点信息主功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getSiteInfo.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getSiteInfo(HttpServletRequest request,
                                  HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String stationId = request.getParameter("stationId");
        try {
            Map<String, Object> data = service.getSiteInfo(stationId);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 二十.	站点信息修改功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/modifySiteInfo.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject modifySiteInfo(HttpServletRequest request,
                                     HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String stationName = request.getParameter("stationName");
        String stationNumber = request.getParameter("stationNumber");
        String stationType = request.getParameter("stationType");
        String usercus = request.getParameter("usercus");
        String stationPosition = request.getParameter("stationPosition");
        String stationAddress = request.getParameter("stationAddress");
        String companyAddress = request.getParameter("companyAddress");
        String stationContactManA = request.getParameter("stationContactManA");
        String contactManPhoneA = request.getParameter("contactManPhoneA");
        String stationContactManB = request.getParameter("stationContactManB");
        String contactManPhoneB = request.getParameter("contactManPhoneB");
        String stationId = request.getParameter("stationId");
        try {
            int result = service.modifySiteInfo(stationName, stationNumber, stationType, usercus, stationPosition, stationAddress,
                    companyAddress, stationContactManA, contactManPhoneA, stationContactManB, contactManPhoneB, stationId);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "修改失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 二十一.	注册站点信息功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addSiteInfo.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addSiteInfo(HttpServletRequest request,
                                  HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String stationName = request.getParameter("stationName");
        String stationNumber = request.getParameter("stationNumber");
        String stationType = request.getParameter("stationType");
        String usercus = request.getParameter("usercus");
        String stationPosition = request.getParameter("stationPosition");
        String stationAddress = request.getParameter("stationAddress");
        String companyAddress = request.getParameter("companyAddress");
        String stationContactManA = request.getParameter("stationContactManA");
        String contactManPhoneA = request.getParameter("contactManPhoneA");
        String stationContactManB = request.getParameter("stationContactManB");
        String contactManPhoneB = request.getParameter("contactManPhoneB");
        try {
            int result = service.addSiteInfo(stationName, stationNumber, stationType, usercus, stationPosition, stationAddress,
                    companyAddress, stationContactManA, contactManPhoneA, stationContactManB, contactManPhoneB);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "注册失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 二十二.	加油记录功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getAddOilLog.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getAddOilLog(HttpServletRequest request,
                                   HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            Map<String, Object> data = service.getAddOilLog(mach_no);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public String getActiveElecLog(HttpServletRequest request,
                                   HttpServletResponse response) {


        String mach_no = request.getParameter("mach_no");
        String user_cus = request.getParameter("user_cus");
        String page_num_str = request.getParameter("pageNum");
        String page_size_str = request.getParameter("pageSize");
        String startDateStr = request.getParameter("startDate");
        String endDateStr = request.getParameter("endDate");
        int page_num = 0;
        int page_size = 0;
        if (Tool.StringUtil.isNum(page_num_str, page_size_str)) {
            page_num = Integer.valueOf(page_num_str);
            page_size = Integer.valueOf(page_size_str);
        }
        long startDate = 0;
        long endDate = 0;
        if (Tool.StringUtil.isNum(startDateStr)) {
            startDate = Long.valueOf(startDateStr);
        }
        if (Tool.StringUtil.isNum(endDateStr)) {
            endDate = Long.valueOf(endDateStr);
        }
        return service.getGenerateLog(user_cus, mach_no, page_num, page_size, startDate, endDate);
    }

    /**
     * 二十四.	油机资产管理
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addAssets.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addAssets(HttpServletRequest request,
                                HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_name = request.getParameter("mach_name");
        String mach_no = request.getParameter("mach_no");
        String model_no = request.getParameter("model_no");
        String vender_name = request.getParameter("vender_name");
        String power_num = request.getParameter("power_num");
        String cus_no = request.getParameter("cus_no");
        String creator = request.getParameter("user_no");
        String use_type = request.getParameter("use_type");
        String mach_type = request.getParameter("mach_type");
        String fuel_type = request.getParameter("fuel_type");
        String state = request.getParameter("state");
        String purch_time = request.getParameter("purch_time");
        String note = request.getParameter("note");
        String volumeno = request.getParameter("volumeno");
        String gprsno = request.getParameter("gprsno");
        try {
            BigDecimal power_num_decimal = new BigDecimal(power_num);
            BigDecimal volumeno_decimal = new BigDecimal(volumeno);
            int result = service.addAssets(mach_name, mach_no, model_no, vender_name, power_num_decimal, cus_no, creator,
                    use_type, mach_type, fuel_type, state, purch_time, note, volumeno_decimal, gprsno);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 二十五.	油机领用管理
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/addOil.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addOil(HttpServletRequest request,
                             HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String co_no = request.getParameter("co_no");
        String co_time = request.getParameter("co_time");
        String co_per = request.getParameter("co_per");
        String co_tel = request.getParameter("co_tel");
        String st_no = request.getParameter("st_no");
        String mach_no = request.getParameter("mach_no");
        String use_address = request.getParameter("use_address");
        String user_no = request.getParameter("user_no");
        try {
            int result = service.addOil(co_no, co_time, co_per, co_tel, st_no, mach_no, use_address, user_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public String getMachineNumByStatus(@RequestParam(name = "user_cus") String user_cus) {
        return super.getSuccessResult(service.getMachineNum(user_cus));
    }


    /**
     * 三十一.	移动油机查询
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/searchMachine.do", method = RequestMethod.POST)
    @ResponseBody
    public String searchMachine(@RequestParam(name = "user_cus", required = true) String user_cus,
                                @RequestParam(name = "state", required = false, defaultValue = "") String state,
                                @RequestParam(name = "st_state", required = false, defaultValue = "") String st_state,
                                @RequestParam(name = "mach_type", required = false, defaultValue = "") String mach_type,
                                @RequestParam(name = "fuel_type", required = false, defaultValue = "") String fuel_type,
                                @RequestParam(name = "Acity_electricity", required = false, defaultValue = "") String Acity_electricity,
                                @RequestParam(name = "generate_status", required = false, defaultValue = "") String generateStatus,
                                @RequestParam(name = "expr1", required = false, defaultValue = "-1") int expr1,
                                @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                                @RequestParam(name = "content", required = false, defaultValue = "") String content,
                                @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
                                @RequestParam(name = "use_type", required = false, defaultValue = "") String use_type) {
        return service.searchMachine(user_cus, state, st_state, mach_type, fuel_type, Acity_electricity, content, generateStatus, expr1, use_type, pageNum, pageSize, orderBy);

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
    public JSONObject startMachine(HttpServletRequest request,
                                   HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String flag = request.getParameter("flag");
        String user_no = request.getParameter("user_no");
        try {
            int result = service.startMachine(mach_no, user_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject offMachine(HttpServletRequest request,
                                 HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String flag = request.getParameter("flag");
        String user_no = request.getParameter("user_no");
        try {
            int result = service.offMachine(mach_no, user_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 三十四.	模式切换功能
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/changeModel.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject changeModel(HttpServletRequest request,
                                  HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String modelflag = request.getParameter("modelflag");
        String user_no = request.getParameter("user_no");
        try {
            String code = "84 05 02 00 00 01 00 03 16";
            if (modelflag.equals("4")) {
                code = "84 05 02 00 00 02 00 04 16";
            }
            int result = service.changeModel(mach_no, Integer.valueOf(modelflag), code, user_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject changeProtectModel(HttpServletRequest request,
                                         HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        String modelflag = request.getParameter("modelflag");
        String user_no = request.getParameter("user_no");
        try {
            String code = "84 05 AA AA AA AA AA 52 16";
            if (modelflag.equals("6")) {
                code = "84 05 02 00 00 02 00 20 16";
            }
            int result = service.changeModel(mach_no, Integer.valueOf(modelflag), code, user_no);
            if (result <= 0) {
                resultMap.put("result", "false");
                resultMap.put("errorMsg", "操作失败");
            }
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 三十六.	移动油机地图位置
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getMachineMap.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getMachineMap(HttpServletRequest request,
                                    HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            Map<String, Object> data = service.getMachineMap(mach_no);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 三十七.	移动油机领用查询(25项目的补充)
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/searchMachineInUse.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject searchMachineInUse(HttpServletRequest request,
                                         HttpServletResponse response) {


        JSONObject resultMap = new JSONObject();
        String user_cus = request.getParameter("user_cus");
        String strat_time = request.getParameter("strat_time");
        String end_time = request.getParameter("end_time");
        try {
            List data = service.searchMachineInUse(user_cus, strat_time, end_time);
            resultMap.put("data", data);
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 38.	移动油机交流主数据明细
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getSiteDetailed.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getSiteDetailed(HttpServletRequest request,
                                      HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            List list = service.getSiteDetailed(mach_no);
            resultMap.put("data", list);
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
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
    public JSONObject getSiteDetailed1(HttpServletRequest request,
                                       HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String mach_no = request.getParameter("mach_no");
        try {
            List list = service.getSiteDetailed1(mach_no);
            resultMap.put("data", list);
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }


    /**
     * 四十.	警报信息查询明细
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getSiteWaring.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject getSiteWaring(HttpServletRequest request,
                                    HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String user_cus = request.getParameter("user_cus");
        try {
            List list = null;
            if (user_cus != null && user_cus.isEmpty()) {
                list = service.getSiteWaring(user_cus);
            }
            resultMap.put("data", list);
            resultMap.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("result", "false");
            resultMap.put("errorMsg", "程序异常");
        }
        return resultMap;
    }

    /**
     * 四十一.	警报信息查询明细
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getSiteWaringList.do", method = RequestMethod.POST)
    @ResponseBody
    public String getSiteWaringList(HttpServletRequest request,
                                    HttpServletResponse response) {
        JSONObject resultMap = new JSONObject();
        String user_cus = request.getParameter("user_cus");
        String page_num_str = request.getParameter("pageNum");
        String page_size_str = request.getParameter("pageSize");
        String alarmType = request.getParameter("alarmType");
        String startDateStr = request.getParameter("startDate");
        String endDateStr = request.getParameter("endDate");
        int page_num = 0;
        int page_size = 0;
        if (Tool.StringUtil.isNum(page_num_str, page_size_str)) {
            page_num = Integer.valueOf(page_num_str);
            page_size = Integer.valueOf(page_size_str);
        }
        long startDate = 0;
        long endDate = 0;
        if (Tool.StringUtil.isNum(startDateStr)) {
            startDate = Long.valueOf(startDateStr);
        }
        if (Tool.StringUtil.isNum(endDateStr)) {
            endDate = Long.valueOf(endDateStr);
        }
        return service.getSiteWaringList(user_cus, page_num, page_size, alarmType, startDate, endDate);
    }

}
