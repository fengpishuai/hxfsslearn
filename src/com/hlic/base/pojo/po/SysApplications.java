package com.hlic.base.pojo.po;

public class SysApplications {
    private String fId;

    private String fCaption;

    private String fIcon;

    private String fDisable;

    private String fIconL;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getfCaption() {
        return fCaption;
    }

    public void setfCaption(String fCaption) {
        this.fCaption = fCaption == null ? null : fCaption.trim();
    }

    public String getfIcon() {
        return fIcon;
    }

    public void setfIcon(String fIcon) {
        this.fIcon = fIcon == null ? null : fIcon.trim();
    }

    public String getfDisable() {
        return fDisable;
    }

    public void setfDisable(String fDisable) {
        this.fDisable = fDisable == null ? null : fDisable.trim();
    }

    public String getfIconL() {
        return fIconL;
    }

    public void setfIconL(String fIconL) {
        this.fIconL = fIconL == null ? null : fIconL.trim();
    }
}