package com.sxt.renthouse.entity;

public class Housepicture {
	//房屋编号 外键
    private String hId;
    //图片类型
    private String hpType;
    //图片路径
    private String hpPath;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String getHpType() {
        return hpType;
    }

    public void setHpType(String hpType) {
        this.hpType = hpType == null ? null : hpType.trim();
    }

    public String getHpPath() {
        return hpPath;
    }

    public void setHpPath(String hpPath) {
        this.hpPath = hpPath == null ? null : hpPath.trim();
    }
}