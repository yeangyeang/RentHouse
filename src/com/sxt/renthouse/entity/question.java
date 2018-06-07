package com.sxt.renthouse.entity;

import java.util.Date;

/*
 * 提问表（Question）
 */
public class question {
	//问题编号	Varchar2(25)	主键	非空
	private String Q_id;
	//用户编号	Varchar2(25)	非空 外键	
	private String U_id;
	//问题描述	Varchar2(255)	非空	
	private String Q_description;
	//提问时间	Date	非空	
	private Date Q_date;
	//提问状态	Int	非空	0：正常提问，待回答 1：正常提问，已回答 -1：问题被删除
	private int Q_status;
	
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
	public String getQ_description() {
		return Q_description;
	}
	public void setQ_description(String q_description) {
		Q_description = q_description;
	}
	public Date getQ_date() {
		return Q_date;
	}
	public void setQ_date(Date q_date) {
		Q_date = q_date;
	}
	public int getQ_status() {
		return Q_status;
	}
	public void setQ_status(int q_status) {
		Q_status = q_status;
	}	
	

	
}
