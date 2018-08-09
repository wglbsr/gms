package com.dyny.gms.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface SiteService {
    public List getAllSite(String username);

    public Map<String, Object> getSiteNumByStatus(String username, int status);

    public Map<String, Object> getMachineNumByStatus(String user_cus, int status);

    public List getAllMap(String username);

    public Map<String, Object> getSiteNumByStatus(String username);

    public List search(String username, String search);

    public List getOffLineSite(String username);

    public List getOnlineSite(String username);

    public List getActiveSite(String username);

    public List getStopSite(String username);

    public Map<String, Object> getSiteHeadMsg(String stationId);

    public List getSiteContent(String stationId);

    public Map<String, Object> getStartVoltage(String mach_no);

    public int modifyStartVoltage(BigDecimal changeVoltage, String mach_no);

    public Map<String, Object> getCareTime(String mach_no);

    public int modifyCareTime(BigDecimal currentServiceTime, String mach_no);

    public Map<String, Object> getStopTime(String mach_no);

    public int modifyStopTime(BigDecimal currentStopTime, String mach_no);

    public Map<String, Object> getMapByStationId(String stationId);

    public Map<String, Object> getSiteInfo(String stationId);

    public int modifySiteInfo(String stationName, String stationNumber, String stationType, String usercus, String stationPosition,
                              String stationAddress, String companyAddress, String stationContactManA, String contactManPhoneA, String stationContactManB,
                              String contactManPhoneB, String stationId);

    public int addSiteInfo(String stationName, String stationNumber, String stationType, String usercus, String stationPosition,
                           String stationAddress, String companyAddress, String stationContactManA, String contactManPhoneA, String stationContactManB,
                           String contactManPhoneB);

    /**
     * 二十二.	加油记录功能
     */
    public Map<String, Object> getAddOilLog(String st_no);

    /**
     * 二十三.	发电记录功能
     */
    public Map<String, Object> getActiveElecLog(String st_no);

    /**
     * 二十四.	油机资产管理
     */
    public int addAssets(
            String mach_name,
            String mach_no,
            String model_no,
            String vender_name,
            BigDecimal power_num,
            String cus_no,
            String creator,
            String use_type,
            String mach_type,
            String fuel_type,
            String state,
            String purch_time,
            String note,
            BigDecimal volumeno,
            String gprsno);

    /**
     * 二十五.	油机领用管理
     */
    public int addOil(
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
    public List getMachineList(String user_cu, String use_type);

    public List getMachineList(String user_cu);

    /**
     * 二十六.	移动油机运行情况（全部）
     */
    public Map<String, Object> getMachineNumByStatus(String user_cus);


    /**
     * 二十七.	移动油机在线(双击在线)
     */
    public List getOnlineMachine(String user_cus);

    /**
     * 二十八.	移动油机离线(双击离线)
     */
    public List getOfflineMachine(String user_cus);

    /**
     * 二十九.	移动油机发电
     */
    public List getActiveMachine(String user_cus);

    /**
     * 三十.	移动油机停机
     */
    public List getStopMachine(String user_cus);

    /**
     * 三十一.	移动油机查询
     */
    public List searchMachine(String user_cus, String state, String st_state, String mach_type, String fuel_type, String Acity_electricity, String search1);


    /**
     * 三十二.	启动功能
     */
    public int startMachine(String mach_no, String user_no);

    /**
     * 三十三.	熄火功能
     */
    public int offMachine(String mach_no, String user_no);

    /**
     * 三十四.	模式切换功能
     */
    public int changeModel(String mach_no, int modelflag, String code, String user_no);

    /**
     * 三十五.	保护模式切换功能
     */
    public int changeProtectModel(String mach_no, int modelflag, String code, String user_no);

    /**
     * 三十六.	移动油机地图位置
     */
    public Map<String, Object> getMachineMap(String user_cus);

    /**
     * 三十七.	移动油机领用查询(25项目的补充)
     */
    public List searchMachineInUse(String user_cus, String strat_time, String end_time);

    /**
     * 三十八.  移动油机交流主数据明细
     */
    public List getSiteDetailed(String mach_no);

    /**
     * 三十九.  移动油机直流主数据明细
     */
    public List getSiteDetailed1(String mach_no);

    /**
     * 四十.警报信息查询明细
     */
    public List getSiteWaring(String user_cus);

    /**
     * 四十一.警报信息查询明细
     */
    public List getSiteWaring1(String user_cus);
}