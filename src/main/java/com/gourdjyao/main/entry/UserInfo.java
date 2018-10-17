package com.gourdjyao.main.entry;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = -172165886721764444L;
    private int id;
    private String username;
    private String password;
    private String nickname;
    private String address;
    private String telphone;
    private long createdatetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public long getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(long createdatetime) {
        this.createdatetime = createdatetime;
    }
}
