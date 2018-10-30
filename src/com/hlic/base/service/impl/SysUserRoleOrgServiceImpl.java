package com.hlic.base.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.hlic.base.dao.mapper.SysRolesMapper;
import com.hlic.base.dao.mapper.SysUserRoleOrgMapper;
import com.hlic.base.pojo.po.SysRoles;
import com.hlic.base.pojo.po.SysUserRoleOrg;
import com.hlic.base.service.SysUserRoleOrgService;
import com.hlic.utils.paginator.domain.PageList;

public class SysUserRoleOrgServiceImpl extends BaseServiceImpl implements SysUserRoleOrgService {

	@Autowired
	private SysUserRoleOrgMapper sysUserRoleOrgMapper;
	
	public PageList<SysUserRoleOrg> getAll(int pageIndex, int pageSize,
			Object sqlParameter) throws Exception {
		return (PageList<SysUserRoleOrg>) getPageList(SysUserRoleOrgMapper.class, "querySysUserRoleOrgList",sqlParameter, pageIndex, pageSize);
	}

	public int upDataSysUserRoleOrgGrid(String jsonObject) throws Exception {
		int F_CODE = 0;
		List<SysUserRoleOrg> list = new ArrayList<SysUserRoleOrg>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray editSave = (JSONArray) saveData.get("editSave");
			//更新行
			list = (List<SysUserRoleOrg>) JSONArray.toCollection(editSave,SysUserRoleOrg.class);
			if(list.size() > 0){
				for(SysUserRoleOrg sysUserRoleOrg : list){
					F_CODE = sysUserRoleOrgMapper.updateByPrimaryKeySelective(sysUserRoleOrg);
				}
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray newSave = (JSONArray) saveData.get("newSave");
			list = (List<SysUserRoleOrg>) JSONArray.toCollection(newSave,SysUserRoleOrg.class);
			//新增行
			if(list.size() > 0){
				for(SysUserRoleOrg sysUserRoleOrg : list){
					F_CODE = sysUserRoleOrgMapper.insertSelective(sysUserRoleOrg);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray delSave = (JSONArray) saveData.get("delSave");
			//删除行
			list = (List<SysUserRoleOrg>) JSONArray.toCollection(delSave,SysUserRoleOrg.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					F_CODE = sysUserRoleOrgMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}

}
