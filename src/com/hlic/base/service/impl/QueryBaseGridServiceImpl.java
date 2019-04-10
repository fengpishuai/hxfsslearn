package com.hlic.base.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.dao.DctEnumMapper;
import com.hlic.base.dao.DofDctColsMapper;
import com.hlic.base.dao.DofDictsMapper;
import com.hlic.base.dao.DofStoreColsMapper;
import com.hlic.base.dao.DofStoresMapper;
import com.hlic.base.dao.SysApplicationsMapper;
import com.hlic.base.dao.SysFuncGrpMapper;
import com.hlic.base.pojo.po.DctEnum;
import com.hlic.base.pojo.po.DctEnumExample;
import com.hlic.base.pojo.po.DofDctCols;
import com.hlic.base.pojo.po.DofDctColsExample;
import com.hlic.base.pojo.po.DofDicts;
import com.hlic.base.pojo.po.DofDictsExample;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.po.DofStoreColsExample;
import com.hlic.base.pojo.po.DofStores;
import com.hlic.base.pojo.po.DofStoresExample;
import com.hlic.base.pojo.po.SysApplications;
import com.hlic.base.pojo.po.SysApplicationsExample;
import com.hlic.base.pojo.po.SysFuncGrp;
import com.hlic.base.pojo.po.SysFuncGrpExample;
import com.hlic.base.pojo.po.SysFuncGrpExample.Criteria;
import com.hlic.base.pojo.vo.GridVo;
import com.hlic.base.pojo.vo.StoParamVo;
import com.hlic.base.service.QueryBaseGridService;

public class QueryBaseGridServiceImpl implements QueryBaseGridService {

	@Autowired
	private DctEnumMapper dctEnumMapper;
	
	@Autowired
	private SysApplicationsMapper sysApplicationsMapper;
	
	@Autowired
	private DofDictsMapper dofDictsMapper;
	
	@Autowired
	private DofDctColsMapper dofDctColsMapper;
	
	@Autowired
	private DofStoresMapper dofStoresMapper;
	
	@Autowired
	private DofStoreColsMapper dofStoreColsMapper;
	
	@Autowired
	private SysFuncGrpMapper sysFuncGrpMapper;
	
