package com.hlic.base.bill;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;

import javax.annotation.Resource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.pvm.process.TransitionImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.web.bind.annotation.RequestBody;

public class ActivitiConsoleUtils {

    @Resource(name="processEngine")
    private ProcessEngine processEngine;
    
    /**
     * @param file  在action层文件上传的内容
     * @param processName  流程名称  
     */ 
    public void deploy(File file,String processName) throws Exception{
        InputStream in = new FileInputStream(file);
        ZipInputStream zipInputStream = new ZipInputStream(in);
        this.processEngine.getRepositoryService()
        .createDeployment()
        .name(processName)
        .addZipInputStream(zipInputStream)
        .deploy();
    } 
    
    /**
     * 查询所有的部署信息
     */
    public List<Deployment> getAllDeployment(){
       /* List<DeployVo> deployList = new ArrayList<DeployVo>();
        DeployVo deployVo = new DeployVo();*/
        List<Deployment> deployments = this.processEngine.getRepositoryService()
                .createDeploymentQuery()
                .orderByDeploymenTime()
                .desc()
                .list();
       /* for (Deployment deployment : deployments) {
            deployVo.setId(deployment.getId());;
            deployVo.setName(deployment.getName());
            deployVo.setDeploymentTime(deployment.getDeploymentTime());
            deployVo.setCategory(deployment.getCategory());
            deployList.add(deployVo);
        }*/
        return deployments;
    }
    
    /**
     * 查询所有的流程定义的信息
     */
    public List<ProcessDefinition> getAllProcessDefinition(){
        return this.processEngine
                .getRepositoryService()
                .createProcessDefinitionQuery()
                .orderByProcessDefinitionVersion()
                .desc()
                .list();
    }
    
    /**
     * 删除某一个部署
     */
    public void deleteDeployment(String deploymentId){
        this.processEngine
        .getRepositoryService()
        .deleteDeployment(deploymentId, true);
    }
    
    //删除流程实例
    public void deleteProcessInstance(String processInstanceId, String fNote){
    	this.processEngine
    	.getRuntimeService()
    	.deleteProcessInstance(processInstanceId, fNote);
    }
    
    /**
     * 查看流程图
     */
    public InputStream showImages(String pdid){
        return this.processEngine
        .getRepositoryService()
        .getProcessDiagram(pdid);
    }
    
    /**
     * 启动流程实例
     *   1、启动流程实例的api leavebill
     *   2、传入一个参数：新增加的请假单的id
     *   3、因为在提交申请的任务中有#{userID},所以在进入提交申请的任务之前，必须通过流程变量给userID赋值
     * @param  processDefinitionKey:流程名称leavebill
     * @param businessKey:流程定义id leavebill:2:104
     * @param userId:当前登录人
     * @return
     */
    public void startPI(String processDefinitionKey,String businessKey,String userId){
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("userId", userId);
        this.processEngine.getRuntimeService()
        .startProcessInstanceByKey(processDefinitionKey, businessKey, variables);
    }
    
    /**
     * 当前登录人登录系统以后要执行的任务
     * @param userId:当前登录人
     */
    public List<Task> getTasksByAssignee(String userId){
        return this.processEngine
        .getTaskService()
        .createTaskQuery()
        .taskAssignee(userId)
        .orderByTaskCreateTime()
        .desc()
        .list();
    }
    
    /**
     * 根据taskId得到当前任务所在的流程实例正在执行的节点的所有的sequenceFlow的名称
     * @param taskId
     * @return
     */
    public List<PvmTransition> getPvmTransitions(String taskId){
        ActivityImpl activityImpl = this.getActivityImplByTaskId(taskId);
        return activityImpl.getOutgoingTransitions();
    }
    
