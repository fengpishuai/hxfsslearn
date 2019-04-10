<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>唯一主键弹帮助</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>

<style type="text/css">
.com-containor{
    position: absolute;
    top: 0px;
    bottom: 40px;
    left: 0px;
    right: 0px;
    overflow: hidden;
}

.btndiv{
    position: absolute;
    bottom: 0px;
    right: 0px;
    margin-right: 10px;
}
.row0{
    font-size: 13px;
    text-align: center;
    margin-top: 10px;
    line-height: 40px;
}
.row1{
    margin-top: 10px;
}
.row2{
    margin-top: 10px;
}
.myspan{
    display: inline-block;
    width: 116px;
    font-size: 13px;
    text-align: right;
}
</style>
</head>
<body>
<div class="com-containor" id="sidegrid" style="">
    <table class="grid" id="selectGrid"></table>
</div>
<div id="btndiv" class="btndiv">
	<a  href="javaScript:void(0)" class="webbtn" onclick="save()"><span class="ico_btn_queding"></span><span init-class="" lan_id="qd">确定</span></a>
	<a  href="javaScript:void(0)" class="webbtn" onclick="quxiao()" ><span class="ico_btn_giveup"></span><span init-class="" lan_id="tc">退出</span></a>
</div>
</body>
<script type="text/javascript">
var dom = "",
    stoId = "",
    dctId = "",
    conWidth = $("#side").width(),
    conHeight = $("#side").height();
$(document).ready(function(){
	$(window).resize(function() {
 		gridResize();
 	});
});
function initSelect(inputData){
	stoId = inputData.stoId;
	dctId = inputData.dctId;
	dom = $("#selectGrid");
	createGrid();
}
function createGrid(){
	dom.hlicStoGrid({
		"datatype" : "local",
		"url"      : "",
		"STO_KEY"  : "COL_PK",
		//"SQL_Filter":SQL_Filter,
        "width"    : conWidth-5,
        "height"   : 260,
        "cellEdit" : false,
        "colNames" : ["唯一编号","标识","标题"], 
        "colModel" : [
            {name : 'COL_PK',index : 'colPk',width : 83,hidden:true},        
            {name : 'COL_ID',index : 'colId',width : 200,editable: true},
            {name : 'COL_TITLE',index : 'colTitle',width : 200,editable: true}
        ]
	});
	initGrid();
}
function initGrid(){
	var sendData = {};
	sendData.stoId = stoId;
	sendData.dctId = dctId;
	$.ajax({
        url:sys_ctx+"/base/queryPkHelpList.action",
        type:'post',
        dataType:'json',
        contentType:"application/json",
        data:JSON.stringify(sendData),
        async:false
    }).done(function(data){
    	if(data.length > 0){
    		dom.jqGrid('clearGridData');
    		for ( var i = 0; i < data.length; i++){
    			dom.jqGrid('addRowData', i + 1, data[i]);
        	}
    	}
    });
}
function gridResize(){
    var jqueryDom    = dom;
    var iframeHeight = $("#sidegrid").height();
    var iframeWidth  = $("#sidegrid").width();
    jqueryDom.setGridHeight(iframeHeight - 100);
    jqueryDom.setGridWidth(iframeWidth -5);
}
function save(){
	var data = {};
	var rowid = dom.jqGrid("getGridParam","selrow");
	if(rowid == "" || rowid == null){
		tipInfo("提示","请选择一行数据！",1000,0);
		return;
	}
	var rowData = dom.jqGrid("getRowData",rowid);
	data.F_ID=rowData.COL_ID;
	callback(data);
	panClose();
}

function quxiao(){
	panClose();
}
</script>
</html>