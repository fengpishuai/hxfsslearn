<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录首页</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<style type="text/css">
.login-container {
    position: absolute;
    top: 0;
    bottom: 0;
    right: 0;
    left: 0;
    text-align: center;
    min-width:820px;
    min-height:410px;
}
.bg-img{
    position: absolute;
    top: 0;
    right: 0;
    left: 0;
    bottom: 0;
    z-index: -1;
    overflow: hidden;
}
.backimg{
	width:100%
}
.loginform{
    margin-top: 10%;
    display: inline-block;
    width: 400px;
    background-color: #efefef;
    padding-top: 20px;
    border-radius: 4px;
}
.formname {
    margin-bottom: 12px;
    letter-spacing: 14px;
    font-weight: 700;
    font-size: 20px;
    color: #525151;
}
.formcommon{
    height: 60px;
}
.inputcommon{
    background: #fff !important;
    height: 29px;
    width: 300px;
    border: 1px solid rgb(188, 188, 188);
    border-radius: 4px;
    padding-left: 10px;
}
.btncommon{
	height:30px;
	width:100px;
	background-color: #58cb73;
	font-size: 16px;
	font-weight: 700;
	color: #fff;
	border:0;
	border-radius: 4px;
}
</style>
</head>
<body>
<div class="login-container">
	<div class="bg-img">
		<img class="backimg" src="${ctx}/common/images/bg5.jpg">
	</div>
	<div class="loginform">
		<form action="${ctx}/index/login.action" method="post">
			<div class="formname">账号登录</div>
			<div class="formcommon form-userid"><input placeholder="请输入员工号" id="userId" name="userId" class="inputcommon" type="text"/></div>
			<div class="formcommon form-password"><input placeholder="请输入密码" id="password" name="password" class="inputcommon" type="password"></div>
			<div class="formcommon form-code"><input id="code" class="inputcommon" type="text"><div class="codeimg"></div></div>
			<div class="formcommon form-other"><input type="checkbox" id="weekLogin"><span style="margin-left:10px;">一周之内自动登录</span><span style="margin-left:82px;">忘记密码?</span></div>
			<div class="formcommon form-button"><input class="btncommon" type="submit" value="登录"></div>
		</form>
	</div>
</div>
</body>
</html>