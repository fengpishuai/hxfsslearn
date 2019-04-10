package com.hlic.base.service;

import java.util.List;

import net.sf.json.JSONObject;

import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysUserRoleFunc;
import com.hlic.utils.paginator.domain.PageList;

public interface SysFuncService {
	PageList<SysFunc> getAll(int pageIndex, int pageSize,Object sqlParameter) throws Exception;
	int insertByBatch(List<SysFunc> sysfunclist);
	int addSysFuncRecordBatch(List<SysFunc> list);
	int upDataSysFuncGrid(String jsonObject);
	List<SysUserRoleFunc> getSysUserRoleFuncList(String userId, String fRoleId) throws Exception;
	int upDataSysFuncRoles(String requestJson) throws Exception;
}
