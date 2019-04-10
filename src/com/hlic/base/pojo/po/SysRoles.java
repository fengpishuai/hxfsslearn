package com.hlic.base.pojo.po;

public class SysRoles {
    private String fRoleid;

    private String fRolemc;

    private String fRolecontent;

    private String fDisable;

    public String getfRoleid() {
        return fRoleid;
    }

    public void setfRoleid(String fRoleid) {
        this.fRoleid = fRoleid == null ? null : fRoleid.trim();
    }

    public String getfRolemc() {
        return fRolemc;
    }

    public void setfRolemc(String fRolemc) {
        this.fRolemc = fRolemc == null ? null : fRolemc.trim();
    }

    public String getfRolecontent() {
        return fRolecontent;
    }

    public void setfRolecontent(String fRolecontent) {
        this.fRolecontent = fRolecontent == null ? null : fRolecontent.trim();
    }

    public String getfDisable() {
        return fDisable;
    }

    public void setfDisable(String fDisable) {
        this.fDisable = fDisable == null ? null : fDisable.trim();
    }
}