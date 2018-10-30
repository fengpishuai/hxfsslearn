<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>知识库</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="${ctx}/common/css/commonGrid.css" type="text/css">
<link rel="stylesheet" href="${ctx}/common/test/css/ask.css" type="text/css">
<style type="text/css">
.top{
    position: absolute;
    top: 0px;
    left: 0px;
    right: 0px;
    height: 50px;
    text-align: center;
    margin-top: 10px;
    border-bottom: 1px solid #cbcbcb;
}
.searchs{
    height: 28px;
    width: 300px;
    border-radius: 3px;
    border: 1px solid #ccc;
    padding-left: 10px;
    padding-right: 10px;
}
.containor{
    position: absolute;
    top: 103px;
    left: 0px;
    right: 270px;
    bottom: 0px;
    margin-left: 116px;
    /* margin-right: 116px; */
    font-size: 14px;
}
.con-ask{
    border-top: 1px solid #e6e3e3;
    border-bottom: 1px solid #e6e3e3;
    padding: 10px;
    margin-bottom: 18px;
}
.con-show{
   margin-left: 18px;
   color: #039393;
}
.con-title{
   padding: 18px 0 18px 0;
   letter-spacing: 2px;
   color: #cb0008;
   border-bottom: 1px solid #e6e3e3;
}
.con-content{
   padding: 10px 0 10px 0;
}
.question{
    display: inline-block;
    vertical-align: top;
    margin-top: 5px;
    margin-left: 13px;
}
.con-search{
    position: absolute;
    top: 70px;
    left: 0px;
    right: 0px;
    height: 33px;
    margin-left: 200px;
    margin-right: 200px;
    font-size: 12px;
    color: #696464;
}
.con-select{
    display: inline-block;
    width: 150px;
    height: 24px;
    border: 1px solid #efe6e6;
    color: #636060;
    font-size: 12px;
}
  
.com-containor{
    position: absolute;
    top: 0px;
    bottom: 40px;
    left: 0px;
    right: 0px;
}
.com-content{
    position: absolute;
    top: 40px;
    bottom: 40px;
    left: 0px;
    right: 0px;
}
.search-input{
    position: absolute;
    top: 6px;
    right: 103px;
    left: 9px;
}
.btndiv{
    position: absolute;
    bottom: 0px;
    right: 0px;
    margin-right: 10px;
}
.right{
    position: absolute;
    top: 103px;
    right: 10px;
    width: 246px;
    font-size: 13px;
    color: #484646;
    background-color: #f9f8f8;
}
.rig-title{
    font-size: 14px;
    font-weight: 600;
    background-color: #f9f8f8;
    padding: 12px 24px;
}
.rig-li{
    padding-left: 23px;
    line-height: 38px;
    color: #2196F3;
    white-space:nowrap; 
    text-overflow:ellipsis;
    overflow:hidden; 
    cursor:pointer;
}
</style>
</head>
<body>
<div class="top">
    <input class="searchs" id="searchsId" placeholder="搜索你感兴趣的问题">
    <a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="searchs()"><span class="ico_btn_add"></span><span> 搜索  </span></a>
</div>
<div class="con-search">
    <select class="con-select">
        <option value="">全部</option>
        <option value="hxfss">华夏幸福共享运营平台</option>
        <option value="hxda">华夏幸福档案系统</option>
    </select>
    <a class="con-show" target="_blank" href="${ctx}/ypml/question.action">提问问题</a>
</div>
<div class="containor" id="containor">
   
