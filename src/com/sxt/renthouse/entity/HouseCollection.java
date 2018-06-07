package com.sxt.renthouse.entity;

import java.util.Date;

/*
 * 收藏表（House	 Collection） 
 */
public class HouseCollection {
	//用户编号	Varchar2(25)	外键，非空	非空
	private String U_id;
	//	房屋编号	Varchar2(25)	外键，非空	
	private String H_id;
	//收藏时间	Date	非空	
	private Date H_date;
	
	
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getH_id() {
		return H_id;
	}
	public void setH_id(String h_id) {
		H_id = h_id;
	}
	public Date getH_date() {
		return H_date;
	}
	public void setH_date(Date h_date) {
		H_date = h_date;
	}
	
	

}
