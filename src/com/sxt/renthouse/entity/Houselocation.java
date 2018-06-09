package com.sxt.renthouse.entity;

public class Houselocation {
	//房屋编号 主键 外键
    private String hId;
    //所属城市
    private String hCity;
    //所属区县
    private String hDistrict;
    //所属小区
    private String hCommunity;
    //详细地址
    private String hLocation;
    //地图经度
    private String hX;
    //地图纬度
    private String hY;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity == null ? null : hCity.trim();
    }

    public String gethDistrict() {
        return hDistrict;
    }

    public void sethDistrict(String hDistrict) {
        this.hDistrict = hDistrict == null ? null : hDistrict.trim();
    }

    public String gethCommunity() {
        return hCommunity;
    }

    public void sethCommunity(String hCommunity) {
        this.hCommunity = hCommunity == null ? null : hCommunity.trim();
    }

    public String gethLocation() {
        return hLocation;
    }

    public void sethLocation(String hLocation) {
        this.hLocation = hLocation == null ? null : hLocation.trim();
    }

    public String gethX() {
        return hX;
    }

    public void sethX(String hX) {
        this.hX = hX == null ? null : hX.trim();
    }

    public String gethY() {
        return hY;
    }

    public void sethY(String hY) {
        this.hY = hY == null ? null : hY.trim();
    }
}