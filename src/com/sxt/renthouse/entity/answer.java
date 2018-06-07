package com.sxt.renthouse.entity;

import java.util.Date;

/*
 * *回答表（answer）
 */
public class answer {
	//答案编号	Varchar2（25）	主键	
	private String A_id;	
	//问题编号	Varchar2(25)	主键	非空
	private String Q_id;
	//用户编号	Varchar2(25)	非空 外键	
	private String U_id;
	//答案文档	Varchar2(255)	非空	
	private String A_description;
	//回答时间	Date	非空	
	private Date A_date;
	//状态	Int	非空	0：正常回答，待回答 -1：不良信息，删除
	private int A_status;
	
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	public String getQ_id() {
		return Q_id;
	}
	public void setQ_id(String q_id) {
		Q_id = q_id;
	}
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getA_description() {
		return A_description;
	}
	public void setA_description(String a_description) {
		A_description = a_description;
	}
	public Date getA_date() {
		return A_date;
	}
	public void setA_date(Date a_date) {
		A_date = a_date;
	}
	public int getA_status() {
		return A_status;
	}
	public void setA_status(int a_status) {
		A_status = a_status;
	}	
	
	

}
