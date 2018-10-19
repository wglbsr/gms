package com.dyny.gms.db.pojo;

import java.util.Date;

public class SystemConfig {
    private Integer id;

    private Boolean activated;

    private Date createTime;

    private Date modifyTime;

    private Integer onilneTimeout;

    private Integer refreshTimeout;

    private String configName;

    private Integer alarmTimeout;

    private String copyrightInfo;

    private String companyAddress;

    private String companyPhone;

    private String contactName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
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

    public Integer getOnilneTimeout() {
        return onilneTimeout;
    }

    public void setOnilneTimeout(Integer onilneTimeout) {
        this.onilneTimeout = onilneTimeout;
    }

    public Integer getRefreshTimeout() {
        return refreshTimeout;
    }

    public void setRefreshTimeout(Integer refreshTimeout) {
        this.refreshTimeout = refreshTimeout;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public Integer getAlarmTimeout() {
        return alarmTimeout;
    }

    public void setAlarmTimeout(Integer alarmTimeout) {
        this.alarmTimeout = alarmTimeout;
    }

    public String getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(String copyrightInfo) {
        this.copyrightInfo = copyrightInfo == null ? null : copyrightInfo.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }
}