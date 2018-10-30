package com.hlic.base.pojo.po;

import java.util.List;

public class SysMenus {
    private String fMenuId;

    private String fMenuName;

    private String fDesc;

    private String fFuncId;

    private String fIcon;

    private String fDisable;

    private Integer fLevel;

    private String fLeaf;

    private String fParent;

    private String fT1;

    private String fT2;
    
    private List<SysFunc> sysFuns;

    public String getfMenuId() {
        return fMenuId;
    }

    public void setfMenuId(String fMenuId) {
        this.fMenuId = fMenuId == null ? null : fMenuId.trim();
    }

    public String getfMenuName() {
        return fMenuName;
    }

    public void setfMenuName(String fMenuName) {
        this.fMenuName = fMenuName == null ? null : fMenuName.trim();
    }

    public String getfDesc() {
        return fDesc;
    }

    public void setfDesc(String fDesc) {
        this.fDesc = fDesc == null ? null : fDesc.trim();
    }

    public String getfFuncId() {
        return fFuncId;
    }

    public void setfFuncId(String fFuncId) {
        this.fFuncId = fFuncId == null ? null : fFuncId.trim();
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

    public Integer getfLevel() {
        return fLevel;
    }

    public void setfLevel(Integer fLevel) {
        this.fLevel = fLevel;
    }

    public String getfLeaf() {
        return fLeaf;
    }

    public void setfLeaf(String fLeaf) {
        this.fLeaf = fLeaf == null ? null : fLeaf.trim();
    }

    public String getfParent() {
        return fParent;
    }

    public void setfParent(String fParent) {
        this.fParent = fParent == null ? null : fParent.trim();
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

	public List<SysFunc> getSysFuns() {
		return sysFuns;
	}

	public void setSysFuns(List<SysFunc> sysFuns) {
		this.sysFuns = sysFuns;
	}
    
}