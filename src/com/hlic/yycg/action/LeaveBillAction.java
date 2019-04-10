package com.hlic.yycg.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.activiti.engine.task.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.bill.ActivitiConsoleUtils;
import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.process.result.DataGridResultInfo;
import com.hlic.base.process.result.ResultInfo;
import com.hlic.base.process.result.SubmitResultInfo;
import com.hlic.utils.RandomUtils;
import com.hlic.utils.paginator.domain.PageList;
import com.hlic.yycg.pojo.po.Leavebill;
import com.hlic.yycg.service.CommonFlowService;
import com.hlic.yycg.service.LeaveBillService;

@Controller
@RequestMapping("/leave")
public class LeaveBillAction {
    
    @Resource(name="leaveBillService")
    private LeaveBillService leaveBillService;
    
    @Resource(name="commonFlowService")
    private CommonFlowService commonFlowService;
    
    @Resource(name="activitiConsoleUtils")
    private ActivitiConsoleUtils activitiConsoleUtils;
    /**
     * 请假申请列表
     * @param model
     */
    @RequestMapping("/leavebill")
    public String leavebill(Model model){
        return "/project/bzlist/leavebill";
    }

    /**
     * 请假申请页面
     * @param model
     */
    @RequestMapping("/leavebillUI")
    public String leavebillUI(Model model){
        model.addAttribute("id", RandomUtils.generateID("LEAVE"));
        model.addAttribute("flowName", "leavebill");
        return "/project/bz/leavebillbz";
    }
    //查询功能数据
  	@RequestMapping("/queryLeavebillList")
    public @ResponseBody DataGridResultInfo queryLeavebillList(int page,int rows,String fAppId) throws Exception{
  		SysFunc sqlParameter = new SysFunc();
  		sqlParameter.setfAppId("1");
  		PageList<Leavebill> list = leaveBillService.getAll(page, rows, sqlParameter);
  		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //总页数
        dataGridResultInfo.setTotals(list.getPaginator().getTotalPages());
        //填充  rows
        dataGridResultInfo.setRows(list);
        //当前页
        dataGridResultInfo.setPage(page);
        //总记录数
        dataGridResultInfo.setRecords(list.getPaginator().getTotalCount());
        return dataGridResultInfo;
    }
    /**
     * 保存请假申请单
     * @param leavebill
     * @return
     */
    @RequestMapping("/submitLeaveBill")
    public @ResponseBody SubmitResultInfo submitLeaveBill(Leavebill leavebill){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功！");
        this.leaveBillService.insertSelective(leavebill);
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        return submitResultInfo;
    }
    
    /**
     * 提交请假申请流程
     * @param jsonObject flowName:流程名称leavebill; pdid:流程定义id leavebill:2:104
     * @return
     */
    @RequestMapping("/submitLeaveBillFlow")
    public @ResponseBody SubmitResultInfo submitLeaveBillFlow(HttpSession httpSession, @RequestBody String jsonObject){
        String userId = (String) httpSession.getAttribute("userId");
        int code = leaveBillService.startLeaveBillFlow(jsonObject, userId);
        
        ResultInfo resultInfo = new ResultInfo();
        if(code == 1){
        	 resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
             resultInfo.setMessage("操作成功！");
        }else{
        	 resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
             resultInfo.setMessage("操作失败！");
        }
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        return submitResultInfo;
    }
    
    @RequestMapping("/submitCommonFlow")
    public @ResponseBody SubmitResultInfo submitCommonFlow(HttpSession httpSession, @RequestBody String jsonObject){
        int code = commonFlowService.startCommonFlow(jsonObject);
        ResultInfo resultInfo = new ResultInfo();
        if(code == 1){
        	 resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
             resultInfo.setMessage("操作成功！");
        }else{
        	 resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
             resultInfo.setMessage("操作失败！");
        }
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        return submitResultInfo;
    }
    
    /**
     * 当前登录人登录系统以后要执行的任务
     * @param leavebill
     * @return
     */
    @RequestMapping("/queryTask")
    public @ResponseBody SubmitResultInfo queryTask(HttpSession httpSession){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
        resultInfo.setMessage("操作成功！");
        String userId = (String) httpSession.getAttribute("userId");
        List<Task> taskList = activitiConsoleUtils.getTasksByAssignee(userId);
        List<Leavebill> leavebillList = this.leaveBillService.findLeaveBillListByID(userId);
       
        SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
        submitResultInfo.setLeavebill(leavebillList);
        return submitResultInfo;
    }
    /**
     * @Title: doTask 
     * @Description: 完成审批任务
     * @param @param httpSession    设定文件 
     * @return void    返回类型 
     * @throws 
     *
     */
    @RequestMapping("doTask")
    public void doTask(HttpSession httpSession){
    	//activitiConsoleUtils.finishTask("1011");
    }
}
