package com.dyny.gms.db.pojo;

import java.util.Date;

public class ApCollar {
    private Integer id;

    private String coNo;

    private String machNo;

    private Integer state;

    private Date coTime;

    private String coPer;

    private String coTel;

    private String stNo;

    private String coAdd;

    private Date creatTime;

    private String creatPer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoNo() {
        return coNo;
    }

    public void setCoNo(String coNo) {
        this.coNo = coNo == null ? null : coNo.trim();
    }

    public String getMachNo() {
        return machNo;
    }

    public void setMachNo(String machNo) {
        this.machNo = machNo == null ? null : machNo.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCoTime() {
        return coTime;
    }

    public void setCoTime(Date coTime) {
        this.coTime = coTime;
    }

    public String getCoPer() {
        return coPer;
    }

    public void setCoPer(String coPer) {
        this.coPer = coPer == null ? null : coPer.trim();
    }

    public String getCoTel() {
        return coTel;
    }

    public void setCoTel(String coTel) {
        this.coTel = coTel == null ? null : coTel.trim();
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo == null ? null : stNo.trim();
    }

    public String getCoAdd() {
        return coAdd;
    }

    public void setCoAdd(String coAdd) {
        this.coAdd = coAdd == null ? null : coAdd.trim();
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
}