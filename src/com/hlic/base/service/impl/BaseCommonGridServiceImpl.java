package com.hlic.base.service.impl;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hlic.base.dao.BaseCommonGridMapper;
import com.hlic.base.dao.DofDctColsMapper;
import com.hlic.base.dao.DofDictsMapper;
import com.hlic.base.dao.DofSnMapper;
import com.hlic.base.dao.DofStoreColsMapper;
import com.hlic.base.dao.DofStoresMapper;
import com.hlic.base.dao.SysSqlFilterMapper;
import com.hlic.base.dao.WdRptqueryConfMapper;
import com.hlic.base.dao.WdRptqueryFilterMapper;
import com.hlic.base.pojo.po.DofDctCols;
import com.hlic.base.pojo.po.DofDctColsExample;
import com.hlic.base.pojo.po.DofDicts;
import com.hlic.base.pojo.po.DofDictsExample;
import com.hlic.base.pojo.po.DofSn;
import com.hlic.base.pojo.po.DofSnExample;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.po.DofStoreColsExample;
import com.hlic.base.pojo.po.DofStoreColsExample.Criteria;
import com.hlic.base.pojo.po.DofStores;
import com.hlic.base.pojo.po.DofStoresExample;
import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysSqlFilter;
import com.hlic.base.pojo.po.SysSqlFilterExample;
import com.hlic.base.pojo.po.WdRptqueryConf;
import com.hlic.base.pojo.po.WdRptqueryConfExample;
import com.hlic.base.pojo.po.WdRptqueryFilter;
import com.hlic.base.pojo.po.WdRptqueryFilterExample;
import com.hlic.base.pojo.vo.GridVo;
import com.hlic.base.service.BaseCommonGridService;
import com.hlic.base.service.DofStoreColsService;
import com.hlic.utils.BeanUtils;
import com.hlic.utils.UUIDBuild;

public class BaseCommonGridServiceImpl implements BaseCommonGridService {
	private static Pattern linePattern = Pattern.compile("_(\\w)");  
	@Autowired
	private BaseCommonGridMapper baseCommonGridMapper;

	@Autowired
	private DofStoreColsMapper dofStoreColsMapper;
	
	@Autowired
	private DofDctColsMapper dofDctColsMapper;
	
	@Autowired
	private DofStoresMapper dofStoresMapper;
	
	@Autowired
	private DofStoreColsService dofStoreColsService;
	
	@Autowired
	private DofDictsMapper dofDictsMapper;
	
	@Autowired
	private SysSqlFilterMapper sysSqlFilterMapper;
	
	@Autowired
	private WdRptqueryConfMapper wdRptqueryConfMapper;
	
	@Autowired
	private WdRptqueryFilterMapper wdRptqueryFilterMapper;
	
	@Autowired
	private DofSnMapper dofSnMapper;
	
	@Resource
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession = null;

