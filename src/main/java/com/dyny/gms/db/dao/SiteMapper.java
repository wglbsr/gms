package com.dyny.gms.db.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Deprecated
@Mapper
public interface SiteMapper {


    public List getGeneratorLocation(@Param("user_cus") String user_cus,
                                     @Param("mach_no") String mach_no,
                                     @Param("activate") boolean activate,
                                     @Param("inactivate") boolean inactivate,
                                     @Param("keyWord") String keyWord);

    public Map<String, Object> getStartVoltage(String mach_no);

    public int modifyStartVoltage(@Param("changeVoltage") BigDecimal changeVoltage, @Param("mach_no") String mach_no);

    /**
     * 十六.	(1)查询保养时间功能
     *
     * @param mach_no
     * @return
     */
    public Map<String, Object> getCareTime(String mach_no);

    /**
     * 十六.(2)设定保养时间功能
     *
     * @param mach_no
     * @return
     */
    public int modifyCareTime(@Param("currentServiceTime") BigDecimal currentServiceTime, @Param("mach_no") String stationId);

    /**
     * 十七.	(1)设定停机功能
     *
     * @param mach_no
     * @return
     */
    public Map<String, Object> getStopTime(String mach_no);


    /**
     * 二十三.	发电记录功能
     */
    public List getGenerateLog(@Param("user_cus") String user_cus,
                               @Param("mach_no") String mach_no,
                               @Param("start_date") long start_date,
                               @Param("end_date") long end_date);



    public Map getMachineNum(@Param("user_cus") String user_cus,
                             @Param("activate") boolean activate,
                             @Param("inactivate") boolean inactivate);


    /**
     * 三十一.	移动油机查询
     */

    public List searchMachine(
            @Param("user_cus") String user_cus,
            @Param("state") String state,
            @Param("online") String online,
            @Param("currentType") String currentType,
            @Param("fuel_type") String fuel_typ,
            @Param("Acity_electricity") String Acity_electricity,
            @Param("content") String content,
            @Param("generateStatus") String generateStatus,
            @Param("expr1") int expr1,
            @Param("use_type") String use_type,
            @Param("activate") boolean activate,
            @Param("inactivate") boolean inactivate);

    /**
     * 三十二.	启动功能
     */
    public int startMachine(@Param("mach_no") String mach_no, @Param("user_no") String user_no);

    /**
     * 三十三.	熄火功能
     */
    public int offMachine(@Param("mach_no") String mach_no, @Param("user_no") String user_no);

    /**
     * 三十四.	模式切换功能
     */
    public int changeModel(
            @Param("mach_no") String mach_no,
            @Param("modelflag") int modelflag,
            @Param("code") String code,
            @Param("user_no") String user_no);

    /**
     * 三十五.	保护模式切换功能
     */
    public int changeProtectModel(
            @Param("mach_no") String mach_no,
            @Param("modelflag") int modelflag,
            @Param("code") String code,
            @Param("user_no") String user_no);



    /**
     * 39.	移动油机交流主数据明细
     */
    public List getSiteDetailed1(String mach_no);


    /**
     * 四十一.警报信息查询明细1
     */
    public List getSiteWarningList(@Param("user_cus") String user_cus, @Param("action_type") int action_type, @Param("start_date") long start_date, @Param("end_date") long end_date);

}
