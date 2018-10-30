package com.hlic.base.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.github.pagehelper.PageInfo;
import com.hlic.base.pojo.po.DofDctCols;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.vo.GridVo;

public interface BaseCommonGridService {
	GridVo<DofDctCols> queryDctColsList(String inputJson);
	
	GridVo<DofStoreCols> queryStoreColsList(String inputJson);
	
	List<Map<String,String>> queryTableRows(String inputJson);
	
	PageInfo<Map<String,Object>> queryCommonGridPageList(int page, int rows, String STO_ID, String SQL_Filter);
	/**************************store start******************************************/
	//存储表中数据查询、查询Store列标题
	public GridVo queryDofStoreColsParamList(String inputJson) throws Exception;
	
	//查询创建store时列属性数据
	GridVo<JSONArray> queryCreateStoreColsList(String inputJson) throws Exception;
	
	int setStoreData(String inputJson)  throws Exception;
	//创建store表，以及相关表属性配置
	int createStoreData(String inputJson)  throws Exception;
	//删除store实体
	int delStoreData(String inputJson) throws Exception;
	//查询store数据
	PageInfo<Map<String,Object>> queryStoreGridPageList(int page, int rows, String STO_ID, String SQL_Filter);
	/**************************store end******************************************/
	
	/**************************dct start******************************************/
	//字典列属性表中数据查询、查询Dct列标题
	public GridVo queryDofDctColsParamList(String inputJson) throws Exception;
	//查询Dct数据
	PageInfo<Map<String,Object>> queryDctGridPageList(int page, int rows, String STO_ID, String SQL_Filter, String SQL_Where);
	//创建dct表，以及相关表属性配置
	int createDctData(String inputJson)  throws Exception;
	//删除Dct实体
	int delDctData(String inputJson) throws Exception;
	//查询创建store时列属性数据
	GridVo<JSONArray> queryCreateDctColsList(String inputJson) throws Exception;
	
	/**************************dct end******************************************/
	
	List<Map<String, Object>> queryCommTableList();
	
	/**************************表公共操作 start******************************************/
	//报表使用查询
	PageInfo<Map<String,Object>> queryTableDataList(int page, int rows,String tableId,String SQL_Filter);
	//更新表数据
	int updateCommonTable(String table, JSONArray jsonArr, String id) throws Exception;
	//删除表数据
	int deleteCommonTable(String table, JSONArray jsonArr, String id) throws Exception;
	//查询唯一键值,为dct、store提供唯一键值
	String queryUniqueKeyValue(String inputJson);
	/**************************表公共操作 end******************************************/
	
}
