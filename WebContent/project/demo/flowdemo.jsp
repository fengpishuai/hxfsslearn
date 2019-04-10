<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流程demo</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<style type="text/css">
.flow {
    height: 180px;
    border: 1px solid #388EDD;
    margin: 10px;
}
.rowbox{
    float: left;
    font-size: 14px;
    margin-left: 10px;
}
.cellinput{
    height: 24px;
}
.example{
    display: inline-block;
    font-size: 12px;
    margin-left: 20px;
}
</style>
</head>
<body>
<div class="content-bz">
    <!-- 部署流程 -->
    <div class="flow">
       <div><a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="startflow()"><span class="ico_btn_add"></span><span> 部署流程  </span></a></div>
       <div></div>
    </div>
    <!-- 删除流程 -->
    <div class="flow">
        <div><a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="deleteflow()"><span class="ico_btn_add"></span><span> 删除流程  </span></a><span class="example">例子（流程实例ID：2401(proc_inst_id)）</span></div>
        <div class="rowbox">
           <span>流程实例ID：</span>
           <input type="text" id="deletepiid" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>备注：</span>
            <input type="text" id="deletenote" class="cellinput"/>
        </div>
    </div>
    <!-- 启动流程 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="" onclick="submitStartFlow()"><span class="ico_btn_add"></span><span>启动流程</span></a><span class="example">例子（流程名称：commonflow;单据编号：2018011700001）</span></div>
        <div class="rowbox">
           <span>流程名称：</span>
           <input type="text" id="flowname" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>单据编号：</span>
            <input type="text" id="fdjbh" class="cellinput"/>
        </div>
    </div>
    <!-- 我的已办 -->
    <div class="flow">
        <div><a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="queryWDYB()"><span class="ico_btn_add"></span><span> 我的已办  </span></a></div>
        <div class="rowbox">
            <span>用户ID：</span>
            <input type="text" id="wdybuserId" class="cellinput"/>
        </div>
    </div>
    <!-- 我的待办 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="" onclick="queryWDDB()"><span class="ico_btn_add"></span><span> 我的待办 </span></a></div>
        <div class="rowbox">
            <span>用户ID：</span>
            <input type="text" id="wddbuserId" class="cellinput"/>
        </div>
    </div>
    <!-- 我的单据 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="" onclick="queryWDDJ()"><span class="ico_btn_add"></span><span> 我的单据</span></a></div>
        <div class="rowbox">
            <span>用户ID：</span>
            <input type="text" id="wddjuserId" class="cellinput"/>
        </div>
    </div>
    <!-- 审批流程 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="" onclick="doTask()"><span class="ico_btn_add"></span><span> 审批流程  </span></a><span class="example">例子（流程ID：2503(taskId);流程节点名称：cspd(TASK_DEF_KEY_);用户ID：100001）</span></div>
        <div class="rowbox">
           <span>流程ID：</span>
           <input type="text" id="dotaskId" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>流程节点名称：</span>
            <input type="text" id="dotasnname" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>用户ID：</span>
            <input type="text" id="douserid" class="cellinput"/>
        </div>
    </div>
    <!-- 加签 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="" onclick="addTask()"><span class="ico_btn_add"></span><span> 加签  </span></a></div>
    </div>
    <!-- 退回 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="width:100px;" onclick="jumpTask()"><span class="ico_btn_add"></span><span> 退回任一节点  </span></a><span class="example">例子（流程执行ID：2401(executionId);目标节点名称：cspd(TASK_DEF_KEY_);当前节点名称：cssh(TASK_DEF_KEY_);流程定义ID：commonflow:4:2306）</span></div>
        <div class="rowbox">
           <span>流程执行ID：</span>
           <input type="text" id="jumpexcutionId" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>目标节点名称：</span>
            <input type="text" id="jumptarget" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>当前节点名称：</span>
            <input type="text" id="jumpcurrent" class="cellinput"/>
        </div>
        <div class="rowbox">
            <span>流程定义ID：</span>
            <input type="text" id="jumpflowid" class="cellinput"/>
        </div>
    </div>
    <!-- 退回 -->
    <div class="flow">
        <div><a class="webbtn" href="javaScript:void(0)" style="width:100px;" onclick="excelExport()"><span class="ico_btn_add"></span><span> excel导出  </span></a></div>
    </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	bindEvent();
});

