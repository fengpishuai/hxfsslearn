<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
</head>
<body>
<div class="content">
    <div class="con-header">
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_add"></span><span class="web-span"> 保存 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_submit"></span><span class="web-span"> 提交 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_addone"></span><span class="web-span"> 加签 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_delete"></span><span class="web-span"> 删除 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_print"></span><span class="web-span"> 打印 </span></a>
        <a class="webbtn1" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn ico_btn_excel"></span><span class="web-span"> EXCEL </span></a>
    </div>
    <div class="con-midden">
        <div class="mid-title">申请单</div>
        <div class="mid-table">
            <table class="mid-tab" cellspacing="0" cellpadding="0">
                <tbody>
                    <tr>
                        <td><div>单据编号：</div></td>
                        <td class="even"><div><input type="text" name="id"/></div></td>
                        <td><div>申请时间：</div></td>
                        <td class="even"><div><input type="text" name="id"/></div></td>
                        <td><div>申请人：</div></td>
                        <td class="even"><div><input type="checkbox" name="id"/></div></td>
                        <td><div>申请人工号：</div></td>
                        <td class="even"><div><select><option value="0">正常</option><option value="1">警告</option><option value="2">严重</option></select></div></td>
                    </tr>
                    <tr>
                        <td><div>单据编号：</div></td>
                        <td class="even"><div><input type="text" id="d28" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/></div></td>
                        <td><div>申请时间：</div></td>
                        <td class="even"><div><input type="text" name="id"/></div></td>
                        <td><div>申请人：</div></td>
                        <td class="even"><div><input type="text" name="id"/></div></td>
                        <td><div>申请人工号：</div></td>
                        <td class="even"><div><input type="text" name="id"/></div></td>
                    </tr>
                </tbody>
            </table>
        </div>
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
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 保  存  </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 加  签  </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 提  交  </span></a>
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
	            url: "${ctx}/user/submitqueryuser.action", // 需要提交的 url
	            dataType:"json",
	            success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
	                // 此处可对 data 作相关处理
	                alert('提交成功！');
	            },
	            error:function(data){
	                console.log(data);
	            }
	        };
	        $("#importExcelForm").ajaxSubmit(options);
	        return false; // 阻止表单自动提交事件
	});
}

</script>
</html>