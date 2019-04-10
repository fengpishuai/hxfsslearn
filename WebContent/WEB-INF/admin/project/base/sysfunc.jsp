<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>功能管理</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="${ctx}/common/css/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="${ctx}/common/css/commonGrid.css" type="text/css">
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
.left-select{
    float: right;
    margin-top: 9px;
    margin-right: 15px;
    font-size: 13px;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">功能管理</div>
        </div>
        <div class="con-button">
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
	    <div class="left-select" style="">
        	<span class="select-title">功能分组：</span>
        	<div name="grpSelect" id="grpSelect" class="panSelect_miniSize"></div>
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
        treeNodeId="",
        grpSelect = "";
    var dom = "",
    	conWidth = $("#side").width(),
        conHeight = $("#side").height();
    $(document).ready(function(){
    	grpSelect = $("#grpSelect");
    	createGrpSelect();
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
    	var sendData = {"F_APP_ID":1};
    	dom.hlicDctGrid({
			"url"      : "${ctx}/base/queryDctPageList.action",
			"DCT_ID"   : "SYS_FUNC",
			"DCT_KEY"  :"F_BH",
			"SQL_Filter":sendData,
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "pager"    : "pager"
		});
    }
    
    //功能所属分组
    function createGrpSelect(){
    	grpSelect.hlicSelect({            
            "defaultItem" : "",
            "remote" : sys_ctx,
            "width" : "190px",
            "selectTime" : 100,
            "selectFirst":false,
            "maxHeight":"100",
            "searchfun":true,
            "createComplete":function(){
            	var list = [];
            	var queryDatas = hlicGridPlus.queryTableRows("queryBase/querySysFuncGridList.action",{});
            	list.push({id:"",text:"全部"});
            	if(queryDatas.length > 0){
            		$.each(queryDatas, function(k,v){
            			list.push({id:v.fId,text:v.fName});
            		});
            	}
				grpSelect.hlicSelect("initData",list);
				grpSelect.hlicSelect("selectIndex",0);
				grpSelect.bind("change",function(data){
					search(data.val); 
                });
            }
         });
    }
    
    function search(id){
    	dom.hlicDctGrid("setSqlFilter",{"F_APP_ID":id});
    	dom.hlicDctGrid("reloadGridData");
    }
    
    //新增一行数据
    function addrow(){
    	dom.hlicDctGrid("addNewRow",{});
    }
   
    function delRow(){
    	deleteRow();
    }
    
    function deleteRow(){
    	var isdelEdit = true;
    	var rowid = dom.jqGrid("getGridParam","selrow");
    	var rowData = dom.jqGrid("getRowData",rowid);
    	var obj={};
    	if(rowData.fBh != ""){
    		obj.fBh = rowData.fBh;
        	delData.push(obj);
    	}
    	dom.find("tr[id='"+rowid+"']").attr("style","display:none");
    	dom.setGridParam({cellEdit:true});
    }
    
    function save(){
    	dom.hlicDctGrid("saveData",sys_ctx+"/base/insertBatchSysFunc.action");
    }
</script>
</html>