package com.hlic.base.pojo.vo;

import com.hlic.base.pojo.po.SysUser;

/**
 * 
 * <p>Title: SysuserCustom</p>
 * <p>Description: 扩展类，用于提交信息、查询条件</p>
 * <p>Company: www.itcast.com</p> 
 * @author	苗润土
 * @date	2014年11月26日上午10:38:43
 * @version 1.0
 */
public class SysuserCustom extends SysUser {
	
	//单位名称 
	private String sysmc;
	private int iRow;

	public String getSysmc() {
		return sysmc;
	}

	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}

    public int getiRow() {
        return iRow;
    }

    public void setiRow(int iRow) {
        this.iRow = iRow;
    }

    @Override
    public String toString() {
        return "SysuserCustom [sysmc=" + sysmc + ", iRow=" + iRow + "]";
    }
	
	
}
