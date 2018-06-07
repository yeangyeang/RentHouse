package com.sxt.renthouse.entity;
/*
 * 房屋图片（House	 Picture）
 */
public class HousePicture {
	//	房屋编号	Varchar2(25)	外键，非空	非空
	private String H_Id;
	//	图片类型	Varchar2(25)
	private String Hp_type;	
	//	图片路径	Varchar2(40)
	private String Hp_path;
	
	
	public String getH_Id() {
		return H_Id;
	}
	public void setH_Id(String h_Id) {
		H_Id = h_Id;
	}
	public String getHp_type() {
		return Hp_type;
	}
	public void setHp_type(String hp_type) {
		Hp_type = hp_type;
	}
	public String getHp_path() {
		return Hp_path;
	}
	public void setHp_path(String hp_path) {
		Hp_path = hp_path;
	}		

	
}
