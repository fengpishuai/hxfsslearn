<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DOFSTORECOLS过滤</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link  rel="stylesheet" href="${ctx}/project/css/filterstyle.css">
<style type="text/css">
.bottom-btn {
    position: absolute;
    bottom: 0px;
    right: 0px;
    left: 0px;
    background-color: #E0DEDE;
    text-align: right;
    padding-right: 14px;
}
</style>
</head>
<body>
<div class="container">
    <div class="content1">
        <div class="sub-content">
           <span class="sub-title">表名：</span>
           <input id="stoId" class="Input" placeholder="表名">
        </div>
        <div class="sub-content">
           <span class="sub-title">列编号：</span>
           <input id="colId" class="Input" placeholder="列编号">
        </div>
        
    </div>
    <div class="bottom-btn">
       <a class="webbtn" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 确  定 </span></a>
       <a class="webbtn" href="javaScript:void(0)" style="" onclick="quxiao()"><span class="ico_btn_add"></span><span> 取  消 </span></a>
    </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$(".closeimg",window.parent.document).unbind("click").click(function() {
		quxiao();
	});
});

function quxiao(){
	panClose();
}

function save(){
	var stoId = $.trim($("#stoId").val());
    var colId = $.trim($("#colId").val()); 
	var data = {};
	data.stoId = stoId;
	data.colId = colId;
	callback(data);
	panClose();
}
</script>
</html>