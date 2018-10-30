<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<style type="text/css">
.someClass{
    background-color: #FBFAE2;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">用户管理</div>
        </div>
    </div>
    <div class="side" id="side">
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
    <div class="con-bottom">
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addrow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
        <a class="webbtn" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
    </div>
</div>
</body>
<script type="text/javascript">
    var lastrow = 0,
        lastcell=0,
        editData=[];
    var conWidth = $("#side").width(),
        conHeight = $("#side").height();
    $(document).ready(function(){
    	//createTable();
    	createTable2();
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
    function createTable2(){
    	$("#jqGrid").jqGrid({
    		datatype: "json", //将这里改为使用JSON数据 
    		url:'${ctx}/user/queryuser_result.action', //这是Action的请求地址 
    		mtype: 'POST', 
    		jsonReader:{
   		　　　　//id: "Id", //相当于设置主键
   		　　　　total: "totals",　　 //总页数(数据库中数据一共有多少页)
   		　　　　page: "page",　　//当前页
   		　　　　records: "records",//总记录数（一共多少条）
   		       root: "rows",　　　 //Json数据{jqGrid需要的数据行}
   		　　　　repeatitems: false
   		　　},
    		width: conWidth-5,
            height: conHeight-56,
    		colNames:['编号','姓名', '电话'], 
    		colModel:[ 
    		{name:'usrUsrid',index:'usrUsrid',editable: true, width:60, sorttype:"int"}, 
            {name:'usrName',index:'usrName',editable: true,align:"center", width:90}, 
            {name:'usrPhone1',index:'usrPhone1',editable: true, width:100}
    		], 
    		pager: 'pager', //分页工具栏 
    		//imgpath: 'js/themes/basic/images', //图片存放路径 
    		rowNum:10, //每页显示记录数 
    		//rownumbers:true, //行序号
    		viewrecords: true, //是否显示行数 
    		rowList:[10,20,30], //可调整每页显示的记录数 
    		multiselect: false, //是否支持多选 
    		loadonce : false,//loadonce 如果设置为true，grid只从服务器加载一次数据。加载数据完成之后，datatype就被指定为local，并且以后所有的操作都是基于客户端的操作，同时，导航功能也会被禁用
    		altRows: true,
            altclass:"someClass",
    		cellsubmit: "clientArray",//防止错误提示
    		cellEdit:true,
    		//caption: "信息显示",
    		beforeEditCell:function(rowid,cellname,v,iRow,iCol){
    			lastrow = iRow;
    			lastcell = iCol;
    	    },
    	    afterEditCell:function(rowid,cellname,v,iRow,iCol){
    	    	console.log(1);
    	    },
    	    beforeSaveCell:function(rowid,cellname,value,iRow,iCol){
                var flag = true,
                    editRowData={};
                if(editData.length>0){
                	$.each(editData,function(k,v){
                		//当有此行时直接更新此行数据或者修改以前旧值
                        if(v.iRow==iRow){
                        	v[cellname]=value;
                        	flag = false;
                        }
                    });
                	if(flag){
                		//当数组中没有编辑的行数据，在数组中添加一行
                		var rowData = $("#jqGrid").jqGrid("getRowData",rowid);
                		var id = rowData.id;
                		editRowData["id"]=id;
                		editRowData["iRow"]=iRow;
                        editRowData[cellname]=value;
                        editData.push(editRowData);
                	}
                }else{
                	//第一次进来赋值
                	var rowData = $("#jqGrid").jqGrid("getRowData",rowid);
                    var id = rowData.id;
                    editRowData["id"]=id;
                	editRowData["iRow"]=iRow;
                    editRowData[cellname]=value;
                    editData.push(editRowData);
                }
                console.log(editData);
            },
    	});
    }
    
    //新增一行数据
    function addrow(){
    	$("#jqGrid").hlicGrid({
    		"url":"",
            "sendData":"",
            "saveSendData":"",
            "colNames":"",
            "colModel":""
    	});
    	$("#jqGrid").hlicGrid("addRowData");
    }
    
    function save(){
    	commonjs.tipAlert("提示","成功");
    	$("#jqGrid").jqGrid("saveCell",lastrow,lastcell);//防止编辑取出html格式的值
    	if(editData.length>0){
    		$.ajax({ 
                url:"${ctx}/user/submitSysUser.action", 
                type:'post', 
                dataType:'json', 
                contentType:"application/json",
                data:JSON.stringify(editData), 
                success : function(data){ 
                    console.log(data); 
                    editData=[];
                } 
            });
    	}
    	
    }
</script>
</html>