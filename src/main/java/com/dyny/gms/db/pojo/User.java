package com.dyny.gms.db.pojo;

public class User {
    private String userNo;

    private Integer id;

    private String userPass;

    private String userCus;

    private Integer userLevel;

    private Integer state;

    private String note;

    private String parentCusNo;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserCus() {
        return userCus;
    }

    public void setUserCus(String userCus) {
        this.userCus = userCus == null ? null : userCus.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getParentCusNo() {
        return parentCusNo;
    }

    public void setParentCusNo(String parentCusNo) {
        this.parentCusNo = parentCusNo == null ? null : parentCusNo.trim();
    }
}