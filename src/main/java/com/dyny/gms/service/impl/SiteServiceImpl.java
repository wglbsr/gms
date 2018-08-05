package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.SiteMapper;
import com.dyny.gms.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
@Service
public class SiteServiceImpl implements SiteService {
	@Autowired
	private SiteMapper mapper;

	@Override
	public List getAllSite(String username) {
		// TODO Auto-generated method stub
		return mapper.getAllSite(username);
	}

	@Override
	public List getAllMap(String username) {
		// TODO Auto-generated method stub
		return mapper.getAllMap(username);
	}

	public Map<String, Object> getSiteNumByStatus(String username) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> allMap = mapper.getAllNum(username);
		Map<String, Object> onlineMap = mapper.getOnlineNum(username);
		Map<String, Object> offlineMap = mapper.getOfflineNum(username);
		Map<String, Object> activeMap = mapper.getActiveNum(username);
		Map<String, Object> stopMap = mapper.getStopNum(username);
		result.put("allStationNum", allMap.get("siteCount"));
		result.put("stationOnlineNum", onlineMap.get("siteCount"));
		result.put("stationOfflineNum", offlineMap.get("siteCount"));
		result.put("stationGenerationNum", activeMap.get("siteCount"));
		result.put("stationInterruptionNum", stopMap.get("siteCount"));
		return result;
	}

	@Override
	public List search(String username, String search) {
		// TODO Auto-generated method stub
		return mapper.search(username, search);
	}

	@Override
	public List getOffLineSite(String username) {
		// TODO Auto-generated method stub
		return mapper.getOffLineSite(username);
	}

	@Override
	public List getOnlineSite(String username) {
		// TODO Auto-generated method stub
		return mapper.getOnlineSite(username);
	}

	@Override
	public List getActiveSite(String username) {
		// TODO Auto-generated method stub
		return mapper.getActiveSite(username);
	}

	@Override
	public List getStopSite(String username) {
		// TODO Auto-generated method stub
		return mapper.getStopSite(username);
	}

	@Override
	public Map<String, Object> getSiteHeadMsg(String stationId) {
		// TODO Auto-generated method stub
		return mapper.getSiteHeadMsg(stationId);
	}

	@Override
	public List getSiteContent(String stationId) {
		// TODO Auto-generated method stub
		return mapper.getSiteContent(stationId);
	}

	@Override
	public Map<String, Object> getStartVoltage(String stationId) {
		// TODO Auto-generated method stub
		return mapper.getStartVoltage(stationId);
	}

	@Override
	public int modifyStartVoltage(int changeVoltage, String stationId) {
		// TODO Auto-generated method stub
		return mapper.modifyStartVoltage(changeVoltage, stationId);
	}
	
	@Override
	public Map<String, Object> getCareTime(String stationId) {
		// TODO Auto-generated method stub
		return mapper.getCareTime(stationId);
	}

	@Override
	public int modifyCareTime(int currentServiceTime, String stationId) {
		// TODO Auto-generated method stub
		return mapper.modifyCareTime(currentServiceTime, stationId);
	}

	@Override
	public Map<String, Object> getStopTime(String stationId) {
		// TODO Auto-generated method stub
		return mapper.getStopTime(stationId);
	}

	@Override
	public int modifyStopTime(int currentStopTime, String stationId) {
		// TODO Auto-generated method stub
		return mapper.modifyStopTime(currentStopTime, stationId);
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
	public Map<String, Object> getActiveElecLog(String st_no) {
		// TODO Auto-generated method stub
		return mapper.getActiveElecLog(st_no);
	}

	@Override
	public int addAssets(String mach_name, String mach_no, String model_no,
			String vender_name, String power_num, String cus_no,
			String creator, String use_type, String mach_type,
			String fuel_type, String state, String purch_time) {
		// TODO Auto-generated method stub
		return mapper.addAssets(mach_name, mach_no, model_no, vender_name, power_num, cus_no, creator, use_type, mach_type, fuel_type, state, purch_time);
	}

	@Override
	public int addOil(String co_no, String co_time, String co_per, String co_tel, 
			String st_no, String mach_no, String use_address, String user_no) {
		// TODO Auto-generated method stub
		return mapper.addOil(co_no, co_time, co_per, co_tel, st_no, mach_no, use_address, user_no);
	}

	@Override
	public Map<String, Object> getMachineNumByStatus(String user_cus) {
		// TODO Auto-generated method stub
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> allMap = mapper.getMachineAllNum(user_cus);
		Map<String, Object> onlineMap = mapper.getMachineOnlineNum(user_cus);
		Map<String, Object> offlineMap = mapper.getMachineOfflineNum(user_cus);
		Map<String, Object> activeMap = mapper.getMachineActiveNum(user_cus);
		Map<String, Object> stopMap = mapper.getMachineStopNum(user_cus);
		result.put("allNum", allMap.get("machineCount"));
		result.put("onlineNum", onlineMap.get("machineCount"));
		result.put("offlineNum", offlineMap.get("machineCount"));
		result.put("generationNum", activeMap.get("machineCount"));
		result.put("interruptionNum", stopMap.get("machineCount"));
		return result;
	}

	@Override
	public List getOnlineMachine(String user_cus) {
		// TODO Auto-generated method stub
		return mapper.getOnlineMachine(user_cus);
	}

	@Override
	public List getOfflineMachine(String user_cus) {
		// TODO Auto-generated method stub
		return mapper.getOfflineMachine(user_cus);
	}

	@Override
	public List getActiveMachine(String user_cus) {
		// TODO Auto-generated method stub
		return mapper.getActiveMachine(user_cus);
	}

	@Override
	public List getStopMachine(String user_cus) {
		// TODO Auto-generated method stub
		return mapper.getStopMachine(user_cus);
	}

	@Override
	public List searchMachine(String user_cus, String state1, String st_state,
			String mach_type, String search) {
		// TODO Auto-generated method stub
		return mapper.searchMachine(user_cus, state1, st_state, mach_type, search);
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
	public Map<String, Object> searchMachineInUse(String user_cus,
			String strat_time, String end_time) {
		// TODO Auto-generated method stub
		return mapper.searchMachineInUse(user_cus, strat_time, end_time);
	}

}
