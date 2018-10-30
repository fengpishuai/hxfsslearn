<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户帮助</title>
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
    <div class="side" id="side" style="top:0px">
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
</div>
</body>
<script type="text/javascript">
var dom = "",
	conWidth = $("#side").width(),
    conHeight = $("#side").height();
$(document).ready(function(){
	init();
	$(window).resize(function() {
		gridResize();
    });
});
function gridResize(){
    var iframeHeight = $("#side").height();
    var iframeWidth  = $("#side").width();
    dom.setGridHeight(iframeHeight-56);
    dom.setGridWidth(iframeWidth-5);
}
function init(){
	dom = $("#jqGrid");
	createGrid();
}
function createGrid(){
	dom.hlicGrid({
		"url"      : "${ctx}/user/queryuser_result.action",
        "width"    : conWidth-5,
        "height"   : conHeight-56,
        "colNames" : ['编号','姓名', '电话'],
        "cellEdit" : false,
        "colModel" : [ 
      		{name:'usrUsrid',index:'usrUsrid',editable: true, width:60, sorttype:"int"}, 
            {name:'usrName',index:'usrName',editable: true,align:"center", width:90}, 
            {name:'usrPhone1',index:'usrPhone1',editable: true, width:100}
    	]
	});
}
</script>
</html>