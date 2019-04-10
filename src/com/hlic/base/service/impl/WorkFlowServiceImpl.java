package com.hlic.base.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.pvm.ReadOnlyProcessDefinition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hlic.base.bill.ActivitiConsoleUtils;
import com.hlic.base.dao.ApproveMapper;
import com.hlic.base.pojo.po.Approve;
import com.hlic.base.pojo.vo.FlowVo;
import com.hlic.base.service.IWorkFlowService;
import com.hlic.utils.flow.RejectToAnyWhereTaskCmd;
import com.hlic.yycg.dao.mapper.LeavebillMapper;
import com.hlic.yycg.pojo.po.Leavebill;

public class WorkFlowServiceImpl implements IWorkFlowService {

    @Autowired
    private ApproveMapper approveMapper;
    
    @Resource(name="processEngine")
    private ProcessEngine processEngine;
    
    @Autowired
    private ActivitiConsoleUtils activitiConsoleUtils;
    
    @Autowired
    private LeavebillMapper leavebillMapper;
    @Transactional
    public void completeTask(String taskId, String userId,String comment) {
        /**
         * 1、把页面上批注的信息保存在approve这张表中
           2、判断当前流程实例正在执行的任务节点
                    提交申请
                        则把a_leavebill中的状态值设置为"1"
         * 3、完成任务
         * 4、完成了该任务以后，判断流程实例是否结束
         *     如果结束了，则设置a_leavebill中的状态值为"2"
         */
        /**
         * 创建一个approve对象
         */
        Approve approve = new Approve();
        approve.setComment(comment);
        approve.setName(userId);
        /**
         * 建立approve与leavebill的关联
         */
        String businessKey = this.activitiConsoleUtils.getBusinessKeyByTaskId(taskId);
        Leavebill leaveBill = this.leavebillMapper.selectByPrimaryKey(businessKey);
        approve.setId(leaveBill.getId());
        
        /**
         * 得到当前正在执行的流程实例的节点的id的值
         */
        ActivityImpl activityImpl = this.activitiConsoleUtils.getActivityImplByTaskId(taskId);
        String name = activityImpl.getProperty("name").toString();
        if("提交申请".equals(name)){
            leaveBill.setState("1");//如果当前的任务是提交申请，则设置状态值为1
        }
        
        //完成当前的任务,并且返回一个流程实例
        //ProcessInstance pi = this.activitiConsoleUtils.finishTask(taskId);
        /*if(pi==null){//该流程已经完成了
            leaveBill.setState("2");
        }*/
        
        this.approveMapper.insertSelective(approve);
    }
    /*
     * 我的待办查询
     * @param userId 
     */
	public List<FlowVo> queryWDDBList(String userId) {
		List<FlowVo> flowVoList = new ArrayList<FlowVo>(); 
		List<Task> taskList = activitiConsoleUtils.getTasksByAssignee(userId);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if(taskList != null && taskList.size() > 0){
			for(Task task : taskList){
				FlowVo flowVo = new FlowVo();
				String businessKey = activitiConsoleUtils.getBusinessKeyByTaskId(task.getId());
				String[] fdjbh = businessKey.split(":");
				Leavebill leaveBill = this.leavebillMapper.selectByPrimaryKey(fdjbh[1]);
				if(leaveBill != null){
					flowVo.setfDjbh(leaveBill.getId());
					flowVo.setfZdsj(formatter.format(leaveBill.getLeavedate()));
					flowVo.setfZdr(leaveBill.getUserid());
					flowVo.setDJMC(leaveBill.getName());
					flowVoList.add(flowVo);
				}
				//System.out.println(businessKey);
			}
		}
		
		return flowVoList;
	}
	@Override
	public void jumpTask(String inputJson) {
		JSONObject sendData = JSONObject.fromObject(inputJson);
        String jumpexcutionId = sendData.getString("jumpexcutionId");
        String jumptarget = sendData.getString("jumptarget");
        String jumpcurrent = sendData.getString("jumpcurrent");
        String jumpflowid = sendData.getString("jumpflowid");
	    Map<String,Object> submitParams = new HashMap<String,Object>();  
	      
	    ReadOnlyProcessDefinition processDefinitionEntity = (ReadOnlyProcessDefinition) processEngine.getRepositoryService().getProcessDefinition(jumpflowid); 
	    // 目标节点  
	    ActivityImpl destinationActivity = (ActivityImpl) processDefinitionEntity  
	            .findActivity(jumptarget);  
	  
	    // 当前节点  
	    ActivityImpl currentActivity = (ActivityImpl) processDefinitionEntity  
	            .findActivity(jumpcurrent);  
	    processEngine.getManagementService().executeCommand(  
	            new RejectToAnyWhereTaskCmd(jumpexcutionId, destinationActivity, submitParams,  
	                    currentActivity,processDefinitionEntity));  
	}

}
