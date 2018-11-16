<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回答问题</title>
<script src="${ctx}/common/js/jquery-1.7.2.min.js"></script>
<style type="text/css">
.ctrlDiv{
	position:absolute;
	top:0px;
	left:0px;
	right:0px;
	bottom:0px;
}
.eleContainer{
	position:absolute;
	top:0px;
	left:0px;
	right:0px;
	bottom:0px;
}
</style>
<script type="text/javascript">
    $(function(){
        $("#displayPdfIframe").attr("src",'<c:url value="/common/js/hlicPlugins/pdfjs/web/viewer.html" />?file=' + encodeURIComponent('<c:url value="/fileManage/download1.action?fBillId=CRS157-BX20170328150244782"/>'));
    });
</script>
</head>
<body>
<div class="ctrlDiv">
    <div class="eleContainer elePaddingBtm">
        <iframe id="displayPdfIframe" width="100%" height="100%" style="border: 0px;"></iframe>
    </div>
</div>
</body>
</html>