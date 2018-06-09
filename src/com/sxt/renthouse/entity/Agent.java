package com.sxt.renthouse.entity;
/**
 * 
 * @author yang
 *
 */
public class Agent {
	//用户编号
    private String uId;
    //经纪人编号
    private String aId;
    //所属门店
    private String aStore;
    //服务年限
    private Integer aExperience;
    //主营模块
    private String aMajor;
    //个人简介
    private String aProfile;
    //服务等级
    private Integer aGrade;
    //等级得分
    private Integer aScore;
    //状态
    private Integer aStatus;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getaStore() {
        return aStore;
    }

    public void setaStore(String aStore) {
        this.aStore = aStore == null ? null : aStore.trim();
    }

    public Integer getaExperience() {
        return aExperience;
    }

    public void setaExperience(Integer aExperience) {
        this.aExperience = aExperience;
    }

    public String getaMajor() {
        return aMajor;
    }

    public void setaMajor(String aMajor) {
        this.aMajor = aMajor == null ? null : aMajor.trim();
    }

    public String getaProfile() {
        return aProfile;
    }

    public void setaProfile(String aProfile) {
        this.aProfile = aProfile == null ? null : aProfile.trim();
    }

    public Integer getaGrade() {
        return aGrade;
    }

    public void setaGrade(Integer aGrade) {
        this.aGrade = aGrade;
    }

    public Integer getaScore() {
        return aScore;
    }

    public void setaScore(Integer aScore) {
        this.aScore = aScore;
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }
}