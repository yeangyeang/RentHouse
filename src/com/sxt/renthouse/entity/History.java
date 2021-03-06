package com.sxt.renthouse.entity;

import java.util.Date;

public class History {
	//用户编号 外键
    private String uId;
    //房屋编号 外键
    private String hId;
    //浏览时间
    private Date hDate;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public Date gethDate() {
        return hDate;
    }

    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }
}