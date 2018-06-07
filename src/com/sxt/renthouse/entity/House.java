package com.sxt.renthouse.entity;

import java.util.Date;

/*
 * 房屋租赁信息（House）
 */
public class House {
	//	房屋编号	Varchar2(25)	主键，非空	非空
	private String H_Id;
	// 户型编号	Varchar2(25)	外键
	private String Ht_Id;
	//房屋类型编号	Varchar2(25)	外键	
	private String Hs_Id;
	//租金	Number(10,2)
	private float H_Rent;		
	//押付	Varchar2(25)	
	private String H_Custody_Pay;		
	//房屋楼层	Number(4)
	private int H_floor;
	//房屋朝向	Varchar2(5)	
	private String H_face;
	//房屋面积	Number(4)
	private int H_area;		
	//发布时间	Date
	private Date H_time;	
	//发布状态	Number(3)	
	private int H_Status;		
	//房屋概况	Varhcar2(2000)
	private String H_Servey;
	//房屋配套	Varchar(13)	外键	
	private String Hm_Id;	
	//状态	Int	非空	0:正常 -1：删除
	private int U_status;
	
	
	public String getH_Id() {
		return H_Id;
	}
	public void setH_Id(String h_Id) {
		H_Id = h_Id;
	}
	public String getHt_Id() {
		return Ht_Id;
	}
	public void setHt_Id(String ht_Id) {
		Ht_Id = ht_Id;
	}
	public String getHs_Id() {
		return Hs_Id;
	}
	public void setHs_Id(String hs_Id) {
		Hs_Id = hs_Id;
	}
	public float getH_Rent() {
		return H_Rent;
	}
	public void setH_Rent(float h_Rent) {
		H_Rent = h_Rent;
	}
	public String getH_Custody_Pay() {
		return H_Custody_Pay;
	}
	public void setH_Custody_Pay(String h_Custody_Pay) {
		H_Custody_Pay = h_Custody_Pay;
	}
	public int getH_floor() {
		return H_floor;
	}
	public void setH_floor(int h_floor) {
		H_floor = h_floor;
	}
	public String getH_face() {
		return H_face;
	}
	public void setH_face(String h_face) {
		H_face = h_face;
	}
	public int getH_area() {
		return H_area;
	}
	public void setH_area(int h_area) {
		H_area = h_area;
	}
	public Date getH_time() {
		return H_time;
	}
	public void setH_time(Date h_time) {
		H_time = h_time;
	}
	public int getH_Status() {
		return H_Status;
	}
	public void setH_Status(int h_Status) {
		H_Status = h_Status;
	}
	public String getH_Servey() {
		return H_Servey;
	}
	public void setH_Servey(String h_Servey) {
		H_Servey = h_Servey;
	}
	public String getHm_Id() {
		return Hm_Id;
	}
	public void setHm_Id(String hm_Id) {
		Hm_Id = hm_Id;
	}
	public int getU_status() {
		return U_status;
	}
	public void setU_status(int u_status) {
		U_status = u_status;
	}	
	
	

}
