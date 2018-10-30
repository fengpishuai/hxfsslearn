<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建Dct表</title>
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
    width: 289px;
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
.gridBtn{
    margin-right:10px;
    cursor:pointer;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-buttonleft">
           <span class="save-ico" onclick="save()" title="保存"></span>
           <span class="giveUp-ico" onclick="giveUp()" title="放弃保存"></span>
           <span class="add-ico"  onclick="addTable()" title="新增"></span>
           <span class="del-ico" onclick="delTable()" title="删除"></span>
           <span class="refresh-ico" onclick="refresh()" title="刷新"></span>
        </div>
        <div class="con-buttonright">
            <a class="gridBtn"><span class="edit-ico"></span><span class="button-name">编辑</span></a>
            <a class="gridBtn" onclick="addRow()"><span class="grid-add-ico"></span><span class="button-name">新增</span></a>
            <a class="gridBtn" onclick="delRow()"><span class="grid-del-ico"></span><span class="button-name">删除</span></a>
	    </div>
    </div>
    <div class="sub-left">
        <div class="left-title">
            <div class="title-nav selectFocus" id="selectList"><i class="dctlist"></i><span class="title-span">列表</span></div>
            <div class="title-nav" id="selectStore"><i class="dct1"></i><span class="title-span">字典表</span></div>
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
/***************************************************
queryDofDctColsParamList  dof_dct_cols 列属性  
queryDofDictsParam        dof_dicts 属性配置 
queryDofDctColsFieldParam dof_dct_cols 列属性配置 
queryDofDictsList         dof_dicts 查询不同平台下有哪些dct 
****************************************************/
    var dom = "",
        leftDom = "",
        fieldDom = "",
        sysSelect = "",
        stoId = "",
        doSaveData = {},/*stoId 存储表ID；stoName 存储表名称;dataType 0:插入，1:更新，2:删除；sysId：属于哪个系统*/
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
    		querydofdicts(stoOwnerBa);
    	});
    	//存储表
    	$("#selectStore").bind("click",function(){
    		$(this).addClass("selectFocus");
    		$("#selectList").removeClass("selectFocus");
    		$("#selectField").removeClass("selectFocus");
    		$("#ulSys").addClass("ui-display");
    		$("#gridSto").removeClass("ui-display");
    		$("#gridField").addClass("ui-display");
    		var dctId = $("#storeId").text();
    		createLeftGrid(dctId);
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
            "cellEdit" : true,
            "colNames" : ["唯一编号","标识","标题","数据类型","缺省值","主键","空否","存储表ID"], 
            "colModel" : [
                {name : 'COL_PK',index : 'colPk',width : 83,hidden:true},        
                {name : 'COL_ID',index : 'colId',width : 83,editable: true},
                {name : 'COL_CAPTION',index : 'colTitle',width : 170,editable: true},
                {name : 'COL_DATA_TYPE',index : 'COL_DATA_TYPE',width : 78,editable: true,align:"center",edittype:'custom',formatter:'select',
                	editoptions: {
                		custom_element:pvt_selectelem, 
                		custom_value:pvt_selecvalue,
                		value:"varchar:字符型;numeric:整型;float:数值型;datetime:时间型"
                	}
                },
                {name : 'COL_DEFAULT',index : 'COL_DEFAULT',width : 78,editable: true},
                {name : 'DCT_FID_FCB',index : 'STO_KEY_FIELD_FCB',width : 78,editable: true,edittype:'checkbox',formatter:'checkbox',align:"center"},
                {name : 'COL_NULL_FCB',index : 'COL_NULL_FCB',width : 78,editable: true,edittype:'checkbox',formatter:'checkbox',align:"center"},
                {name : 'STO_ID',index : 'STO_ID',width : 83,hidden:true}
            ]
		});
    	dom.hlicStoGrid("setDctLink",{"COL_ELEMENT_TYPE_FMC":"DCT_ELEMENT","COL_ENUM_KEY_FMC":"DCT_ENUM","COL_FK_DCT_FMC":"DOF_DICTS"});
    	dom.bind("DSEVENT_ROW_CLICK",function(e,param){
    		if(!$("#gridField").is(":hidden")){
    			var rowData = dom.jqGrid("getRowData",param.rowid);
    			var dctId = $("#storeId").text();
    			initFieldGridData(dctId,rowData.COL_ID);
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
    function initGrid(dctId){
    	var sendData = {};
    	sendData.DCT_ID = dctId;
    	$.ajax({
            url:sys_ctx+"/base/queryCreateDctColsList.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            async:false
        }).done(function(data){
        	if(data.colList.length > 0){
        		dom.jqGrid('clearGridData');
        		for ( var i = 0; i < data.colList.length; i++){
        			if(data.colList[i].hasOwnProperty("DCT_FID")){
        				data.colList[i].DCT_FID = 1;
        				dom.jqGrid('addRowData', i + 1, data.colList[i]);
        			}else{
        				dom.jqGrid('addRowData', i + 1, data.colList[i]);
        			}
            	}
        	}
        });
    }
    //存储表属性表展示
    function createLeftGrid(dctId){
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
    	initLeftGridData(dctId);
	}
    function initLeftGridData(dctId){
    	var sendData = {};
    	sendData.dctId = dctId;
    	$.ajax({
            url:"${ctx}/queryBase/queryDofDictsParam.action",
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
    
    function setCellEditType(data){
    	for ( var i = 0; i < 20; i++){
    		if(data[i].f_TASK_KEY == "StoKeyField"){
    			data[i].f_TASK_VALUE = "<div class='editCell help-cell' t='12' cell='text' aria-describedby='' editable='true'><input type='text' style='width: 100%;height: 27px;' value='"+data[i].f_TASK_VALUE+"' /></div><i name='' class='commonGridSearch' onclick=''></i>";
    		}
            if(data[i].f_TASK_KEY == "StoKeyMode"){
            	var selectObjHtml = "<select enable='' t='3'  name=''  style='font-size:12px;border:0px solid transparent;background:#FFFFFF;width:100%;height:98%;' align='center'><option value=' '></option>";
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
			leftDom.jqGrid('addRowData', i + 1, data[i]);
    	}
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
    function initFieldGridData(dctId,colId){
    	var sendData = {};
    	sendData.dctId = dctId;
    	sendData.colId = colId;
    	$.ajax({
            url:"${ctx}/queryBase/queryDofDctColsFieldParam.action",
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
					querydofdicts(stoOwnerBa); 
                });
				stoOwnerBa = queryDatas[0].fId;
				doSaveData.sysId = stoOwnerBa;
				querydofdicts(stoOwnerBa);
            }
         });
    }
    /**
     * 查询系统下有哪些store
     * stoId 系统类型SYS
     */
    function querydofdicts(stoOwnerBa){
    	var queryDatas = hlicGridPlus.queryTableRows("queryBase/queryDofDictsList.action",{"dctOwnerBa":stoOwnerBa});
    	$("#left-ul").children().remove();
     	if(queryDatas.length > 0){
        	doSaveData.dataType = "1";
    		var html = "";
    		for(var i=0; i<queryDatas.length; i++){
    			html += "<li class='list-item' stoId='"+queryDatas[i].dctId+"'><span class='storelist'></span><span class='listlispan'>"+queryDatas[i].dctCaption+"("+queryDatas[i].dctId+")</span></li>";
    		}
    		$("#left-ul").append(html);
    		initGrid(queryDatas[0].dctId);//查询dct表明细属性
    		if(queryDatas[0].dctId != "" && queryDatas[0].dctId != undefined){
    			$("#storeId").text(queryDatas[0].dctId);
    			doSaveData.dctId = queryDatas[0].dctId;
    		}
    		//列表绑定事件
        	$(".list-item").bind("click",function(){
        		$(".item-select").removeClass("item-select");
        		$(this).addClass("item-select");
        		var dctId = $(this).attr("stoId");
        		$("#storeId").text(dctId);
        		doSaveData.dctId = dctId;
        		initGrid(dctId);//查询dct表明细属性
        	});
    	}
    }
    function searchs(){
    	var sendData = {};
    	sendData.dctId = "WD_HTZXMX";
    	$.ajax({
            url:"${ctx}/queryBase/queryDofDictsParam.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData),
            success : function(data){
                commonjs.tipAlert("提示","成功");
            }
        });
    }
    //添加新表
    function addTable(){
    	$(window.top.document).find("#addDo").hlicComSelect({
            "width"    : "500px",//弹出框的宽度
            "height"   : "280px",//弹出框的高度   
            "title":"设置条件",
            "loadtext":"正在加载中...",
            "url"      : sys_ctx+"/common/help/addDohelp.jsp",
            "onlyfirst"  : false,
            "parenturl"  : window.location.href,
            "callback" : function(data){
            	doSaveData.dctId = data.F_ID;
            	doSaveData.dctName = data.F_MC;
            	doSaveData.dataType = "0";//0:插入；1:更新；2:删除
            	dom.jqGrid('clearGridData');
        		var	html = "<li class='list-item' stoId='"+data.F_ID+"'><span class='storelist'></span><span class='listlispan'>"+data.F_MC+"("+data.F_ID+")</span></li>";
        		$("#left-ul").append(html);
            }
        });
    }
    //删除新表
    function delTable(){
    	var dctId = $(".item-select").attr("stoid");
    	if(stoId == undefined){
    		tipInfo("提示","请选择要删除的对象！",1000,0);
    		return;
    	}
    	tipConfirm("提示","确定要删除表吗？","是","否",function(value){
			if(value){
				var sendData = {};
		    	sendData.dctId = dctId; //存储表ID
		    	sendData.sysId = doSaveData.sysId; //属于哪个系统
		    	sendData.dataType = "2";//0:插入；1:更新；2:删除
		    	$.ajax({
		            url:"${ctx}/base/delDctData.action",
		            type:'post',
		            dataType:'json',
		            contentType:"application/json",
		            data:JSON.stringify(sendData)
		        }).done(function(data){
		        	if(data.type == "0"){
		        		doSaveData = {};
		        		tipInfo("提示","删除成功！",1000,0);
		        	}
		        });
			}
    	});
    }
    
    function addRow(){
    	var sendData = {};
    	if(doSaveData.dctId == "" || doSaveData.dctId == undefined){
    		tipInfo("提示","请选择一个对象！",1000,0);
    		return;
    	}
    	sendData.DCT_ID = doSaveData.dctId;
    	var ids = dom.jqGrid('getDataIDs');
    	dom.jqGrid('addRowData', ids[ids.length], sendData);
    }
    function delRow(){
    	dom.hlicStoGrid("deleteRow");
    }
    
    function save() {
    	var gridData = dom.hlicStoGrid("getSaveData");
    	var sendData = {};
    	sendData.dctId = doSaveData.dctId; //存储表ID
    	sendData.dctName = doSaveData.dctName; //存储表名称
    	sendData.sysId = doSaveData.sysId; //属于哪个系统
    	sendData.dataType = doSaveData.dataType;//0:插入；1:更新；2:删除
    	sendData.gridData = gridData;
    	$.ajax({
            url:"${ctx}/base/createDctData.action",
            type:'post',
            dataType:'json',
            contentType:"application/json",
            data:JSON.stringify(sendData)
        }).done(function(data){
        	if(data.type == "0"){
        		doSaveData = {};
        		tipAlert("提示","保存成功！",1000,0);
        	}
        });
    }
</script>
</html>