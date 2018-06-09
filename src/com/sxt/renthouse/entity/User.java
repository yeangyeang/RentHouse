package com.sxt.renthouse.entity;

public class User {
	//用户编号 主键
    private String uId;
    //密码
    private String uPwd;
    //用户昵称
    private String uName;
    //性别
    private String uSex;
    //图片
    private String uPhoto;
    //等级
    private String uGrade;
    //手机号码
    private String uPhone;
    //用户种类
    private String uType;
    //状态
    private Integer uStatus;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto == null ? null : uPhoto.trim();
    }

    public String getuGrade() {
        return uGrade;
    }

    public void setuGrade(String uGrade) {
        this.uGrade = uGrade == null ? null : uGrade.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType == null ? null : uType.trim();
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}