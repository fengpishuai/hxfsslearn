package com.hlic.base.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.hlic.base.pojo.po.DctEnum;
import com.hlic.base.pojo.po.DofDicts;
import com.hlic.base.pojo.po.DofStores;
import com.hlic.base.pojo.po.SysApplications;
import com.hlic.base.pojo.po.SysFuncGrp;
import com.hlic.base.pojo.vo.StoParamVo;


public interface QueryBaseGridService {

	//查询枚举字典数据
	public List<DctEnum> queryDctEnumList(String inputJson);
	//查询系统引用数据
	public List<SysApplications> querySysApplicationsList();
	//
	public List<DofDicts> queryDofDictsList(String inputJson);
	
	public List<DofStores> queryDofStoresList(String inputJson);
	//
	public List<StoParamVo> queryDofStoresParam(String inputJson) throws Exception;
	
	public List<StoParamVo> queryDofStoreColsFieldParam(String inputJson) throws Exception;
	
	List<StoParamVo> queryDofDictsParam(String inputJson) throws Exception;
	
	public List<StoParamVo> queryDofDctColsFieldParam(String inputJson) throws Exception;
	//查询功能所属分组
	public List<SysFuncGrp> querySysFuncGrpList();
}
