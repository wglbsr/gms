package com.dyny.gms.db.pojo;

import java.util.Date;

public class ApWarning {
    private Integer id;

    private Integer stId;

    private String machNo;

    private Integer actionType;

    private String action;

    private Byte see;

    private Date interTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Byte getSee() {
        return see;
    }

    public void setSee(Byte see) {
        this.see = see;
    }

    public Date getInterTime() {
        return interTime;
    }

    public void setInterTime(Date interTime) {
        this.interTime = interTime;
    }
}