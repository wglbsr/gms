package com.dyny.gms.db.pojo;

import java.util.Date;

public class GeneratorStationRel {
    private Integer id;

    private String stationNo;

    private String generatorNo;

    private Date createTime;

    private Boolean deleted;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public String getGeneratorNo() {
        return generatorNo;
    }

    public void setGeneratorNo(String generatorNo) {
        this.generatorNo = generatorNo == null ? null : generatorNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}