package com.hlic.base.pojo.po;

public class SysFuncGrp {
    private String fId;

    private String fName;

    private String fDisable;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfDisable() {
        return fDisable;
    }

    public void setfDisable(String fDisable) {
        this.fDisable = fDisable == null ? null : fDisable.trim();
    }
}