    /**
     * 获取sqlSession.
     * @return
     */
    public SqlSession getSqlSession(){
        if(sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }
	/*
	 * 防止sql注入，如果有以下字段不允许 查询数据
	 */
	public static boolean sql_inj(String str){
		//这里的东西还可以自己添加
		String inj_str = "exec|insert|select|delete|drop|update|count|chr|mid|master|truncate|char|declare|;|-|+";
		
		String[] inj_stra=inj_str.split("\\|");
		for (int i=0 ; i < inj_stra.length ; i++ ){
			if (str.indexOf(inj_stra[i])>=0){
			    return true;
			}
		}
		return false;
	}
	/**
	 * @Title: queryTableRows 
	 * @Description: 查询表数据
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@Override
	public List<Map<String,String>> queryTableRows(String inputJson) {
		List<Map<String, String>> retList = new ArrayList<Map<String, String>>();
		Map<String,String> retMap = new HashMap<String, String>();
		try{
			Map<String, String> map = new ConcurrentHashMap<String,String>();
			JSONObject inputData = JSONObject.fromObject(inputJson);
			String tableName = (String) inputData.get("tableName");
			String columns = (String) inputData.get("columns");
			String tableFilter = (String) inputData.get("tableFilter");
			String offset = (String) inputData.get("offset");
			String limit = (String) inputData.get("limit");
			if(tableName != null && !"".equals(tableName)){
				if(BaseCommonGridServiceImpl.sql_inj(tableName)){
					throw new Exception("传入的表名有非法字符！");
				}
			}else{
				throw new Exception("表名不能为空！");
			}
			if(columns != null && !"".equals(columns)){
	            if(BaseCommonGridServiceImpl.sql_inj(columns)){
	            	throw new Exception("传入的表列有非法字符！");
				}		
			}else{
				columns = "*";
			}
			if(tableFilter != null && !"".equals(tableFilter)){
	            if(BaseCommonGridServiceImpl.sql_inj(tableFilter)){
	            	throw new Exception("传入的表过滤条件有非法字符！");
				}
			}else{
				tableFilter = "1=1";
			}
			if(offset != null && !"".equals(offset)){
				
			}
			map.put("tableName", tableName);
			map.put("columns", columns);
			map.put("tableFilter", tableFilter);
			map.put("offset", "0");
			map.put("limit", "10");
			List<Map<String,Object>> objList = baseCommonGridMapper.queryTableRows(map);
			for(Map<String, Object> objMap : objList){
				for (Map.Entry<String, Object> entry : objMap.entrySet()) {
					retMap.put(entry.getKey(), entry.getValue().toString());
				}
				retList.add(retMap);
			}
			return retList;
		}catch (Exception e) {
			e.printStackTrace();
			retMap.put("F_CODE","0");
			retMap.put("F_MESSAGE",e.getMessage());
			return retList;
		}
	}

	/**
	 * @Title: queryColsList 
	 * @Description: 查询列标题，所有store存储表标题
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@Override
	public GridVo<DofStoreCols> queryStoreColsList(String inputJson) {
		GridVo<DofStoreCols> gridVo = new GridVo<DofStoreCols>();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("STO_ID");
		
		DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
		dofStoreColsExample.setOrderByClause("COL_DISP_ORDER ASC");
		com.hlic.base.pojo.po.DofStoreColsExample.Criteria criteria = dofStoreColsExample.createCriteria();
		criteria.andStoIdEqualTo(stoId);
		List<DofStoreCols> dofStoreColsList = dofStoreColsMapper.selectByExample(dofStoreColsExample);
		//设置列标题colNames
		List<String> colName = new ArrayList<String>();
		if(dofStoreColsList.size() > 0){
			for(DofStoreCols dofStoreCols : dofStoreColsList){
				colName.add(dofStoreCols.getColTitle());
			}
		}
		DofStoresExample dofStoresExample =  new DofStoresExample();
		com.hlic.base.pojo.po.DofStoresExample.Criteria dofStoresCriteria = dofStoresExample.createCriteria();
		dofStoresCriteria.andStoIdEqualTo(stoId);
		List<DofStores> dofStores = dofStoresMapper.selectByExample(dofStoresExample);
		gridVo.setColList(dofStoreColsList);
		gridVo.setDictList(dofStores);
		gridVo.setColName(colName);
		return gridVo;
	}
	/**
	 * 查询存储表数据,store配置管理中使用
	 */
	@SuppressWarnings("unchecked")
	@Override
	public GridVo<JSONArray> queryDofStoreColsParamList(String inputJson)
			throws Exception {
		//存储store数据
		JSONArray storeArray = new JSONArray();
		GridVo<JSONArray> gridVo = new GridVo<JSONArray>();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("STO_ID");
		//获取存储表中的数据
		List<Map<String, Object>> dofStoreColslist = baseCommonGridMapper.queryDofStoreColsParamList(stoId);
		
		for(Map<String,Object> map : dofStoreColslist){
			JSONObject storeJsonObj = new JSONObject();
			for(Map.Entry<String, Object> m: map.entrySet()){
				String key = m.getKey();
				Object val = m.getValue();
				
				if("COL_ENUM_KEY".equals(key)){
					storeJsonObj.put("COL_ENUM_KEY_FBH",val);
				}else if("COL_ENUM_KEY_FMC".equals(key)){
					storeJsonObj.put("COL_ENUM_KEY_FMC",val);
				}else if("COL_ELEMENTTYPE_MODE".equals(key)){
					storeJsonObj.put("COL_ELEMENTTYPE_MODE_FCB",val);
				}else if("COL_ELEMENT_TYPE".equals(key)){
					storeJsonObj.put("COL_ELEMENT_TYPE_FBH",val);
				}else if("COL_ELEMENT_TYPE_FMC".equals(key)){
					storeJsonObj.put("COL_ELEMENT_TYPE_FMC",val);
				}else if("COL_FK_DCT".equals(key)){
					storeJsonObj.put("COL_FK_DCT_FBH",val);
				}else if("COL_FK_DCT_FMC".equals(key)){
					storeJsonObj.put("COL_FK_DCT_FMC",val);
				}else if("COL_ELEMENT_TYPE_MODE".equals(key)){
					storeJsonObj.put("COL_ELEMENT_TYPE_MODE_FCB",val);
				}else if("COL_FK".equals(key)){
					storeJsonObj.put("COL_FK_FCB",val);
				}else if("COL_ENUM".equals(key)){
					storeJsonObj.put("COL_ENUM_FCB",val);
				}else if("COL_USE".equals(key)){
					storeJsonObj.put("COL_USE_FCB",val);
				}else if("COL_VISIBLE".equals(key)){
					storeJsonObj.put("COL_VISIBLE_FCB",val);
				}else{
					storeJsonObj.put(key, val);
				}
			}
			storeArray.add(storeJsonObj);	
		}
		gridVo.setColList(storeArray);
		return gridVo;
	}
	
	/**
	 * 查询字典列属性表数据,Dct配置管理中使用
	 */
	@SuppressWarnings("unchecked")
	@Override
	public GridVo<JSONArray> queryDofDctColsParamList(String inputJson)
			throws Exception {
		//存储store数据
		JSONArray dctArray = new JSONArray();
		GridVo<JSONArray> gridVo = new GridVo<JSONArray>();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("DCT_ID");
		//获取存储表中的数据
		List<Map<String, Object>> dofStoreColslist = baseCommonGridMapper.queryDofDctColsParamList(dctId);
		
		for(Map<String,Object> map : dofStoreColslist){
			JSONObject dctJsonObj = new JSONObject();
			for(Map.Entry<String, Object> m: map.entrySet()){
				String key = m.getKey();
				Object val = m.getValue();
				
				if("COL_ENUM_KEY".equals(key)){
					dctJsonObj.put("COL_ENUM_KEY_FBH",val);
				}else if("COL_ENUM_KEY_FMC".equals(key)){
					dctJsonObj.put("COL_ENUM_KEY_FMC",val);
				}else if("COL_ELEMENTTYPE_MODE".equals(key)){
					dctJsonObj.put("COL_ELEMENTTYPE_MODE_FCB",val);
				}else if("COL_ELEMENT_TYPE".equals(key)){
					dctJsonObj.put("COL_ELEMENT_TYPE_FBH",val);
				}else if("COL_ELEMENT_TYPE_FMC".equals(key)){
					dctJsonObj.put("COL_ELEMENT_TYPE_FMC",val);
				}else if("COL_FK_DCT".equals(key)){
					dctJsonObj.put("COL_FK_DCT_FBH",val);
				}else if("COL_FK_DCT_FMC".equals(key)){
					dctJsonObj.put("COL_FK_DCT_FMC",val);
				}else if("COL_ELEMENT_TYPE_MODE".equals(key)){
					dctJsonObj.put("COL_ELEMENT_TYPE_MODE_FCB",val);
				}else if("COL_FK".equals(key)){
					dctJsonObj.put("COL_FK_FCB",val);
				}else if("COL_ENUM".equals(key)){
					dctJsonObj.put("COL_ENUM_FCB",val);
				}else if("COL_USE".equals(key)){
					dctJsonObj.put("COL_USE_FCB",val);
				}else if("COL_VISIBLE".equals(key)){
					dctJsonObj.put("COL_VISIBLE_FCB",val);
				}else{
					dctJsonObj.put(key, val);
				}
			}
			dctArray.add(dctJsonObj);	
		}
		gridVo.setColList(dctArray);
		return gridVo;
	}

	/**
	 * @Title: queryCommonGridPageList 
	 * @Description: 公共分页功能 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@Override
	public PageInfo<Map<String, Object>> queryCommonGridPageList(int page,
			int rows, String STO_ID, String SQL_Filter) {
		try{
			Map<String, String> map = new ConcurrentHashMap<String,String>();
			String tableName = STO_ID;
			String columns = "*";
			String tableFilter = SQL_Filter;
			if(tableName != null && !"".equals(tableName)){
				if(BaseCommonGridServiceImpl.sql_inj(tableName)){
					throw new Exception("传入的表名有非法字符！");
				}
			}else{
				throw new Exception("表名不能为空！");
			}
			if(columns != null && !"".equals(columns)){
	            if(BaseCommonGridServiceImpl.sql_inj(columns)){
	            	throw new Exception("传入的表列有非法字符！");
				}		
			}else{
				columns = "*";
			}
			if(tableFilter != null && !"".equals(tableFilter)){
	            if(BaseCommonGridServiceImpl.sql_inj(tableFilter)){
	            	throw new Exception("传入的表过滤条件有非法字符！");
				}
			}else{
				tableFilter = "1=1";
			}
		
			map.put("tableName", tableName);
			map.put("columns", columns);
			map.put("tableFilter", tableFilter);
			PageHelper.startPage(page, rows);
		    List<Map<String,Object>> list = baseCommonGridMapper.queryCommonGridPageList(map);
		    JSONArray storeArray = new JSONArray();
		    for(Map<String,Object> gridmap : list){
				JSONObject storeJsonObj = new JSONObject();
				for(Map.Entry<String, Object> m: gridmap.entrySet()){
					String key = m.getKey();
					Object val = m.getValue();
					
					if("COL_ENUM_KEY".equals(key)){
						storeJsonObj.put("COL_ENUM_KEY_FBH",val);
					}else if("COL_ENUM_KEY_FMC".equals(key)){
						storeJsonObj.put("COL_ENUM_KEY_FMC",val);
					}else if("COL_ELEMENTTYPE_MODE".equals(key)){
						storeJsonObj.put("COL_ELEMENTTYPE_MODE_FCB",val);
					}else if("COL_ELEMENT_TYPE".equals(key)){
						storeJsonObj.put("COL_ELEMENT_TYPE_FBH",val);
					}else if("COL_ELEMENT_TYPE_FMC".equals(key)){
						storeJsonObj.put("COL_ELEMENT_TYPE_FMC",val);
					}else if("COL_FK_DCT".equals(key)){
						storeJsonObj.put("COL_FK_DCT_FBH",val);
					}else if("COL_FK_DCT_FMC".equals(key)){
						storeJsonObj.put("COL_FK_DCT_FMC",val);
					}else if("COL_ELEMENT_TYPE_MODE".equals(key)){
						storeJsonObj.put("COL_ELEMENT_TYPE_MODE_FCB",val);
					}else if("COL_FK".equals(key)){
						storeJsonObj.put("COL_FK_FCB",val);
					}else if("COL_ENUM".equals(key)){
						storeJsonObj.put("COL_ENUM_FCB",val);
					}else if("COL_USE".equals(key)){
						storeJsonObj.put("COL_USE_FCB",val);
					}else if("COL_VISIBLE".equals(key)){
						storeJsonObj.put("COL_VISIBLE_FCB",val);
					}else{
						storeJsonObj.put(key, val);
					}
					
				}
				storeArray.add(storeJsonObj);
		    }
		    
		    PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(storeArray);

			return pageInfo;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * @Title: queryDctColsList 
	 * @Description: 查询DCT列标题
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param DCT_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@Override
	public GridVo<DofDctCols> queryDctColsList(String inputJson) {
		GridVo<DofDctCols> gridVo = new GridVo<DofDctCols>();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("DCT_ID");
		//1、获取字典属性
		DofDictsExample dofDictsExample = new DofDictsExample();
		com.hlic.base.pojo.po.DofDictsExample.Criteria criteria =  dofDictsExample.createCriteria();
		criteria.andDctIdEqualTo(dctId);
		List<DofDicts> dictList = dofDictsMapper.selectByExample(dofDictsExample);
		//2、获取列标题属性colModel
		List<DofDctCols> list = baseCommonGridMapper.queryDctColsList(dctId);

		gridVo.setColList(list);
		gridVo.setDictList(dictList);
		return gridVo;
	}
	
	public List<Map<String, Object>> queryCommTableList(){
		Map<String, Object> map = new HashMap<String, Object>();
		//查询sqlfilter配置信息
		SysSqlFilterExample sysSqlFilterExample = new SysSqlFilterExample();
		com.hlic.base.pojo.po.SysSqlFilterExample.Criteria criteria = sysSqlFilterExample.createCriteria();
		criteria.andFFuncIdEqualTo("");
		criteria.andFNameEqualTo("");
		List<SysSqlFilter> sysSqlFilterList = sysSqlFilterMapper.selectByExample(sysSqlFilterExample);
		if(sysSqlFilterList.size() > 0){
			SysSqlFilter sysSqlFilter = sysSqlFilterList.get(0);
			String sqlStr = "";
			sqlStr = sysSqlFilter.getfSql();
			sqlStr += "where usr_usrid = #{usrUsrid} and usr_name like concat('%',#{userName},'%')";
			//这里的 sql 对应 XML 中的 ${sql}
			map.put("sql", sqlStr);
			//#{enabled}
			map.put("usrUsrid", "100001");
			//#{userName}
			map.put("userName", "李岩");
			//接口方式调用
			List<Map<String, Object>> list = baseCommonGridMapper.executeSql(map);
			//sqlSession方式调用
			sqlSession.selectList("executeSql", map);
			sqlSession.close();
			return list;
		}else{
			return null;
		}
	}
	/**
	 * 对任意表进行分页查询
	 */
	@Override
	public PageInfo<Map<String,Object>> queryTableDataList(int page, int rows,String tableId,String SQL_Filter){
		List<Map<String, Object>> retData = new ArrayList<Map<String, Object>>();
		try {
			//查询业务报表
			WdRptqueryConfExample wdRptqueryConfExample = new WdRptqueryConfExample();
			com.hlic.base.pojo.po.WdRptqueryConfExample.Criteria criterion = wdRptqueryConfExample.createCriteria();
			criterion.andFBizCodeEqualTo(tableId);
			List<WdRptqueryConf> wdRptqueryConfList = wdRptqueryConfMapper.selectByExample(wdRptqueryConfExample);
			if(wdRptqueryConfList.size() > 0){
				Map<String, Object> sqlMapper = new HashMap<String, Object>();
				//查询报表过滤条件
				WdRptqueryFilterExample wdRptqueryFilterExample = new WdRptqueryFilterExample();
				com.hlic.base.pojo.po.WdRptqueryFilterExample.Criteria filterCriterion = wdRptqueryFilterExample.createCriteria();
				filterCriterion.andFBizCodeEqualTo(tableId);
				List<WdRptqueryFilter> wdRptqueryFilterList = wdRptqueryFilterMapper.selectByExample(wdRptqueryFilterExample);
				WdRptqueryConf wdRptqueryConf = wdRptqueryConfList.get(0);
				StringBuffer sqlStr = new StringBuffer();
				//判断查询sql是否为空
				if(!"".equals(wdRptqueryConf.getfSqltext())){
					sqlStr.append(wdRptqueryConf.getfSqltext()+" where 1=1 ");
					if(wdRptqueryFilterList.size() > 0 && !"".equals(SQL_Filter)){
						JSONObject inputData = JSONObject.fromObject(SQL_Filter);
						Map<String,Object> fReqData =  (Map<String, Object>) inputData;
						for(WdRptqueryFilter wdRptqueryFilter : wdRptqueryFilterList){
							for (Map.Entry<String, Object> entry : fReqData.entrySet()) {
								//判断报表过滤条件中过滤条件与前台传来的过滤条件是否相同
								if(wdRptqueryFilter.getfParamName().equals(entry.getKey())){
									sqlMapper.put(entry.getKey(), entry.getValue());
									sqlStr.append(" and "+wdRptqueryFilter.getfParamExp());
								}
							}
						}
					}
					sqlMapper.put("sql", sqlStr.toString());
					//sqlMapper.put("f_pkey", "1");
					if(!"".equals(sqlStr.toString()) && sqlStr != null){
						PageHelper.startPage(page, rows);
						retData = baseCommonGridMapper.executeSql(sqlMapper);
						PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(retData);
						//retData = sqlSession.selectList("executeSql", sqlMapper);
						System.out.println(retData);
						return pageInfo;
					}
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public GridVo<JSONArray> queryCreateStoreColsList(String inputJson) throws Exception {
		GridVo<JSONArray> gridVo = new GridVo<JSONArray>();
		JSONArray storeArray = new JSONArray();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("STO_ID");
		//获取存储表中的数据
		List<Map<String, Object>> dofStoreColslist = baseCommonGridMapper.queryCreateStoreColsList(stoId);
		
		for(Map<String,Object> map : dofStoreColslist){
			JSONObject storeJsonObj = new JSONObject();
			for(Map.Entry<String, Object> m: map.entrySet()){
				String key = m.getKey();
				Object val = m.getValue();
				
				if("STO_KEY_FIELD".equals(key)){
					storeJsonObj.put("STO_KEY_FIELD_FCB",val);
				}else if("COL_NULL".equals(key)){
					storeJsonObj.put("COL_NULL_FCB",val);
				}else{
					storeJsonObj.put(key, val);
				}
			}
			storeArray.add(storeJsonObj);
		}
		
		gridVo.setColList(storeArray);
		return gridVo;
	}
	@SuppressWarnings("unchecked")
	@Override
	public GridVo<JSONArray> queryCreateDctColsList(String inputJson) throws Exception {
		GridVo<JSONArray> gridVo = new GridVo<JSONArray>();
		JSONArray dctArray = new JSONArray();
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("DCT_ID");
		//获取存储表中的数据
		List<Map<String, Object>> dofDctColslist = baseCommonGridMapper.queryCreateDctColsList(dctId);
		
		for(Map<String,Object> map : dofDctColslist){
			JSONObject dctJsonObj = new JSONObject();
			for(Map.Entry<String, Object> m: map.entrySet()){
				String key = m.getKey();
				Object val = m.getValue();
				
				if("DCT_FID".equals(key)){
					dctJsonObj.put("DCT_FID_FCB",val);
				}else if("COL_NULL".equals(key)){
					dctJsonObj.put("COL_NULL_FCB",val);
				}else{
					dctJsonObj.put(key, val);
				}
			}
			dctArray.add(dctJsonObj);
		}
		
		gridVo.setColList(dctArray);
		return gridVo;
	}
	@Override
	public int createStoreData(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		String stoName = (String) inputData.get("stoName");
		String dataType = (String) inputData.get("dataType");
		String sysId = (String) inputData.get("sysId");
		JSONObject saveData = inputData.getJSONObject("gridData");
		if(!saveData.isNullObject()){
			//1、dof_store_cols改变存储表列属性
			upDateDofStoreColsGrid(stoId,saveData.toString());
		}
		//0:插入；1:更新；2:删除
		if("0".equals(dataType)){
			DofStores dofStores = new DofStores();
			dofStores.setStoId(stoId);
			dofStores.setStoCaption(stoName);
			dofStores.setStoInter("0");
			dofStores.setStoDofObj(stoId);
			dofStores.setStoOwnerBa(sysId);
			dofStores.setStoIcon("");
			//2、dof_stores存储表属性表插入数据
			dofStoresMapper.insertSelective(dofStores);
			if(saveData.get("editSave") != null){
				JSONArray preNewSave = (JSONArray) saveData.get("editSave");
				if(preNewSave.size() > 0){
					Iterator item = preNewSave.iterator();
					Map<String, String> map = new HashMap<String, String>();
					StringBuffer sqlStr = new StringBuffer();
					sqlStr.append("CREATE TABLE ");
					sqlStr.append(stoId+" (");
					
					for(int i = 0 ; i < preNewSave.size() ; i++) {
						JSONObject store = (JSONObject) preNewSave.get(i);
						sqlStr.append(store.get("COL_ID"));
						if(i == preNewSave.size()-1){
							//判断数据类型是否选择
							if(store.get("COL_DATA_TYPE") == null){
								sqlStr.append(" varchar(32) DEFAULT NULL ");
							}else{
								//列空否
								if(store.get("COL_NULL") == null || "0".equals(store.get("COL_NULL"))){
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + " DEFAULT NULL ");
								}else{
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + " NOT NULL");
								}
								
							}
						}else{
							if(store.get("COL_DATA_TYPE") == null){
								sqlStr.append(" varchar(32) DEFAULT NULL, ");
							}else{
								if(store.get("COL_NULL") == null || "0".equals(store.get("COL_NULL"))){
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + "(32) DEFAULT NULL, ");
								}else{
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + "(32) NOT NULL,");
								}
								
							}
						}
					}
					sqlStr.append(" )");
					map.put("updateSql", sqlStr.toString());
					//3、创建存储表
					baseCommonGridMapper.createTmpTable(map);
				}
			}
			
		}
		//更新
		if("1".equals(dataType)){
			
		}
		//删除
		if("2".equals(dataType)){
			
		}
		return 0;
	}
	/**
	 * 字典表创建，字典属性创建
	 */
	@Override
	public int createDctData(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("dctId");
		String dctName = (String) inputData.get("dctName");
		String dataType = (String) inputData.get("dataType");
		String sysId = (String) inputData.get("sysId");
		JSONObject saveData = inputData.getJSONObject("gridData");
		if(!saveData.isNullObject()){
			//1、dof_store_cols改变存储表列属性
			upDateDofDctColsGrid(dctId,saveData.toString());
		}
		//0:插入；1:更新；2:删除
		if("0".equals(dataType)){
			DofDicts dofDicts = new DofDicts();
			dofDicts.setDctId(dctId);
			dofDicts.setDctCaption(dctName);
			dofDicts.setDctInter("0");
			dofDicts.setDctDofObj(dctId);
			dofDicts.setDctOwnerBa(sysId);
			dofDicts.setDctIcon("");
			//2、dof_stores存储表属性表插入数据
			dofDictsMapper.insertSelective(dofDicts);
			if(saveData.get("editSave") != null){
				JSONArray preNewSave = (JSONArray) saveData.get("editSave");
				if(preNewSave.size() > 0){
					Iterator item = preNewSave.iterator();
					Map<String, String> map = new HashMap<String, String>();
					StringBuffer sqlStr = new StringBuffer();
					sqlStr.append("CREATE TABLE ");
					sqlStr.append(dctId+" (");
					
					for(int i = 0 ; i < preNewSave.size() ; i++) {
						JSONObject store = (JSONObject) preNewSave.get(i);
						sqlStr.append(store.get("COL_ID"));
						if(i == preNewSave.size()-1){
							//判断数据类型是否选择
							if(store.get("COL_DATA_TYPE") == null){
								sqlStr.append(" varchar(32) DEFAULT NULL ");
							}else{
								//列空否
								if(store.get("COL_NULL") == null || "0".equals(store.get("COL_NULL"))){
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + " DEFAULT NULL ");
								}else{
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + " NOT NULL");
								}
								
							}
						}else{
							if(store.get("COL_DATA_TYPE") == null){
								sqlStr.append(" varchar(32) DEFAULT NULL, ");
							}else{
								if(store.get("COL_NULL") == null || "0".equals(store.get("COL_NULL"))){
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + "(32) DEFAULT NULL, ");
								}else{
									sqlStr.append(" " + store.get("COL_DATA_TYPE") + "(32) NOT NULL,");
								}
								
							}
						}
					}
					sqlStr.append(" )");
					map.put("updateSql", sqlStr.toString());
					//3、创建存储表
					baseCommonGridMapper.createTmpTable(map);
				}
			}
			
		}
		//更新
		if("1".equals(dataType)){
			
		}
		//删除
		if("2".equals(dataType)){
			
		}
		return 0;
	}
	
	private int upDateDofStoreColsGrid(String stoId, String jsonObject) throws Exception {
		int F_CODE = 0;
		List<DofStoreCols> list = new ArrayList<DofStoreCols>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray preNewSave = (JSONArray) saveData.get("editSave");
			JSONArray newSave = keyNameToHump(preNewSave);
			list = (List<DofStoreCols>) JSONArray.toCollection(newSave,DofStoreCols.class);
			//新增行
			if(list.size() > 0){
				int count = 1;
				for(DofStoreCols dofStoreCols : list){
					dofStoreCols.setColPk(stoId + "_" + dofStoreCols.getColId());
					dofStoreCols.setStoId(stoId);
					dofStoreCols.setColDispOrder(count);
					dofStoreCols.setColCaption(dofStoreCols.getColTitle());
					F_CODE = dofStoreColsMapper.insertSelective(dofStoreCols);
					count++;
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray preDelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = keyNameToHump(preDelSave);
			//删除行
			list = (List<DofStoreCols>) JSONArray.toCollection(delSave,DofStoreCols.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					//F_CODE = dofStoreColsMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}
	private int upDateDofDctColsGrid(String stoId, String jsonObject) throws Exception {
		int F_CODE = 0;
		List<DofDctCols> list = new ArrayList<DofDctCols>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray preNewSave = (JSONArray) saveData.get("editSave");
			JSONArray newSave = keyNameToHump(preNewSave);
			list = (List<DofDctCols>) JSONArray.toCollection(newSave,DofDctCols.class);
			//新增行
			if(list.size() > 0){
				int count = 1;
				for(DofDctCols dofDctCols : list){
					dofDctCols.setColPk(stoId + "_" + dofDctCols.getColId());
					dofDctCols.setDctId(stoId);
					dofDctCols.setColDispOrder(count);
					dofDctCols.setColCaption(dofDctCols.getColCaption());
					dofDctCols.setColTitle(dofDctCols.getColCaption());
					F_CODE = dofDctColsMapper.insertSelective(dofDctCols);
					count++;
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray preDelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = keyNameToHump(preDelSave);
			//删除行
			list = (List<DofDctCols>) JSONArray.toCollection(delSave,DofDctCols.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					//F_CODE = dofStoreColsMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}
	 /**
     * @Title: keyNameToHump 
     * @Description: 把带下划线的key转换成驼峰 
     * @param @param preData
     * @param @return    设定文件 
     * @return JSONArray    返回类型 
     * @throws 
     */
    private static JSONArray keyNameToHump(JSONArray preData){
    	JSONArray formatSave = new JSONArray();
    	@SuppressWarnings("unchecked")
		Iterator<Object> it = preData.iterator();
		while (it.hasNext()) {
			JSONObject obj = (JSONObject) it.next();
			JSONObject inObj = new JSONObject();
			@SuppressWarnings("unchecked")
			Map<String, Object> map = obj;
			for (Entry<String, Object> entry : map.entrySet()) {
				String keyName = entry.getKey();
				keyName = lineToHump(keyName);
				inObj.put(keyName, entry.getValue());
			}
			formatSave.add(inObj);
		}
		return formatSave;
    }
    /**下划线转驼峰*/  
    public static String lineToHump(String str){  
        str = str.toLowerCase();  
        Matcher matcher = linePattern.matcher(str);  
        StringBuffer sb = new StringBuffer();  
        while(matcher.find()){  
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());  
        }  
        matcher.appendTail(sb);  
        return sb.toString();  
    }
	@Override
	public int delStoreData(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		String sysId = (String) inputData.get("sysId");
		if(stoId != null && sysId != null){
			//1、删除dof_stores中的数据
			DofStoresExample dofStoresExample = new DofStoresExample();
			com.hlic.base.pojo.po.DofStoresExample.Criteria criteria = dofStoresExample.createCriteria();
			criteria.andStoIdEqualTo(stoId);
			criteria.andStoOwnerBaEqualTo(sysId);
			int dofStoreCode = dofStoresMapper.deleteByExample(dofStoresExample);
			
			//2、删除dof_store_cols中的数据
			DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
			com.hlic.base.pojo.po.DofStoreColsExample.Criteria criteriaCols = dofStoreColsExample.createCriteria();
			criteriaCols.andStoIdEqualTo(stoId);
			int dofStoreColsCode = dofStoreColsMapper.deleteByExample(dofStoreColsExample);
			
			//3、删表
			baseCommonGridMapper.dropTable(stoId);
		}
		return 0;
	}
	@Override
	public int delDctData(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("dctId");
		String sysId = (String) inputData.get("sysId");
		if(dctId != null && sysId != null){
			//1、删除dof_stores中的数据
			DofDictsExample dofDictsExample = new DofDictsExample();
			com.hlic.base.pojo.po.DofDictsExample.Criteria criteria = dofDictsExample.createCriteria();
			criteria.andDctIdEqualTo(dctId);
			criteria.andDctOwnerBaEqualTo(sysId);
			int dofDctCode = dofDictsMapper.deleteByExample(dofDictsExample);
			
			//2、删除dof_store_cols中的数据
			DofDctColsExample dofDctColsExample = new DofDctColsExample();
			com.hlic.base.pojo.po.DofDctColsExample.Criteria criteriaCols = dofDctColsExample.createCriteria();
			criteriaCols.andDctIdEqualTo(dctId);
			int dofStoreColsCode = dofDctColsMapper.deleteByExample(dofDctColsExample);
			
			//3、删表
			baseCommonGridMapper.dropTable(dctId);
		}
		return 0;
	}
	@Override
	public int setStoreData(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		String sysId = (String) inputData.get("sysId");
		JSONArray storeParam = (JSONArray) inputData.get("storeParam");
		JSONObject gridData = inputData.getJSONObject("gridData");
		if(!gridData.isNullObject()){
			//1、dof_store_cols改变存储表列属性
			upDateDofStoreColsGrid(stoId,gridData.toString());
		}
		if(storeParam.size() > 0){
			for(int i=0; i<storeParam.size(); i++){
				JSONObject storeObj = (JSONObject) storeParam.get(i);
				DofStores dofStores = (DofStores) storeObj.toBean(storeObj,DofStores.class);
				DofStoresExample dofStoresExample = new DofStoresExample();
				com.hlic.base.pojo.po.DofStoresExample.Criteria criteria = dofStoresExample.createCriteria();
				criteria.andStoIdEqualTo(dofStores.getStoId());
				criteria.andStoOwnerBaEqualTo(sysId);
				dofStoresMapper.updateByExampleSelective(dofStores, dofStoresExample);
			}
		}
		return 0;
	}
	@Override
	public int updateCommonTable(String table, JSONArray jsonArr, String id) throws Exception {
		StringBuffer sqlStr = null;
		Iterator<Object> it = jsonArr.iterator();
		int F_CODE = 0;
		while (it.hasNext()) {
			Map<String, Object> map = (JSONObject) it.next();
			Map<String, String> sqlMap = new HashMap<String, String>();
			sqlStr = new StringBuffer("update "+table+" set ");
			String sqlWhere = "";
			int count = 1;
			for (Entry<String, Object> entry : map.entrySet()) {
				if(id.equals(entry.getKey())){
					sqlWhere = " where "+entry.getKey() + "='" +entry.getValue()+ "'";
				}else{
					if(count == 1){
						sqlStr.append(entry.getKey() + "='" + entry.getValue()+"'");
					}else{
						sqlStr.append(","+entry.getKey() + "='" + entry.getValue()+"'");
					}
					count++;
				}
			}
			sqlStr.append(sqlWhere);
			sqlMap.put("updateSql", sqlStr.toString());
			//3、创建存储表
			F_CODE = baseCommonGridMapper.createTmpTable(sqlMap);
		}
		return F_CODE;
	}
	@Override
	public int deleteCommonTable(String table, JSONArray jsonArr, String id) throws Exception {
		List<Object> idList = new ArrayList<Object>();
		Map<String, Object> sqlMap = new HashMap<String, Object>();
		String fId = "";
		Iterator<Object> it = jsonArr.iterator();
		while (it.hasNext()) {
			Map<String, Object> map = (JSONObject) it.next();
			for (Entry<String, Object> entry : map.entrySet()) {
				idList.add(entry.getValue());
				fId = entry.getKey();
			}
		}
		sqlMap.put("sqlList", idList);
		sqlMap.put("table", table);
		sqlMap.put("fId", fId);
		return baseCommonGridMapper.deleteSql(sqlMap);
	}
	/**
	 * store数据查询
	 */
	@Override
	public PageInfo<Map<String, Object>> queryStoreGridPageList(int page,
			int rows, String STO_ID, String SQL_Filter) {

		StringBuffer tableStr = new StringBuffer(" "+STO_ID + " A ");
		StringBuffer colStr = new StringBuffer("select A.* ");
		Map<String,Object> sqlMap = new HashMap<String, Object>();
		List<String> dctIdList = new ArrayList<String>();
		//1、根据STO_ID查询DofStoreCols表中列的配置
		DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
		Criteria criteria = dofStoreColsExample.createCriteria();
		criteria.andStoIdEqualTo(STO_ID);
		List<DofStoreCols> dofStoreColsList = dofStoreColsMapper.selectByExample(dofStoreColsExample);
		for(DofStoreCols dofStoreCols : dofStoreColsList){
			if("1".equals(dofStoreCols.getColType())){
				dctIdList.add(dofStoreCols.getColFkDct());
			}
		}
		List<DofDicts> dofDictsList = new ArrayList<DofDicts>();
		if(dctIdList.size() > 0){
			//2、根据Store中列的配置查询DofDicts配置的字典编号和名称
			DofDictsExample dofDictsExample = new DofDictsExample(); 
			com.hlic.base.pojo.po.DofDictsExample.Criteria dofDictsCriteria = dofDictsExample.createCriteria();
			dofDictsCriteria.andDctIdIn(dctIdList);
			dofDictsList = dofDictsMapper.selectByExample(dofDictsExample);
		}
		
		//左链接拼接
		for(DofStoreCols dofStoreCols : dofStoreColsList){
			if("1".equals(dofStoreCols.getColType())){
				for(DofDicts dofDicts : dofDictsList){
					if(dofStoreCols.getColFkDct().equals(dofDicts.getDctId())){
						tableStr.append(" LEFT JOIN "+dofStoreCols.getColFkDct()+" ON "+dofDicts.getDctId()+"."+dofDicts.getDctFid()+"=A."+dofStoreCols.getColId());
						colStr.append(","+dofDicts.getDctId()+"."+dofDicts.getDctFname());
					}
				}
				
			}else {
				
			}
		}
		String sqlStr = colStr.toString() + " from " + tableStr.toString();
		sqlMap.put("sql", sqlStr);
		List<Map<String,Object>> storeMap = baseCommonGridMapper.executeSql(sqlMap);
		return null;
	}
	/**
	 * Dct数据查询
	 */
	@Override
	public PageInfo<Map<String, Object>> queryDctGridPageList(int page,
			int rows, String DCT_ID, String SQL_Filter, String SQL_Where) {

		StringBuffer tableStr = new StringBuffer(" "+DCT_ID + " A ");
		StringBuffer colStr = new StringBuffer("select A.* ");
		StringBuffer filterStr = new StringBuffer(" where 1=1 ");
		Map<String,Object> sqlMap = new HashMap<String, Object>();
		List<String> dctIdList = new ArrayList<String>();
		//1、根据STO_ID查询DofStoreCols表中列的配置
		DofDctColsExample dofDctColsExample = new DofDctColsExample();
		com.hlic.base.pojo.po.DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
		criteria.andDctIdEqualTo(DCT_ID);
		List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample);
		for(DofDctCols dofDctCols : dofDctColsList){
			if("1".equals(dofDctCols.getColFk())){
				dctIdList.add(dofDctCols.getColFkDct());
			}
		}
		List<DofDicts> dofDictsList = new ArrayList<DofDicts>();
		if(dctIdList.size() > 0){
			//2、根据Store中列的配置查询DofDicts配置的字典编号和名称
			DofDictsExample dofDictsExample = new DofDictsExample(); 
			com.hlic.base.pojo.po.DofDictsExample.Criteria dofDictsCriteria = dofDictsExample.createCriteria();
			dofDictsCriteria.andDctIdIn(dctIdList);
			dofDictsList = dofDictsMapper.selectByExample(dofDictsExample);
		}
		
		//左链接拼接
		for(DofDctCols dofDctCols : dofDctColsList){
			if("1".equals(dofDctCols.getColFk())){
				for(DofDicts dofDicts : dofDictsList){
					if(dofDctCols.getColFkDct().equals(dofDicts.getDctId())){
						tableStr.append(" LEFT JOIN "+dofDctCols.getColFkDct()+" ON "+dofDicts.getDctId()+"."+dofDicts.getDctFid()+"=A."+dofDctCols.getColId());
						colStr.append(","+dofDicts.getDctId()+"."+dofDicts.getDctFname()+" AS "+dofDctCols.getColId()+"_FMC");
					}
				}
				
			}else {
				
			}
		}
		
		//查询报表过滤条件
		WdRptqueryFilterExample wdRptqueryFilterExample = new WdRptqueryFilterExample();
		com.hlic.base.pojo.po.WdRptqueryFilterExample.Criteria filterCriterion = wdRptqueryFilterExample.createCriteria();
		filterCriterion.andFBizCodeEqualTo(DCT_ID);
		List<WdRptqueryFilter> wdRptqueryFilterList = wdRptqueryFilterMapper.selectByExample(wdRptqueryFilterExample);
		//判断查询sql是否为空
		if(wdRptqueryFilterList.size() > 0 && !"".equals(SQL_Filter)){
			JSONObject inputData = JSONObject.fromObject(SQL_Filter);
			Map<String,Object> fReqData =  (Map<String, Object>) inputData;
			for(WdRptqueryFilter wdRptqueryFilter : wdRptqueryFilterList){
				for (Map.Entry<String, Object> entry : fReqData.entrySet()) {
					//判断报表过滤条件中过滤条件与前台传来的过滤条件是否相同
					if(wdRptqueryFilter.getfParamName().equals(entry.getKey()) && !"".equals(entry.getValue())){
						sqlMap.put(entry.getKey(), entry.getValue());
						filterStr.append(" and ZD."+wdRptqueryFilter.getfParamExp());
					}
				}
			}
		}
		if(!"".equals(SQL_Where)){
			filterStr.append(" AND "+SQL_Where);
		}
		
		String sqlStr = "SELECT * FROM ("+colStr.toString() + " from " + tableStr.toString()+") ZD "+filterStr.toString();
		sqlMap.put("sql", sqlStr);
		PageHelper.startPage(page, rows);
		List<Map<String,Object>> storeMap = baseCommonGridMapper.executeSql(sqlMap);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(storeMap);
		return pageInfo;
	}
	/**
	 * 查询唯一键值,为dct、store提供唯一键值
	 */
	@Override
	public String queryUniqueKeyValue(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String tId = (String) inputData.get("tId");
		String parentId = (String) inputData.get("parentId");
		List<DofStores> dofStoresList = new ArrayList<DofStores>();
		Map<String,String> sqlMap = null;
		DofDictsExample dofDictsExample = new DofDictsExample();
		com.hlic.base.pojo.po.DofDictsExample.Criteria criteria = dofDictsExample.createCriteria();
		criteria.andDctIdEqualTo(tId);
		List<DofDicts> dofDictsList = dofDictsMapper.selectByExample(dofDictsExample);
		String numLen = "";
		if(dofDictsList.size() == 0){
			DofStoresExample dofStoresExample = new DofStoresExample();
			com.hlic.base.pojo.po.DofStoresExample.Criteria stoCriteria = dofStoresExample.createCriteria();
			stoCriteria.andStoIdEqualTo(tId);
			dofStoresList = dofStoresMapper.selectByExample(dofStoresExample);
		}
		//字典生成唯一键值
		if(dofDictsList.size() > 0){
			DofDicts dofDicts = dofDictsList.get(0);
			//1、分级字典，编号自增
			if(!"".equals(dofDicts.getDctFparent()) && !"".equals(dofDicts.getDctStruc()) && !"".equals(parentId)){
				sqlMap = new HashMap<String, String>();
				String sqlStr = "select MAX("+dofDicts.getDctFid()+") from #{table} where "+dofDicts.getDctFparent()+"=#{parentId}";
				sqlMap.put("sql", sqlStr);
				sqlMap.put("table", tId);
				sqlMap.put("parentId", parentId);
				int increment = baseCommonGridMapper.queryCount(sqlMap);
				increment++;
				numLen = String.valueOf(increment);
			}else if(!"".equals(dofDicts.getDctId())){//2、不分级字典，编号自增
				//1、自增
				sqlMap = new HashMap<String, String>();
				String sqlStr = "select max("+dofDicts.getDctFid()+") from "+tId;
				sqlMap.put("sql", sqlStr);
				//sqlMap.put("table", tId);
				int increment = baseCommonGridMapper.queryCount(sqlMap);
				increment++;
				numLen = String.valueOf(increment);
			}
			
			//2、uuid
			String UUID = UUIDBuild.getUUID();
			//3、分级字典，级数中自增
		}
		//sto生成唯一键值
		if(dofStoresList.size() > 0){
			DofStores dofStores = dofStoresList.get(0);
			if("UUID".equals(dofStores.getStoKeyCrtr())){
				numLen = UUIDBuild.getUUID();
			}/*else if(!"".equals(dofStores.getStoKeyField())){
				DofSn dofSn = dofSnMapper.selectByPrimaryKey(dofStores.getStoKeyField());
				if(dofSn != null){
					StringBuffer idStr = new StringBuffer();
					idStr.append(dofSn.getSnElementFixed());
					DateFormat df = new SimpleDateFormat("yyyyMMdd");
					Calendar calendar = Calendar.getInstance();
					String dateName = df.format(calendar.getTime());
					idStr.append(dateName);
					sqlMap = new HashMap<String, Object>();
					String sqlStr = "select max("+dofStores.getStoKeyField()+") from "+tId+" where "+dofStores.getStoKeyField()+"=#{fDJBH}";
					sqlMap.put("sql", sqlStr);
					sqlMap.put("fDJBH", idStr.toString());
					int increment = baseCommonGridMapper.queryCount(sqlMap);
				}
			}*/
			
		}
		return numLen;
	}
	/**
	 * sto和dct中查询唯一主键帮助信息
	 */
	@Override
	public List<Map<String, Object>> queryPkHelpList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = inputData.getString("stoId");
		String dctId = inputData.getString("dctId");
		List<Map<String, Object>> retRows = new ArrayList<Map<String, Object>>(); 
		//查询dofStorecols中列的数据
		if(!"".equals(stoId)){
			DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
			Criteria criteria = dofStoreColsExample.createCriteria();
			criteria.andStoIdEqualTo(stoId);
			List<DofStoreCols> dofStoreColsList = dofStoreColsMapper.selectByExample(dofStoreColsExample);
			for(DofStoreCols dofStoreCols : dofStoreColsList){
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("COL_PK", dofStoreCols.getColPk());
				map.put("COL_ID", dofStoreCols.getColId());
				map.put("COL_TITLE", dofStoreCols.getColTitle());
				retRows.add(map);
			}
		}
		//查询dofDctcols中列的数据
		if(!"".equals(dctId)){
			DofDctColsExample dofDctColsExample = new DofDctColsExample();
			com.hlic.base.pojo.po.DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
			criteria.andDctIdEqualTo(dctId);
			List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample);
			for(DofDctCols dofDctCols : dofDctColsList){
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("COL_PK", dofDctCols.getColPk());
				map.put("COL_ID", dofDctCols.getColId());
				map.put("COL_TITLE", dofDctCols.getColTitle());
				retRows.add(map);
			}
		}
		return retRows;
	}
	@Override
	public int saveCommonTableData(String inputJson) {
		int F_CODE = 0;
		Map<String,String> sqlMap = null;
		JSONObject saveData = JSONObject.fromObject(inputJson);
		String stoId = saveData.getString("stoId");
		String fId = saveData.getString("fId");
		if(saveData.get("editSave") != null){
			JSONArray preeditSave = (JSONArray) saveData.get("editSave");
			JSONArray editSave = BeanUtils.keyNameToHump(preeditSave);
			//更新行
			if(editSave.size() > 0){
				for(int i=0; i<editSave.size(); i++){
					int count = 0;
					String fIdValue = "";
					StringBuffer sqlStr = new StringBuffer();
					sqlStr.append("update "+stoId+" set ");
					JSONObject jsObj = editSave.getJSONObject(i);
					for (Object keyStr : jsObj.keySet()) {
						String key =  (String) keyStr;
						//驼峰列名转换成下划线列名
						String keyVal = new BeanUtils().underline(new StringBuffer(key)).toString();
						
						if(fId.toUpperCase().equals(keyVal.toUpperCase())){
							fIdValue = (String) jsObj.get(key);
						}else{
							if(count == 0){
								sqlStr.append(" "+keyVal+"='"+(String) jsObj.get(key)+"' ");
							}else{
								sqlStr.append(", "+keyVal+"='"+jsObj.get(key)+"' ");
							}
							count++;
						}
					}
					sqlStr.append(" where "+fId+"=#{fId}");
					sqlMap = new HashMap<String, String>();
					
					
					sqlMap.put("updateSql", sqlStr.toString());
					sqlMap.put("fId", fIdValue);
					F_CODE = baseCommonGridMapper.updateTable(sqlMap);
				}
				
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray prenewSave = (JSONArray) saveData.get("newSave");
			JSONArray newSave = BeanUtils.keyNameToHump(prenewSave);
			//新增行
			if(newSave.size() > 0){
				for(int i=0; i<newSave.size(); i++){
					int count = 0;
					StringBuffer sqlStr = new StringBuffer();
					StringBuffer valStr = new StringBuffer();
					sqlMap = new HashMap<String, String>();
					
					sqlStr.append("insert into "+stoId);
					sqlStr.append(" (");
					// insert into table (列名) value (#{列名})
					valStr.append("(");
					JSONObject jsObj = newSave.getJSONObject(i);
					for (Object keyStr : jsObj.keySet()) {
						String key =  (String) keyStr;
						String keyVal = new BeanUtils().underline(new StringBuffer(key)).toString();
						if(count == 0){
							sqlStr.append(keyVal);
							valStr.append("#{"+keyVal+"}");
							sqlMap.put(keyVal, (String) jsObj.get(key));
						}else{
							sqlStr.append(","+keyVal);
							valStr.append(",#{"+keyVal+"}");
							sqlMap.put(keyVal, (String) jsObj.get(key));
						}
						count++;
					}
					sqlStr.append(") ");
					valStr.append(")");
					sqlMap.put("insertSql", sqlStr.toString() + " values " + valStr.toString());
					F_CODE = baseCommonGridMapper.insertCommonTable(sqlMap);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray predelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = BeanUtils.keyNameToHump(predelSave);
			//删除行
			if(delSave.size() > 0){
				for(int i=0; i<delSave.size(); i++){
					sqlMap = new HashMap<String, String>();
					StringBuffer sqlStr = new StringBuffer();
					sqlStr.append("delete from "+stoId+" where ");
					JSONObject jsObj = delSave.getJSONObject(i);
					for (Object keyStr : jsObj.keySet()) {
						String key =  (String) keyStr;
						//驼峰列名转换成下划线列名
						String keyVal = new BeanUtils().underline(new StringBuffer(key)).toString();
						sqlStr.append(" "+keyVal+"=#{"+keyVal+"}");
						sqlMap.put(keyVal, (String) jsObj.get(key));
					}
					sqlMap.put("deleteSql", sqlStr.toString());
					F_CODE = baseCommonGridMapper.deleteCommonTable(sqlMap);
				}
			}
		}
		return F_CODE;
	}
}
