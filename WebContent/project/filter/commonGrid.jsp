<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报表弹出框</title>
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
    top: 0px;
    bottom: 40px;
    left: 0px;
    right: 0px;
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
    <div class="com-content" id="contgrid">
        <table id="grid9"></table>
        <div id="grid9_pager"></div>
    </div>
</div>
<div id="btndiv" class="btndiv">
	<a  href="javaScript:void(0)" class="webbtn" onclick="save()"><span class="ico_btn_queding"></span><span init-class="" lan_id="qd">确定</span></a>
	<a  href="javaScript:void(0)" class="webbtn" onclick="quxiao()" ><span class="ico_btn_giveup"></span><span init-class="" lan_id="tc">退出</span></a>
</div>
</body>
<script type="text/javascript">
var dom = "";

$(document).ready(function(){
	dom = $("#grid9");
	createDct();
	var hsztData = [{"F_ID":"1","F_NAME":"华夏幸福"},{"F_ID":"2","F_NAME":"固安"},{"F_ID":"3","F_NAME":"凤凰城"}];
	addGridData(hsztData);
    $(window).resize(function() {
        gridResize();
    });
});
function initSelect(inputData){
	dom = $("#grid9");
	createDct();
	var hsztData = [{"F_ID":"1","F_NAME":"华夏幸福"},{"F_ID":"2","F_NAME":"固安"},{"F_ID":"3","F_NAME":"凤凰城"}];
	addGridData(hsztData);
}
function createDct(){
	dom.jqGrid({
        datatype: "jsonstring",
        data:[],
        mtype:"post",
        jsonReader: {
            userdata : "redate",
            repeatitems : false // 设置成false，在后台设置值的时候，可以乱序。且并非每个值都得设
        },
        colNames:["核算主体ID","核算主体名称"],
        colModel:[
            {name:"F_ID",index:"F_ID",width:200,sortable:true,editable:false,align:"left"},
            {name:"F_NAME",index:"F_NAME",width:300,sortable:true,editable:false,align:"left"},
        ],
        rowNum:10,
        weidth:$("#maingrid").width(),
        height:$("#maingrid").height()-45,
        rowList:[10,20,30],
        viewrecords: true,
        autowidth:false,
        autoheight:false,
        sortable:false,
        multiselect: false,//多选  
        multiboxonly:true,
        hoverrows : false,  // 表行是否有鼠标悬停效果
        shrinkToFit:false,
        emptyrecords: "",
        loadtext: "读取中...",
        ondblClickRow : function(id) {},
        loadComplete:function(a){
            gridResize();
        },
        ondblClickRow:function(){
        }
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
    jqueryDom.setGridHeight(iframeHeight - 60);
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
	data.F_ID=rowData.F_ID;
	data.F_MC=rowData.F_NAME;
	callback(data);
	panClose();
}

function quxiao(){
	panClose();
}
</script>
</html>