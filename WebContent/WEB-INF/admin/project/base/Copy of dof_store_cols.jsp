<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>功能管理</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="${ctx}/common/css/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="${ctx}/common/css/commonGrid.css" type="text/css">
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
            <div class="am-text-primary am-text-lg">功能管理</div>
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
			"url"      : "${ctx}/base/querySysFuncList.action",
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "colNames" : ["功能编号","功能名称", "级数","明细否","功能描述","功能图标","功能图片","所属应用编号","对应的url页面","父节点","是否禁用"],
            "colModel" : [ 
         		{name:'fBh',index:'fBh',editable: true, width:60}, 
                {name:'fMc',index:'fMc',classes: 'cus-edit-td',editable: true,edittype: 'custom',align:"center", width:90,edittype: 'custom',
                    editoptions: {
                        custom_element: myelem,
                        custom_value: myvalue
                    }
         		},
                {name:'fJs',index:'fJs',classes: 'cus-edit-td',editable: true,align:"center", width:90,
         			editoptions: {
                        dataInit: function (e) {
                            initDate(e);
                        }
                    }
         		}, 
                {name:'fMx',index:'fMx',editable: true,align:"center", width:90,edittype:'select',
         			editoptions:{
                	    value:gettypes()
                	}
         		}, 
                {name:'fText',index:'fText',editable: true,align:"center", width:90}, 
                {name:'fIcon',index:'fIcon',editable: true,align:"center", width:90}, 
                {name:'fImage',index:'fImage',editable: true,align:"center", width:90}, 
                {name:'fAppId',index:'fAppId',editable: true,align:"center", width:90}, 
                {name:'fUrl',index:'fUrl',editable: true,align:"center", width:90}, 
                {name:'fParent',index:'fParent',editable: true,align:"center", width:90},
                {name:'fDisable',index:'fDisable',editable: true,edittype:'checkbox',formatter:'checkbox',align:"center", width:90}
       		]
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

    function chooseProduct(rowid, elemId) {
        commonjs.commonGridHelp("用户帮助","/hxfsslearn/user/queryuserhelp.action", function callBack(data){
        	doCheck(data);
        });
       
        function doCheck(data) {
            var newData = {};
            newData.fMx = data.usrUsrid;
            $('#' + elemId).find('input').val(data.usrName);
            dom.jqGrid("setRowData", rowid, newData);
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
    function addRow(){
    	dom.hlicGrid("addNewRow",{"fAppId":"1"});
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	dom.hlicGrid("saveData", "${ctx}/base/insertBatchSysFunc.action");
    }
</script>
</html>