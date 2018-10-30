<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>药品信息导入</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<style type="text/css">
body{margin:0;padding:0;} 

.btn_addPic{ 
	display: block; 
	position: relative; 
	width: 140px; 
	height: 39px; 
	overflow: hidden; 
	border: 1px solid #EBEBEB; 
	background: none repeat scroll 0 0 #F3F3F3; 
	color: #999999; 
	cursor: pointer; 
	text-align: center; 
	text-decoration:none;
} 
.btn_addPic span{display: block;line-height: 39px;} 
.btn_addPic:hover em{background-position:-19px 0;} 
.filePrew { 
	display: block; 
	position: absolute; 
	top: 0; 
	left: 0; 
	width: 140px; 
	height: 39px; 
	/* font-size: 100px; */ /* 增大不同浏览器的可点击区域 */ 
	opacity: 0; /* 实现的关键点 */ 
	filter:alpha(opacity=0);/* 兼容IE */ 
} 
</style>
</head>
<body>
<div>
    <div class="filename" style="height:200px;text-align:center;">
    
    </div>
    <div>
        <form id="importExcelForm" action="" enctype="multipart/form-data" style="text-align: center;">
            <a class="webbtn" href="javaScript:void(0)" style="">
                <span> 添加文件 </span>
                <input class="filePrew" title="支持jpg、jpeg、gif、png格式，文件小于5M"  type="file" name="ypxximportfile" onchange="return addFileName()">
            </a>
	        <a class="webbtn" href="javaScript:void(0)" style="" id="btn-submit"><span class="ico_btn_add"></span><span> 保  存 </span></a>
		</form>
    </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	bindEvent();
});
//获取文件名称
function addFileName(){
	var file = $(".filePrew").val();
	var fileName = file.split("\\");
	fileName = fileName[fileName.length-1];
    $(".filename").text(fileName);
}
//保存文件
function bindEvent(){
    $("#btn-submit").on("click",function(){
    	var options = {
			type: "post", // 提交方式 get/post
            url: "${ctx}/ypml/importypxxsubmit.action", // 需要提交的 url
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