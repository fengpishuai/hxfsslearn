<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假申请单列表</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<style type="text/css">
.someClass{
    background-color: #FBFAE2;
}
.wddj-selected-mid{
    width:100px;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">请假申请单列表</div>
        </div>
        <div class="hearder-select">
            <label class="wddj-lab">年份：</label>
            <select class="wddj-selected-mid">
              <option value="option1">全部</option>
              <option value="option2">一天</option>
              <option value="option3">三天</option>
              <option value="option3">一周</option>
            </select>
        </div>
    </div>
    <div class="con-nav">
        <button class="nav-btn" onclick="addNewleave()">新增</button>
        <div class="nav-search">
            <label class="wddj-lab">填报日期：</label>
            <input type="text" class="wddj-input-mid wddj-input-img" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
            <label class="wddj-lab">至</label>
            <input type="text" class="wddj-input-mid wddj-input-img" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
            <button class="nav-btn">查询</button>
        </div>
    </div>
    <div class="con-midden">
        <table class="grid" id="jqGrid"></table>
        <div id="pager"></div>
    </div>
</div>
</body>
<script type="text/javascript">
    var dom = "",
        conWidth = $(".con-midden").width(),
        conHeight = $(".con-midden").height();
    $(document).ready(function(){
        init();
        $(window).resize(function() {
            gridResize();
        });
    });
    function init(){
    	dom = $("#jqGrid");
    	createGrid();
    }
    function gridResize(){
        var iframeHeight = $(".con-midden").height();
        var iframeWidth  = $(".con-midden").width();
        dom.setGridHeight(iframeHeight - 53);
        dom.setGridWidth(iframeWidth-5);
    }
    function createGrid(){
    	dom.hlicGrid({
			"url"      : "${ctx}/leave/queryLeavebillList.action",
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "cellEdit" : false,
            "colNames" : ['单据编号','请假天数','请假原因','制单时间','状态','制单人','起始时间','请假类型'],
            "colModel" : [ 
                 {name:'id',index:'id',editable: true, width:60, sorttype:"int"},
                 {name:'days',index:'days',editable: true, width:60, sorttype:"int"}, 
                 {name:'content',index:'content',editable: true,align:"center", width:90}, 
                 {name:'leavedate',index:'leavedate',editable: true, width:100},
                 {name:'state',index:'state',editable: true, width:100},
                 {name:'userid',index:'userid',editable: true, width:100},
                 {name:'startdate',index:'startdate',editable: true, width:100},
                 {name:'leavetype',index:'leavetype',editable: true, width:100}
            ]
		});
    }
    //新增
    function addNewleave(){
    	var windom = $(window.parent.document);
    	windom.find(".iframecom").hide();
    	var html='<iframe frameborder="0" class="iframecom" frameid="" src="${ctx}/leave/leavebillUI.action"></iframe>'
		var titlehtml='<div class="nav-name" navid="" onclick="changePage(this)">请假申请单<div class="closebtn" navid="" onclick="closePage(this)"></div></div>';
		windom.find("#con-iframe").append(html);
		windom.find("#navigation").append(titlehtml);
    }
</script>
</html>