package com.hlic.yycg.service.impl;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.bill.ActivitiConsoleUtils;
import com.hlic.yycg.dao.mapper.ScTaskMapper;
import com.hlic.yycg.pojo.po.ScTask;
import com.hlic.yycg.service.CommonFlowService;

public class CommonFlowServiceImpl implements CommonFlowService{

	@Resource(name="activitiConsoleUtils")
    private ActivitiConsoleUtils activitiConsoleUtils;
	
	@Autowired
	private ScTaskMapper scTaskMapper;

	@Override
	public int startCommonFlow(String jsonObject) {
		String businessKey = "";
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		String f_pkey = saveData.getString("F_PKEY");
		ScTask scTask = scTaskMapper.selectByPrimaryKey(f_pkey);
		if(scTask != null){
        	businessKey = "commflow:" + f_pkey;
        	this.activitiConsoleUtils.startPI("commonflow",businessKey,"0000");
        	return 1;
        }else{
        	return 0;
        }
	}
	
}
