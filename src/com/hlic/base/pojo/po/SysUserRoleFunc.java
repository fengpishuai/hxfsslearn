package com.hlic.base.pojo.po;

public class SysUserRoleFunc {
    private String fUserid;

    private String fFuncid;

    private String fDisable;

    private String fRoleid;

    public String getfUserid() {
        return fUserid;
    }

    public void setfUserid(String fUserid) {
        this.fUserid = fUserid == null ? null : fUserid.trim();
    }

    public String getfFuncid() {
        return fFuncid;
    }

    public void setfFuncid(String fFuncid) {
        this.fFuncid = fFuncid == null ? null : fFuncid.trim();
    }

    public String getfDisable() {
        return fDisable;
    }

    public void setfDisable(String fDisable) {
        this.fDisable = fDisable == null ? null : fDisable.trim();
    }

    public String getfRoleid() {
        return fRoleid;
    }

    public void setfRoleid(String fRoleid) {
        this.fRoleid = fRoleid == null ? null : fRoleid.trim();
    }
}