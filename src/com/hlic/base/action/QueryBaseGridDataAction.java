package com.hlic.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.pojo.po.DctEnum;
import com.hlic.base.pojo.po.DofDicts;
import com.hlic.base.pojo.po.DofStores;
import com.hlic.base.pojo.po.SysApplications;
import com.hlic.base.pojo.po.SysFuncGrp;
import com.hlic.base.pojo.vo.StoParamVo;
import com.hlic.base.service.QueryBaseGridService;

@Controller
@RequestMapping("queryBase")
public class QueryBaseGridDataAction {

	@Autowired
	private QueryBaseGridService queryBaseGridService;
	
	//查询菜单数据
	@RequestMapping("/queryDctEnumList")
    public @ResponseBody List<DctEnum> queryDctEnumList(@RequestBody String inputJson) throws Exception{
		List<DctEnum> list = queryBaseGridService.queryDctEnumList(inputJson);
        return list;
    }
	
	//查询系统应用
	@RequestMapping("/querySysApplicationsList")
    public @ResponseBody List<SysApplications> querySysApplicationsList() throws Exception{
		List<SysApplications> list = queryBaseGridService.querySysApplicationsList();
        return list;
    }
	//从dofdicts中查询字典属性
	@RequestMapping("/queryDofDictsList")
    public @ResponseBody List<DofDicts> queryDofDictsList(@RequestBody String inputJson) throws Exception{
		List<DofDicts> list = queryBaseGridService.queryDofDictsList(inputJson);
        return list;
    }
	//从dofstores中查询存储表属性
	@RequestMapping("/queryDofStoresList")
    public @ResponseBody List<DofStores> queryDofStoresList(@RequestBody String inputJson) throws Exception{
		List<DofStores> list = queryBaseGridService.queryDofStoresList(inputJson);
        return list;
    }
	//查询存储表属性
	@RequestMapping("/queryDofStoresParam")
    public @ResponseBody List<StoParamVo> queryDofStoresParam(@RequestBody String inputJson) throws Exception{
		List<StoParamVo> list = queryBaseGridService.queryDofStoresParam(inputJson);
        return list;
    }
	//查询存储表列属性
	@RequestMapping("/queryDofStoreColsFieldParam")
    public @ResponseBody List<StoParamVo> queryDofStoreColsFieldParam(@RequestBody String inputJson) throws Exception{
		List<StoParamVo> list = queryBaseGridService.queryDofStoreColsFieldParam(inputJson);
        return list;
    }
	
	//查询字典表属性
	@RequestMapping("/queryDofDictsParam")
    public @ResponseBody List<StoParamVo> queryDofDictsParam(@RequestBody String inputJson) throws Exception{
		List<StoParamVo> list = queryBaseGridService.queryDofDictsParam(inputJson);
        return list;
    }
	
	//查询字典列属性
	@RequestMapping("/queryDofDctColsFieldParam")
    public @ResponseBody List<StoParamVo> queryDofDctColsFieldParam(@RequestBody String inputJson) throws Exception{
		List<StoParamVo> list = queryBaseGridService.queryDofDctColsFieldParam(inputJson);
        return list;
    }
	
	//查询系统应用
	@RequestMapping("/querySysFuncGridList")
    public @ResponseBody List<SysFuncGrp> querySysFuncGridList() throws Exception{
		List<SysFuncGrp> list = queryBaseGridService.querySysFuncGrpList();
        return list;
    }
}
