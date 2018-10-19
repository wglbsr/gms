package com.dyny.gms.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Deprecated
public interface SiteService {


     List getGeneratorLocation(String username,String machNo,boolean activate,boolean inactivate,String keyWord);

     Map<String, Object> getStartVoltage(String mach_no);

     int modifyStartVoltage(BigDecimal changeVoltage, String mach_no);

     Map<String, Object> getCareTime(String mach_no);

     int modifyCareTime(BigDecimal currentServiceTime, String mach_no);

     Map<String, Object> getStopTime(String mach_no);



    /**
     * 二十三.	发电记录功能
     */
     String getGenerateLog(String user_cus, String mach_no, int pageNum, int pageSize, long startDate, long endDate);


     String getGenerateLogFile(String user_cus, String mach_no, long startDate, long endDate) throws FileNotFoundException, IOException;


    /**
     * 二十六.
     */

    /**
     * 二十六.	移动油机运行情况（全部）
     */
     Map<String, Object> getMachineNum(String user_cus,boolean activate,boolean inactivate);


    /**
     * 三十一.	移动油机查询
     */
     String searchMachine(String user_cus, String state, String st_state, String mach_type, String fuel_type,
                          String Acity_electricity, String content, String generateStatus, int expr1,
                          String use_type,boolean activate,boolean inactivate, int pageNum, int pageSize, String orderBy);


    /**
     * 三十二.	启动功能
     */
     int startMachine(String mach_no, String user_no);

    /**
     * 三十三.	熄火功能
     */
     int offMachine(String mach_no, String user_no);

    /**
     * 三十四.	模式切换功能
     */
     int changeModel(String mach_no, int modelflag, String code, String user_no);

    /**
     * 三十五.	保护模式切换功能
     */
     int changeProtectModel(String mach_no, int modelflag, String code, String user_no);


    /**
     * 三十九.  移动油机直流主数据明细
     */
     List getSiteDetailed1(String mach_no);


     String getSiteWarningList(String user_cus, int pageNum, int pageSize, int action, long startDate, long endDate);
}
