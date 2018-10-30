<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>功能所属分组</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="${ctx}/common/css/zTreeStyle.css" type="text/css">
<script src="${ctx}/common/js/jquery.ztree.all.min.js"></script>
<style type="text/css">
.someClass{
    background-color: #FBFAE2;
}
.leftMenu{
	position:absolute;
	top:42px;
	left:0px;
	bottom: 1px;
	width:200px;
	border-right: 1px solid #DEDBDB;
    border-bottom: 1px solid #DEDBDB;
    border-top: 1px solid #DEDBDB;
}
.backlayer{
    background-color: #8d8d8d;
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    filter: ();
    filter: alpha(opacity=50);
    -moz-opacity: 0.5;
    opacity: 0.5;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">功能所属分组</div>
        </div>
        <div class="con-button">
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
    </div>
    <div class="side" id="side">
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
</div>
</body>
<script type="text/javascript">
    var lastrow = 0,
        lastcell=0,
        editData=[],//编辑的数据
        newData = [],//新增的数据
        delData = [],//删除的数据
        treeNodeId="";
    var dom = "",
    	conWidth = $("#side").width(),
        conHeight = $("#side").height();
    $(document).ready(function(){
    	init();
    	$(window).resize(function() {
    		gridResize();
        });
    });
    //初始化数据
    function init(){
    	dom = $("#jqGrid");
    	createTable();
    }
    function gridResize(){
        var iframeHeight = $("#side").height();
        var iframeWidth  = $("#side").width();
        dom.setGridHeight(iframeHeight-56);
        dom.setGridWidth(iframeWidth-5);
    }
	
    function createTable(){
    	dom.hlicDctGrid({
			"url"      : "${ctx}/base/queryDctPageList.action",
			"DCT_ID"   : "SYS_FUNC_GRP",
			"DCT_KEY"  : "F_ID",
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "pager"    : "pager"
		});
    }
    
    function search(id){
    	var sendData = {"F_MENU_ID":id};
    	dom.hlicDctGrid("queryGridData",sendData);
    }
    
    //新增一行数据
    function addrow(){
    	dom.hlicDctGrid("addNewRow",{});
    }
    function delRow(){
    	dom.hlicDctGrid("deleteRow");
    }
    
    function save(){
    	dom.hlicDctGrid("saveData",sys_ctx+"/base/saveSysFuncGrpData.action");
    }
</script>
</html>