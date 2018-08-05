package com.dyny.gms.db.pojo;

import java.util.Date;

public class ApLank {
    private Integer stId;

    private String machNo;

    private Date creatTime;

    private Double startNum;

    private Double endNum;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getMachNo() {
        return machNo;
    }

    public void setMachNo(String machNo) {
        this.machNo = machNo == null ? null : machNo.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Double getStartNum() {
        return startNum;
    }

    public void setStartNum(Double startNum) {
        this.startNum = startNum;
    }

    public Double getEndNum() {
        return endNum;
    }

    public void setEndNum(Double endNum) {
        this.endNum = endNum;
    }
}