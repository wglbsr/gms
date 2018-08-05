package com.dyny.gms.entity;

public class User {

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age = 0;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private String name = null;
}
