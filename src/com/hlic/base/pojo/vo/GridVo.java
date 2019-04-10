package com.hlic.base.pojo.vo;

import java.util.List;

public class GridVo<T> {

	private List<String> colName;

	private List<T> colList;
	
	private List dictList;

	public List getDictList() {
		return dictList;
	}

	public void setDictList(List dictList) {
		this.dictList = dictList;
	}

	public List<String> getColName() {
		return colName;
	}

	public void setColName(List<String> colName) {
		this.colName = colName;
	}

	public List<T> getColList() {
		return colList;
	}

	public void setColList(List<T> colList) {
		this.colList = colList;
	}
	
}
