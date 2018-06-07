package com.sxt.renthouse.entity;
/*
 * 用户
 */
public class User {
	//用户编号（账号）	Varchar2(25)	主键，非空	非空
	private String U_id;	
	//密码	Varchar2(25)
	private String U_password;
	//用户昵称	Varchar2(40)
	private String U_Name;
	//用户性别	Varchar2(5)	
	private String U_sex;
	//用户头像	Varchar2(255)	
	private String U_photo;              
	//用户等级	Varchar2(40)
	private String U_grade;
	//手机号码	Varchar	2(12)
	private String U_phone;
	//用户种类	Varchar2(40)
	private String U_type;
	//状态	Int	非空	0:正常 -1：删除
	private int U_status;
	
	public String getU_photo() {
		return U_photo;
	}
	public void setU_photo(String u_photo) {
		U_photo = u_photo;
	}
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getU_password() {
		return U_password;
	}
	public void setU_password(String u_password) {
		U_password = u_password;
	}
	public String getU_Name() {
		return U_Name;
	}
	public void setU_Name(String u_Name) {
		U_Name = u_Name;
	}
	public String getU_sex() {
		return U_sex;
	}
	public void setU_sex(String u_sex) {
		U_sex = u_sex;
	}
	public String getU_grade() {
		return U_grade;
	}
	public void setU_grade(String u_grade) {
		U_grade = u_grade;
	}
	public String getU_phone() {
		return U_phone;
	}
	public void setU_phone(String u_phone) {
		U_phone = u_phone;
	}
	public String getU_type() {
		return U_type;
	}
	public void setU_type(String u_type) {
		U_type = u_type;
	}
	public int getU_status() {
		return U_status;
	}
	public void setU_status(int u_status) {
		U_status = u_status;
	}	
	
	

}
