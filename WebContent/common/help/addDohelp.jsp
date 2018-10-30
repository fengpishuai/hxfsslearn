<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加Do</title>
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
    <div class="row0">对象新建，填写ID及描述信息</div>
    <div class="row1">
        <span  class="myspan">对象标识：</span>
        <input type="text" id="dxbs" style="width:317px;height:30px;border-radius: 4px;border: 1px solid #afadad;"/>
    </div>
    <div class="row2">
        <span class="myspan">对象描述：</span>
        <input type="text" id="dxms" style="width:317px;height:30px;border-radius: 4px;border: 1px solid #afadad;"/>
    </div>
</div>
<div id="btndiv" class="btndiv">
	<a  href="javaScript:void(0)" class="webbtn" onclick="save()"><span class="ico_btn_queding"></span><span init-class="" lan_id="qd">确定</span></a>
	<a  href="javaScript:void(0)" class="webbtn" onclick="quxiao()" ><span class="ico_btn_giveup"></span><span init-class="" lan_id="tc">退出</span></a>
</div>
</body>
<script type="text/javascript">
var dom = "";
function save(){
	var data = {};
	var dxbs = $.trim($("#dxbs").val());
	var dxms = $.trim($("#dxms").val());
	if(dxbs == "" || dxms==""){
		tipInfo("提示","对象标识和对象描述不能为空！",1000,0);
		return;
	}
	data.F_ID=dxbs;
	data.F_MC=dxms;
	callback(data);
	panClose();
}

function quxiao(){
	panClose();
}
</script>
</html>