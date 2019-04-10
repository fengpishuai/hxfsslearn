<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store存储表管理</title>
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
    left: 284px;
    right: 0px;
    margin-left: 5px;
    overflow: hidden;
}
.sub-left {
    position: absolute;
    top: 44px;
    bottom: 0px;
    left: 00px;
    width: 285px;
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
.changeStyle{
    height:24px;
    width:188px;
    border:1px solid #aaa;
}
.list-item {
    font-size: 12px;
    height: 36px;
    color: #222222;
    list-style-type: none;
    cursor: pointer;
}
.item-select{
    background-color: #24A9E1!important;
    color: #FFF;
}
.con-buttonleft{
    float: left;
    height: 38px;
    line-height: 40px;
    width: 273px;
    color: #005399;
}
.con-buttonright{
    float: left;
    height: 38px;
    line-height: 40px;
    width: 273px;
    color: #005399;
}
.bottom-sto{
    position: absolute;
    bottom: 0px;
    right: 0px;
    height: 30px;
    margin-right: 18px;
    font-size: 13px;
    color: #333;
}
.storeId{
    display: inline-block;
    vertical-align: top;
    margin-top: 4px;
}
.editCell{
    height:30px;
}
.help-cell{
    display: inline-block;
    height: 30px;
    width: 80%;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-buttonleft">
           <span class="save-ico" onclick="save()" title="保存"></span>
           <span class="giveUp-ico" onclick="giveUp()" title="放弃保存"></span>
           <span class="add-ico"  onclick="addRow()" title="新增"></span>
           <span class="del-ico" onclick="delete()" title="删除"></span>
           <span class="refresh-ico" onclick="refresh()" title="刷新"></span>
        </div>
        <div class="con-buttonright">
            <a><span class="edit-ico"></span><span class="button-name">编辑</span></a>
	    </div>
    </div>
    <div class="sub-left">
        <div class="left-title">
            <div class="title-nav selectFocus" id="selectList"><i class="dctlist"></i><span class="title-span">列表</span></div>
            <div class="title-nav" id="selectStore"><i class="dct1"></i><span class="title-span">存储表</span></div>
            <div class="title-nav" id="selectField"><i class="field"></i><span class="title-span">字段</span></div>
        </div>
        <div class="left-grid" id="ulSys">
	        <div class="left-select" style="">
	        	<span class="select-title">系统：</span>
	        	<div name="sysSelect" id="sysSelect" class="panSelect_miniSize"></div>
	        </div>
	        <div class="left-select" style="margin-top:0px">
	        	<span class="select-title">切换：</span>
	        	<input type="text" class="changeStyle"/>
	        </div>
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
        <table class="grid" id="jqGrid"></table>
        <div class="bottom-sto" style=""><span id="storeId" class="storeId"></span></div>
    </div>
</div>
</body>
<script type="text/javascript">
/*********************************************************
queryDofStoreColsParamList   dof_store_cols 列属性  
queryDofStoresParam          dof_stores 属性配置  
queryDofStoreColsFieldParam  dof_store_cols 列属性配置 
queryDofStoresList           dof_stores 查询不同平台下有哪些store 
**********************************************************/
    var dom = "",
        leftDom = "",
        fieldDom = "",
        sysSelect = "",
        stoId = "",
        /*stoId 存储表ID；stoName 存储表名称;dataType 0:插入，1:更新，2:删除；sysId：属于哪个系统*/
        doSaveData = {},
        storeParam = [],//存储表属性
        storeField = [],//存储表字段属性
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
    	createsysSelect();
    	createGrid();
    	bindEvent();
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
    		querydofstores(stoOwnerBa);
    	});
    	//存储表
    	$("#selectStore").bind("click",function(){
    		$(this).addClass("selectFocus");
    		$("#selectList").removeClass("selectFocus");
    		$("#selectField").removeClass("selectFocus");
    		$("#ulSys").addClass("ui-display");
    		$("#gridSto").removeClass("ui-display");
    		$("#gridField").addClass("ui-display");
    		var storeId = $("#storeId").text();
    		createLeftGrid(storeId);
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
    	dom.hlicStoGrid({
    		"datatype" : "local",
			"url"      : "",
			"STO_KEY"  : "COL_PK",
   			"SQL_Filter":SQL_Filter,
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "colNames" : ["唯一编号","标识","标题","描述","字段类型","引用元素否","元素类型编号","元素类型","枚举否","枚举类型编号","枚举类型","引入字典编号","引用字典","启用","权限过滤","可见","虚拟","参照","参照列","参照属性"], 
            "colModel" : [
                {name : 'COL_PK',index : 'colPk',width : 83,hidden:true},        
                {name : 'COL_ID',index : 'colId',width : 83},
                {name : 'COL_CAPTION',index : 'colCaption',width : 120},
                {name : 'COL_TITLE',index : 'colTitle',width : 170},
                {name : 'COL_TYPE',index : 'COL_TYPE',width : 94,editable: true,align:"center",edittype:'custom',formatter:'select',
                	editoptions: { 
                		custom_element:pvt_selectelem, 
                		custom_value:pvt_selecvalue,
                		value:"0:无;1:字典"
                	}
                }, 
                {name : 'COL_ELEMENT_TYPE_MODE_FCB',index : 'COL_ELEMENT_TYPE_MODE_FCB',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 70,editable:true},
                {name : 'COL_ELEMENT_TYPE_FBH',index : 'COL_ELEMENT_TYPE_FBH',width : 110,editable: true,hidden:true},
                {name : 'COL_ELEMENT_TYPE_FMC',index : 'COL_ELEMENT_TYPE_FMC',width : 72,editable: true,width : 90,classes: 'cus-edit-td',align:"center"},
                {name : 'COL_ENUM_FCB',index : 'COL_ENUM_FCB',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 60},
                {name : 'COL_ENUM_KEY_FBH',index : 'COL_ENUM_KEY_FBH',width : 110,editable: true,hidden:true},
                {name : 'COL_ENUM_KEY_FMC',index : 'COL_ENUM_KEY_FMC',editable: true,width : 90,classes: 'cus-edit-td',align:"center"},
                {name : 'COL_FK_DCT_FBH',index : 'COL_FK_DCT_FBH',width : 110,editable: true,hidden:true},
                {name : 'COL_FK_DCT_FMC',index : 'COL_FK_DCT_FMC',width : 110,classes: 'cus-edit-td',editable: true},
                {name : 'COL_USE_FCB',index : 'COL_USE_FCB',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 60},
                {name : 'COL_FK_ACCESS',index : 'COL_FK_ACCESS',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 65},
                {name : 'COL_VISIBLE_FCB',index : 'COL_VISIBLE_FCB',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 60},
                {name : 'COL_VT',index : 'COL_VT',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 60},
                {name : 'COL_VT_REF',index : 'COL_VT_REF',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center",width : 60},
                {name : 'COL_VT_REF_ATTR',index : 'COL_VT_REF_ATTR',width : 60},
                {name : 'COL_VT_REF_ATTR',index : 'COL_VT_REF_ATTR',width : 78}
            ]
		});
    	dom.hlicStoGrid("setDctLink",{"COL_ELEMENT_TYPE_FMC":"DCT_ELEMENT","COL_ENUM_KEY_FMC":"DCT_ENUM","COL_FK_DCT_FMC":"DOF_DICTS"});
    	dom.bind("DSEVENT_ROW_CLICK",function(e,param){
    		if(!$("#gridField").is(":hidden")){
    			var rowData = dom.jqGrid("getRowData",param.rowid);
    			var stoId = $("#storeId").text();
    			initFieldGridData(stoId,rowData.COL_ID);
    		}
    	});
	}
  //定义普通select的edittype+++++++开始+++++++++
	//私有pvt=private
	function pvt_selectelem(value, options) {
		var elemid = options.id;
		var jqgridelem = options.jqGridElem;
		var option = $("<option>");
		var dom = $("<select />").css("width","100%");;
		if(options.value!=null){
			var keyValue = options.value.split(";");
			for(var i = 0;i<keyValue.length;i++){
				var splitKeyValue = keyValue[i].split(":");
				option.clone().attr("value",splitKeyValue[0]).html(splitKeyValue[1]).appendTo(dom);
			}
		}else{
			console.error("The dom of select needs values!");
		}
		return dom.val(value);
	};
	
	function pvt_selecvalue(elem, operation, value) {
		if (operation === 'get') {
			$(elem).trigger("blur");
			$(elem).trigger("change_value");
			return $(elem).val();
		} else if (operation === 'set') {
			$(elem).val(value);
		}
	};
	//定义普通select的edittype+++++++结束+++++++++
    function initGrid(stoId){
    	var sendData = {};
    	sendData.STO_ID = stoId;
    	$.ajax({
            url:sys_ctx+"/base/queryDofStoreColsParamList.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            async:false
        }).done(function(data){
        	if(data.colList.length > 0){
        		dom.jqGrid('clearGridData');
        		for ( var i = 0; i < data.colList.length; i++){
        			dom.jqGrid('addRowData', i + 1, data.colList[i]);
            	}
        	}
        });
    }
    //存储表属性表展示
    function createLeftGrid(storeId){
    	var SQL_Filter = "";
    	leftDom.hlicStoGrid({
    		"datatype" : "local",
			"url"      : "",
   			"SQL_Filter":SQL_Filter,
            "width"    : leftGridWidth-5,
            "height"   : leftGridHeight-60,
            "cellEdit" : false,
            "colNames" : ["键值","属性","内容"], 
            "colModel" : [
                {name : 'f_TASK_KEY',index : 'F_TASK_KEY',width : 60,hidden:true},
                {name : 'f_TASK_TITLE',index : 'F_TASK_TITLE',width : 120}, 
                {name : 'f_TASK_VALUE',index : 'F_TASK_VALUE',width : 130,editable:true}, 
            ]
		});
    	initLeftGridData(storeId);
	}
    function initLeftGridData(stoId){
    	var sendData = {};
    	sendData.stoId = stoId;
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
            		setCellEditType(data);
            	}
            }
        });
    }
    //存储表内容单元格格式化设置
    function setCellEditType(data){
    	for ( var i = 0; i < 20; i++){
    		//唯一主键
    		if(data[i].f_TASK_KEY == "StoKeyField"){
    			data[i].f_TASK_VALUE = "<div class='editCell help-cell' t='12' cell='text' aria-describedby='' editable='true'><input type='text' id='stoKeyField' style='width: 100%;height: 27px;' value='"+data[i].f_TASK_VALUE+"' /></div><i name='' class='commonGridSearch' onclick='selectPkHelp()'></i>";
    		}
    		//键生成规则
            if(data[i].f_TASK_KEY == "StoKeyMode"){
            	var selectObjHtml = "<select id='stoKeyMode' enable='' t='3'  name=''  style='font-size:12px;border:0px solid transparent;background:#FFFFFF;width:100%;height:98%;' align='center'><option value=' '></option>";
            	if(data[i].f_TASK_VALUE != ""){
            		if(data[i].f_TASK_VALUE == "ONINSERT"){
            			selectObjHtml += "<option value='ONINSERT' selected='selected'>ONINSERT</option><option value='ONCOMIT'>ONCOMIT</option>";
            		}
                    if(data[i].f_TASK_VALUE == "ONCOMIT"){
                    	selectObjHtml += "<option value='ONINSERT'>ONINSERT</option><option value='ONCOMIT' selected='selected'>ONCOMIT</option>";
            		}
            	}else{
            		selectObjHtml = selectObjHtml +"<option value='ONINSERT'>ONINSERT</option><option value='ONCOMIT'>ONCOMIT</option>";
            	}
        		data[i].f_TASK_VALUE = "<div class='editCell' t='3' cell='select' aria-describedby='' editable='true'>"+selectObjHtml+"</div>";
    		}
    		//键生成算法 f_TASK_VALUE
            if(data[i].f_TASK_KEY == "StoKeyCrtr"){
    			data[i].f_TASK_VALUE = "<div class='editCell help-cell' t='12' cell='text' aria-describedby='' editable='true'><input type='text' id='stoKeyCrtr' style='width: 100%;height: 27px;' value='"+data[i].f_TASK_VALUE+"' /></div><i name='' class='commonGridSearch' onclick='selectKeyCrtrHelp()'></i>";
    		}
			leftDom.jqGrid('addRowData', i + 1, data[i]);
    	}
    	$("#stoKeyMode").change(function(){
    		var param = $(this).children('option:selected').val();
    		setStoParam("stoKeyMode",param);
    	});
    }
    //唯一主键弹出框
    function selectPkHelp(){
    	var sendData = {};
    	sendData.stoId = doSaveData.stoId;
    	sendData.dctId = "";
    	$(window.top.document).find("#selectPkHelp").hlicComSelect({
            "width"    : "600px",//弹出框的宽度
            "height"   : "360px",//弹出框的高度   
            "title":"设置条件",
            "loadtext":"正在加载中...",
            "url"      : sys_ctx+"/common/help/selectPkHelp.jsp",
            "dydata"   : sendData,
            "onlyfirst"  : false,
            "parenturl"  : window.location.href,
            "callback" : function(data){
            	var fpkey = data.F_ID;
            	$("#stoKeyField").val(fpkey);
            	setStoParam("stoKeyField",fpkey);
            }
        });
    }
    //键生成算法
    function selectKeyCrtrHelp(){
    	var sendData = {};
    	$(window.top.document).find("#selectKeyCrtrHelp").hlicComSelect({
            "width"    : "600px",//弹出框的宽度
            "height"   : "360px",//弹出框的高度   
            "title":"设置条件",
            "loadtext":"正在加载中...",
            "url"      : sys_ctx+"/common/help/selectKeyCrtrHelp.jsp",
            "dydata"   : sendData,
            "onlyfirst"  : false,
            "parenturl"  : window.location.href,
            "callback" : function(data){
            	var fpkey = data.F_ID;
            	$("#stoKeyCrtr").val(fpkey);
            	setStoParam("stoKeyCrtr",fpkey);
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
            "height"   : leftGridHeight-60,
            "colNames" : ["键值","属性","内容"], 
            "colModel" : [
                {name : 'f_TASK_KEY',index : 'F_TASK_KEY',width : 60,hidden:true},
                {name : 'f_TASK_TITLE',index : 'F_TASK_TITLE',width : 120}, 
                {name : 'f_TASK_VALUE',index : 'F_TASK_VALUE',width : 130,editable:true}, 
            ]
		});
	}
    function initFieldGridData(stoId,colId){
    	var sendData = {};
    	sendData.stoId = stoId;
    	sendData.colId = colId;
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
            			list.push({id:v.fId,text:v.fCaption+"("+v.fId+")"});
            		});
            	}
				sysSelect.hlicSelect("initData",list);
				sysSelect.hlicSelect("selectIndex",0);
				sysSelect.bind("change",function(data){
					stoOwnerBa = data.val;
					doSaveData.sysId = stoOwnerBa;
					querydofstores(stoOwnerBa); 
                });
				stoOwnerBa = queryDatas[0].fId;
				doSaveData.sysId = stoOwnerBa;
				querydofstores(stoOwnerBa);
            }
         });
    }
    /**
     * 查询系统下有哪些store
     * stoId 系统类型SYS
     */
    function querydofstores(stoOwnerBa){
    	var queryDatas = hlicGridPlus.queryTableRows("queryBase/queryDofStoresList.action",{"stoOwnerBa":stoOwnerBa});
    	if(queryDatas.length > 0){
    		doSaveData.dataType = "1";
    		$("#left-ul").children().remove();
    		var html = "";
    		for(var i=0; i<queryDatas.length; i++){
    			html += "<li class='list-item' stoId='"+queryDatas[i].stoId+"'><span class='storelist'></span><span class='listlispan'>"+queryDatas[i].stoCaption+"("+queryDatas[i].stoId+")</span></li>";
    		}
    		$("#left-ul").append(html);
    		initGrid(queryDatas[0].stoId);//查询dct表明细属性
    		$("#storeId").text(queryDatas[0].stoId);
    		doSaveData.stoId = queryDatas[0].stoId;
    		//列表绑定事件
        	$(".list-item").bind("click",function(){
        		$(".item-select").removeClass("item-select");
        		$(this).addClass("item-select");
        		var stoId = $(this).attr("stoId");
        		$("#storeId").text(stoId);
        		doSaveData.stoId = stoId;
        		initGrid(stoId);//查询dct表明细属性
        	});
    	}
    }
    //设置存储表属性
    function setStoParam(stoKey, stoParam){
    	var stoId = doSaveData.stoId;
    	var stoObj = {},
    	    hasStore = [],
    	    isParam = true,
    	    isStore = true;
    	if(storeParam.length > 0){
    		for(var i=0; i<storeParam.length; i++){
        		$.each(storeParam[i],function(key,val){
        			//判断是否有这个store
        			if(val == stoId){
        				//判断store中是否有这个属性
        				if(key == stoKey){
        					storeParam[i][key] = stoParam;
        					isParam = false;
        				}
        				hasStore = storeParam[i];
        				storeParam.splice(i, 1);
        				isStore = false;
        			}
        		});
        	}
    		//新增一个Store
    		if(isStore){
    			stoObj.stoId = stoId;
    			stoObj[stoKey] = stoParam;
    			storeParam.push(stoObj);
    		}
    		//store中新增一个param
    		if(!isStore && isParam){
    			hasStore[stoKey] = stoParam;
    			storeParam.push(hasStore);
    		}
    	}else{
    		stoObj.stoId = stoId;
    		stoObj[stoKey] = stoParam;
    		storeParam.push(stoObj);
    	}
    }
    //设置存储表列属性
    function setStoField(stoField){
    	if(storeField.length > 0){
    		for(var i=0; i<storeField.length; i++){
        		$.each(storeField[i],function(key,val){
        			
        		});
        	}
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
    
    function save() {
    	var gridData = dom.hlicStoGrid("getSaveData");
    	var sendData = {};
    	sendData.stoId = doSaveData.stoId; //存储表ID
    	sendData.sysId = doSaveData.sysId; //属于哪个系统
    	sendData.storeParam = storeParam;
    	sendData.gridData = gridData;
    	$.ajax({
            url:"${ctx}/base/setStoreData.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData)
        }).done(function(data){
        	if(data.type == "0"){
        		doSaveData = {};
        		tipInfo("提示","保存成功！",1000,0);
        	}
        });
    }
</script>
</html>