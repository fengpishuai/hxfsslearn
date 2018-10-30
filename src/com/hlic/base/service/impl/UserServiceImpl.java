package com.hlic.base.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.dao.mapper.SysUserMapper;
import com.hlic.base.dao.mapper.SysuserMapperCustom;
import com.hlic.base.dao.mapper.UsergysMapper;
import com.hlic.base.dao.mapper.UserjdMapper;
import com.hlic.base.dao.mapper.UseryyMapper;
import com.hlic.base.pojo.po.SysUser;
import com.hlic.base.pojo.po.SysUserExample;
import com.hlic.base.pojo.po.SysUserExample.Criteria;
import com.hlic.base.pojo.po.Usergys;
import com.hlic.base.pojo.po.UsergysExample;
import com.hlic.base.pojo.po.Userjd;
import com.hlic.base.pojo.po.UserjdExample;
import com.hlic.base.pojo.po.Useryy;
import com.hlic.base.pojo.po.UseryyExample;
import com.hlic.base.pojo.vo.SysuserCustom;
import com.hlic.base.pojo.vo.SysuserQueryVo;
import com.hlic.base.process.context.Config;
import com.hlic.base.process.result.ResultUtil;
import com.hlic.base.service.UserService;
import com.hlic.utils.UUIDBuild;
import com.hlic.utils.paginator.domain.PageList;


public class UserServiceImpl extends BaseServiceImpl implements UserService {

	// 注入 mapper
	@Autowired
	private SysUserMapper sysUserMapper;

	// 根据账号查询用户方法
	public SysUser findSysuserByUserid(String userId) throws Exception {
		SysUserExample sysuserExample = new SysUserExample();
		SysUserExample.Criteria criteria = sysuserExample.createCriteria();
		// 设置查询条件，根据账号查询
		criteria.andUsrUsridEqualTo(userId);
		List<SysUser> list = sysUserMapper.selectByExample(sysuserExample);

		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

    public void insertselective(SysUser sysuser) throws Exception {
        sysUserMapper.insertSelective(sysuser);
    }

    public void updateSysuser(SysUser[] sysuser) throws Exception {
        int code = 1;
        for (SysUser sysuser2 : sysuser) {
            code = sysUserMapper.updateByPrimaryKeySelective(sysuser2);
        }
        if(code != 1){
            ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 213, null));
        }
    }
    
    @SuppressWarnings("unchecked")
    public PageList<SysUser> getAll(int pageIndex, int pageSize) throws Exception {
        return (PageList<SysUser>) getPageList(SysUserMapper.class, "selectByExample",null, pageIndex, pageSize);
    }

	public List<SysUser> selectUseridAndPassword(String userId, String password) {
		SysUserExample sysUserExample = new SysUserExample();
		Criteria criteria = sysUserExample.createCriteria();
		criteria.andUsrUsridEqualTo(userId);
		criteria.andUsrPasswordEqualTo(password);
		return sysUserMapper.selectByExample(sysUserExample);
	}
}
