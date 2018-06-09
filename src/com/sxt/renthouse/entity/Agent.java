package com.albin.mybatis.pojo;

public class Agent {
    private String uId;

    private String aId;

    private String aStore;

    private Integer aExperience;

    private String aMajor;

    private String aProfile;

    private Integer aGrade;

    private Integer aScore;

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