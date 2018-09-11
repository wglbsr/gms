package com.dyny.gms.db.pojo;

public class Region {
    private Integer id;

    private String name;

    private Integer parentAddressId;

    private Integer addressId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentAddressId() {
        return parentAddressId;
    }

    public void setParentAddressId(Integer parentAddressId) {
        this.parentAddressId = parentAddressId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}