<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据对象管理</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<script src="${ctx}/common/js/custom/panComSelect.js"></script>
<link rel="stylesheet" href="${ctx}/common/css/commonGrid.css" type="text/css">
<link rel="stylesheet" href="${ctx}/project/base/baseDataManage.css" type="text/css">

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

.win-show {
    position: absolute;
    top: 0px;
    bottom: 0px;
    right: 0px;
    left: 0px;
    overflow: hidden;
}
.win-container {
    position: absolute;
    left: 25%;
    width: 630px;
    height: 400px;
    margin-top: 6%;
}
.win-title {
    height: 40px;
    background-color: #388EDD;
}
.win-content {
    height: 100%;
    border-left: 1px solid #8d8d8d;
    border-right: 1px solid #8d8d8d;
    border-bottom: 1px solid #8d8d8d;
    background-color: #fff;
}
.win-showlayer{
    position:absolute;
    top:0px;
    bottom:0px;
    right:0px;
    left:0px;
    background-color: #9C9A9A;
    filter: alpha(Opacity=60);
    -moz-opacity: 0.6;
    opacity: 0.6;
}
.sub-right{
    position: absolute;
    top: 44px;
    bottom: 0px;
    left: 260px;
    right: 0px;
    margin-left: 5px;
    overflow: hidden;
}
.sub-left {
    position: absolute;
    top: 44px;
    bottom: 0px;
    left: 00px;
    width: 260px;
    border: 1px solid #d8d8d8;
    font-size:14px;
}
.left-select {
    height: 40px;
    margin-top: 8px;
}
.left-title {
    height: 32px;
    border-bottom: 1px solid #d8d8d8;
}
.title-nav {
    float: left;
    width: 84px;
    height: 32px;
    font-size: 14px;
    border-right: 1px solid #d8d8d8;
    text-align: center;
    cursor: pointer;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">数据对象管理</div>
        </div>
        <div class="con-button">
            <a class="webbtn" href="javaScript:void(0)" style="" onclick="searchs()"><span class="ico_btn_add"></span><span> 过滤条件 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addRow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
    </div>
    <div class="sub-left">
        <div class="left-title">
            <div class="title-nav selectFocus" id="selectList"><i class="dctlist"></i><span class="title-span">列表</span></div>
            <div class="title-nav" id="selectStore"><i class="dct1"></i><span class="title-span">存储表</span></div>
            <div class="title-nav" id="selectField"><i class="field"></i><span class="title-span">字段</span></div>
        </div>
        <div class="left-select">
        	<span class="select-title">系统：</span>
        	<div name="sysSelect" id="sysSelect" class="panSelect_miniSize"></div>
        </div>
        <div class="left-grid" id="ulSys">
        	<ul id="left-ul" class="left-ul"></ul>
        </div>
        <div class="left-grid ui-display" id="gridSto">
        	<table class="grid" id="leftGrid"></table>
        	<div id="leftpager"></div>
        </div>
        <div class="left-grid ui-display" id="gridField">
        	<table class="grid" id="fieldGrid"></table>
        </div>
    </div>
    <div class="sub-right" id="side">
        <div></div>
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
</div>
</body>
<script type="text/javascript">
    var dom = "",
        leftDom = "",
        fieldDom = "",
        sysSelect = "",
        dctOwnerBa = "",
    	conWidth = $("#side").width(),
        conHeight = $("#side").height(),
        leftGridWidth = $(".sub-left").width(),
        leftGridHeight = $(".sub-left").height();
    $(document).ready(function(){
    	init();
    	$(window).resize(function() {
    		gridResize();
        });
    });
    function gridResize(){
        var iframeHeight = $("#side").height();
        var iframeWidth  = $("#side").width();
        var leftWidth = $(".sub-left").width();
        var leftHeight = $(".sub-left").height();
        dom.setGridHeight(iframeHeight-56);
        dom.setGridWidth(iframeWidth-5);
        leftDom.setGridHeight(leftHeight-110);
        leftDom.setGridWidth(leftWidth-5);
        fieldDom.setGridHeight(leftHeight-110);
        fieldDom.setGridWidth(leftWidth-5);
    }
    function init(){
    	dom = $("#jqGrid");
    	leftDom = $("#leftGrid");
    	fieldDom = $("#fieldGrid");
    	sysSelect = $("#sysSelect");
    	bindEvent();
    	createsysSelect();
    	createGrid();
    }
    //绑定事件 selectList selectStore selectField
    function bindEvent(){
    	//列表
    	$("#selectList").bind("click",function(){
    		$(this).addClass("selectFocus");
    		$("#selectStore").removeClass("selectFocus");
    		$("#selectField").removeClass("selectFocus");
    		$("#ulSys").removeClass("ui-display");
    		$("#gridSto").addClass("ui-display");
    		$("#gridField").addClass("ui-display");
    		querydofdicts(dctOwnerBa);
    	});
    	//存储表
    	$("#selectStore").bind("click",function(){
    		$(this).addClass("selectFocus");
    		$("#selectList").removeClass("selectFocus");
    		$("#selectField").removeClass("selectFocus");
    		$("#ulSys").addClass("ui-display");
    		$("#gridSto").removeClass("ui-display");
    		$("#gridField").addClass("ui-display");
    		createLeftGrid();
    	});
    	//字段
    	$("#selectField").bind("click",function(){
    		$(this).addClass("selectFocus");
    		$("#selectStore").removeClass("selectFocus");
    		$("#selectList").removeClass("selectFocus");
    		$("#ulSys").addClass("ui-display");
    		$("#gridSto").addClass("ui-display");
    		$("#gridField").removeClass("ui-display");
    		createFieldGrid();
    	});
    }
    function createGrid(){
    	var SQL_Filter = "";
    	dom.hlicDctGrid({
			"url"      : "${ctx}/base/queryDctGridPageList.action",
			"DCT_KEY"  : "COL_PK",
			"DCT_ID"   : "DOF_STORE_COLS",
   			"SQL_Filter":SQL_Filter,
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "pager"    : "pager"
		});
	}
    //存储表属性表展示
    function createLeftGrid(){
    	var SQL_Filter = "";
    	leftDom.hlicStoGrid({
    		"datatype" : "local",
			"url"      : "",
   			"SQL_Filter":SQL_Filter,
            "width"    : leftGridWidth-5,
            "height"   : leftGridHeight-110,
            "colNames" : ["键值","属性","内容"], 
            "colModel" : [
                {name : 'f_TASK_KEY',index : 'F_TASK_KEY',width : 60,hidden:true},
                {name : 'f_TASK_TITLE',index : 'F_TASK_TITLE',width : 120}, 
                {name : 'f_TASK_VALUE',index : 'F_TASK_VALUE',width : 120,editable:true}, 
            ]
		});
    	initLeftGridData();
	}
    function initLeftGridData(){
    	var sendData = {};
    	sendData.stoId = "WD_HTZXMX";
    	$.ajax({
            url:"${ctx}/queryBase/queryDofStoresParam.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            async:false,
            success : function(data){
            	if(data.length > 0){
            		leftDom.jqGrid('clearGridData');
            		for ( var i = 0; i < 20; i++){
            			leftDom.jqGrid('addRowData', i + 1, data[i]);
                	}
            	}
            }
        });
    }
    
    //字段属性展示
    function createFieldGrid(){
    	var SQL_Filter = "";
    	fieldDom.hlicStoGrid({
    		"datatype" : "local",
			"url"      : "",
   			"SQL_Filter":SQL_Filter,
            "width"    : leftGridWidth-5,
            "height"   : leftGridHeight-110,
            "colNames" : ["键值","属性","内容"], 
            "colModel" : [
                {name : 'f_TASK_KEY',index : 'F_TASK_KEY',width : 60,hidden:true},
                {name : 'f_TASK_TITLE',index : 'F_TASK_TITLE',width : 120}, 
                {name : 'f_TASK_VALUE',index : 'F_TASK_VALUE',width : 120,editable:true}, 
            ]
		});
    	initFieldGridData();
	}
    function initFieldGridData(){
    	var sendData = {};
    	sendData.stoId = "WD_HTZXMX";
    	sendData.colId = "F_PKEY";
    	$.ajax({
            url:"${ctx}/queryBase/queryDofStoreColsFieldParam.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            async:false,
            success : function(data){
            	if(data.length > 0){
            		fieldDom.jqGrid('clearGridData');
            		for ( var i = 0; i < 20; i++){
            			fieldDom.jqGrid('addRowData', i + 1, data[i]);
                	}
            	}
            }
        });
    }
    
    function initDate(e){
    	$(e).bind("click",function(){
    		WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});
    	});
    }
   
    //系统下来框
    function createsysSelect(){
    	sysSelect.hlicSelect({            
            "defaultItem" : "",
            "remote" : sys_ctx,
            "width" : "190px",
            "selectTime" : 100,
            "selectFirst":false,
            "maxHeight":"100",
            "searchfun":true,
            "createComplete":function(){
            	var list = [];
            	var queryDatas = hlicGridPlus.queryTableRows("queryBase/querySysApplicationsList.action",{});
            	if(queryDatas.length > 0){
            		$.each(queryDatas, function(k,v){
            			list.push({id:"k",text:v.fCaption+"("+v.fId+")"});
            		});
            	}
				sysSelect.hlicSelect("initData",list);
				sysSelect.hlicSelect("selectIndex",0);
				sysSelect.bind("change",function(){
					dctOwnerBa = queryDatas[0].fId;
					querydofdicts(dctOwnerBa); 
					
                });
				dctOwnerBa = queryDatas[0].fId;
				querydofdicts(dctOwnerBa);
            }
         });
    }
    /**
     * 查询系统下有哪些store
     * dctOwnerBa 系统类型SYS
     */
    function querydofdicts(dctOwnerBa){
    	var queryDatas = hlicGridPlus.queryTableRows("queryBase/queryDofDictsList.action",{"dctOwnerBa":dctOwnerBa});
    	if(queryDatas.length > 0){
    		$("#left-ul").children().remove();
    		var html = "";
    		for(var i=0; i<queryDatas.length; i++){
    			html += "<li class='left-li'><span class='listspan'></span><span class='listlispan'>"+queryDatas[i].dctCaption+"("+queryDatas[i].dctDofObj+")</span></li>";
    		}
    		$("#left-ul").append(html);
    		
    	}
    }
    function searchs(){
    	var sendData = {};
    	sendData.stoId = "WD_HTZXMX";
    	$.ajax({
            url:"${ctx}/queryBase/queryDofStoresParam.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            success : function(data){
                commonjs.tipAlert("提示","成功");
            }
        });
    }
    
    function addRow(){
    	var sendData = {};
    	sendData.STO_ID = "HX_YWXT";
    	$.ajax({
            url:"${ctx}/base/queryColsList.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            success : function(data){
                commonjs.tipAlert("提示","成功");
            }
        });
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	dom.hlicGrid("saveData", "${ctx}/base/upDataDofStoreColsGrid.action");
    }
</script>
</html>