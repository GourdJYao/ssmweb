package com.gourdjyao.main.entry;

import java.io.Serializable;
import java.util.Date;

public class BusLineInfo implements Serializable {

    private static final long serialVersionUID = 3195093652982858434L;
    private int buslineid;
    private UserInfo userInfo;
    private String destinationname;
    private float destinationlat;
    private float destinationlon;
    private String originname;
    private float originlat;
    private float originlon;
    private String busname;
    private long createtime = new Date().getTime();

    public int getBuslineid() {
        return buslineid;
    }

    public void setBuslineid(int buslineid) {
        this.buslineid = buslineid;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getDestinationname() {
        return destinationname;
    }

    public void setDestinationname(String destinationname) {
        this.destinationname = destinationname;
    }

    public float getDestinationlat() {
        return destinationlat;
    }

    public void setDestinationlat(float destinationlat) {
        this.destinationlat = destinationlat;
    }

    public float getDestinationlon() {
        return destinationlon;
    }

    public void setDestinationlon(float destinationlon) {
        this.destinationlon = destinationlon;
    }

    public String getOriginname() {
        return originname;
    }

    public void setOriginname(String originname) {
        this.originname = originname;
    }

    public float getOriginlat() {
        return originlat;
    }

    public void setOriginlat(float originlat) {
        this.originlat = originlat;
    }

    public float getOriginlon() {
        return originlon;
    }

    public void setOriginlon(float originlon) {
        this.originlon = originlon;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }
}
