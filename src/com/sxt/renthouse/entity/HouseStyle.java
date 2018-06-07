package com.sxt.renthouse.entity;
/*
 * 房屋类型类 注：毛坯
 */
public class HouseStyle {
	//房屋类型编号 非空
	private String Hs_Id;
	//房屋类型名称
	private String Ct_Name;
	
	
	public String getHs_Id() {
		return Hs_Id;
	}
	public void setHs_Id(String hs_Id) {
		Hs_Id = hs_Id;
	}
	public String getCt_Name() {
		return Ct_Name;
	}
	public void setCt_Name(String ct_Name) {
		Ct_Name = ct_Name;
	}
	
	
}
