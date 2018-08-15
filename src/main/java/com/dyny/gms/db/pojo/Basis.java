package com.dyny.gms.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Basis {
    private Integer id;

    private String machNo;

    private Boolean state;

    private Boolean sysMode;

    private BigDecimal lankLevel;

    private BigDecimal cabinetTemperature;

    private BigDecimal stCurrent;

    private BigDecimal externalTemperature;

    private BigDecimal stVoltage;

    private BigDecimal alVoltage;

    private Boolean cityElectricity;

    private Boolean cabinetState;

    private Date stTime;

    private String startTime;

    private String endTime;

    private String verNo;

    private BigDecimal startVoltage;

    private BigDecimal sumPower;

    private String numTime;

    private String onTime;

    private String maintainTime;

    private BigDecimal mainboardTemperature;

    private Date interTime;

    private BigDecimal stCo;

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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getSysMode() {
        return sysMode;
    }

    public void setSysMode(Boolean sysMode) {
        this.sysMode = sysMode;
    }

    public BigDecimal getLankLevel() {
        return lankLevel;
    }

    public void setLankLevel(BigDecimal lankLevel) {
        this.lankLevel = lankLevel;
    }

    public BigDecimal getCabinetTemperature() {
        return cabinetTemperature;
    }

    public void setCabinetTemperature(BigDecimal cabinetTemperature) {
        this.cabinetTemperature = cabinetTemperature;
    }

    public BigDecimal getStCurrent() {
        return stCurrent;
    }

    public void setStCurrent(BigDecimal stCurrent) {
        this.stCurrent = stCurrent;
    }

    public BigDecimal getExternalTemperature() {
        return externalTemperature;
    }

    public void setExternalTemperature(BigDecimal externalTemperature) {
        this.externalTemperature = externalTemperature;
    }

    public BigDecimal getStVoltage() {
        return stVoltage;
    }

    public void setStVoltage(BigDecimal stVoltage) {
        this.stVoltage = stVoltage;
    }

    public BigDecimal getAlVoltage() {
        return alVoltage;
    }

    public void setAlVoltage(BigDecimal alVoltage) {
        this.alVoltage = alVoltage;
    }

    public Boolean getCityElectricity() {
        return cityElectricity;
    }

    public void setCityElectricity(Boolean cityElectricity) {
        this.cityElectricity = cityElectricity;
    }

    public Boolean getCabinetState() {
        return cabinetState;
    }

    public void setCabinetState(Boolean cabinetState) {
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

    public BigDecimal getStartVoltage() {
        return startVoltage;
    }

    public void setStartVoltage(BigDecimal startVoltage) {
        this.startVoltage = startVoltage;
    }

    public BigDecimal getSumPower() {
        return sumPower;
    }

    public void setSumPower(BigDecimal sumPower) {
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

    public BigDecimal getMainboardTemperature() {
        return mainboardTemperature;
    }

    public void setMainboardTemperature(BigDecimal mainboardTemperature) {
        this.mainboardTemperature = mainboardTemperature;
    }

    public Date getInterTime() {
        return interTime;
    }

    public void setInterTime(Date interTime) {
        this.interTime = interTime;
    }

    public BigDecimal getStCo() {
        return stCo;
    }

    public void setStCo(BigDecimal stCo) {
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