package com.hlic.base.service;

import com.hlic.base.pojo.po.SysUserRoleOrg;
import com.hlic.utils.paginator.domain.PageList;

public interface SysUserRoleOrgService {
	PageList<SysUserRoleOrg> getAll(int pageIndex, int pageSize, Object sqlParameter) throws Exception;
	int upDataSysUserRoleOrgGrid(String jsonObject) throws Exception;
}
