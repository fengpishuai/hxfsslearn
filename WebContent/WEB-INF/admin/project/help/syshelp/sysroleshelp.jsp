<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统功能权限帮助</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="${ctx}/common/css/zTreeStyle.css" type="text/css">
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
			"url"      : "${ctx}/base/querySysRolesList.action",
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "cellEdit" : false,
            "colNames" : ["角色编号","角色名称", "角色描述","是否禁用"],
            "colModel" : [ 
         		{name:'fRoleid',index:'fRoleid',editable: true, width:60}, 
                {name:'fRolemc',index:'fRolemc',editable: true,align:"center", width:90},
                {name:'fRolecontent',index:'fRolecontent',editable: true,align:"center", width:90}, 
                {name:'fDisable',index:'fDisable',editable: true,align:"center", width:90}
       		]
		});
	}
</script>
</html>