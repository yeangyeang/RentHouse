package com.sxt.renthouse.entity;
/*
 * 经纪人
 */
public class Agent {
	//用户编号（账号）	Varchar2(25)	外键，非空	非空
	private String U_id;	
	//经纪人编号	Varchar2(25)	主键，非空	
	private String A_ID;	
	//所属门店	Varchar2(40)
	private String A_store;	
	//服务年限	int
	private int A_experience;
	//主营模块	Varchar2(100)
	private String A_major;
	//个人简介	Varchar2(255)
	private String A_profile;
	//服务等级	Int
	private int A_grade;	
	//等级得分	Int
	private int A_Score;
	//状态	Int	非空	0:正常 -1：删除
	private int A_status;
	
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getA_ID() {
		return A_ID;
	}
	public void setA_ID(String a_ID) {
		A_ID = a_ID;
	}
	public String getA_store() {
		return A_store;
	}
	public void setA_store(String a_store) {
		A_store = a_store;
	}
	public int getA_experience() {
		return A_experience;
	}
	public void setA_experience(int a_experience) {
		A_experience = a_experience;
	}
	public String getA_major() {
		return A_major;
	}
	public void setA_major(String a_major) {
		A_major = a_major;
	}
	public String getA_profile() {
		return A_profile;
	}
	public void setA_profile(String a_profile) {
		A_profile = a_profile;
	}
	public int getA_grade() {
		return A_grade;
	}
	public void setA_grade(int a_grade) {
		A_grade = a_grade;
	}
	public int getA_Score() {
		return A_Score;
	}
	public void setA_Score(int a_Score) {
		A_Score = a_Score;
	}
	public int getA_status() {
		return A_status;
	}
	public void setA_status(int a_status) {
		A_status = a_status;
	}	
	
	
	

}
