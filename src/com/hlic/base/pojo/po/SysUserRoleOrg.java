package com.hlic.base.pojo.po;

public class SysUserRoleOrg {
    private String fPkey;

    private String fUserId;

    private String fRoleId;

    private String fOrgId;

    private String fCompId;

    private String fSc;

    public String getfPkey() {
        return fPkey;
    }

    public void setfPkey(String fPkey) {
        this.fPkey = fPkey == null ? null : fPkey.trim();
    }

    public String getfUserId() {
        return fUserId;
    }

    public void setfUserId(String fUserId) {
        this.fUserId = fUserId == null ? null : fUserId.trim();
    }

    public String getfRoleId() {
        return fRoleId;
    }

    public void setfRoleId(String fRoleId) {
        this.fRoleId = fRoleId == null ? null : fRoleId.trim();
    }

    public String getfOrgId() {
        return fOrgId;
    }

    public void setfOrgId(String fOrgId) {
        this.fOrgId = fOrgId == null ? null : fOrgId.trim();
    }

    public String getfCompId() {
        return fCompId;
    }

    public void setfCompId(String fCompId) {
        this.fCompId = fCompId == null ? null : fCompId.trim();
    }

    public String getfSc() {
        return fSc;
    }

    public void setfSc(String fSc) {
        this.fSc = fSc == null ? null : fSc.trim();
    }
}