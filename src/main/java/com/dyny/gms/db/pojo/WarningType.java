package com.dyny.gms.db.pojo;

import java.util.Date;

public class WarningType {
    private Integer id;

    private Integer warningType;

    private String warningName;

    private String warningCode;

    private Integer warningLevel;

    private String warningRemark;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarningType() {
        return warningType;
    }

    public void setWarningType(Integer warningType) {
        this.warningType = warningType;
    }

    public String getWarningName() {
        return warningName;
    }

    public void setWarningName(String warningName) {
        this.warningName = warningName == null ? null : warningName.trim();
    }

    public String getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(String warningCode) {
        this.warningCode = warningCode == null ? null : warningCode.trim();
    }

    public Integer getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
    }

    public String getWarningRemark() {
        return warningRemark;
    }

    public void setWarningRemark(String warningRemark) {
        this.warningRemark = warningRemark == null ? null : warningRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}