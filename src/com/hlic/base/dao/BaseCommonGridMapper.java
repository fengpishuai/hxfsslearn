package com.hlic.base.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hlic.base.pojo.po.DofDctCols;

public interface BaseCommonGridMapper {
	List<DofDctCols> queryDctColsList(String dctId);
	
	List<Map<String, Object>> queryDofStoreColsParamList(String stoId);
	
	List<Map<String, Object>> queryDofDctColsParamList(String dctId);
	
	List<Map<String, Object>> queryTableRows(Map<String, String> map);
	
	List<Map<String, Object>> queryCommonGridPageList(Map<String, String> map);

	List<Map<String, Object>> executeSql(Map<String, Object> map);
	
	List<Map<String, Object>> queryCreateStoreColsList(String stoId);
	
	List<Map<String, Object>> queryCreateDctColsList(String dctId);
	
	int createTmpTable(Map<String, String> map);
	
	int dropTable(@Param("tableName") String tableName);
	
	int insertTable(Map<String, Object> map);
	
	int deleteSql(Map<String, Object> map);
	
	/************start 20190403 sto和dct通用保存方法*************/
	//查询行数
	int queryCount(Map<String, String> map);
	
	int updateTable(Map<String, String> map);
	
	int insertCommonTable(Map<String, String> map);
	
	int deleteCommonTable(Map<String, String> map);
	/************end 20190403 sto和dct通用保存方法 ***************/
}
