<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>字典弹出框</title>
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

</style>
</head>
<body>
<div class="com-containor" id="sidegrid" style="">
    <div class="search-content">
        <div class="search-input">
            <input type="text" id="searchVal" style="height: 22px;width:100%;" placeholder="请搜索">
        </div>
        <a href="javaScript:void(0)" class="webbtn" style="float: right;margin-right: 10px;margin-top: 6px;" onclick="searchs()"><span class="ico_btn_search"></span><span init-class="">搜索</span></a>
    </div>
    <div class="com-content" id="contgrid">
        <table id="grid9"></table>
        <div id="grid9_pager"></div>
    </div>
</div>
<div id="btndiv" class="btndiv">
	<a  href="javaScript:void(0)" class="webbtn" onclick="save()"><span class="ico_btn_queding"></span><span init-class="">确定</span></a>
	<a  href="javaScript:void(0)" class="webbtn" onclick="quxiao()" ><span class="ico_btn_giveup"></span><span init-class="">退出</span></a>
</div>
</body>
<script type="text/javascript">
var dom = "",
    dctId = "",
    dctKey = "",
    dctFid = "",
    dctFname = "";
/* $(document).ready(function(){
	dom = $("#grid9");
	createDct();
	$(window).resize(function() {
        gridResize();
    });
});  */
function initSelect(inputData){
	dom = $("#grid9");
	dctId = inputData.dctId;
	createDct();
	$(window).resize(function() {
        gridResize();
    });
}
function createDct(){
	dom.hlicDctGrid({
		"datatype" : "json",
		"url"      : sys_ctx+"/base/queryDctPageList.action",
		"DCT_ID"   : dctId,
		"DCT_KEY"  : "",
		"DCT_HELP" : true,
		"cellEdit" : false,
		"shrinkToFit" : true,
        "width"    : $("#sidegrid").width()-5,
        "height"   : $("#sidegrid").height()-95,
        "pager"    : "grid9_pager"
	});
	dom.bind("hlicDctGrid_loadCompleteTrigger",function(){
		var stoClient = dom.hlicDctGrid("getStoClient");
		dctFid = stoClient.dictProperty.dctFid;//dof_dict字典表的属性
		dctFname = stoClient.dictProperty.dctFname;
	});
    $(".ui-jqgrid-sortable").unbind("click").bind("click",function(){
        return false;
    });
}

function addGridData(data){
	dom.jqGrid("clearGridData");  // 清空数据
    // 遍历数据
    $.each(data,function(kk,vv){
    	dom.jqGrid("addRowData", kk+1,vv);
    });
}

function gridResize(){
    var jqueryDom    = dom;
    var iframeHeight = $("#sidegrid").height();
    var iframeWidth  = $("#sidegrid").width();
    jqueryDom.setGridHeight(iframeHeight - 100);
    jqueryDom.setGridWidth(iframeWidth -5);
}
function searchs(){
	var searchVal = $.trim($("#searchVal").val());
	var sqlWhere = "";
	if(searchVal != ""){
		sqlWhere = dctFid+" LIKE '%"+searchVal+"%' OR "+dctFname+" LIKE '%"+searchVal+"%'";
	}
	dom.hlicDctGrid("setDctId",dctId);
	dom.hlicDctGrid("setSqlWhere",sqlWhere);
	dom.hlicDctGrid("reloadGridData");
}
function save(){
	var data = {};
	var rowid = dom.jqGrid("getGridParam","selrow");
	if(rowid == "" || rowid == null){
		tipInfo("提示","请选择一行数据！",1000,0);
		return;
	}
	var rowData = dom.jqGrid("getRowData",rowid);
	data.F_ID=rowData[dctFid];
	data.F_MC=rowData[dctFname];
	callback(data);
	panClose();
}

function quxiao(){
	panClose();
}
</script>
</html>