package com.dyny.gms.db.pojo;

import java.util.Date;

public class Enumeration {
    private Byte id;

    private String enumValueText;

    private Byte enumValue;

    private Date createTime;

    private Date modifyTime;

    private Integer modifyUser;

    private Integer createUser;

    private String columnKey;

    private String columnText;

    private String remark;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getEnumValueText() {
        return enumValueText;
    }

    public void setEnumValueText(String enumValueText) {
        this.enumValueText = enumValueText == null ? null : enumValueText.trim();
    }

    public Byte getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(Byte enumValue) {
        this.enumValue = enumValue;
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

    public Integer getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey == null ? null : columnKey.trim();
    }

    public String getColumnText() {
        return columnText;
    }

    public void setColumnText(String columnText) {
        this.columnText = columnText == null ? null : columnText.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}