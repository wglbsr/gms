package com.dyny.gms.service.impl;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.OperateMapper;
import com.dyny.gms.db.dao.SiteMapper;
import com.dyny.gms.db.pojo.SystemConfig;
import com.dyny.gms.exportEntity.GenerateRecordEntity;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.SiteService;
import com.dyny.gms.service.SystemConfigService;
import com.dyny.gms.utils.CommonUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sun.misc.Cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
@Service
public class SiteServiceImpl extends BaseService implements SiteService {
    private final Logger logger = Logger.getLogger(SiteServiceImpl.class);

    @Override
    public String getSiteWarningList(String user_cus, int pageNum, int pageSize, int action,
                                     long startDate, long endDate) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = mapper.getSiteWarningList(user_cus, action, startDate, endDate);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Autowired
    private SiteMapper mapper;
    @Autowired
    private OperateMapper operateMapper;

    @Override
    public List getGeneratorLocation(String username, String machNo, boolean activate, boolean inactivate, String keyWord) {
        // TODO Auto-generated method stub
        return mapper.getGeneratorLocation(username, machNo, activate, inactivate, keyWord);
    }

    @Override
    public Map<String, Object> getStartVoltage(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getStartVoltage(mach_no);
    }

    @Override
    public int modifyStartVoltage(BigDecimal changeVoltage, String mach_no) {
        // TODO Auto-generated method stub


        int result = 0;
        result += mapper.modifyStartVoltage(changeVoltage, mach_no);
        return result;
    }

    @Override
    public Map<String, Object> getCareTime(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getCareTime(mach_no);
    }

    @Override
    public Map<String, Object> getStopTime(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getStopTime(mach_no);
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
    public String getGenerateLogFile(String user_cus, String mach_no, long startDate, long endDate) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        List<Map> result = mapper.getGenerateLog(user_cus, mach_no, startDate, endDate);
        List<GenerateRecordEntity> list = GenerateRecordEntity.parseObjectToGenerateRecordEntity(result);
        ExportParams params = new ExportParams("发电记录表", "发电记录表");
        params.setType(ExcelType.XSSF);
        Workbook workbook = ExcelExportUtil.exportExcel(params, GenerateRecordEntity.class, list);
        String excelFileName = CommonUtil.Date.getNowDateStringByPattern("yyyyMMddHHmmssSSS") + user_cus + ".xlsx";
        FileOutputStream fos = new FileOutputStream(this.path + File.separator + excelFileName);
        workbook.write(fos);
        fos.close();
        return excelFileName;
    }

    @Autowired
    SystemConfigService systemConfigService;

    /**
     * @param user_cus
     * @return
     */
    @Override
    public Map<String, Object> getMachineNum(String user_cus, boolean activate, boolean inactivate) {
        // TODO Auto-generated method stub
        Map<String, Object> result = new HashMap<String, Object>();
        SystemConfig systemConfig = systemConfigService.getConfig();
        Map<String, Integer> allMap = mapper.getMachineNum(user_cus, systemConfig.getOnlineTimeout(), activate, inactivate);
        int total = allMap.containsKey("total") ? allMap.get("total") : 0;
        int online = allMap.containsKey("online") ? allMap.get("online") : 0;
        int sleeping = allMap.containsKey("sleeping") ? allMap.get("sleeping") : 0;
        result.put("allNum", total);
        result.put("onlineNum", online);
        result.put("offlineNum", total - online);
        result.put("generatingNum", sleeping);
        result.put("interruptionNum", total - sleeping);
        return result;
    }

    @Override
    public String searchMachine(String user_cus, String state, String st_state, String mach_type, String fuel_type,
                                String Acity_electricity, String content, String generateStatus, int expr1, String use_type,
                                boolean activate, boolean inactivate, int pageNum, int pageSize, String orderBy) {
        // TODO Auto-generated method stub
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = mapper.searchMachine(user_cus, state, st_state, mach_type, fuel_type, Acity_electricity, content, generateStatus, expr1, use_type, activate, inactivate);
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
    public List getSiteDetailed1(String mach_no) {
        // TODO Auto-generated method stub
        return mapper.getSiteDetailed1(mach_no);
    }


}