    /**
     * 根据taskId得到当前流程实例正在执行的节点ActivityImpl
     */
    public ActivityImpl getActivityImplByTaskId(String taskId){
        /**
         * 根据taskId获取到task
         */
        Task task = this.processEngine
        .getTaskService()
        .createTaskQuery()
        .taskId(taskId)
        .singleResult();
        /**
         * 根据task获取到pi
         */
        ProcessInstance pi = this.processEngine.getRuntimeService()
        .createProcessInstanceQuery()
        .processInstanceId(task.getProcessInstanceId())
        .singleResult();
        
        ProcessDefinitionEntity processDefinitionEntity = this.getProcessDefinitionEntityByTaskId(taskId);
        return processDefinitionEntity.findActivity(pi.getActivityId());
    }
    
    /**
     * 根据taskId获取到ProcessDefinitionEntity
     */
    private ProcessDefinitionEntity getProcessDefinitionEntityByTaskId(String taskId){
        Task task = this.processEngine
        .getTaskService()
        .createTaskQuery()
        .taskId(taskId)
        .singleResult();
        return (ProcessDefinitionEntity)this.processEngine.getRepositoryService()
        .getProcessDefinition(task.getProcessDefinitionId());
    }
    
    /**
     * 根据taskId查找businessKey
     */
    public String getBusinessKeyByTaskId(String taskId){
        Task task = this.processEngine
                .getTaskService()
                .createTaskQuery()
                .taskId(taskId)
                .singleResult();
        ProcessInstance pi = this.processEngine.getRuntimeService()
        .createProcessInstanceQuery()
        .processInstanceId(task.getProcessInstanceId())
        .singleResult();
        return pi.getBusinessKey();
    }
    
    /**
     * 根据taskId完成任务，并且在完成任务以后判断流程实例是否结束
     */
    public ProcessInstance finishTask(String taskId,String dotaskname, String userId){
        /**
         * 根据taskId提取任务
         */
    	Map<String, Object> variables = new HashMap<String, Object>();
    	variables.put("userId", userId);
        Task task = this.processEngine.getTaskService()
        .createTaskQuery()
        .taskId(taskId)
        .singleResult();
        //根据任务得到piid
        String piid = task.getProcessInstanceId();
        this.processEngine.getTaskService()
        .complete(taskId, variables);
        //根据piid过滤流程实例
        ProcessInstance pi = this.processEngine.getRuntimeService()
        .createProcessInstanceQuery()
        .processInstanceId(piid)
        .singleResult();
        return pi;//如果整个流程实例结束了，则pi为null,如果没有结束就是一个对象
    }
    
    /**
     * 根据登陆人ID查询我的待办
     * @param userId
     * @return
     */
    public List<String> queryWDDB(String userId){
        List<String> businessList = new ArrayList<String>();
        List<Task> taskList = this.processEngine
        .getTaskService()
        .createTaskQuery()
        .taskAssignee(userId)
        .orderByTaskCreateTime()
        .desc()
        .list();
        for (Task task : taskList) {
            ProcessInstance pi = this.processEngine.getRuntimeService()
            .createProcessInstanceQuery()
            .processInstanceId(task.getProcessInstanceId())
            .singleResult();
            businessList.add(pi.getBusinessKey());
            System.out.println("任务ID:"+pi.getId());  
            System.out.println("流程实例ID:"+pi.getProcessInstanceId());  
            System.out.println("单据编号："+pi.getBusinessKey());  
        }
        return businessList;
    }
    //我的已办
    public List<HistoricTaskInstance> queryWDYB(String userId){
    	List<HistoricTaskInstance> list = this.processEngine.getHistoryService() // 历史任务Service  
                .createHistoricTaskInstanceQuery() // 创建历史任务实例查询  
                .taskAssignee(userId) // 指定办理人  
                .finished() // 查询已经完成的任务    
                .list();  
        for(HistoricTaskInstance hti:list){  
            System.out.println("任务ID:"+hti.getId());  
            System.out.println("流程实例ID:"+hti.getProcessInstanceId());  
            System.out.println("班里人："+hti.getAssignee());  
            System.out.println("创建时间："+hti.getStartTime());  
            System.out.println("结束时间："+hti.getEndTime());  
            System.out.println("===========================");  
        }  
        return list;
    }
}
