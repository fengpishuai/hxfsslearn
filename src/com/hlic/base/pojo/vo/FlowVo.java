package com.hlic.base.pojo.vo;

public class FlowVo {

	//判断走哪个流程分支
	private int isOK = 1;
	//单据编号
	private String fDjbh;
	//单据类型
	private String fDjlx;
	//金额
	private String fJe;
	//制单人
	private String fZdr;
	//事由
	private String fNote;
	//制单时间
	private String fZdsj;
	//流程id
	private String taskId;
	//单据名称
	private String DJMC;

	public String getfDjbh() {
		return fDjbh;
	}

	public void setfDjbh(String fDjbh) {
		this.fDjbh = fDjbh;
	}

	public String getfDjlx() {
		return fDjlx;
	}

	public void setfDjlx(String fDjlx) {
		this.fDjlx = fDjlx;
	}

	public String getfJe() {
		return fJe;
	}

	public void setfJe(String fJe) {
		this.fJe = fJe;
	}

	public String getfZdr() {
		return fZdr;
	}

	public void setfZdr(String fZdr) {
		this.fZdr = fZdr;
	}

	public String getfNote() {
		return fNote;
	}

	public void setfNote(String fNote) {
		this.fNote = fNote;
	}

	public String getfZdsj() {
		return fZdsj;
	}

	public void setfZdsj(String fZdsj) {
		this.fZdsj = fZdsj;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public int getIsOK() {
		return isOK;
	}

	public void setIsOK(int isOK) {
		this.isOK = isOK;
	}

	public String getDJMC() {
		return DJMC;
	}

	public void setDJMC(String dJMC) {
		DJMC = dJMC;
	}
	
}
