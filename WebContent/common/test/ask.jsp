<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回答问题</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
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
	        position:absolute;
	        top:103px;
	        left:0px;
	        right:0px;
	        bottom:0px;
	        margin-left: 200px;
            margin-right: 200px;
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
	   .questionImg{
		    width: 37px;
		    height: 32px;
		    display: inline-block;
		    background-image: url(./img/question.png);
		    background-repeat: no-repeat;
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
</div>
<div class="containor" id="containor">
   
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
});
function searchs(){
	var titleVal = $("#searchsId").val();
	if(titleVal == ""){
		tipAlert("提示","搜索问题不能为空","确定");
		return;
	}
	var saveData = {};
	saveData.title = titleVal;
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
        		           +    '<div><span>'+v.fZdr+'</span><span style="margin-left: 18px;">'+v.fZdsj+'</span><a href="javascript:void(0)" class="con-show" zbid="'+v.fPkey+'" onclick="showAsk(this)">查看答案</a><a href="javascript:void(0)" class="con-show" zbid="'+v.fPkey+'" onclick="askHelp(this)">回答问题</a></div>'
        		           +    '<div class="con-title"><span class="questionImg"></span><span class="question">'+v.fWttitle+'</span></div>'
        		           +    '<div class="con-content" id="'+v.fPkey+'"></div>'
        		           +'</div>';
        		    $("#containor").append(html); 
        		});
        	}
        } 
    });
}
//展示问题
function showAsk(self){
	var contentId = $(self).attr("zbid");
	var saveData = {};
	saveData.ssdjbh = contentId;
	$.ajax({ 
        url:"${ctx}/ypml/queryHxQuestionMxList.action", 
        type:'post', 
        dataType:'json', 
        contentType:"application/json",
        data:JSON.stringify(saveData), 
        success : function(data){ 
        	if(data.length > 0){
        		$("#"+contentId).children().remove();
        		$.each(data,function(k,v){
        			var html = '<div class="con-ask">'
        			          +'    <div><span>回答人：'+v.fHdr+'</span><span>'+v.fHdsj+'</span></div>'
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
	$(window.top.document).find("#askHelp").hlicComSelect({
        "width"    : "800px",//弹出框的宽度
        "height"   : "600px",//弹出框的高度   
        "title":"设置条件",
        "loadtext":"正在加载中...",
        "url"      : sys_ctx+"/common/test/askHelp.jsp",
        "onlyfirst"  : false,
        "parenturl"  : window.location.href,
        "callback" : function(data){
        	
        }
    });
}
</script>
</html>