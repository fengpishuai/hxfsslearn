<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grid显示字段配置</title>
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
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">Grid显示字段配置</div>
        </div>
        <div class="con-button">
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addRow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
    </div>
    <div class="side" id="side">
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
            "colNames" : ["流水码","表名", "显示列","显示列名称","序号","字典表","列类型","元素模式","元素类型","列权限控制","引用扩展连接","过滤条件","COL_EDIT_STYLE","列标题","是否启用","COL_INTER","是否显示","空否","列宽","列计算公式","COL_EXP","COL_RCALC","COL_REXP","枚举","所选枚举","COL_VT","COL_VT_REF","COL_VT_REF_COL","COL_VT_REF_ATTR","COL_VALI","COL_VALI_EXP","COL_VALI_MSG","COL_REG","COL_REG_EXP","COL_REG_MSG","COL_EDITABLE"],
            "colModel" : [ 
         		{name:'colPk',index:'colPk',editable: true, width:60}, 
                {name:'stoId',index:'stoId',editable: true,align:"center", width:90},
                {name:'colId',index:'colId',editable: true,align:"center", width:90}, 
                {name:'colCaption',index:'colCaption',editable: true,align:"center", width:90},
                {name:'colDispOrder',index:'colDispOrder',editable: true,align:"center", width:90},
                {name:'colFkDct',index:'colFkDct',editable: true,align:"center", width:90},
                {name:'colType',index:'colType',editable: true,align:"center", width:90},
                {name:'colElementTypeMode',index:'colElementTypeMode',editable: true,align:"center", width:90},
                {name:'colElementType',index:'colElementType',editable: true,align:"center", width:90},
                {name:'colFkAccess',index:'colFkAccess',editable: true,align:"center", width:90},
                {name:'colShowmask',index:'colShowmask',editable: true,align:"center", width:90},
                {name:'colEditmask',index:'colEditmask',editable: true,align:"center", width:90},
                {name:'colEditStyle',index:'colEditStyle',editable: true,align:"center", width:90},
                {name:'colTitle',index:'colTitle',editable: true,align:"center", width:90},
                {name:'colUse',index:'colUse',editable: true,align:"center", width:90},
                {name:'colInter',index:'colInter',editable: true,align:"center", width:90},
                {name:'colVisible',index:'colVisible',editable: true,align:"center", width:90},
                {name:'colDefault',index:'colDefault',editable: true,align:"center", width:90},
                {name:'colNull',index:'colNull',editable: true,align:"center", width:90},
                {name:'colShowSize',index:'colShowSize',editable: true,align:"center", width:90},
                {name:'colCalc',index:'colCalc',editable: true,align:"center", width:90},
                {name:'colExp',index:'colExp',editable: true,align:"center", width:90},
                {name:'colRcalc',index:'colRcalc',editable: true,align:"center", width:90},
                {name:'colRexp',index:'colRexp',editable: true,align:"center", width:90},
                {name:'colEnum',index:'colEnum',editable: true,align:"center", width:90},
                {name:'colEnumKey',index:'colEnumKey',editable: true,align:"center", width:90},
                {name:'colVt',index:'colVt',editable: true,align:"center", width:90},
                {name:'colVtRef',index:'colVtRef',editable: true,align:"center", width:90},
                {name:'colVtRefCol',index:'colVtRefCol',editable: true,align:"center", width:90},
                {name:'colVtRefAttr',index:'colVtRefAttr',editable: true,align:"center", width:90},
                {name:'colVali',index:'colVali',editable: true,align:"center", width:90},
                {name:'colValiExp',index:'colValiExp',editable: true,align:"center", width:90},
                {name:'colValiMsg',index:'colValiMsg',editable: true,align:"center", width:90},
                {name:'colReg',index:'colReg',editable: true,align:"center", width:90},
                {name:'colRegExp',index:'colRegExp',editable: true,align:"center", width:90},
                {name:'colRegMsg',index:'colRegMsg',editable: true,align:"center", width:90},
                {name:'colEditable',index:'colEditable',editable: true,align:"center", width:90}
       		]
		});
	}
    
    function addRow(){
    	dom.hlicGrid("addNewRow",{});
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	dom.hlicGrid("saveData", "${ctx}/base/insertBatchSysRoles.action");
    }
</script>
</html>