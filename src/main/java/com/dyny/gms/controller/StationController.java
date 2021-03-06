package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.custom.StationForPage;
import com.dyny.gms.service.StationService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class StationController extends BaseController {
    @Autowired
    StationService stationService;


    @RequestMapping(value = "/getStationList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationList(@RequestParam(name = "customerNo", required = true) String customerNo,
                                 @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                 @RequestParam(name = "userLevel", required = false, defaultValue = "0") int userLevel,
                                 @RequestParam(name = "orderBy", required = false, defaultValue = "id") String orderBy,
                                 @RequestParam(name = "searchContent", required = false, defaultValue = "") String searchContent,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize) {
        return stationService.getStationListByUsercus(customerNo, userLevel, searchContent, pageNum, pageSize, orderBy);
    }


    @RequestMapping(value = "/getWithoutGeneratorStationList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getWithoutGeneratorStationList(@RequestParam(name = "customerNo", required = true) String customerNo,
                                 @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                                 @RequestParam(name = "userLevel", required = false, defaultValue = "0") int userLevel,
                                 @RequestParam(name = "orderBy", required = false, defaultValue = "id") String orderBy,
                                 @RequestParam(name = "searchContent", required = false, defaultValue = "") String searchContent,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize) {
        return stationService.getWithoutGeneratorStationList(customerNo, userLevel, searchContent, pageNum, pageSize, orderBy);
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
    public String updateStation(@RequestBody StationForPage Station) {
        return super.getSuccessResult(stationService.updateStationForPage(Station));
    }

    @RequestMapping(value = "/deleteStationByStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteStationByStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.deleteStationAndOtherData(stationNo));
    }

    @RequestMapping(value = "/getStationByStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationByStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.getStationDataFromCache(stationNo));
    }

    @RequestMapping(value = "/getStationByStationNoList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getStationByStationNoList(@RequestParam(name = "stationNo", required = true) String stationNoListStr) {
        return super.getSuccessResult(stationService.getStationByStationNoList(Arrays.asList(stationNoListStr.split(","))));
    }

    @RequestMapping(value = "/checkStationNo", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String checkStationNo(@RequestParam(name = "stationNo", required = true) String stationNo) {
        return super.getSuccessResult(stationService.checkStationNo(stationNo));
    }

    @Value("${import.example}")
    private String excelExamplePath;

    @GetMapping("/downloadImportFileExample")
    public ResponseEntity<byte[]> downloadImportFileExample() throws IOException {
        File file = new File(excelExamplePath);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", file.getName());
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }

    @Value("${import.excel}")
    private String excelImportPath;


    @RequestMapping(value = "/importStationDataByExcel", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String importStationDataByExcel(@RequestParam("file") MultipartFile file, @RequestParam("customerNo") String customerNo) throws IOException {
        int re = 0;
        if (file.isEmpty()) {
            return super.getSuccessResult(0);
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        String path = excelImportPath;
        File fileAbsPath = new File(path + File.separator + fileName);
        //覆盖旧文件
        if (fileAbsPath.exists()) {
            fileAbsPath.delete();
        }
        if (!fileAbsPath.getParentFile().exists()) { //判断文件父目录是否存在
            fileAbsPath.getParentFile().mkdirs();
        } else {
            file.transferTo(fileAbsPath);
        }
        return super.getSuccessResult(stationService.importStationFromExcelFile(fileAbsPath, customerNo));
    }


}
