package com.hlic.base.pojo.po;

public class SysSqlFilter {
    private String fPkey;

    private String fFuncId;

    private String fName;

    private String fSql;

    private String fMs;

    private String fType;

    public String getfPkey() {
        return fPkey;
    }

    public void setfPkey(String fPkey) {
        this.fPkey = fPkey == null ? null : fPkey.trim();
    }

    public String getfFuncId() {
        return fFuncId;
    }

    public void setfFuncId(String fFuncId) {
        this.fFuncId = fFuncId == null ? null : fFuncId.trim();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfSql() {
        return fSql;
    }

    public void setfSql(String fSql) {
        this.fSql = fSql == null ? null : fSql.trim();
    }

    public String getfMs() {
        return fMs;
    }

    public void setfMs(String fMs) {
        this.fMs = fMs == null ? null : fMs.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }
}