package com.hlic.base.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.dao.mapper.SysFuncMapper;
import com.hlic.base.dao.mapper.SysUserRoleFuncMapper;
import com.hlic.base.dao.mapper.SysUserRoleOrgMapper;
import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysUserExample.Criteria;
import com.hlic.base.pojo.po.SysUserRoleFunc;
import com.hlic.base.pojo.po.SysUserRoleFuncExample;
import com.hlic.base.pojo.po.SysUserRoleOrg;
import com.hlic.base.pojo.po.SysUserRoleOrgExample;
import com.hlic.base.service.SysFuncService;
import com.hlic.utils.BeanUtils;
import com.hlic.utils.paginator.domain.PageList;


public class SysFuncServiceImpl extends BaseServiceImpl implements SysFuncService  {

	//判断是否走roleid逻辑
	private static String NOTPROCCESSROLE = "0";
	
	@Autowired
	private SysFuncMapper sysFuncMapper;
	
	@Autowired
	private SysUserRoleFuncMapper sysUserRoleFuncMapper;
	
	@Autowired
	private SysUserRoleOrgMapper sysUserRoleOrgMapper;
	
	public PageList<SysFunc> getAll(int pageIndex, int pageSize,
			Object sqlParameter) throws Exception {
		return (PageList<SysFunc>) getPageList(SysFuncMapper.class, "queryFuncList",sqlParameter, pageIndex, pageSize);
	}

	public int insertByBatch(List<SysFunc> sysfunclist) {
		return sysFuncMapper.insertByBatch(sysfunclist);
	}

	public int addSysFuncRecordBatch(List<SysFunc> list) {
		// TODO Auto-generated method stub
		return sysFuncMapper.addSysFuncRecordBatch(list);
	}

