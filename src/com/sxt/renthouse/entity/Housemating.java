package com.sxt.renthouse.entity;

public class Housemating {
	//房屋编号 主键 外键
    private String hId;
    //床
    private Byte hmBed;
    //洗衣机
    private Byte hmWasher;
    //阳台
    private Byte hmBalcony;
    //冰箱
    private Byte hmRefrigerator;
    //卫生间
    private Byte hmToilet;
    //厨房
    private Byte hmKitchen;
    //电视
    private Byte hmTv;
    //热水器
    private Byte hmHeater;
    //衣柜
    private Byte hmWardrobe;
    //暖气
    private Byte hmHeating;
    //宽带
    private Byte hmBroadband;
    //沙发
    private Byte hmSofa;

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public Byte getHmBed() {
        return hmBed;
    }

    public void setHmBed(Byte hmBed) {
        this.hmBed = hmBed;
    }

    public Byte getHmWasher() {
        return hmWasher;
    }

    public void setHmWasher(Byte hmWasher) {
        this.hmWasher = hmWasher;
    }

    public Byte getHmBalcony() {
        return hmBalcony;
    }

    public void setHmBalcony(Byte hmBalcony) {
        this.hmBalcony = hmBalcony;
    }

    public Byte getHmRefrigerator() {
        return hmRefrigerator;
    }

    public void setHmRefrigerator(Byte hmRefrigerator) {
        this.hmRefrigerator = hmRefrigerator;
    }

    public Byte getHmToilet() {
        return hmToilet;
    }

    public void setHmToilet(Byte hmToilet) {
        this.hmToilet = hmToilet;
    }

    public Byte getHmKitchen() {
        return hmKitchen;
    }

    public void setHmKitchen(Byte hmKitchen) {
        this.hmKitchen = hmKitchen;
    }

    public Byte getHmTv() {
        return hmTv;
    }

    public void setHmTv(Byte hmTv) {
        this.hmTv = hmTv;
    }

    public Byte getHmHeater() {
        return hmHeater;
    }

    public void setHmHeater(Byte hmHeater) {
        this.hmHeater = hmHeater;
    }

    public Byte getHmWardrobe() {
        return hmWardrobe;
    }

    public void setHmWardrobe(Byte hmWardrobe) {
        this.hmWardrobe = hmWardrobe;
    }

    public Byte getHmHeating() {
        return hmHeating;
    }

    public void setHmHeating(Byte hmHeating) {
        this.hmHeating = hmHeating;
    }

    public Byte getHmBroadband() {
        return hmBroadband;
    }

    public void setHmBroadband(Byte hmBroadband) {
        this.hmBroadband = hmBroadband;
    }

    public Byte getHmSofa() {
        return hmSofa;
    }

    public void setHmSofa(Byte hmSofa) {
        this.hmSofa = hmSofa;
    }
}