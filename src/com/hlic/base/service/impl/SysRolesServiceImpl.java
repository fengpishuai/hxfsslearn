package com.hlic.base.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.hlic.base.dao.mapper.SysRolesMapper;
import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysRoles;
import com.hlic.base.service.SysRolesService;
import com.hlic.utils.paginator.domain.PageList;

public class SysRolesServiceImpl extends BaseServiceImpl implements SysRolesService {

	@Autowired
	private SysRolesMapper sysRolesMapper;
	
	public PageList<SysRoles> getAll(int pageIndex, int pageSize,
			Object sqlParameter) throws Exception {
		return (PageList<SysRoles>) getPageList(SysRolesMapper.class, "querySysRolesList",sqlParameter, pageIndex, pageSize);
	}
	
	@SuppressWarnings("unchecked")
	public int upDataSysRolesGrid(String jsonObject) {
		int F_CODE = 0;
		List<SysRoles> list = new ArrayList<SysRoles>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray editSave = (JSONArray) saveData.get("editSave");
			//更新行
			list = (List<SysRoles>) JSONArray.toCollection(editSave,SysRoles.class);
			if(list.size() > 0){
				for(SysRoles sysRoles : list){
					F_CODE = sysRolesMapper.updateByPrimaryKeySelective(sysRoles);
				}
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray newSave = (JSONArray) saveData.get("newSave");
			list = (List<SysRoles>) JSONArray.toCollection(newSave,SysRoles.class);
			//新增行
			if(list.size() > 0){
				for(SysRoles sysRoles : list){
					F_CODE = sysRolesMapper.insertSelective(sysRoles);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray delSave = (JSONArray) saveData.get("delSave");
			//删除行
			list = (List<SysRoles>) JSONArray.toCollection(delSave,SysRoles.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					F_CODE = sysRolesMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}

}