	@SuppressWarnings("unchecked")
	public int upDataSysFuncGrid(String jsonObject) {
		int F_CODE = 0;
		List<SysFunc> list = new ArrayList<SysFunc>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray preeditSave = (JSONArray) saveData.get("editSave");
			JSONArray editSave = BeanUtils.keyNameToHump(preeditSave);
			//更新行
			list = (List<SysFunc>) JSONArray.toCollection(editSave,SysFunc.class);
			if(list.size() > 0){
				for(SysFunc sysFunc : list){
					F_CODE = sysFuncMapper.updateByPrimaryKeySelective(sysFunc);
				}
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray prenewSave = (JSONArray) saveData.get("newSave");
			JSONArray newSave = BeanUtils.keyNameToHump(prenewSave);
			list = (List<SysFunc>) JSONArray.toCollection(newSave,SysFunc.class);
			//新增行
			if(list.size() > 0){
				for(SysFunc sysFunc : list){
					F_CODE = sysFuncMapper.insertSelective(sysFunc);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray predelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = BeanUtils.keyNameToHump(predelSave);
			//删除行
			list = (List<SysFunc>) JSONArray.toCollection(delSave,SysFunc.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					F_CODE = sysFuncMapper.deleteByPrimaryKey(Integer.parseInt(item.next().toString()));
				}
			}
		}
		return F_CODE;
	}

	/*
	 * 根据用户ID或者角色ID查询功能
	 */
	public List<SysUserRoleFunc> getSysUserRoleFuncList(String userId, String fRoleId) throws Exception {
		SysUserRoleFuncExample example = new SysUserRoleFuncExample();
		SysUserRoleFuncExample.Criteria criteria = example.createCriteria();
		List<SysUserRoleFunc> sysUserRoleFuncList = new ArrayList<SysUserRoleFunc>();
		//用户ID和是否禁用
		if(userId != "" && userId != null){
			criteria.andFUseridEqualTo(userId);
			criteria.andFDisableEqualTo("Yes");
			sysUserRoleFuncList = sysUserRoleFuncMapper.selectByExample(example);
		}
		//用户ID和是否禁用
		if(fRoleId != "" && fRoleId != null){
			criteria.andFRoleidEqualTo(fRoleId);
			criteria.andFDisableEqualTo("Yes");
			sysUserRoleFuncList = sysUserRoleFuncMapper.selectByExample(example);
		}
		return sysUserRoleFuncList;
	}
	/*
	 * 更新系统功能权限表（sys_user_role_func）
	 */
	public int upDataSysFuncRoles(String requestJson) throws Exception {
		JSONArray saveData = JSONArray.fromObject(requestJson);
		for(int i = 0; i<saveData.size(); i++){
			Map<String, Object> map = new HashMap<String, Object>();
			List<String> funcIdList = new ArrayList<String>();
			JSONObject userList = JSONObject.fromObject(saveData.get(i).toString());
			//List funcList = (List) JSONArray.toCollection((JSONArray) userList.get("funcList"));
			//获取功能数据列表
			JSONArray funcList = JSONArray.fromObject(userList.get("funcList"));
			//获取功能编号
			for(int j = 0; j < funcList.size(); j++){
				JSONObject func = JSONObject.fromObject(funcList.get(j));
				funcIdList.add(func.getString("fBh"));
			}
			//判断是已选用户还是已选角色[{"userId":"",funcList:[{"funcId":""},{"funcId":""}...]},]
			if(userList.get("roleId") == null){
				//获取用户id
				String userId = userList.get("userId").toString();
				this.updateOrInsertData(userId, NOTPROCCESSROLE, funcList, funcIdList);
				/*map.put("fUserid", userId);
				map.put("funcList", funcIdList);
				//1、根据用户Id和功能Id查询sys_user_role_func表中是否存在数据
				List<SysUserRoleFunc> userRoleList = sysUserRoleFuncMapper.selectByUserIdInFuncId(map);
				for(int j = 0; j < funcList.size(); j++){
					JSONObject func = JSONObject.fromObject(funcList.get(j));
					SysUserRoleFunc sysUserRoleFunc = new SysUserRoleFunc();
					String fBh = func.getString("fBh");
					String fDisable = func.getString("fDisable");
					//2、当步骤1查出数据走条件内
					if(userRoleList.size() > 0){
						for(int z = 0; z < userRoleList.size(); z++){
							//3、前台传来的和查出的数据进行比较如果有进行更新，如果没有进行插入
							if(userRoleList.get(z).getfFuncid().equals(fBh)){
								SysUserRoleFuncExample sysUserRoleFuncExample = new SysUserRoleFuncExample();
								SysUserRoleFuncExample.Criteria criteria = sysUserRoleFuncExample.createCriteria();
								criteria.andFUseridEqualTo(userId);
								criteria.andFFuncidEqualTo(fBh);
								sysUserRoleFunc.setfDisable(fDisable);
								sysUserRoleFuncMapper.updateByExampleSelective(sysUserRoleFunc, sysUserRoleFuncExample);
							}else{
								sysUserRoleFunc.setfUserid(userId);
								sysUserRoleFunc.setfFuncid(fBh);
								sysUserRoleFunc.setfDisable(fDisable);
								sysUserRoleFuncMapper.insertSelective(sysUserRoleFunc);
							}
						}
					}else{
						sysUserRoleFunc.setfUserid(userId);
						sysUserRoleFunc.setfFuncid(fBh);
						sysUserRoleFunc.setfDisable(fDisable);
						sysUserRoleFuncMapper.insertSelective(sysUserRoleFunc);
					}
				}*/
			}else{
				String roleId = userList.get("roleId").toString();
				SysUserRoleOrgExample sysUserRoleOrgExample = new SysUserRoleOrgExample();
				SysUserRoleOrgExample.Criteria criteria = sysUserRoleOrgExample.createCriteria();
				criteria.andFRoleIdEqualTo(roleId);
				List<SysUserRoleOrg> userRoleList = sysUserRoleOrgMapper.selectUserAndRoleByExample(sysUserRoleOrgExample);
				if(userRoleList.size() > 0){
					for(int g=0; g < userRoleList.size(); g++){
						//获取用户id
						String userId = userRoleList.get(g).getfUserId();
						this.updateOrInsertData(userId, roleId, funcList, funcIdList);
					}
				}
			}
		}
		return 0;
	}
	
	private void updateOrInsertData(String userId, String roleId, JSONArray funcList, List<String> funcIdList){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fUserid", userId);
		//如果roleId等于0不走role逻辑
		if(!roleId.equals(NOTPROCCESSROLE)){
			map.put("fRoleid", roleId);
		}
		map.put("funcList", funcIdList);
		//1、根据用户Id和功能Id查询sys_user_role_func表中是否存在数据
		List<SysUserRoleFunc> userFuncList = sysUserRoleFuncMapper.selectByUserIdInFuncId(map);
		for(int j = 0; j < funcList.size(); j++){
			boolean isInsert = true;
			JSONObject func = JSONObject.fromObject(funcList.get(j));
			SysUserRoleFunc sysUserRoleFunc = new SysUserRoleFunc();
			String fBh = func.getString("fBh");
			String fDisable = func.getString("fDisable");
			//2、当步骤1查出数据走条件内
			if(userFuncList.size() > 0){
				for(int z = 0; z < userFuncList.size(); z++){
					//3、前台传来的和查出的数据进行比较如果有进行更新，如果没有进行插入
					if(userFuncList.get(z).getfFuncid().equals(fBh)){
						SysUserRoleFuncExample sysUserRoleFuncExample = new SysUserRoleFuncExample();
						SysUserRoleFuncExample.Criteria criteria2 = sysUserRoleFuncExample.createCriteria();
						criteria2.andFUseridEqualTo(userId);
						criteria2.andFFuncidEqualTo(fBh);
						if(!roleId.equals(NOTPROCCESSROLE)){
							criteria2.andFRoleidEqualTo(roleId);
						}
						sysUserRoleFunc.setfDisable(fDisable);
						isInsert = false;
						sysUserRoleFuncMapper.updateByExampleSelective(sysUserRoleFunc, sysUserRoleFuncExample);
					}
				}
				if(isInsert){
					sysUserRoleFunc.setfUserid(userId);
					sysUserRoleFunc.setfFuncid(fBh);
					if(!roleId.equals(NOTPROCCESSROLE)){
						sysUserRoleFunc.setfRoleid(roleId);
					}
					sysUserRoleFunc.setfDisable(fDisable);
					sysUserRoleFuncMapper.insertSelective(sysUserRoleFunc);
				}
			}else{
				sysUserRoleFunc.setfUserid(userId);
				sysUserRoleFunc.setfFuncid(fBh);
				if(!roleId.equals(NOTPROCCESSROLE)){
					sysUserRoleFunc.setfRoleid(roleId);
				}
				sysUserRoleFunc.setfDisable(fDisable);
				sysUserRoleFuncMapper.insertSelective(sysUserRoleFunc);
			}
		}
	}

}
