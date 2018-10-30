package com.hlic.base.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysMenus;

public interface CommonStoMapper {
	List<SysMenus> queryBaseCommonGridList();
	List<Map<String, Object>> queryCommonGridList(Map<String, String> map);
}
