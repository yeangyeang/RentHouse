package com.sxt.renthouse.entity;

import java.util.Date;

public class Housecollection {
	//用户编号
    private String hId;
    //房屋编号
    private String uId;
    //收藏时间
    private Date hDate;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public Date gethDate() {
        return hDate;
    }

    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }
}