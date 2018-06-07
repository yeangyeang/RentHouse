package com.sxt.renthouse.entity;
/*
 * 房屋位置（House location）  
 */
public class Houselocation {
	//房屋编号 非空
	private String H_Id;
	//所属城市	
	private String H_City;
	//所属区县
	private String H_District;
	//所属小区
	private String H_Community;
	//小区详细地址
	private String H_Location;
	//地图经度
	private String H_X;
	//地图纬度
	private String H_Y;
	public String getH_Id() {
		return H_Id;
	}
	public void setH_Id(String h_Id) {
		H_Id = h_Id;
	}
	public String getH_City() {
		return H_City;
	}
	public void setH_City(String h_City) {
		H_City = h_City;
	}
	public String getH_District() {
		return H_District;
	}
	public void setH_District(String h_District) {
		H_District = h_District;
	}
	public String getH_Community() {
		return H_Community;
	}
	public void setH_Community(String h_Community) {
		H_Community = h_Community;
	}
	public String getH_Location() {
		return H_Location;
	}
	public void setH_Location(String h_Location) {
		H_Location = h_Location;
	}
	public String getH_X() {
		return H_X;
	}
	public void setH_X(String h_X) {
		H_X = h_X;
	}
	public String getH_Y() {
		return H_Y;
	}
	public void setH_Y(String h_Y) {
		H_Y = h_Y;
	}
	
	
}
