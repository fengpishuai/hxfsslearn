<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单管理</title>
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
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">菜单管理</div>
        </div>
        <div class="con-button">
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addRow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
    </div>
    <div class="leftMenu">
    	<ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="side" id="side" style="left:200px;">
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
<!--     <div class="con-bottom">
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
    </div> -->
</div>
</body>
<script type="text/javascript">
    var lastrow = 0,
        lastcell=0,
        editData=[],
        treeNodeId="";
    var dom = "",
    	conWidth = $("#side").width(),
        conHeight = $("#side").height();
    $(document).ready(function(){
    	dom = $("#jqGrid");
    	loadMenus();
    	createTable();
    	$(window).resize(function() {
    		gridResize();
        });
    });
    function gridResize(){
        var iframeHeight = $("#side").height();
        var iframeWidth  = $("#side").width();
        $("#jqGrid").setGridHeight(iframeHeight-56);
        $("#jqGrid").setGridWidth(iframeWidth-5);
    }
    //创建树
    function createTree(rowData){
    	var setting = {	
   			data: {
   				simpleData: {
   					enable: true
   				}
   			},
   			callback: {
   				onClick: zTreeOnClick
   			}
    	};
    	var zNodes =[];
    	for(var i=0;i<rowData.length;i++){
    		var obj={};
    		if(rowData[i].fParent==0){
    			obj.open=true;
    		}
    		obj.id=rowData[i].fMenuId;
    		obj.pId=rowData[i].fParent;
    		obj.name=rowData[i].fMenuName;
    		zNodes.push(obj);
    	}
    	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
    }
    //树节点点击事件
    function zTreeOnClick(event, treeId, treeNode) {
	    console.log(treeNode.tId + ", " + treeNode.name+","+treeNode.id);
	    treeNodeId = treeNode.id;
	    search(treeNodeId);
	};
	//加载菜单数据
	function loadMenus(){
		$.ajax({ 
	        url:"${ctx}/base/querySysMenusListB.action", 
	        type:'post', 
	        dataType:'json',
	        async : false
		}).done(function(data){
			createTree(data);
		});
	}
    function createTable(){
    	var sendData = {'F_PARENT':1};
    	dom.hlicDctGrid({
			"url"      : "${ctx}/base/queryDctPageList.action",
			"DCT_ID"   : "SYS_MENUS",
			"DCT_KEY"  : "F_MENU_ID",
			"PARENT_ID": "F_PARENT",
			"SQL_Filter":sendData,
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "pager"    : "pager"
		});
    }
    
    function search(id){
    	dom.hlicDctGrid("setSqlFilter",{'F_PARENT':id});
    	dom.hlicDctGrid("reloadGridData");
    	//dom.jqGrid('setGridParam',{postData:{"SQL_Filter":id}}).trigger('reloadGrid'); 
    }
    
    function addRow(){
    	if(treeNodeId==""){
    		dom.hlicDctGrid("addNewRow",{"F_PARENT":"000008"});
    	}else{
    		dom.hlicDctGrid("addNewRow",{"F_PARENT":treeNodeId});
    	}
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	dom.hlicDctGrid("saveData", "${ctx}/base/upDataSysMenusGrid.action");
    }
</script>
</html>