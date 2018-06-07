package com.sxt.renthouse.entity;
/*
 * 户型（House Type ）   注：一室一厅
 */
public class HouseType {
	//户型编号 主键 非空
	private String Ht_Id ;
	//户型名称
	private String Ht_Name;
	
	
	public String getHt_Id() {
		return Ht_Id;
	}
	public void setHt_Id(String ht_Id) {
		Ht_Id = ht_Id;
	}
	public String getHt_Name() {
		return Ht_Name;
	}
	public void setHt_Name(String ht_Name) {
		Ht_Name = ht_Name;
	}
	
	
	
}
