package com.dyny.gms.db.pojo;

import java.util.Date;

public class CBasis {
    private Integer id;

    private String machNo;

    private Byte state;

    private Byte sysMode;

    private Double lankLevel;

    private Double cabinetTemperature;

    private Double stCurrent;

    private Double externalTemperature;

    private Double stVoltage;

    private Double alVoltage;

    private Byte cityElectricity;

    private Byte cabinetState;

    private Date stTime;

    private String startTime;

    private String endTime;

    private String verNo;

    private Double startVoltage;

    private Double sumPower;

    private String numTime;

    private String onTime;

    private String maintainTime;

    private Double mainboardTemperature;

    private Date interTime;

    private Double stCo;

    private String stCoordinate;

    private String item3;

    private String item4;

    private String item5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachNo() {
        return machNo;
    }

    public void setMachNo(String machNo) {
        this.machNo = machNo == null ? null : machNo.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getSysMode() {
        return sysMode;
    }

    public void setSysMode(Byte sysMode) {
        this.sysMode = sysMode;
    }

    public Double getLankLevel() {
        return lankLevel;
    }

    public void setLankLevel(Double lankLevel) {
        this.lankLevel = lankLevel;
    }

    public Double getCabinetTemperature() {
        return cabinetTemperature;
    }

    public void setCabinetTemperature(Double cabinetTemperature) {
        this.cabinetTemperature = cabinetTemperature;
    }

    public Double getStCurrent() {
        return stCurrent;
    }

    public void setStCurrent(Double stCurrent) {
        this.stCurrent = stCurrent;
    }

    public Double getExternalTemperature() {
        return externalTemperature;
    }

    public void setExternalTemperature(Double externalTemperature) {
        this.externalTemperature = externalTemperature;
    }

    public Double getStVoltage() {
        return stVoltage;
    }

    public void setStVoltage(Double stVoltage) {
        this.stVoltage = stVoltage;
    }

    public Double getAlVoltage() {
        return alVoltage;
    }

    public void setAlVoltage(Double alVoltage) {
        this.alVoltage = alVoltage;
    }

    public Byte getCityElectricity() {
        return cityElectricity;
    }

    public void setCityElectricity(Byte cityElectricity) {
        this.cityElectricity = cityElectricity;
    }

    public Byte getCabinetState() {
        return cabinetState;
    }

    public void setCabinetState(Byte cabinetState) {
        this.cabinetState = cabinetState;
    }

    public Date getStTime() {
        return stTime;
    }

    public void setStTime(Date stTime) {
        this.stTime = stTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getVerNo() {
        return verNo;
    }

    public void setVerNo(String verNo) {
        this.verNo = verNo == null ? null : verNo.trim();
    }

    public Double getStartVoltage() {
        return startVoltage;
    }

    public void setStartVoltage(Double startVoltage) {
        this.startVoltage = startVoltage;
    }

    public Double getSumPower() {
        return sumPower;
    }

    public void setSumPower(Double sumPower) {
        this.sumPower = sumPower;
    }

    public String getNumTime() {
        return numTime;
    }

    public void setNumTime(String numTime) {
        this.numTime = numTime == null ? null : numTime.trim();
    }

    public String getOnTime() {
        return onTime;
    }

    public void setOnTime(String onTime) {
        this.onTime = onTime == null ? null : onTime.trim();
    }

    public String getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime == null ? null : maintainTime.trim();
    }

    public Double getMainboardTemperature() {
        return mainboardTemperature;
    }

    public void setMainboardTemperature(Double mainboardTemperature) {
        this.mainboardTemperature = mainboardTemperature;
    }

    public Date getInterTime() {
        return interTime;
    }

    public void setInterTime(Date interTime) {
        this.interTime = interTime;
    }

    public Double getStCo() {
        return stCo;
    }

    public void setStCo(Double stCo) {
        this.stCo = stCo;
    }

    public String getStCoordinate() {
        return stCoordinate;
    }

    public void setStCoordinate(String stCoordinate) {
        this.stCoordinate = stCoordinate == null ? null : stCoordinate.trim();
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3 == null ? null : item3.trim();
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4 == null ? null : item4.trim();
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5 == null ? null : item5.trim();
    }
}