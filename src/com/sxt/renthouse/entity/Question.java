package com.sxt.renthouse.entity;

import java.util.Date;

public class Question {
	//问题编号
    private String qId;
    //用户编号
    private String uId;
    //问题描述
    private String qDescription;
    //提问时间
    private Date qDate;
    //提问状态
    private Integer qStatus;

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getqDescription() {
        return qDescription;
    }

    public void setqDescription(String qDescription) {
        this.qDescription = qDescription == null ? null : qDescription.trim();
    }

    public Date getqDate() {
        return qDate;
    }

    public void setqDate(Date qDate) {
        this.qDate = qDate;
    }

    public Integer getqStatus() {
        return qStatus;
    }

    public void setqStatus(Integer qStatus) {
        this.qStatus = qStatus;
    }
}