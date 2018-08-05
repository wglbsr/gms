package com.dyny.gms.db.pojo;

import java.util.Date;

public class ApOperate {
    private Integer id;

    private String machNo;

    private Integer opNo;

    private String opNum;

    private Date creatTime;

    private String creatPer;

    private Byte action;

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

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }
}