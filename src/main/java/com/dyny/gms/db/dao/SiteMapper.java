package com.dyny.gms.db.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SiteMapper {
	
	public List getAllSite(@Param("username")String username);
	
	public List getAllMap(@Param("username")String username);
	
	/**
	 * 所有站点数量
	 * @return
	 */
	public Map<String, Object> getAllNum(@Param("username")String username);
	
	/**
	 * 在线的站点
	 * @return
	 */
	public Map<String, Object> getOnlineNum(@Param("username")String username);
	
	/**
	 * 离线的站点数量
	 * @return
	 */
	public Map<String, Object> getOfflineNum(@Param("username")String username);
	
	/**
	 * 发电的站点数
	 * @return
	 */
	public Map<String, Object> getActiveNum(@Param("username")String username);
	
	/**
	 * 站点状态为停电的站点的数量
	 * @return
	 */
	public Map<String, Object> getStopNum(@Param("username")String username);
	
	public List search(@Param("username")String username, @Param("search")String search);
	
	public List getOffLineSite(@Param("username")String username);
	
	public List getOnlineSite(@Param("username")String username);
	
	public List getActiveSite(@Param("username")String username);
	
	public List getStopSite(@Param("username")String username);
	
	public Map<String, Object> getSiteHeadMsg(String stationId);
	
	public List getSiteContent(String stationId);
	
	public Map<String, Object> getStartVoltage(String mach_no);
	
	public int modifyStartVoltage(@Param("changeVoltage") BigDecimal changeVoltage, @Param("mach_no")String mach_no);
	
	/**
	 * 十六.	(1)查询保养时间功能
	 * @param mach_no
	 * @return
	 */
	public Map<String, Object> getCareTime(String mach_no);
	
	/**
	 * 十六.(2)设定保养时间功能 
	 * @param mach_no
	 * @return
	 */
	public int modifyCareTime (@Param("currentServiceTime")BigDecimal currentServiceTime, @Param("mach_no")String stationId);
	
	/**
	 * 十七.	(1)设定停机功能
	 * @param mach_no
	 * @return
	 */
	public Map<String, Object> getStopTime(String mach_no);
	
	/**
	 * 十七.(2)设定停机功能 
	 * @param mach_no
	 * @return
	 */
	public int modifyStopTime (@Param("currentStopTime")BigDecimal currentStopTime, @Param("mach_no")String mach_no);
	
	/**
	 * 十八.	查看地图位置功能
	 * @param stationId
	 * @return
	 */
	public Map<String, Object> getMapByStationId(String stationId);
	
	/**
	 * 十九.	站点信息主功能
	 */
	public Map<String, Object> getSiteInfo(String stationId);
	
	/**
	 * 二十.	站点信息修改功能
	 */
	public int modifySiteInfo(
			@Param("stationName")String stationName, 
			@Param("stationNumber")String stationNumber, 
			@Param("stationType")String stationType, 
			@Param("usercus")String usercus, 
			@Param("stationPosition")String stationPosition, 
			@Param("stationAddress")String stationAddress, 
			@Param("companyAddress")String companyAddress, 
			@Param("stationContactManA")String stationContactManA, 
			@Param("contactManPhoneA")String contactManPhoneA, 
			@Param("stationContactManB")String stationContactManB,
			@Param("contactManPhoneB")String contactManPhoneB, 
			@Param("stationId")String stationId);
	
	/**
	 * 二十一.	注册站点信息功能
	 */
	public int addSiteInfo(
			@Param("stationName")String stationName, 
			@Param("stationNumber")String stationNumber, 
			@Param("stationType")String stationType, 
			@Param("usercus")String usercus, 
			@Param("stationPosition")String stationPosition, 
			@Param("stationAddress")String stationAddress, 
			@Param("companyAddress")String companyAddress, 
			@Param("stationContactManA")String stationContactManA, 
			@Param("contactManPhoneA")String contactManPhoneA, 
			@Param("stationContactManB")String stationContactManB,
			@Param("contactManPhoneB")String contactManPhoneB);
	
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
			@Param("mach_name")String mach_name,
			@Param("mach_no")String mach_no,
			@Param("model_no")String model_no,
			@Param("vender_name")String vender_name,
			@Param("power_num")BigDecimal power_num,
			@Param("cus_no")String cus_no,
			@Param("user_no")String creator,
			@Param("use_type")String use_type,
			@Param("mach_type")String mach_type,
			@Param("fuel_type")String fuel_type,
			@Param("state")String state,
			@Param("purch_time")String purch_time,
			@Param("note") String note,
			@Param("volumeno")BigDecimal volumeno,
			@Param("gprsno") String gprsno);
	
	/**
	 * 二十五.	油机领用管理
	 */
	public int addOil(
			@Param("co_no")String co_no,
			@Param("co_time")String co_time,
			@Param("co_per")String co_per,
			@Param("co_tel")String co_tel,
			@Param("st_no")String st_no,
			@Param("mach_no")String mach_no,
			@Param("use_address")String use_address,
			@Param("user_no")String user_no);
	/**
	 * 二十六.
	 */
	public List getMachineList(@Param(value="user_cus")String user_cu);
	
	/**
	 * 二十六.	移动油机运行情况（全部）
	 */
	public Map<String, Object> getMachineAllNum(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十六.	移动油机运行情况（在线）
	 */
	public Map<String, Object> getMachineOnlineNum(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十六.	移动油机运行情况（离线）
	 */
	public Map<String, Object> getMachineOfflineNum(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十六.	移动油机运行情况（发电）
	 */
	public Map<String, Object> getMachineActiveNum(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十六.	移动油机运行情况（停电）
	 */
	public Map<String, Object> getMachineStopNum(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十七.	移动油机在线(双击在线)
	 */
	public List getOnlineMachine(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十八.	移动油机离线(双击离线)
	 */
	public List getOfflineMachine(@Param(value="user_cus")String user_cus);
	
	/**
	 * 二十九.	移动油机发电
	 */
	public List getActiveMachine(@Param(value="user_cus")String user_cus);
	
	/**
	 * 三十.	移动油机停机
	 */
	public List getStopMachine(@Param(value="user_cus")String user_cus);
	
	/**
	 *  三十一.	移动油机查询 
	 */

	public List searchMachine(
			@Param("user_cus")String user_cus, 
			@Param("state")String state, 
			@Param("st_state")String st_state, 
			@Param("mach_type")String mach_type, 
			@Param("fuel_type")String fuel_typ, 
			@Param("Acity_electricity")String Acity_electricity, 
			@Param("search1")String search1);
	
	/**
	 * 三十二.	启动功能
	 */
	public int startMachine(@Param("mach_no")String mach_no, @Param("user_no")String user_no);
	
	/**
	 * 三十三.	熄火功能
	 */
	public int offMachine(@Param("mach_no")String mach_no, @Param("user_no")String user_no);
	
	/**
	 * 三十四.	模式切换功能
	 */
	public int changeModel(
			@Param("mach_no")String mach_no, 
			@Param("modelflag")int modelflag, 
			@Param("code")String code, 
			@Param("user_no")String user_no);
	
	/**
	 * 三十五.	保护模式切换功能
	 */
	public int changeProtectModel(
			@Param("mach_no")String mach_no, 
			@Param("modelflag")int modelflag, 
			@Param("code")String code, 
			@Param("user_no")String user_no);
	
	/**
	 * 三十六.	移动油机地图位置
	 */
	public Map<String, Object> getMachineMap(String user_cus);
	
	/**
	 * 三十七.	移动油机领用查询(25项目的补充)
	 */
	public List searchMachineInUse(
			@Param("user_cus")String user_cus,
			@Param("strat_time")String strat_time,
			@Param("end_time")String end_time);
	/**
	 * 38.	移动油机交流主数据明细 
	 */
	public List getSiteDetailed(String mach_no);
	
	/**
	 * 39.	移动油机交流主数据明细 
	 */
	public List getSiteDetailed1(String mach_no);
	/**
	 * 四十.警报信息查询明细
	 */
public List getSiteWaring(@Param("user_cus")String user_cus);

/**
 * 四十一.警报信息查询明细1
 */
public List getSiteWaring1(@Param("user_cus")String user_cus);

}
