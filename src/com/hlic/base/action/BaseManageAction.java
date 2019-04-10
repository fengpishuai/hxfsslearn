package com.hlic.base.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.hlic.base.pojo.po.DofDctCols;
import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysRoles;
import com.hlic.base.pojo.po.SysUserRoleFunc;
import com.hlic.base.pojo.po.SysUserRoleOrg;
import com.hlic.base.pojo.vo.GridVo;
import com.hlic.base.pojo.vo.SysFuncExcampleVo;
import com.hlic.base.process.result.DataGridResultInfo;
import com.hlic.base.process.result.ResultInfo;
import com.hlic.base.service.BaseCommonGridService;
import com.hlic.base.service.DofStoreColsService;
import com.hlic.base.service.SysFuncGrpService;
import com.hlic.base.service.SysFuncService;
import com.hlic.base.service.SysMenusService;
import com.hlic.base.service.SysRolesService;
import com.hlic.base.service.SysUserRoleOrgService;
import com.hlic.utils.ExcelExportSXXSSF;
import com.hlic.utils.Ypxx;
import com.hlic.utils.paginator.domain.PageList;

@Controller
@RequestMapping("base")
public class BaseManageAction {

	@Autowired
	private SysMenusService sysMenusService;
	
	@Autowired
	private SysFuncService sysFuncService;
	
	@Autowired
	private SysRolesService sysRolesService;
	
	@Autowired
	private SysUserRoleOrgService sysUserRoleOrgService;
	
	@Autowired
	private DofStoreColsService dofStoreColsService;
	
	@Autowired
	private BaseCommonGridService baseCommonGridService;
	
	@Autowired
	private SysFuncGrpService sysFuncGrpService;
	
	@Autowired
	private ExcelExportSXXSSF excelExportSXXSSF;
	/*
	 * 菜单管理
	 */
	@RequestMapping("/sysmenus")
    public String sysmenus(Model model){
        return "/project/base/sysmenus";
    }
	/*
	 * 功能管理
	 */
	@RequestMapping("/sysfunc")
    public String sysfunc(Model model){
        return "/project/base/sysfunc";
    }
	/*
	 * sto配置管理
	 */
	@RequestMapping("/dof_store_cols")
    public String dofStoreCols(Model model){
        return "/project/base/dof_store_cols";
    }
	/**
	 * @Title: dofDctCols 
	 * @Description: 字典配置管理
	 * @param @param model
	 */
	@RequestMapping("/dof_dct_cols")
    public String dofDctCols(Model model){
        return "/project/base/dof_dct_cols";
    }
	
	/*
	 * 角色管理
	 */
	@RequestMapping("/sysroles")
    public String sysroles(Model model){
        return "/project/base/sysroles";
    }
	/*
	 * 角色帮助
	 */
	@RequestMapping("/sysroleshelp")
    public String sysRolesHelp(Model model){
        return "/project/help/syshelp/sysroleshelp";
    }
	/*
	 * 用户角色组织机构映射
	 */
	@RequestMapping("/sysuserroleorg")
    public String sysuserroleorg(Model model){
        return "/project/base/sysuserroleorg";
    }
	/*
	 * 系统功能权限管理
	 */
	@RequestMapping("/sysfuncroles")
    public String sysfuncroles(Model model){
        return "/project/base/sysfuncroles";
    }
	/*
	 * 系统用户管理
	 */
	@RequestMapping("/sysuser")
    public String sysuser(Model model){
        return "/project/base/sysuser";
    }
	
	/*
	 * 
	 */
	@RequestMapping("/baseCommonGrid")
    public String baseCommonGrid(Model model){
        return "/project/base/basecommonGrid";
    }
	
	/*
	 * store存储表管理
	 */
	@RequestMapping("/baseDataManage")
    public String baseDataManage(Model model){
        return "/project/base/baseDataManage";
    }
	
