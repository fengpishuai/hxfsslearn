package com.hlic.base.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


import net.sf.json.JSONObject;

import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.hlic.base.bill.ActivitiConsoleUtils;
import com.hlic.base.pojo.vo.FlowVo;
import com.hlic.base.process.result.ResultInfo;
import com.hlic.base.process.result.SubmitResultInfo;
import com.hlic.base.service.IWorkFlowService;
import com.hlic.yycg.pojo.po.Leavebill;
import com.hlic.yycg.service.LeaveBillService;

@Controller
@RequestMapping("workFlow")
public class WorkFlowAction {

    @Resource(name="activitiConsoleUtils")
    private ActivitiConsoleUtils activitiConsoleUtils;
    
    @Autowired
    private LeaveBillService leaveBillService;
    
    @Autowired
    private IWorkFlowService workFlowService;
   
    @RequestMapping("/newdeploy")
    public void newdeploy(@RequestParam("file") CommonsMultipartFile file, String filename){
		
	}
    @RequestMapping("/deployUI")
    public String deployUI(Model model){
        //将页面所需要的数据取出，传到页面
        List<Deployment> deployments = this.activitiConsoleUtils.getAllDeployment();
        model.addAttribute("deployments", deployments);
        List<ProcessDefinition> processDefinitions = this.activitiConsoleUtils.getAllProcessDefinition();
        model.addAttribute("processDefinitions", processDefinitions);
        return "/flow/deployUI";
    }
   /* @RequestMapping("/deployUI_result")
    public @ResponseBody FlowResultInfo deployUI_result(Model model){
        FlowResultInfo flowResultInfo = new FlowResultInfo();
        List<DeployVo> deployments = this.activitiConsoleUtils.getAllDeployment();
        flowResultInfo.setDeployment(deployments);
        List<ProcessDefinition> processDefinitions = this.activitiConsoleUtils.getAllProcessDefinition();
        flowResultInfo.setProcessDefinition(processDefinitions);
        return flowResultInfo;
    }*/
    /** 
     * 删除部署流程
     * @param model
     * @param deploymentId
     * @return
     */
    @RequestMapping("/deleteDeployment")
    public @ResponseBody SubmitResultInfo deleteDeployment(Model model,String deploymentId){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功！");
        this.activitiConsoleUtils.deleteDeployment(deploymentId);
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        return submitResultInfo;
    }
    //删除流程实例
    @RequestMapping("/deleteProcessInstance")
    public String deleteProcessInstance(@RequestBody String inputJson){
    	JSONObject sendData = JSONObject.fromObject(inputJson);
        String processInstanceId = sendData.getString("processInstanceId");
    	String fNote = sendData.getString("fNote");
    	activitiConsoleUtils.deleteProcessInstance(processInstanceId, fNote);
    	return "0";
    }
    /**
     * 跳转到办理任务的界面
     */
    @RequestMapping("/taskUI")
    public String taskUI(){
        /**
         * 1、显示填写的请假单的内容
         * 2、动态的显示连线
         */
        String businessKey = this.activitiConsoleUtils.getBusinessKeyByTaskId("1605");
        Leavebill leaveBill = this.leaveBillService.findLeaveBillByID(businessKey);
        /**
         * 请假单的回显
         */
        //ActionContext.getContext().getValueStack().push(leaveBill);
        System.out.println(leaveBill);
        /**
         * 该任务的sequenceFlow
         */
        List<PvmTransition> pvmTransitions = this.activitiConsoleUtils.getPvmTransitions("1605");
        //ActionContext.getContext().put("outcomeList", pvmTransitions);
        System.out.println(pvmTransitions);
        /**
         * 显示历史信息
         *   该请假单所有的审批信息
         */
       /* Set<Approve> approves = leaveBill.getApproves();
        ActionContext.getContext().put("commentList", approves);*/
        return "taskForm";
    }
    
    /**
     * 完成任务
     */
    @RequestMapping("/submitTask")
    public void submitTask(Model model){
        this.workFlowService.completeTask("1807", "1", "同意");
    }
    /**
     * 启动流程
     * @param jsonObject flowName:流程名称leavebill;pdid:流程定义id leavebill:2:104
     * @return
     */
    @RequestMapping("/submitStartFlow")
    public @ResponseBody SubmitResultInfo submitStartFlow(HttpSession httpSession, @RequestBody String jsonObject) throws Exception{
        JSONObject saveData = JSONObject.fromObject(jsonObject);
        //流程名称 例如leavebill
        String flowName = saveData.getString("flowName");
        //pdid 流程定义id 例如leavebill:2:104
        String businessKey = flowName+":"+saveData.getString("F_DJBH");
        String userId = (String) httpSession.getAttribute("userId");
        this.activitiConsoleUtils.startPI(flowName,businessKey,userId);
        
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功！");
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        return submitResultInfo;
    }
    /**
     * 查看我的待办流程
     * @return
     */
    @RequestMapping("/queryWDDBList")
    public @ResponseBody List<FlowVo> queryWDDBList(HttpSession httpSession) throws Exception{
    	String userId = (String) httpSession.getAttribute("userId");
    	return workFlowService.queryWDDBList(userId);
    }
    //我的待办
    @RequestMapping("/queryWDDB")
    public @ResponseBody List<String> queryWDDB(@RequestBody String inputJson){
    	JSONObject sendData = JSONObject.fromObject(inputJson);
        String userId = sendData.getString("userId");
    	List<String> wddjList = activitiConsoleUtils.queryWDDB(userId);
    	return wddjList;
    }
    
    //审批流程
    @RequestMapping("/doTask")
    public String doTask(HttpSession httpSession,@RequestBody String inputJson){
    	String userId = "";
    	JSONObject sendData = JSONObject.fromObject(inputJson);
        String dotaskId = sendData.getString("dotaskId");
        String dotasnname = sendData.getString("dotasnname");
        userId = sendData.getString("douserid");
        if("".equals(userId)){
        	userId = (String) httpSession.getAttribute("userId");
        }
    	activitiConsoleUtils.finishTask(dotaskId,dotasnname,userId);
    	return "0";
    }
    //查看我的已办
    @RequestMapping("/queryWDYB")
    public String queryWDYB(HttpSession httpSession,@RequestBody String inputJson){
    	JSONObject sendData = JSONObject.fromObject(inputJson);
        String userId = sendData.getString("userId");
    	activitiConsoleUtils.queryWDYB(userId);
    	return "";
    }
    //跳转任务节点
    @RequestMapping("/jumpTask")
    public String jumpTask(HttpSession httpSession,@RequestBody String inputJson){
    	workFlowService.jumpTask(inputJson);
    	return "";
    }
}
