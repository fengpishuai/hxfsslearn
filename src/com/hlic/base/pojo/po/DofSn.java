package com.hlic.base.pojo.po;

import java.io.Serializable;

public class DofSn implements Serializable {
    private String snId;

    private String snName;

    private String snElementFixed;

    private String snElementTime;

    private String snElementNum;

    private static final long serialVersionUID = 1L;

    public String getSnId() {
        return snId;
    }

    public void setSnId(String snId) {
        this.snId = snId == null ? null : snId.trim();
    }

    public String getSnName() {
        return snName;
    }

    public void setSnName(String snName) {
        this.snName = snName == null ? null : snName.trim();
    }

    public String getSnElementFixed() {
        return snElementFixed;
    }

    public void setSnElementFixed(String snElementFixed) {
        this.snElementFixed = snElementFixed == null ? null : snElementFixed.trim();
    }

    public String getSnElementTime() {
        return snElementTime;
    }

    public void setSnElementTime(String snElementTime) {
        this.snElementTime = snElementTime == null ? null : snElementTime.trim();
    }

    public String getSnElementNum() {
        return snElementNum;
    }

    public void setSnElementNum(String snElementNum) {
        this.snElementNum = snElementNum == null ? null : snElementNum.trim();
    }
}