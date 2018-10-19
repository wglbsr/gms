package com.dyny.gms.db.pojo.custom;

import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.Station;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author:wanggl
 * @date:2018-10-19
 * @version:1.0.0
 */
public class GeneratorStatusBean {
    private String generatorName;
    private String generatorNo;
    private String stationNo;
    private String stationName;
    private String fuelTypeName;
    private String currentTypeName;
    private BigDecimal outputVoltage;
    private BigDecimal outPutCurrent;
    private BigDecimal bootVoltage;
    private BigDecimal batteryVoltage;
    private BigDecimal generatorTemperature;
    private BigDecimal coContent;
    private BigDecimal fuelLevel;
    private float fuelPercent;
    private BigDecimal fuelTankCapacity;
    private boolean loading;
    private boolean sleeping;
    private boolean powerOutage;
    private int totalGenerateTime;
    private int generatorMode;
    private BigDecimal maintainTime;
    private int fuelType;
    private int currentType;
    private int generateCnt;
    private Date createTime;
    private int boardVersion;

    public GeneratorStatusBean(Generator generator, Basis basis, Station station) {
        this.generatorName = generator.getMachName();
        this.generatorNo = generator.getMachNo();
        this.stationNo = station.getStationNo();
        this.stationName = station.getStationName();
        this.fuelTypeName = generator.getFuelType();
        this.currentTypeName = generator.getMachType();
        this.outputVoltage = basis.getOutputVoltage();
        this.outPutCurrent = basis.getStCurrent();
        this.bootVoltage = generator.getStartVoltage();
        this.batteryVoltage = basis.getAlVoltage();
        this.generatorTemperature = basis.getCabinetTemperature();
        this.coContent = basis.getStCo();
        this.fuelLevel = basis.getLankLevel();
        this.fuelTankCapacity = generator.getVolumeno();
        this.fuelPercent = this.fuelLevel.floatValue() / this.fuelTankCapacity.floatValue();
        this.loading = basis.getLoadMode();
        this.sleeping = basis.getState();
        this.powerOutage = basis.getCityElectricity();
        this.totalGenerateTime = generator.getTotalGenerateTime();
        this.generateCnt = generator.getTotalGenerateCnt();
        this.generatorMode = basis.getSysMode();
        this.maintainTime = generator.getMaintainTime();
        this.fuelType = 0;
        this.currentType = 0;
        this.createTime = basis.getInterTime();
        this.boardVersion = generator.getBoardVersion();
    }


    public int getBoardVersion() {
        return boardVersion;
    }

    public void setBoardVersion(int boardVersion) {
        this.boardVersion = boardVersion;
    }


    public String getGeneratorName() {
        return generatorName;
    }

    public void setGeneratorName(String generatorName) {
        this.generatorName = generatorName;
    }

    public String getGeneratorNo() {
        return generatorNo;
    }

    public void setGeneratorNo(String generatorNo) {
        this.generatorNo = generatorNo;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFuelTypeName() {
        return fuelTypeName;
    }

    public void setFuelTypeName(String fuelTypeName) {
        this.fuelTypeName = fuelTypeName;
    }

    public String getCurrentTypeName() {
        return currentTypeName;
    }

    public void setCurrentTypeName(String currentTypeName) {
        this.currentTypeName = currentTypeName;
    }

    public BigDecimal getOutputVoltage() {
        return outputVoltage;
    }

    public void setOutputVoltage(BigDecimal outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    public BigDecimal getOutPutCurrent() {
        return outPutCurrent;
    }

    public void setOutPutCurrent(BigDecimal outPutCurrent) {
        this.outPutCurrent = outPutCurrent;
    }

    public BigDecimal getBootVoltage() {
        return bootVoltage;
    }

    public void setBootVoltage(BigDecimal bootVoltage) {
        this.bootVoltage = bootVoltage;
    }

    public BigDecimal getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(BigDecimal batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public BigDecimal getGeneratorTemperature() {
        return generatorTemperature;
    }

    public void setGeneratorTemperature(BigDecimal generatorTemperature) {
        this.generatorTemperature = generatorTemperature;
    }

    public BigDecimal getCoContent() {
        return coContent;
    }

    public void setCoContent(BigDecimal coContent) {
        this.coContent = coContent;
    }

    public BigDecimal getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(BigDecimal fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public float getFuelPercent() {
        return fuelPercent;
    }

    public void setFuelPercent(float fuelPercent) {
        this.fuelPercent = fuelPercent;
    }

    public BigDecimal getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(BigDecimal fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public boolean isLoading() {
        return loading;
    }

    public void setLoading(boolean loading) {
        this.loading = loading;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public boolean isPowerOutage() {
        return powerOutage;
    }

    public void setPowerOutage(boolean powerOutage) {
        this.powerOutage = powerOutage;
    }

    public int getTotalGenerateTime() {
        return totalGenerateTime;
    }

    public void setTotalGenerateTime(int totalGenerateTime) {
        this.totalGenerateTime = totalGenerateTime;
    }

    public int getGeneratorMode() {
        return generatorMode;
    }

    public void setGeneratorMode(int generatorMode) {
        this.generatorMode = generatorMode;
    }

    public BigDecimal getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(BigDecimal maintainTime) {
        this.maintainTime = maintainTime;
    }

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public int getCurrentType() {
        return currentType;
    }

    public void setCurrentType(int currentType) {
        this.currentType = currentType;
    }

    public int getGenerateCnt() {
        return generateCnt;
    }

    public void setGenerateCnt(int generateCnt) {
        this.generateCnt = generateCnt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