</div>
<div class="right">
    <div class="rig-title">热点问题</div>
    <div class="rig-content" id="rig-content">
       
    </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$(".con-select").change(function(){ 
		searchs();
    }); 
	hotQuestion();
});
function searchs(){
	var titleVal = $("#searchsId").val();
	var project = $(".con-select").val();
	if(titleVal == ""){
		tipAlert("提示","搜索问题不能为空","确定");
		return;
	}
	searchData(titleVal, project);
}
function searchData(titleVal, project){
	var saveData = {};
	saveData.title = titleVal;
	saveData.project = project;
	$.ajax({ 
        url:"${ctx}/ypml/queryHxQuestion.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
        	if(data.length > 0){
        		$("#containor").children().remove();
        		$.each(data,function(k,v){
        			var html = '<div class="con-ask">'
        		           +    '<div><span>'+v.fZdr+'</span><span style="margin-left: 18px;">'+v.fZdsj+'</span><a href="javascript:void(0)" class="con-show" zbid="'+v.fPkey+'" count="'+v.fClick+'" onclick="showAsk(this)">查看答案</a><a href="javascript:void(0)" class="con-show" zbid="'+v.fPkey+'" onclick="askHelp(this)">回答问题</a></div>'
        		           +    '<div class="con-title"><span class="questionImg"></span><span class="question">'+v.fWttitle+'</span></div>'
        		           +    '<div class="con-content" id="'+v.fPkey+'"></div>'
        		           +'</div>';
        		    $("#containor").append(html); 
        		});
        	}else{
        		tipAlert("提示","没有您搜索的问题！","确定");
        	}
        } 
    });
}
//展示问题
function showAsk(self){
	var contentId = $(self).attr("zbid");
	var fClick = parseInt($(self).attr("count"));
	var saveData = {};
	saveData.ssdjbh = contentId;
	saveData.fClick = fClick+1;
	$.ajax({ 
        url:"${ctx}/ypml/queryHxQuestionMxList.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
        	if(data.length > 0){
        		$(self).attr("count", fClick+1);
        		$("#"+contentId).children().remove();
        		$.each(data,function(k,v){
        			var html = '<div class="con-ask">'
        			          +'    <div style="color: #9C27B0;"><span >回答人：'+v.fHdr+'</span><span style="margin-left: 10px;">'+v.fHdsj+'</span><a href="javascript:void(0)" class="con-show" zbid="'+v.fPkey+'" onclick="editHelp(this)">修改</a></div>'
        			          +'    <div class="ask-content">'+v.fHdnr+'</div>'
        			          +'</div>';
        			$("#"+contentId).append(html);
        		});
        	}
        }
	});
}
//回答问题
function askHelp(self){
	var contentId = $(self).attr("zbid");
	var sendData = {"pkey":contentId};
	$(window.top.document).find("#askHelp").hlicComSelect({
		"width"    : "720px",//弹出框的宽度
        "height"   : "480px",//弹出框的高度   
        "title":"设置条件",
        "loadtext":"正在加载中...",
        "url"      : sys_ctx+"/common/test/askHelp.jsp",
        "dydata"   : sendData,
        "onlyfirst"  : true,
        "parenturl"  : window.location.href,
        "callback" : function(data){
        
        }
    });
}
//修改回答
function editHelp(self){
	var contentId = $(self).attr("zbid");
	var sendData = {"pkey":contentId};
	$(window.top.document).find("#editHelp").hlicComSelect({
		"width"    : "720px",//弹出框的宽度
        "height"   : "480px",//弹出框的高度   
        "title":"设置条件",
        "loadtext":"正在加载中...",
        "url"      : sys_ctx+"/common/test/editHelp.jsp",
        "dydata"   : sendData,
        "onlyfirst"  : true,
        "parenturl"  : window.location.href,
        "callback" : function(data){
        
        }
    });
}
//热点问题查询 rig-content
function hotQuestion(){
	var saveData = {};
	$.ajax({ 
        url:"${ctx}/ypml/queryHotHxQuestionList.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){
        	if(data.rows.length > 0){
        		$.each(data.rows,function(k,v){
        			var html = '<div class="rig-li" title="'+v.F_WTTITLE+'" onclick="hotSearch(this)">'+v.F_WTTITLE+'</div>';
        			$("#rig-content").append(html);
        		});
        	}
        }
	});
}
function hotSearch(self){
	var titleVal = $(self).attr("title");
	searchData(titleVal, "");
}
</script>
</html>