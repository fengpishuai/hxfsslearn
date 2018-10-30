<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>枚举字典</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<script src="${ctx}/common/js/custom/panComSelect.js"></script>
<link rel="stylesheet" href="${ctx}/common/css/commonGrid.css" type="text/css">

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
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">枚举字典</div>
        </div>
        <div class="con-button">
            <a class="webbtn" href="javaScript:void(0)" style="" onclick="searchs()"><span class="ico_btn_add"></span><span> 过滤条件 </span></a>
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
    	var SQL_Filter = "";
    	dom.hlicDctGrid({
			"url"      : "${ctx}/base/queryDctGridPageList.action",
			"DCT_KEY"  : "F_BH",
			"DCT_ID"   : "DCT_ENUM",
   			"SQL_Filter":SQL_Filter,
            "width"    : conWidth-5,
            "height"   : conHeight-56
		});
	}
    function myelem(value, options) {
        var rowid = options.rowId;
        var html = '<div><input class="commonGridInput" type="text"/>';
        html += '<i class="commonGridSearch" onclick=\'chooseProduct("' + rowid + '","' + options.id + '")\'></i></div>';
        var a = $(html);
        if (value) {
            a.find('input').val(value);
        }
        return a.get(0);
    }

    function myvalue(elem, operation, value) {
        if (operation === 'get') {
            return $(elem).find('input').val() || '';
        } else if (operation === 'set') {
            $('input', elem).val(value);
        }
    }

    function initDate(e){
    	$(e).bind("click",function(){
    		WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});
    	});
    }
    function gettypes(){
    	var str="1:增值税专用发票;2:增值税普通发票"; 
    	/* $.ajax({ 
	    	type:"post", 
	    	async:false, 
	    	url:"checkpersontype", 
	    	success:function(data){ 
		    	if (data != null) { 
		    	var jsonobj=eval(data); 
		    	var length=jsonobj.length; 
		    	for(var i=0;i<length;i++){ 
			    	if(i!=length-1){ 
			    	    str+=jsonobj[i].personType+":"+jsonobj[i].personType+";"; 
			    	}else{ 
			    	    str+=jsonobj[i].personType+":"+jsonobj[i].personType;// 这里是option里面的 value:label 
			    	} 
		    	} 
		    	//$.each(jsonobj, function(i){ 
		    	//str+="personType:"+jsonobj[i].personType+";" 
		    	//$("<option value='" + jsonobj[i].personType + "'>" + jsonobj[i].personType+ "</option>").appendTo(typeselect); 
		    	//}); 
		    	}  
		    	alert(str); 
	    	}
    	});  */
    	return str;
    }
    function searchs(){
    	$("#filter").hlicComSelect({
    		"width"  : 680,
    		"height" : 400,
    		"title"  : "帮助",
    		"url"    : "${ctx}/project/filter/dofstorecolsFilter.jsp",
    		"callback" : function(data){
    			console.log(1);
    			dom.hlicGrid("queryGridData",JSON.stringify({"stoId":data.stoId,"colId":data.colId}));
    		}
    	});
    }
    function addRow(){
    	dom.hlicGrid("addNewRow",{});
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	dom.hlicGrid("saveData", "${ctx}/base/upDataDofStoreColsGrid.action");
    }
</script>
</html>