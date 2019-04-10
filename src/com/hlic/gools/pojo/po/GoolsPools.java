package com.hlic.gools.pojo.po;

import java.io.Serializable;

public class GoolsPools implements Serializable {
    private String fId;

    private String fSpmc;

    private String fSpbh;

    private String fGhsbh;

    private String fJe;

    private String fDisable;

    private String fT1;

    private String fT2;

    private String fT3;

    private static final long serialVersionUID = 1L;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getfSpmc() {
        return fSpmc;
    }

    public void setfSpmc(String fSpmc) {
        this.fSpmc = fSpmc == null ? null : fSpmc.trim();
    }

    public String getfSpbh() {
        return fSpbh;
    }

    public void setfSpbh(String fSpbh) {
        this.fSpbh = fSpbh == null ? null : fSpbh.trim();
    }

    public String getfGhsbh() {
        return fGhsbh;
    }

    public void setfGhsbh(String fGhsbh) {
        this.fGhsbh = fGhsbh == null ? null : fGhsbh.trim();
    }

    public String getfJe() {
        return fJe;
    }

    public void setfJe(String fJe) {
        this.fJe = fJe == null ? null : fJe.trim();
    }

    public String getfDisable() {
        return fDisable;
    }

    public void setfDisable(String fDisable) {
        this.fDisable = fDisable == null ? null : fDisable.trim();
    }

    public String getfT1() {
        return fT1;
    }

    public void setfT1(String fT1) {
        this.fT1 = fT1 == null ? null : fT1.trim();
    }

    public String getfT2() {
        return fT2;
    }

    public void setfT2(String fT2) {
        this.fT2 = fT2 == null ? null : fT2.trim();
    }

    public String getfT3() {
        return fT3;
    }

    public void setfT3(String fT3) {
        this.fT3 = fT3 == null ? null : fT3.trim();
    }
}