	/**
	 * 根据父节点查询枚举数据
	 */
	@Override
	public List<DctEnum> queryDctEnumList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String parentId = (String) inputData.get("parentId");
		DctEnumExample dctEnumExample = new DctEnumExample();
		DctEnumExample.Criteria criteria = dctEnumExample.createCriteria();
		criteria.andFParentEqualTo(parentId);
		return dctEnumMapper.selectByExample(dctEnumExample);
	}

	//查询系统应用
	@Override
	public List<SysApplications> querySysApplicationsList() {
		SysApplicationsExample sysApplicationsExample = new SysApplicationsExample();
		SysApplicationsExample.Criteria criteria = sysApplicationsExample.createCriteria();
		return sysApplicationsMapper.selectByExample(sysApplicationsExample);
	}

	//查询系统中字典
	@Override
	public List<DofDicts> queryDofDictsList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctOwnerBa = (String) inputData.get("dctOwnerBa");
		DofDictsExample dofDictsExample = new DofDictsExample();
		DofDictsExample.Criteria criteria = dofDictsExample.createCriteria();
		criteria.andDctOwnerBaEqualTo(dctOwnerBa);
		return dofDictsMapper.selectByExample(dofDictsExample);
	}

	/**
	 * queryDofStoresParam
	 * 获取stores属性
	 */
	@Override
	public List<StoParamVo> queryDofStoresParam(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		List<StoParamVo> stoParamVoList = new ArrayList<StoParamVo>();
		DofStores model = new DofStores();
		Field[] field = model.getClass().getDeclaredFields();
		//查询列(从  Dof_Dct_Cols中查询DOF_STORES列)
		DofDctColsExample dofDctColsExample = new DofDctColsExample();
		dofDctColsExample.setOrderByClause("col_disp_order asc");
		DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
		criteria.andDctIdEqualTo("DOF_STORES");
		List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample); 
		//查询行值(从Dof_Stores中查询store存储表的属性)
		DofStoresExample dofStoresExample = new DofStoresExample();
		DofStoresExample.Criteria criteria1 = dofStoresExample.createCriteria();
		criteria1.andStoIdEqualTo(stoId);
		List<DofStores> dofStoresList = dofStoresMapper.selectByExample(dofStoresExample);
		for(DofStores dofStores : dofStoresList){
			model = dofStores;
		}
		for(DofDctCols dofDctCols : dofDctColsList){
			for(int j=0; j<field.length; j++){
				String colStr = dofDctCols.getColId().replace("_", "").toUpperCase();
				String fieldStr = field[j].getName().toUpperCase();
                if(fieldStr.equals(colStr)){
                	String name = field[j].getName(); // 获取属性的名字  
                    name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法  
                    String type = field[j].getGenericType().toString(); // 获取属性的类型  
                    if (type.equals("class java.lang.String")) { // 如果type是类类型，则前面包含"class  
                                                                    // "，后面跟类名  
                        Method m = model.getClass().getMethod("get" + name);  
                        String value = (String) m.invoke(model); // 调用getter方法获取属性值  
                        if (value != null) {  
                        	StoParamVo stoParamVo = new StoParamVo();
                           //String content = value + "\t";  
                        	stoParamVo.setF_TASK_KEY(name);
                        	stoParamVo.setF_TASK_TITLE(dofDctCols.getColCaption());
                        	stoParamVo.setF_TASK_VALUE(value);
                        	stoParamVoList.add(stoParamVo);
                        }  
                    }  
				}
			}
		}
		return stoParamVoList;
	}

	/**
	 * queryDofStoreColsFieldParam
	 * 查询存储表列属性
	 */
	@Override
	public List<StoParamVo> queryDofStoreColsFieldParam(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		String colId = (String) inputData.get("colId");
		String[] arr = new String[]{"COLDEFAULT","COLEDITSTYLE","COLEDITMASK","COLSHOWMASK","COLCALC","COLEXP","COLRCALC","COLREXP","COLVALI","COLVALIEXP","COLVALIMSG","COLREG","COLREGEXP","COLREGMSG","COLEDITABLE"};
		List<StoParamVo> stoParamVoList = new ArrayList<StoParamVo>();
		DofStoreCols model = new DofStoreCols();
		Field[] field = model.getClass().getDeclaredFields();
		//查询列(从  Dof_Dct_Cols中查询DOF_STORE_COLS列)
		DofDctColsExample dofDctColsExample = new DofDctColsExample();
		dofDctColsExample.setOrderByClause("col_disp_order asc");
		DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
		criteria.andDctIdEqualTo("DOF_STORE_COLS");
		List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample); 
		//查询行值(从 dof_store_cols中查询存储表列属性)
		DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
		DofStoreColsExample.Criteria criteria1 = dofStoreColsExample.createCriteria();
		criteria1.andStoIdEqualTo(stoId);
		criteria1.andColIdEqualTo(colId);
		List<DofStoreCols> dofStoreColsList = dofStoreColsMapper.selectByExample(dofStoreColsExample);
		for(DofStoreCols dofStoreCols : dofStoreColsList){
			model = dofStoreCols;
		}
		StoParamVo stoParam = new StoParamVo();
		stoParam.setF_TASK_KEY("");
		stoParam.setF_TASK_TITLE("字段名");
		stoParam.setF_TASK_VALUE(colId);
		stoParamVoList.add(stoParam);
		for(DofDctCols dofDctCols : dofDctColsList){
			for(int j=0; j<field.length; j++){
				String colStr = dofDctCols.getColId().replace("_", "").toUpperCase();
				String fieldStr = field[j].getName().toUpperCase();
                if(fieldStr.equals(colStr) && Arrays.asList(arr).contains(fieldStr)){
                	String name = field[j].getName(); // 获取属性的名字  
                    name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法  
                    String type = field[j].getGenericType().toString(); // 获取属性的类型  
                    if (type.equals("class java.lang.String")) { // 如果type是类类型，则前面包含"class  
                                                                    // "，后面跟类名  
                        Method m = model.getClass().getMethod("get" + name);  
                        String value = (String) m.invoke(model); // 调用getter方法获取属性值  
                        if (value != null) {  
                        	StoParamVo stoParamVo = new StoParamVo();
                           //String content = value + "\t";  
                        	stoParamVo.setF_TASK_KEY(name);
                        	stoParamVo.setF_TASK_TITLE(dofDctCols.getColCaption());
                        	stoParamVo.setF_TASK_VALUE(value);
                        	stoParamVoList.add(stoParamVo);
                        }  
                    }  
				}
			}
		}
		return stoParamVoList;
	}
	
	/**
	 * queryDofDictsParam
	 * 获取stores属性
	 */
	@Override
	public List<StoParamVo> queryDofDictsParam(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("dctId");
		List<StoParamVo> stoParamVoList = new ArrayList<StoParamVo>();
		DofDicts model = new DofDicts();
		Field[] field = model.getClass().getDeclaredFields();
		//查询列(从  Dof_Dct_Cols中查询DOF_STORES列)
		DofDctColsExample dofDctColsExample = new DofDctColsExample();
		dofDctColsExample.setOrderByClause("col_disp_order asc");
		DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
		criteria.andDctIdEqualTo("DOF_DICTS");
		List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample); 
		//查询行值(从Dof_Stores中查询store存储表的属性)
		DofDictsExample dofDictsExample = new DofDictsExample();
		com.hlic.base.pojo.po.DofDictsExample.Criteria criteria1 = dofDictsExample.createCriteria();
		criteria1.andDctIdEqualTo(dctId);
		List<DofDicts> dofDictsList = dofDictsMapper.selectByExample(dofDictsExample);
		for(DofDicts dofDicts : dofDictsList){
			model = dofDicts;
		}
		for(DofDctCols dofDctCols : dofDctColsList){
			for(int j=0; j<field.length; j++){
				String colStr = dofDctCols.getColId().replace("_", "").toUpperCase();
				String fieldStr = field[j].getName().toUpperCase();
                if(fieldStr.equals(colStr)){
                	String name = field[j].getName(); // 获取属性的名字  
                    name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法  
                    String type = field[j].getGenericType().toString(); // 获取属性的类型  
                    if (type.equals("class java.lang.String")) { // 如果type是类类型，则前面包含"class  
                                                                    // "，后面跟类名  
                        Method m = model.getClass().getMethod("get" + name);  
                        String value = (String) m.invoke(model); // 调用getter方法获取属性值  
                        if (value != null) {  
                        	StoParamVo stoParamVo = new StoParamVo();
                           //String content = value + "\t";  
                        	stoParamVo.setF_TASK_KEY(name);
                        	stoParamVo.setF_TASK_TITLE(dofDctCols.getColCaption());
                        	stoParamVo.setF_TASK_VALUE(value);
                        	stoParamVoList.add(stoParamVo);
                        }  
                    }  
				}
			}
		}
		return stoParamVoList;
	}
	
	/**
	 * queryDofDctColsFieldParam
	 * 查询字典列属性
	 */
	@Override
	public List<StoParamVo> queryDofDctColsFieldParam(String inputJson) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String dctId = (String) inputData.get("dctId");
		String colId = (String) inputData.get("colId");
		String[] arr = new String[]{"COLDEFAULT","COLEDITSTYLE","COLEDITMASK","COLSHOWMASK","COLCALC","COLEXP","COLRCALC",
				"COLREXP","COLVALI","COLVALIEXP","COLVALIMSG","COLREG","COLREGEXP","COLREGMSG","COLEDITABLE"};
		List<StoParamVo> stoParamVoList = new ArrayList<StoParamVo>();
		DofDctCols model = new DofDctCols();
		Field[] field = model.getClass().getDeclaredFields();
		//查询列(从  Dof_Dct_Cols中查询DOF_STORE_COLS列)
		DofDctColsExample dofDctColsExample = new DofDctColsExample();
		dofDctColsExample.setOrderByClause("col_disp_order asc");
		DofDctColsExample.Criteria criteria = dofDctColsExample.createCriteria();
		criteria.andDctIdEqualTo("DOF_DCT_COLS");
		List<DofDctCols> dofDctColsList = dofDctColsMapper.selectByExample(dofDctColsExample); 
		//查询行值(从 dof_store_cols中查询存储表列属性)
		DofDctColsExample dofDctColsParam = new DofDctColsExample();
		com.hlic.base.pojo.po.DofDctColsExample.Criteria dctCriteria = dofDctColsParam.createCriteria();
		dctCriteria.andDctIdEqualTo(dctId);
		dctCriteria.andColIdEqualTo(colId);
		List<DofDctCols> dofDctColsList1 = dofDctColsMapper.selectByExample(dofDctColsParam);
		for(DofDctCols dofDctCols1 : dofDctColsList1){
			model = dofDctCols1;
		}
		StoParamVo stoParam = new StoParamVo();
		stoParam.setF_TASK_KEY("");
		stoParam.setF_TASK_TITLE("字段名");
		stoParam.setF_TASK_VALUE(colId);
		stoParamVoList.add(stoParam);
		for(DofDctCols dofDctCols : dofDctColsList1){
			for(int j=0; j<field.length; j++){
				String colStr = dofDctCols.getColId().replace("_", "").toUpperCase();
				String fieldStr = field[j].getName().toUpperCase();
                if(fieldStr.equals(colStr) && Arrays.asList(arr).contains(fieldStr)){
                	String name = field[j].getName(); // 获取属性的名字  
                    name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法  
                    String type = field[j].getGenericType().toString(); // 获取属性的类型  
                    if (type.equals("class java.lang.String")) { // 如果type是类类型，则前面包含"class  
                                                                    // "，后面跟类名  
                        Method m = model.getClass().getMethod("get" + name);  
                        String value = (String) m.invoke(model); // 调用getter方法获取属性值  
                        if (value != null) {  
                        	StoParamVo stoParamVo = new StoParamVo();
                           //String content = value + "\t";  
                        	stoParamVo.setF_TASK_KEY(name);
                        	stoParamVo.setF_TASK_TITLE(dofDctCols.getColCaption());
                        	stoParamVo.setF_TASK_VALUE(value);
                        	stoParamVoList.add(stoParamVo);
                        }  
                    }  
				}
			}
		}
		return stoParamVoList;
	}

	/**
	 * 根据stoId查询dofStores中数据
	 */
	@Override
	public List<DofStores> queryDofStoresList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoOwnerBa = (String) inputData.get("stoOwnerBa");
		DofStoresExample dofStoresExample = new DofStoresExample();
		DofStoresExample.Criteria criteria = dofStoresExample.createCriteria();
		criteria.andStoOwnerBaEqualTo(stoOwnerBa);
		return dofStoresMapper.selectByExample(dofStoresExample);
	}

	@Override
	public List<SysFuncGrp> querySysFuncGrpList() {
		SysFuncGrpExample sysFuncGrpExample = new SysFuncGrpExample();
		Criteria criteria = sysFuncGrpExample.createCriteria();
		return sysFuncGrpMapper.selectByExample(sysFuncGrpExample);
	}
}
