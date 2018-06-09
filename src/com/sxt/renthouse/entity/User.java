package com.sxt.renthouse.entity;

public class User {
	//用户编号 主键
    private String u_Id;
    //密码
    private String u_Pwd;
    //用户昵称
    private String u_Name;
    //性别
    private String u_Sex;
    //图片
    private String u_Photo;
    //等级
    private String u_Grade;
    //手机号码
    private String u_Phone;
    //用户种类
    private String u_Type;
    //状态
    private Integer u_Status;
	public String getU_Id() {
		return u_Id;
	}
	public void setU_Id(String u_Id) {
		this.u_Id = u_Id;
	}
	public String getU_Pwd() {
		return u_Pwd;
	}
	public void setU_Pwd(String u_Pwd) {
		this.u_Pwd = u_Pwd;
	}
	public String getU_Name() {
		return u_Name;
	}
	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}
	public String getU_Sex() {
		return u_Sex;
	}
	public void setU_Sex(String u_Sex) {
		this.u_Sex = u_Sex;
	}
	public String getU_Photo() {
		return u_Photo;
	}
	public void setU_Photo(String u_Photo) {
		this.u_Photo = u_Photo;
	}
	public String getU_Grade() {
		return u_Grade;
	}
	public void setU_Grade(String u_Grade) {
		this.u_Grade = u_Grade;
	}
	public String getU_Phone() {
		return u_Phone;
	}
	public void setU_Phone(String u_Phone) {
		this.u_Phone = u_Phone;
	}
	public String getU_Type() {
		return u_Type;
	}
	public void setU_Type(String u_Type) {
		this.u_Type = u_Type;
	}
	public Integer getU_Status() {
		return u_Status;
	}
	public void setU_Status(Integer u_Status) {
		this.u_Status = u_Status;
	}

    
}