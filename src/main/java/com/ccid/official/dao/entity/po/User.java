package com.ccid.official.dao.entity.po;

import java.util.Date;

public class User {
    /**   ID **/
    private Integer id;

    /** 用户名称  USERNAME **/
    private String username;

    /** 生日  BIRTHDAY **/
    private Date birthday;

    /** 性别  SEX **/
    private String sex;

    /** 地址  ADDRESS **/
    private String address;

    /**     ID   **/
    public Integer getId() {
        return id;
    }

    /**     ID   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**   用户名称  USERNAME   **/
    public String getUsername() {
        return username;
    }

    /**   用户名称  USERNAME   **/
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**   生日  BIRTHDAY   **/
    public Date getBirthday() {
        return birthday;
    }

    /**   生日  BIRTHDAY   **/
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**   性别  SEX   **/
    public String getSex() {
        return sex;
    }

    /**   性别  SEX   **/
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**   地址  ADDRESS   **/
    public String getAddress() {
        return address;
    }

    /**   地址  ADDRESS   **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}