package com.sxt.renthouse.entity;

import java.util.Date;

public class House {
	//房屋编号 主键
    private String hId;
    //用户id 外键
    private String uId;
    //经纪人id 外键
    private String aId;
    //租赁标题 
    private String hTitle;
    //户型
    private String hType;
    //装修程度
    private String hStyle;
    //租金
    private Double hRent;
    //押付
    private Double hCustodypay;
    //房屋楼层
    private String hFloor;
    //房屋朝向
    private String hFace;
    //面积
    private Float hArea;
    //发布时间
    private Date hTime;
    //发布状态
    private Integer hStatus;
    //房屋概况
    private String hServey;

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

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String gethTitle() {
        return hTitle;
    }

    public void sethTitle(String hTitle) {
        this.hTitle = hTitle == null ? null : hTitle.trim();
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType == null ? null : hType.trim();
    }

    public String gethStyle() {
        return hStyle;
    }

    public void sethStyle(String hStyle) {
        this.hStyle = hStyle == null ? null : hStyle.trim();
    }

    public Double gethRent() {
        return hRent;
    }

    public void sethRent(Double hRent) {
        this.hRent = hRent;
    }

    public Double gethCustodypay() {
        return hCustodypay;
    }

    public void sethCustodypay(Double hCustodypay) {
        this.hCustodypay = hCustodypay;
    }

    public String gethFloor() {
        return hFloor;
    }

    public void sethFloor(String hFloor) {
        this.hFloor = hFloor == null ? null : hFloor.trim();
    }

    public String gethFace() {
        return hFace;
    }

    public void sethFace(String hFace) {
        this.hFace = hFace == null ? null : hFace.trim();
    }

    public Float gethArea() {
        return hArea;
    }

    public void sethArea(Float hArea) {
        this.hArea = hArea;
    }

    public Date gethTime() {
        return hTime;
    }

    public void sethTime(Date hTime) {
        this.hTime = hTime;
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public String gethServey() {
        return hServey;
    }

    public void sethServey(String hServey) {
        this.hServey = hServey == null ? null : hServey.trim();
    }
}