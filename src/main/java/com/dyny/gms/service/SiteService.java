package com.dyny.gms.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
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
     * 二十五.	油机领用管理
     */
     int addOil(
            String co_no,
            String co_time,
            String co_per,
            String co_tel,
            String st_no,
            String mach_no,
            String use_address,
            String user_no);

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

//    /**
//     * 三十六.	移动油机地图位置
//     */
//     Map<String, Object> getMachineMap(String user_cus);

    /**
     * 三十七.	移动油机领用查询(25项目的补充)
     */
     List searchMachineInUse(String user_cus, String strat_time, String end_time);


    /**
     * 三十九.  移动油机直流主数据明细
     */
     List getSiteDetailed1(String mach_no);


     String getSiteWarningList(String user_cus, int pageNum, int pageSize, int action, long startDate, long endDate);
}
