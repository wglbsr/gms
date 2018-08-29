package com.dyny.gms.db.pojo;

import java.util.Date;

public class Operate {
    private Integer id;

    private String machNo;

    private Integer opNo;

    private String opNum;

    private Date creatTime;

    private String creatPer;

    private Boolean action;

    private Integer executeId;

    private Date actualExecuteTime;

    private Boolean deleted;

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

    public Integer getOpNo() {
        return opNo;
    }

    public void setOpNo(Integer opNo) {
        this.opNo = opNo;
    }

    public String getOpNum() {
        return opNum;
    }

    public void setOpNum(String opNum) {
        this.opNum = opNum == null ? null : opNum.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreatPer() {
        return creatPer;
    }

    public void setCreatPer(String creatPer) {
        this.creatPer = creatPer == null ? null : creatPer.trim();
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }

    public Integer getExecuteId() {
        return executeId;
    }

    public void setExecuteId(Integer executeId) {
        this.executeId = executeId;
    }

    public Date getActualExecuteTime() {
        return actualExecuteTime;
    }

    public void setActualExecuteTime(Date actualExecuteTime) {
        this.actualExecuteTime = actualExecuteTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}