	/*
	 * store存储表管理
	 */
	@RequestMapping("/storeManage")
    public String storeManage(Model model){
        return "/project/base/storeManage";
    }
	/*
	 * dct字典表管理
	 */
	@RequestMapping("/dctManage")
    public String dctManage(Model model){
        return "/project/base/dctManage";
    }
	//创建DCT表
	@RequestMapping("/createDct")
    public String createDct(Model model){
        return "/project/base/createDct";
    }
	//创建Store表
	@RequestMapping("/createStore")
    public String createStore(Model model){
        return "/project/base/createStore";
    }
	/*
	 * dct_enum枚举字典
	 */
	@RequestMapping("/dct_enum")
    public String dct_enum(Model model){
        return "/project/base/dct_enum";
    }
	/*
	 * sys_func_grp功能所属分组
	 */
	@RequestMapping("/sysFuncGrp")
    public String sysFuncGrp(Model model){
        return "/project/base/SYS_FUNC_GRP";
    }
	/*
	 * SQL条件配置
	 */
	@RequestMapping("/WD_RPTQUERY_FILTER")
    public String wdRptQueryFilter(Model model){
        return "/project/base/WD_RPTQUERY_FILTER";
    }
	/*
	 * 业务报表配置
	 */
	@RequestMapping("/WD_RPTQUERY_CONF")
    public String wdRptQueryConf(Model model){
        return "/project/base/WD_RPTQUERY_CONF";
    }
	//查询菜单数据
	@RequestMapping("/querySysMenusListA")
    public @ResponseBody DataGridResultInfo querySysMenusListA(int page,int rows,String fMenuId) throws Exception{
		SysMenus sqlParameter = new SysMenus();
		if(fMenuId==null){
			sqlParameter.setfParent("1");
		}else{
			sqlParameter.setfParent(fMenuId);
		}
		
		PageList<SysMenus> list = sysMenusService.getAll(page, rows, sqlParameter);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
	//查询菜单数据
	@RequestMapping("/querySysMenusListB")
    public @ResponseBody List<SysMenus> querySysMenusListB() throws Exception{
		List<SysMenus> list = sysMenusService.findSysMenusList();
        return list;
    }
	//更新菜单数据
	@RequestMapping("/upDataSysMenusGrid")
    public @ResponseBody ResultInfo upDataSysMenusGrid(@RequestBody String sysFuncJson) throws Exception{
		int F_CODE = sysMenusService.upDataSysMenusGrid(sysFuncJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	
	//查询功能数据
	@RequestMapping("/querySysFuncList")
    public @ResponseBody DataGridResultInfo querySysFuncList(int page,int rows,String fAppId) throws Exception{
		SysFunc sqlParameter = new SysFunc();
		sqlParameter.setfAppId("1");
		PageList<SysFunc> list = sysFuncService.getAll(page, rows, sqlParameter);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
	//插入功能管理数据
	@RequestMapping("/insertBatchSysFunc")
    public @ResponseBody ResultInfo insertByBatch(@RequestBody String sysFuncJson) throws Exception{
		int F_CODE = sysFuncService.upDataSysFuncGrid(sysFuncJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/*
	 * 查询角色管理数据
	 */
	@RequestMapping("/querySysRolesList")
    public @ResponseBody DataGridResultInfo querySysRolesList(int page,int rows,String fAppId) throws Exception{
		SysFunc sqlParameter = new SysFunc();
		PageList<SysRoles> list = sysRolesService.getAll(page, rows, sqlParameter);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
	//插入角色管理数据
	@RequestMapping("/insertBatchSysRoles")
    public @ResponseBody ResultInfo insertBatchSysRoles(@RequestBody String sysRolesJson) throws Exception{
		int F_CODE = sysRolesService.upDataSysRolesGrid(sysRolesJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/*
	 * 查询用户角色组织机构数据
	 */
	@RequestMapping("/querySysUserRoleOrgList")
    public @ResponseBody DataGridResultInfo querySysUserRoleOrgList(int page,int rows,String fAppId) throws Exception{
		SysUserRoleOrg sqlParameter = new SysUserRoleOrg();
		PageList<SysUserRoleOrg> list = sysUserRoleOrgService.getAll(page, rows, sqlParameter);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
	/*
	 * 插入用户角色组织机构数据
	 */
	@RequestMapping("/upDataSysUserRoleOrgGrid")
    public @ResponseBody ResultInfo upDataSysUserRoleOrgGrid(@RequestBody String sysUserRoleOrgJson) throws Exception{
		int F_CODE = sysUserRoleOrgService.upDataSysUserRoleOrgGrid(sysUserRoleOrgJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/*
	 * 系统功能权限查询
	 */
	@RequestMapping("/querySysUserRoleFuncList")
    public @ResponseBody DataGridResultInfo querySysUserRoleFuncList(int page,int rows,String fUserId, String fRoleId, String fFuncName) throws Exception{
		SysFunc sqlParameter = new SysFunc();
		if(fFuncName != null &&  !"".equals(fFuncName)){
			sqlParameter.setfMc(fFuncName);
		}
		boolean flag = false;
		List<SysFuncExcampleVo> sysFuncExcampleVoList = new ArrayList<SysFuncExcampleVo>();
		//获取系统功能管理所有数据
		PageList<SysFunc> sysFuncList = sysFuncService.getAll(page, rows, sqlParameter);
		//根据用户ID或者角色ID查询系统用户角色功能表
		List<SysUserRoleFunc> sysUserRoleFuncList = sysFuncService.getSysUserRoleFuncList(fUserId, fRoleId);
		for(SysFunc sysFunc : sysFuncList){
			SysFuncExcampleVo sysFuncExcampleVo = new SysFuncExcampleVo();
			flag = false;
			if(sysUserRoleFuncList != null){
				for(SysUserRoleFunc sysUserRoleFunc : sysUserRoleFuncList){
					if(sysUserRoleFunc.getfFuncid().equals(sysFunc.getfBh().toString())){
						flag = true;
					}
				}
			}
			sysFuncExcampleVo.setfBh(sysFunc.getfBh().toString());
			sysFuncExcampleVo.setfFuncName(sysFunc.getfMc());
			if(flag){
				sysFuncExcampleVo.setfDisable("Yes");
			}else{
				sysFuncExcampleVo.setfDisable("No");
			}
			sysFuncExcampleVoList.add(sysFuncExcampleVo);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(sysFuncList.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(sysFuncExcampleVoList);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(sysFuncList.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
	/*
	 * 系统功能权限数据保存
	 */
	@RequestMapping("/sysfuncrolessave")
    public @ResponseBody ResultInfo sysFuncRolesSave(@RequestBody String requestJson) throws Exception{
		int F_CODE = sysFuncService.upDataSysFuncRoles(requestJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/**
	 * @Title: queryDctColsList 
	 * @Description: 查询Dct列标题 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param Dct_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryDctColsList")
    public @ResponseBody GridVo<DofDctCols> queryDctColsList(@RequestBody String inputJson) throws Exception{
		GridVo<DofDctCols> gridVo = baseCommonGridService.queryDctColsList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: queryDctGridPageList 
	 * @Description: Dct分页功能 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param DCT_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryDctPageList")
    public @ResponseBody DataGridResultInfo queryDctPageList(int page,int rows,@RequestParam(value="DCT_ID", defaultValue ="") String DCT_ID,@RequestParam(value="SQL_Filter", defaultValue ="") String SQL_Filter,@RequestParam(value="SQL_Where", defaultValue ="") String SQL_Where) throws Exception{
        PageInfo<Map<String,Object>> baseCommonGridList = baseCommonGridService.queryDctGridPageList(page, rows, DCT_ID, SQL_Filter,SQL_Where);
       // baseCommonGridService.queryCommTableList();
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(baseCommonGridList.getPages());
        //填充  rows
        dataGridResultInfo.setRows(baseCommonGridList.getList());
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(baseCommonGridList.getTotal());
        return dataGridResultInfo;
    }
	/**
	 * @Title: queryStoreColsList 
	 * @Description: 查询dofstorecols中属性配置,store配置管理中使用
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryDofStoreColsParamList")
    public @ResponseBody GridVo queryDofStoreColsParamList(@RequestBody String inputJson) throws Exception{
		GridVo gridVo = baseCommonGridService.queryDofStoreColsParamList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: queryDofDctColsParamList 
	 * @Description: 查询dof_dct_cols中属性配置,dct配置管理中使用
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryDofDctColsParamList")
    public @ResponseBody GridVo queryDofDctColsParamList(@RequestBody String inputJson) throws Exception{
		GridVo gridVo = baseCommonGridService.queryDofDctColsParamList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: queryStoreColsList 
	 * @Description: 查询Store列标题
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryStoreColsList")
    public @ResponseBody GridVo queryStoreColsList(@RequestBody String inputJson) throws Exception{
		GridVo gridVo = baseCommonGridService.queryStoreColsList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: queryStoGridPageList 
	 * @Description: Store分页功能 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryStoGridPageList")
    public @ResponseBody DataGridResultInfo queryStoGridPageList(int page,int rows,@RequestParam(value="STO_ID", defaultValue ="") String STO_ID,@RequestParam(value="SQL_Filter", defaultValue ="") String SQL_Filter) throws Exception{
        PageInfo<Map<String,Object>> baseCommonGridList = baseCommonGridService.queryCommonGridPageList(page, rows, STO_ID, SQL_Filter);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(baseCommonGridList.getPages());
        //填充  rows
        dataGridResultInfo.setRows(baseCommonGridList.getList());
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(baseCommonGridList.getTotal());
        return dataGridResultInfo;
    }
	/**
	 * @Title: queryDofStoreColList 
	 * @Description: Dof_Store_Col分页功能 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryDofDctColsList")
    public @ResponseBody DataGridResultInfo queryDofDctColsList(int page,int rows,@RequestParam(value="STO_ID", defaultValue ="") String STO_ID,@RequestParam(value="SQL_Filter", defaultValue ="") String SQL_Filter) throws Exception{
        PageInfo<Map<String,Object>> baseCommonGridList = baseCommonGridService.queryCommonGridPageList(page, rows, STO_ID, SQL_Filter);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(baseCommonGridList.getPages());
        //填充  rows
        dataGridResultInfo.setRows(baseCommonGridList.getList());
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(baseCommonGridList.getTotal());
        return dataGridResultInfo;
    }
	/*
	 * 插入dof_store_cols构数据
	 */
	@RequestMapping("/upDataDofStoreColsGrid")
    public @ResponseBody ResultInfo upDataDofStoreColsGrid(@RequestBody String dofStoreColsJson) throws Exception{
		int F_CODE = dofStoreColsService.upDataDofStoreColsGrid(dofStoreColsJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	
	/**
	 * @Title: queryStoresList 
	 * @Description: Store公共分页功能 
	 * @param @param page 第几页
	 * @param @param rows 一页几条数据
	 * @param @param STO_ID 表名
	 * @param @param SQL_Filter 过滤条件
	 * @return DataGridResultInfo    返回类型 
 	 * @throws
	 **/
	@RequestMapping("/queryStoresList")
    public @ResponseBody DataGridResultInfo queryStoresList(int page,int rows,@RequestParam(value="STO_ID", defaultValue ="") String STO_ID,@RequestParam(value="SQL_Filter", defaultValue ="") String SQL_Filter) throws Exception{
		
		PageInfo<Map<String, Object>> baseCommonGridList = baseCommonGridService.queryTableDataList(page, rows, STO_ID, SQL_Filter);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(baseCommonGridList.getPages());
        //填充  rows
        dataGridResultInfo.setRows(baseCommonGridList.getList());
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(baseCommonGridList.getTotal());
        
        return dataGridResultInfo;
    }
	
	@RequestMapping("/setStoreData")
    public @ResponseBody ResultInfo setStoreData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.setStoreData(inputJson);
		//baseCommonGridService.queryStoreDataList(0,0,"");
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/**
	 * @Title: queryCreateStoreColsList 
	 * @Description: store创建器列属性数据查询 
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return GridVo<Map<String,Object>>    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/queryCreateStoreColsList")
    public @ResponseBody GridVo<JSONArray> queryCreateStoreColsList(@RequestBody String inputJson) throws Exception{
		GridVo<JSONArray> gridVo = baseCommonGridService.queryCreateStoreColsList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: queryCreateDctColsList 
	 * @Description: Dct创建器列属性查询
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return GridVo<JSONArray>    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/queryCreateDctColsList")
    public @ResponseBody GridVo<JSONArray> queryCreateDctColsList(@RequestBody String inputJson) throws Exception{
		GridVo<JSONArray> gridVo = baseCommonGridService.queryCreateDctColsList(inputJson);
        return gridVo;
    }
	/**
	 * @Title: createStoreData 
	 * @Description: store管理器创建实体
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return ResultInfo    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/createStoreData")
    public @ResponseBody ResultInfo createStoreData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.createStoreData(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/**
	 * @Title: createDctData 
	 * @Description: dct管理器创建实体
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return ResultInfo    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/createDctData")
    public @ResponseBody ResultInfo createDctData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.createDctData(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/**
	 * @Title: delStoreData 
	 * @Description: store管理器删除实体 
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return ResultInfo    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/delStoreData")
    public @ResponseBody ResultInfo delStoreData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.delStoreData(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	/**
	 * @Title: delDctData 
	 * @Description: dct管理器删除实体 
	 * @param @param inputJson
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return ResultInfo    返回类型 
	 * @throws 
	 *
	 */
	@RequestMapping("/delDctData")
    public @ResponseBody ResultInfo delDctData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.delDctData(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	@RequestMapping("/excelExport")
    public void excelExport(@RequestBody String inputJson) throws Exception{
		/**            导出文件存放物理路径
		 * @param fileWebPath
		 *            导出文件web下载路径
		 * @param filePrefix
		 *            导出文件名的前缀          
		 * @param flushRows
		 *            存放在内存的数据量
		 * @param fieldNames
		 *            导出文件列标题
		 * @param fieldCodes
		 * 			  导出数据对象的字段名称     
		 * @param flushRows*/
		//导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "d:/upload/linshi/";
		//导出文件的前缀
		String filePrefix="ypxx";
		//-1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows=1000;
		
		//指导导出数据的title
		List<String> fieldNames=new ArrayList<String>();
		fieldNames.add("流水号");
		fieldNames.add("通用名");
		fieldNames.add("价格");
		
		//告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes=new ArrayList<String>();
		fieldCodes.add("bm");//药品流水号
		fieldCodes.add("mc");//通用名
		fieldCodes.add("price");//价格
		
		
		
		//注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应
		
		
		//开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/", filePrefix, fieldNames, fieldCodes, flushRows);
		
		//准备导出的数据，将数据存入list，且list中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<Ypxx> list = new ArrayList<Ypxx>();
		for(int i=5800; i>0; i--){
			Ypxx ypxx1 = new Ypxx("001", "青霉素", 5);
			list.add(ypxx1);
		}
		
		//执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		//输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();
		
		System.out.println(webpath);
    }
	
	@RequestMapping("/saveSysFuncGrpData")
    public @ResponseBody ResultInfo saveSysFuncGrpData(@RequestBody String inputJson) throws Exception{
		int F_CODE = sysFuncGrpService.updateSysFuncGrp(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
    }
	
	
	@RequestMapping("/queryUniqueKeyValue")
    public @ResponseBody ResultInfo queryUniqueKeyValue(@RequestBody String inputJson) throws Exception{
		int F_CODE = ResultInfo.TYPE_RESULT_SUCCESS;
		String numLen = baseCommonGridService.queryUniqueKeyValue(inputJson);
		if("".equals(numLen)){
			F_CODE = ResultInfo.TYPE_RESULT_FAIL;
		}
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		resultInfo.setMessage(numLen);
		return resultInfo;
    }
	//sto和dct中查询唯一主键帮助信息
	@RequestMapping("/queryPkHelpList")
	public @ResponseBody List<Map<String, Object>> queryPkHelpList(@RequestBody String inputJson) throws Exception{
		return baseCommonGridService.queryPkHelpList(inputJson);
	}
	//
	@RequestMapping("/saveData")
	public @ResponseBody ResultInfo saveData(@RequestBody String inputJson) throws Exception{
		int F_CODE = baseCommonGridService.saveCommonTableData(inputJson);
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setType(F_CODE);
		return resultInfo;
	}
	 
}
