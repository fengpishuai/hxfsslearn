<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假申请单</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
</head>
<body>
<div class="content-bz">
    <div class="con-bz-header">
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn ico_btn_add"></span><span class="web-span"> 保存 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick=""><span class="ico_btn ico_btn_submit"></span><span class="web-span"> 提交 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick=""><span class="ico_btn ico_btn_addone"></span><span class="web-span"> 加签 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick=""><span class="ico_btn ico_btn_delete"></span><span class="web-span"> 删除 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick=""><span class="ico_btn ico_btn_print"></span><span class="web-span"> 打印 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick=""><span class="ico_btn ico_btn_excel"></span><span class="web-span"> EXCEL </span></a>
    </div>
    <div class="con-bz-midden">
        <div class="mid-title">请假申请单</div>
        <form id="leaveBillForm" action="">
            <input type="hidden" name="flowName" value="${flowName }"/>
            <div class="mid-table">
            <table class="mid-tab" cellspacing="0" cellpadding="0">
                <tbody>
                    <tr>
                        <td><div>单据编号：</div></td>
                        <td class="even"><div><input type="text" name="id" value="${id }"/></div></td>
                        <td><div>单据日期：</div></td>
                        <td class="even"><div><input type="text" name="leavedate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/></div></td>
                        <td><div>请假人：</div></td>
                        <td class="even"><div><input type="text" name="userid"></div></td>
                        <td><div>假期类型：</div></td>
                        <td class="even"><div><input type="text" name="leavetype"></div></td>
                    </tr>
                    <tr>
                        <td><div>起始日期：</div></td>
                        <td class="even"><div><input type="text" name="startdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/></div></td>
                        <td><div>结束日期：</div></td>
                        <td class="even"><div><input type="text" name="enddate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/></div></td>
                        <td><div>申请天数：</div></td>
                        <td class="even"><div><input type="text" name="days"/></div></td>
                        <td><div>请假原因：</div></td>
                        <td class="even"><div><input type="text" name="remark"></div></td>
                    </tr>
                    <tr>
                        <td><div>备注：</div></td>
                        <td colspan="7" class="even"><div><input type="text" name="content" /></div></td>
                    </tr>
                </tbody>
            </table>
        </div>
        </form>
        <div class="mid-sm">
            <div class="sm-title">填报说明</div>
            <div class="sm-content">保存之后显示审批流程信息</div>
        </div>
        <div class="mid-flow">
            <div class="flow-title">审批流程</div>
            <div class="flow-content">保存之后显示审批流程信息</div>
        </div>
        <!-- <form id="queryuserform" action="">
		    <input type="text" name="id"/>
		    <input type="text" name="username"/>
		    <button id="btn-submit">提交</button>
		</form> -->
    </div>
    <div class="con-bz-bottom">
        <a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn_add"></span><span> 保  存  </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="queryTask()"><span class="ico_btn_add"></span><span> 查询我的待办 </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="doTask()"><span class="ico_btn_add"></span><span> 审批流程  </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addTask()"><span class="ico_btn_add"></span><span> 加签  </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="width: 146px;" onclick="startCommonFlow()"><span class="ico_btn_add"></span><span>启动commonflow</span></a>
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

function submitLeaveBillFlow(){
	var flowName = $("input[name=flowName]").val();
	var id = $("input[name=id]").val();
	var userId = 1;
	$.ajax({ 
        url:"${ctx}/leave/submitLeaveBillFlow.action?id="+id+"&userId="+userId+"&flowName="+flowName, 
        type:'post', 
        dataType:'json', 
        //contentType:"application/json",
        //data:editData, 
        success : function(data){ 
            console.log(data); 
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

function saveData(){
	var saveData = {};
	saveData.flowName = "leavebill";
	saveData.F_DJBH = "LEAVE201606153870";
	$.ajax({ 
        url:"${ctx}/leave/submitLeaveBillFlow.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            //commonjs.tipAlert("提示","成功");
        } 
    });
}
function addTask(){
	
}
function startCommonFlow(){
	var saveData = {};
	saveData.F_PKEY = "B22C39442E927522DD453F27ED2A2FAE";
	$.ajax({ 
        url:"${ctx}/leave/submitCommonFlow.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            //commonjs.tipAlert("提示","成功");
        } 
    });
}
//启动流程
function submitLeaveBillFlow(){
	var saveData = {};
	saveData.flowName = "leavebill";
	saveData.id = "leavebill:2:104";
	$.ajax({ 
        url:"${ctx}/leave/submitLeaveBillFlow.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
            //commonjs.tipAlert("提示","成功");
        } 
    });
}

function doTask(){
	$.ajax({ 
        url:"${ctx}/leave/doTask.action", 
        type:'post', 
        dataType:'json', 
        /* contentType:"application/json",
        data:JSON.stringify(saveData),  */
        success : function(data){ 
            //commonjs.tipAlert("提示","成功");
        } 
    });
}
</script>
</html>