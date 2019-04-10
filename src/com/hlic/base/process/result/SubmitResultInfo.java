package com.hlic.base.process.result;

import java.util.List;

import com.hlic.yycg.pojo.po.Leavebill;

/**
 * 系统提交结果结果类型
 * @author Thinkpad
 *
 */
public class SubmitResultInfo {

	public SubmitResultInfo(ResultInfo resultInfo){
		this.resultInfo = resultInfo;
	}
	
	//操作结果信息
	private ResultInfo resultInfo;
	
	private List<Leavebill> leavebill;
	
	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

    public List<Leavebill> getLeavebill() {
        return leavebill;
    }

    public void setLeavebill(List<Leavebill> leavebill) {
        this.leavebill = leavebill;
    }
	
}
