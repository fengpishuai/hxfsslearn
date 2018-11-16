<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=basePath%>/common/js/jquery-1.7.2.min.js"></script><script type="text/javascript">
    var util = {
        basePath : function basePath() {// 返回项目路径
            var context = document.getElementsByTagName('base')[0].href;
            return context;
        },
        file_upload : function file_upload() {

            // 创建表单数据对象
            var obj = new FormData();

            // 获取文件框中的数据
            var file1 = document.getElementById("file1").files[0];
            var file2 = document.getElementById("file2").files[0];

            // 将文件数据添加至表单数据对象中
            obj.append("file1", file1);
            obj.append("file2", file2);

            console.log("请求参数---》》》" + obj);

            // 使用ajax异步文件上传
            $.ajax({
                url : util.basePath() + 'fileManage/uploadFiles.action',
                type : 'POST',
                data : obj,
                contentType : false,
                processData : false,
                mimeType : 'multipart/form-data',
                success : function(data) {

                    console.log(data);
                }
            })
        }

    }
</script>
</head>
<body>
    <!-- 使用post表单提交，设置类型为：multipart/form-data -->
    <form action="<%=basePath%>fileManage/uploadFiles.action" enctype="multipart/form-data" method="POST">
        <h2>基本form表单上传文件</h2>
        文件一：<input type="file" name="file1" /><br /> 文件二：<input type="file"
            name="file2" /><br /> <input type="submit" value="提交" />
    </form>


    <!-- 使用ajax上传文件方式 -->
    <div>
        <h3>ajax上传文件</h3>
        文件一：<input type="file" id="file1" /><br /> 文件二：<input type="file"
            id="file2" /><br /> <input type="button"
            onclick="util.file_upload()" value="上传提交">
    </div>

</body>
</html>