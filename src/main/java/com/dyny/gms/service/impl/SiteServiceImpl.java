package com.dyny.gms.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.dao.SiteMapper;
import com.dyny.gms.exportEntity.GenerateRecordEntity;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.SiteService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SiteServiceImpl extends BaseService implements SiteService {
    @Override
    public String getSiteWaringList(String user_cus, int pageNum, int pageSize, String action, long startDate, long endDate) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = mapper.getSiteWaringList(user_cus, action, startDate, endDate);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Autowired
    private SiteMapper mapper;

    @Override
    public List getAllMap(String username) {
        // TODO Auto-generated method stub
        return mapper.getAllMap(username);
    }

    @Override
    public Map<String, Object> getStartVoltage(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getStartVoltage(mach_no);
    }

    @Override
    public int modifyStartVoltage(BigDecimal changeVoltage, String mach_no) {
        // TODO Auto-generated method stub
        return mapper.modifyStartVoltage(changeVoltage, mach_no);
    }

    @Override
    public Map<String, Object> getCareTime(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getCareTime(mach_no);
    }

    @Override
    public int modifyCareTime(BigDecimal currentServiceTime, String mach_no) {
        // TODO Auto-generated method stub
        return mapper.modifyCareTime(currentServiceTime, mach_no);
    }

    @Override
    public Map<String, Object> getStopTime(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getStopTime(mach_no);
    }

    @Override
    public int modifyStopTime(BigDecimal currentStopTime, String mach_no) {
        // TODO Auto-generated method stub
        return mapper.modifyStopTime(currentStopTime, mach_no);
    }

    @Override
    public Map<String, Object> getMapByStationId(String stationId) {
        // TODO Auto-generated method stub
        return mapper.getMapByStationId(stationId);
    }

    @Override
    public Map<String, Object> getSiteInfo(String stationId) {
        // TODO Auto-generated method stub
        return mapper.getSiteInfo(stationId);
    }

    /**
     * @param stationName
     * @param stationNumber
     * @param stationType
     * @param usercus
     * @param stationPosition
     * @param stationAddress
     * @param companyAddress
     * @param stationContactManA
     * @param contactManPhoneA
     * @param stationContactManB
     * @param contactManPhoneB
     * @param stationId
     * @return
     */
    @Override
    public int modifySiteInfo(String stationName, String stationNumber,
                              String stationType, String usercus, String stationPosition,
                              String stationAddress, String companyAddress,
                              String stationContactManA, String contactManPhoneA,
                              String stationContactManB, String contactManPhoneB, String stationId) {
        // TODO Auto-generated method stub
        return mapper.modifySiteInfo(stationName, stationNumber, stationType, usercus, stationPosition, stationAddress, companyAddress, stationContactManA, contactManPhoneA, stationContactManB, contactManPhoneB, stationId);
    }

    @Override
    public int addSiteInfo(String stationName, String stationNumber,
                           String stationType, String usercus, String stationPosition,
                           String stationAddress, String companyAddress,
                           String stationContactManA, String contactManPhoneA,
                           String stationContactManB, String contactManPhoneB) {
        // TODO Auto-generated method stub
        return mapper.addSiteInfo(stationName, stationNumber, stationType, usercus, stationPosition, stationAddress, companyAddress, stationContactManA, contactManPhoneA, stationContactManB, contactManPhoneB);
    }

    @Override
    public Map<String, Object> getAddOilLog(String st_no) {
        // TODO Auto-generated method stub
        return mapper.getAddOilLog(st_no);
    }

    @Override
    public String getGenerateLog(String user_cus, String mach_no, int pageNum, int pageSize, long startDate, long endDate) {
        // TODO Auto-generated method stub
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = mapper.getGenerateLog(user_cus, mach_no, startDate, endDate);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Value("${export.excel}")
    private String path;

    @Override
    public String getGenerateLogFile(String user_cus,String mach_no, long startDate, long endDate) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        List<Map> result = mapper.getGenerateLog(user_cus, mach_no, startDate, endDate);
        List<GenerateRecordEntity> list = GenerateRecordEntity.parseObjectToGenerateRecordEntity(result);
        ExportParams params = new ExportParams("发电记录表", "发电记录表");
        params.setType(ExcelType.XSSF);
        Workbook workbook = ExcelExportUtil.exportExcel(params, GenerateRecordEntity.class, list);
        String excelFileName = Tool.DateUtil.getNowDateStringByPattern("yyyyMMddHHmmssSSS") + user_cus + ".xlsx";
        FileOutputStream fos = new FileOutputStream(this.path + File.separator + excelFileName);
        workbook.write(fos);
        fos.close();
        return excelFileName;
    }

    @Override
    public int addAssets(String mach_name, String mach_no, String model_no,
                         String vender_name, BigDecimal power_num, String cus_no,
                         String creator, String use_type, String mach_type,
                         String fuel_type, String state, String purch_time, String note, BigDecimal volumeno, String gprsno) {
        // TODO Auto-generated method stub
        return mapper.addAssets(mach_name, mach_no, model_no, vender_name, power_num, cus_no, creator, use_type, mach_type, fuel_type, state, purch_time, note, volumeno, gprsno);
    }

    @Override
    public int addOil(String co_no, String co_time, String co_per, String co_tel,
                      String st_no, String mach_no, String use_address, String user_no) {
        // TODO Auto-generated method stub
        return mapper.addOil(co_no, co_time, co_per, co_tel, st_no, mach_no, use_address, user_no);
    }


    /**
     * 性能极低!!!!!!!!!!!!!!!
     *
     * @param user_cus
     * @return
     */
    @Override
    public Map<String, Object> getMachineNum(String user_cus) {
        // TODO Auto-generated method stub
        Map<String, Object> result = new HashMap<String, Object>();
        Map<String, Integer> allMap = mapper.getMachineNum(user_cus);
        int total = allMap.get("total");
        int online = allMap.get("online");
        int generating = allMap.get("generating");
        result.put("allNum", total);
        result.put("onlineNum", online);
        result.put("offlineNum", total - online);
        result.put("generatingNum", generating);
        result.put("interruptionNum", total - generating);
        return result;
    }

    @Override
    public String searchMachine(String user_cus, String state, String st_state,
                                String mach_type, String fuel_type, String Acity_electricity, String content, String generateStatus, int expr1, String use_type, int pageNum, int pageSize, String orderBy) {
        // TODO Auto-generated method stub
        Page page = PageHelper.startPage(pageNum, pageSize);
        if (Tool.StringUtil.validStr(orderBy)) {
            page.setOrderBy(orderBy);
        }
        List result = mapper.searchMachine(user_cus, state, st_state, mach_type, fuel_type, Acity_electricity, content, generateStatus, expr1, use_type);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int startMachine(String mach_no, String user_no) {
        // TODO Auto-generated method stub
        return mapper.startMachine(mach_no, user_no);
    }

    @Override
    public int offMachine(String mach_no, String user_no) {
        // TODO Auto-generated method stub
        return mapper.offMachine(mach_no, user_no);
    }

    @Override
    public int changeModel(String mach_no, int modelflag, String code,
                           String user_no) {
        // TODO Auto-generated method stub
        return mapper.changeModel(mach_no, modelflag, code, user_no);
    }

    @Override
    public int changeProtectModel(String mach_no, int modelflag, String code,
                                  String user_no) {
        // TODO Auto-generated method stub
        return mapper.changeProtectModel(mach_no, modelflag, code, user_no);
    }

    @Override
    public Map<String, Object> getMachineMap(String user_cus) {
        // TODO Auto-generated method stub
        return mapper.getMachineMap(user_cus);
    }

    @Override
    public List searchMachineInUse(String user_cus,
                                   String strat_time, String end_time) {
        // TODO Auto-generated method stub
        return mapper.searchMachineInUse(user_cus, strat_time, end_time);
    }

    @Override
    public List getMachineList(String user_cu) {
        // TODO Auto-generated method stub
        return mapper.getMachineList(user_cu);
    }

    /**
     * 获得固定油机,暂时只是添加多一个参数
     * 20180809
     *
     * @param user_cu
     * @param use_type
     * @return
     */
    @Override
    public List getMachineList(String user_cu, String use_type) {
        // TODO Auto-generated method stub
        return mapper.getMachineListWithUseType(user_cu, use_type);
    }

    @Override
    public List getSiteDetailed(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getSiteDetailed(mach_no);
    }

    @Override
    public List getSiteDetailed1(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getSiteDetailed1(mach_no);
    }

    @Override
    public List getSiteWaring(String user_cus) {
        // TODO Auto-generated method stub
        return mapper.getSiteWaring(user_cus);
    }

}
