package com.hlic.base.service;

import java.util.List;

import com.hlic.base.pojo.po.SysMenus;
import com.hlic.utils.paginator.domain.PageList;

public interface SysMenusService {

	List<SysMenus> findSysMenusList();
	public List<SysMenus> querymenusList() throws Exception;
	public PageList<SysMenus> getAll(int pageIndex, int pageSize,Object sqlParameter) throws Exception;
	int insertSysMenus(SysMenus sysMenus);
	int addSysMenusRecordBatch(List<SysMenus> sysMenus);
	int upDataSysMenusGrid(String jsonObject) throws Exception;
}
