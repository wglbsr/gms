package com.dyny.gms.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Generator {
    private String machNo;

    private Integer id;

    private String machName;

    private String machType;

    private String fuelType;

    private String useType;

    private String stNo;

    private String cusNo;

    private String modelNo;

    private String venderName;

    private BigDecimal powerNum;

    private Date purchTime;

    private String state;

    private String note;

    private Date creatTime;

    private String creator;

    private String verNo;

    private BigDecimal maintainTime;

    private BigDecimal stopTime;

    private BigDecimal startVoltage;

    private BigDecimal volumeno;

    private String gprsno;

    private Date maintainDate;

    private Integer maintainNum;

    private Integer totalGenerateTime;

    private Integer totalGenerateCnt;

    private Boolean deleted;

    private Boolean activated;

    private Integer boardVersion;

    private String offlineReason;

    private Integer offlineType;

    public String getMachNo() {
        return machNo;
    }

    public void setMachNo(String machNo) {
        this.machNo = machNo == null ? null : machNo.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMachName() {
        return machName;
    }

    public void setMachName(String machName) {
        this.machName = machName == null ? null : machName.trim();
    }

    public String getMachType() {
        return machType;
    }

    public void setMachType(String machType) {
        this.machType = machType == null ? null : machType.trim();
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo == null ? null : stNo.trim();
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo == null ? null : cusNo.trim();
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName == null ? null : venderName.trim();
    }

    public BigDecimal getPowerNum() {
        return powerNum;
    }

    public void setPowerNum(BigDecimal powerNum) {
        this.powerNum = powerNum;
    }

    public Date getPurchTime() {
        return purchTime;
    }

    public void setPurchTime(Date purchTime) {
        this.purchTime = purchTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getVerNo() {
        return verNo;
    }

    public void setVerNo(String verNo) {
        this.verNo = verNo == null ? null : verNo.trim();
    }

    public BigDecimal getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(BigDecimal maintainTime) {
        this.maintainTime = maintainTime;
    }

    public BigDecimal getStopTime() {
        return stopTime;
    }

    public void setStopTime(BigDecimal stopTime) {
        this.stopTime = stopTime;
    }

    public BigDecimal getStartVoltage() {
        return startVoltage;
    }

    public void setStartVoltage(BigDecimal startVoltage) {
        this.startVoltage = startVoltage;
    }

    public BigDecimal getVolumeno() {
        return volumeno;
    }

    public void setVolumeno(BigDecimal volumeno) {
        this.volumeno = volumeno;
    }

    public String getGprsno() {
        return gprsno;
    }

    public void setGprsno(String gprsno) {
        this.gprsno = gprsno == null ? null : gprsno.trim();
    }

    public Date getMaintainDate() {
        return maintainDate;
    }

    public void setMaintainDate(Date maintainDate) {
        this.maintainDate = maintainDate;
    }

    public Integer getMaintainNum() {
        return maintainNum;
    }

    public void setMaintainNum(Integer maintainNum) {
        this.maintainNum = maintainNum;
    }

    public Integer getTotalGenerateTime() {
        return totalGenerateTime;
    }

    public void setTotalGenerateTime(Integer totalGenerateTime) {
        this.totalGenerateTime = totalGenerateTime;
    }

    public Integer getTotalGenerateCnt() {
        return totalGenerateCnt;
    }

    public void setTotalGenerateCnt(Integer totalGenerateCnt) {
        this.totalGenerateCnt = totalGenerateCnt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Integer getBoardVersion() {
        return boardVersion;
    }

    public void setBoardVersion(Integer boardVersion) {
        this.boardVersion = boardVersion;
    }

    public String getOfflineReason() {
        return offlineReason;
    }

    public void setOfflineReason(String offlineReason) {
        this.offlineReason = offlineReason == null ? null : offlineReason.trim();
    }

    public Integer getOfflineType() {
        return offlineType;
    }

    public void setOfflineType(Integer offlineType) {
        this.offlineType = offlineType;
    }
}