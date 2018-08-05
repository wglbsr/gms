package com.dyny.gms.db.pojo;

import java.util.Date;

public class CStation {
    private Integer id;

    private String stNo;

    private String stName;

    private String stUnit;

    private Byte stType;

    private String machNo;

    private String stCoordinate;

    private String stAdd;

    private String unitAdd;

    private String stPer1;

    private String stPertel1;

    private String stPer2;

    private String stPertel2;

    private Date creatTime;

    private String creator;

    private Double stopTime;

    private Double startVoltage;

    private Double maintainTime;

    private String item1;

    private String item2;

    private String item3;

    private String item4;

    private String item5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo == null ? null : stNo.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStUnit() {
        return stUnit;
    }

    public void setStUnit(String stUnit) {
        this.stUnit = stUnit == null ? null : stUnit.trim();
    }

    public Byte getStType() {
        return stType;
    }

    public void setStType(Byte stType) {
        this.stType = stType;
    }

    public String getMachNo() {
        return machNo;
    }

    public void setMachNo(String machNo) {
        this.machNo = machNo == null ? null : machNo.trim();
    }

    public String getStCoordinate() {
        return stCoordinate;
    }

    public void setStCoordinate(String stCoordinate) {
        this.stCoordinate = stCoordinate == null ? null : stCoordinate.trim();
    }

    public String getStAdd() {
        return stAdd;
    }

    public void setStAdd(String stAdd) {
        this.stAdd = stAdd == null ? null : stAdd.trim();
    }

    public String getUnitAdd() {
        return unitAdd;
    }

    public void setUnitAdd(String unitAdd) {
        this.unitAdd = unitAdd == null ? null : unitAdd.trim();
    }

    public String getStPer1() {
        return stPer1;
    }

    public void setStPer1(String stPer1) {
        this.stPer1 = stPer1 == null ? null : stPer1.trim();
    }

    public String getStPertel1() {
        return stPertel1;
    }

    public void setStPertel1(String stPertel1) {
        this.stPertel1 = stPertel1 == null ? null : stPertel1.trim();
    }

    public String getStPer2() {
        return stPer2;
    }

    public void setStPer2(String stPer2) {
        this.stPer2 = stPer2 == null ? null : stPer2.trim();
    }

    public String getStPertel2() {
        return stPertel2;
    }

    public void setStPertel2(String stPertel2) {
        this.stPertel2 = stPertel2 == null ? null : stPertel2.trim();
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

    public Double getStopTime() {
        return stopTime;
    }

    public void setStopTime(Double stopTime) {
        this.stopTime = stopTime;
    }

    public Double getStartVoltage() {
        return startVoltage;
    }

    public void setStartVoltage(Double startVoltage) {
        this.startVoltage = startVoltage;
    }

    public Double getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Double maintainTime) {
        this.maintainTime = maintainTime;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1 == null ? null : item1.trim();
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2 == null ? null : item2.trim();
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3 == null ? null : item3.trim();
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4 == null ? null : item4.trim();
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5 == null ? null : item5.trim();
    }
}