function bindEvent(){
	$("#btn-submit").on("click",function(){
		var options = {
	            type: "post", // 提交方式 get/post
	            url: "${ctx}/leave/submitLeaveBill.action", // 需要提交的 url
	            dataType:"json",
	            success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
	                // 此处可对 data 作相关处理
	                alert('提交成功！');
	            },
	            error:function(data){
	                console.log(data);
	            }
	        };
	        $("#leaveBillForm").ajaxSubmit(options);
	        return false; // 阻止表单自动提交事件
	});
}

function deleteflow(){
	var deletepiid = $.trim($("#deletepiid").val());
	var deletenote = $.trim($("#deletenote").val());
	if(deletepiid == ""){
		tipAlert("提示","流程实例不能为空","确定");
		return
	}
	if(deletenote == ""){
		tipAlert("提示","备注不能为空","确定");
		return
	}
	var saveData = {};
	saveData.processInstanceId = deletepiid;
	saveData.fNote = deletenote;
	$.ajax({ 
        url:"${ctx}/workFlow/deleteProcessInstance.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}

function queryTask(){
	$.ajax({ 
        url:"${ctx}/leave/queryTask.action", 
        type:'post', 
        dataType:'json', 
        //contentType:"application/json",
        //data:editData, 
        success : function(data){ 
            console.log(data); 
        } 
    });
}
function queryWDDJ(){
	var userId = $.trim($("#wddjuserId").val());
	var saveData = {};
	saveData.userId = userId;
	$.ajax({ 
        url:"${ctx}/workFlow/queryWDDJ.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
function queryWDYB(){
	var userId = $.trim($("#wdybuserId").val());
	var saveData = {};
	saveData.userId = userId;
	$.ajax({ 
        url:"${ctx}/workFlow/queryWDYB.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
function queryWDDB(){
	var userId = $.trim($("#wddbuserId").val());
	var saveData = {};
	saveData.userId = userId;
	$.ajax({ 
        url:"${ctx}/workFlow/queryWDDB.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
//启动流程
function submitStartFlow(){
	var flowname  = $.trim($("#flowname").val());
	var fdjbh =$.trim($("#fdjbh").val());
	if(flowname == ""){
		tipAlert("提示","流程名称不能为空","确定");
		return;
	}
	if(fdjbh == ""){
		tipAlert("提示","单据编号不能为空","确定");
		return;
	}
	var saveData = {};
	saveData.flowName = flowname;
	saveData.F_DJBH = fdjbh;
	$.ajax({ 
        url:"${ctx}/workFlow/submitStartFlow.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
//审批流程
function doTask(){
	var dotaskId = $.trim($("#dotaskId").val());
	var dotasnname = $.trim($("#dotasnname").val());
	var douserid = $.trim($("#douserid").val());
	if(dotaskId == ""){
		tipAlert("提示","流程ID不能为空","确定");
		return;
	}
	if(dotasnname == ""){
		tipAlert("提示","流程节点名称不能为空","确定");
		return;
	}
	if(douserid == ""){
		tipAlert("提示","用户ID不能为空","确定");
		return;
	}
	var saveData = {};
	saveData.dotaskId = dotaskId;
	saveData.dotasnname = dotasnname;
	saveData.douserid = douserid;
	$.ajax({ 
        url:"${ctx}/workFlow/doTask.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
//退回到任一节点
function jumpTask(){
	var jumpexcutionId = $.trim($("#jumpexcutionId").val());
	var jumptarget = $.trim($("#jumptarget").val());
	var jumpcurrent = $.trim($("#jumpcurrent").val());
	var jumpflowid = $.trim($("#jumpflowid").val());
	if(jumpexcutionId == ""){
		tipAlert("提示","流程执行ID不能为空","确定");
		return;
	}
	if(jumptarget == ""){
		tipAlert("提示","目标节点名称不能为空","确定");
		return;
	}
	if(jumpcurrent == ""){
		tipAlert("提示","当前节点名称不能为空","确定");
		return;
	}
	if(jumpflowid == ""){
		tipAlert("提示","流程定义ID不能为空","确定");
		return;
	}
	var saveData = {};
	saveData.jumpexcutionId = jumpexcutionId;
	saveData.jumptarget = jumptarget;
	saveData.jumpcurrent = jumpcurrent;
	saveData.jumpflowid = jumpflowid;
	$.ajax({ 
        url:"${ctx}/workFlow/jumpTask.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
function excelExport(){
	var saveData = {};
	$.ajax({ 
        url:"${ctx}/base/excelExport.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            tipAlert("提示","成功","确定");
        } 
    });
}
</script>
</html>