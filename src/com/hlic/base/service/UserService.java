package com.hlic.base.service;


import java.util.List;

import com.hlic.base.pojo.po.SysUser;
import com.hlic.base.pojo.po.Usergys;
import com.hlic.base.pojo.po.Userjd;
import com.hlic.base.pojo.po.Useryy;
import com.hlic.base.pojo.vo.SysuserCustom;
import com.hlic.base.pojo.vo.SysuserQueryVo;
import com.hlic.utils.paginator.domain.PageList;

public interface UserService {

	public PageList<SysUser> getAll(int pageIndex, int pageSize) throws Exception;
	
	public List<SysUser> selectUseridAndPassword(String userId, String password);
}
