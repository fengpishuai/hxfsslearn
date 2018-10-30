package com.hlic.base.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.hlic.base.dao.mapper.BaseCommonGridMapper;
import com.hlic.base.dao.mapper.SysFuncGrpMapper;
import com.hlic.base.pojo.po.SysFuncGrp;
import com.hlic.base.pojo.po.SysFuncGrpExample;
import com.hlic.base.pojo.po.SysFuncGrpExample.Criteria;
import com.hlic.base.pojo.po.SysFuncGrpExample.Criterion;
import com.hlic.base.service.BaseCommonGridService;
import com.hlic.base.service.SysFuncGrpService;
import com.hlic.utils.BeanUtils;

public class SysFuncGrpServiceImpl implements SysFuncGrpService {

	@Autowired
	private SysFuncGrpMapper sysFuncGrpMapper;
	
	@Autowired
	private BaseCommonGridService baseCommonGridService;
	
	@Override
	public int updateSysFuncGrp(String inputJson) throws Exception {
		int F_CODE = 0;
		List<SysFuncGrp> list = new ArrayList<SysFuncGrp>();
		JSONObject saveData = JSONObject.fromObject(inputJson);
		
		if(saveData.get("editSave") != null){
			JSONArray editSave = (JSONArray) saveData.get("editSave");
			//更新行
			if(editSave.size() > 0){
				F_CODE = baseCommonGridService.updateCommonTable("SYS_FUNC_GRP",editSave,"F_ID");
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray prenewSave = (JSONArray) saveData.get("newSave");
			JSONArray newSave = BeanUtils.keyNameToHump(prenewSave);
			list = (List<SysFuncGrp>) JSONArray.toCollection(newSave,SysFuncGrp.class);
			//新增行
			if(list.size() > 0){
				for(SysFuncGrp sysFuncGrp : list){
					F_CODE = sysFuncGrpMapper.insertSelective(sysFuncGrp);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray delSave = (JSONArray) saveData.get("delSave");
			//删除行
			if(delSave.size() > 0){
				F_CODE = baseCommonGridService.deleteCommonTable("SYS_FUNC_GRP",delSave,"F_ID");
			}
		}
		return F_CODE;
	}

}
