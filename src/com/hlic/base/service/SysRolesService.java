package com.hlic.base.service;

import com.hlic.base.pojo.po.SysRoles;
import com.hlic.utils.paginator.domain.PageList;

public interface SysRolesService {
	PageList<SysRoles> getAll(int pageIndex, int pageSize, Object sqlParameter) throws Exception;
	int upDataSysRolesGrid(String jsonObject) throws Exception;
}
