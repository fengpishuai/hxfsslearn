<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页面</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<script src="${ctx}/common/js/welcome.js"></script>
<link rel="stylesheet" href="${ctx}/common/css/welcome.css">
<style type="text/css">

</style>
</head>
<body>
<div class="container">
    <div class="con-header">
        <div id="navigation">
            <span id="wddjspan" class="active comnav" init-class="active">我的单据</span>
            <span id="wddbspan" class="comnav">我的待办</span>
            <span id="wdybspan" class="comnav">我的已办</span>
        </div>
    </div>
    <div class="con-content">
        <div id="wddj" class="wddj">
            <div id="wddj-search" class="wddj-search">
	            <div id="changePeriod" class="changePeriod">
	                <span style="position: relative; font-size: 13px; top: 5px;" init-class="" lan_id="sj">时间：</span>
	                <div class="change-select">
	                    <select class="select-style">
	                      <option value="option1">全部</option>
	                      <option value="option2">一天</option>
	                      <option value="option3">三天</option>
	                      <option value="option3">一周</option>
	                    </select>
	                </div>
	            </div>
	            <div id="refreshcomBtn" class="refreshcomBtn">
	                <div class="refresh-img"></div>
	                <p init-class="" lan_id="sx">刷新</p>
	            </div>
	        </div>
            <div class="wddj-searcha">
	            <form action="">
	                <label class="wddj-lab">单据类型：</label>
	                <select class="wddj-selected-mid">
	                  <option value="option1">全部</option>
	                  <option value="option2">一天</option>
	                  <option value="option3">三天</option>
	                  <option value="option3">一周</option>
	                </select>
	                <label class="wddj-lab">填报日期：</label>
	                <input type="text" class="wddj-input-mid wddj-input-img" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
	                <label class="wddj-lab">至</label>
	                <input type="text" class="wddj-input-mid wddj-input-img" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
	                <label class="wddj-lab">单据状态：</label>
	                <select class="wddj-selected-small">
	                  <option value="option1">全部</option>
	                  <option value="option2">制单中</option>
	                  <option value="option3">审批中</option>
	                  <option value="option3">已结束</option>
	                  <option value="option2">被退回</option>
	                  <option value="option3">已作废</option>
	                </select>
	                <button class="wddj-btn-small">搜索</button>
	                <button type="reset" class="wddj-btn-small">重置</button>
	            </form>
            </div>
            <div class="wddj-content" id="wddj-content">
                 <ul class="wddj-ul-list" id="wddj-ul-list">
                 </ul>   
            </div>
            <div class="wddj-pager">
                <table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table" style="width:100%;table-layout:fixed;height:100%;font-size: 12px;" role="row"><tbody><tr><td id="grid9_pager_left" align="left"></td><td id="grid9_pager_center" align="center" style="white-space: pre; width: 282px;"><table cellspacing="0" cellpadding="0" border="0" style="table-layout:auto;" class="ui-pg-table"><tbody><tr><td id="first_grid9_pager" class="ui-pg-button ui-corner-all ui-state-disabled" style="cursor: default;"><span class="ui-icon ui-icon-seek-first"></span></td><td id="prev_grid9_pager" class="ui-pg-button ui-corner-all ui-state-disabled"><span class="ui-icon ui-icon-seek-prev"></span></td><td class="ui-pg-button ui-state-disabled" style="width:4px;"><span class="ui-separator"></span></td><td dir="ltr" data-countpage="1">第<input class="ui-pg-input-gai" type="text" size="2" value="1" maxlength="7" role="textbox">页 共1页</td><td class="ui-pg-button ui-state-disabled" style="width:4px;"><span class="ui-separator"></span></td><td id="next_grid9_pager" class="ui-pg-button ui-corner-all ui-state-disabled"><span class="ui-icon ui-icon-seek-next"></span></td><td id="last_grid9_pager" class="ui-pg-button ui-corner-all ui-state-disabled"><span class="ui-icon ui-icon-seek-end"></span></td><td dir="ltr"><select class="ui-pg-selbox" role="listbox"><option role="option" value="5" selected="selected">5</option><option role="option" value="10">10</option><option role="option" value="20">20</option><option role="option" value="30">30</option><option role="option" value="40">40</option></select></td></tr></tbody></table></td><td id="grid9_pager_right" align="right"><div dir="ltr" style="text-align:right" class="ui-paging-info">1 - 5　共 5 条</div><table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table navtable" style="float:left;table-layout:auto;"><tbody><tr></tr></tbody></table></td></tr></tbody></table>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
</script>
</html>