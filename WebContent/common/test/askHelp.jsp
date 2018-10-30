<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回答问题</title>
<%@ include file="/WEB-INF/admin/meta.jsp"%>
<%@ include file="/WEB-INF/admin/css.jsp"%>
<%@ include file="/WEB-INF/admin/js.jsp"%>
<link rel="stylesheet" href="./js/themes/default/default.css" />
<link rel="stylesheet" href="./js/themes/default/prettify.css" />
<script charset="utf-8" src="./js/kindeditor-all.js"></script>
<script charset="utf-8" src="./js/zh-CN.js"></script>
<script charset="utf-8" src="./js/prettify.js"></script>
<style type="text/css">
    .top{
        position:absolute;
        top:0px;
        left:0px;
        right:0px;
        height:40px;
    }
    .containor{
		position: absolute;
	    top: 0px;
	    left: 0px;
	    right: 4px;
	    bottom: 40px;
    }
    .con-title{
        height:68px;
    }
    .bottom{
	    position: absolute;
	    bottom: 0px;
	    /* left: 0px; */
	    right: 20px;
	    height: 40px;
	    background-color: #f1efef;
	    padding-top: 8px;
	    padding-left: 200px;
    }
    .title{
        height: 40px;
	    width: 100%;
	    border: 1px solid #ccc;
    }
</style>
</head>
<body>
<div class="top">

</div>
<div class="containor">
    <div class="con-content">
        <textarea name="content1" cols="100" rows="8" style="width:100%;height:400px;visibility:hidden;"></textarea>
    </div>
</div>
<div class="bottom">
    <a class="webbtn" id="btn-submit" href="javaScript:void(0)" style="" onclick="save()"><span class="ico_btn_add"></span><span> 保存  </span></a>
</div>
</body>
<script type="text/javascript">
var submitFlag = true,
    pkey = "";
function initSelect(inputData){
	pkey = inputData.pkey;
}
KindEditor.ready(function(K) {
	var editor1 = K.create('textarea[name="content1"]', {
		cssPath : './js/themes/default/prettify.css',
		//uploadJson : './upload_json.jsp',
		//fileManagerJson : './file_manager_json.jsp',
		allowFileManager : true,
		afterCreate : function() {
			var self = this;
			K.ctrl(document, 13, function() {
				self.sync();
				document.forms['example'].submit();
			});
			K.ctrl(self.edit.doc, 13, function() {
				self.sync();
				document.forms['example'].submit();
			});
		}
	});
	prettyPrint();
});
//保存
function save(){
	var titleName = $("#titleId").val();
	var content = $(".ke-edit-iframe").contents().find("body").html();
	if(titleName == ""){
		tipAlert("提示","标题不能为空！","确定");
		return;
	}
	if(content == ""){
		tipAlert("提示","内容不能为空！","确定");
		return;
	}
	if(submitFlag){
		submitFlag = false;
		var saveData = {};
		saveData.pkey = pkey;
		saveData.content = content;
		$.ajax({ 
	        url:"${ctx}/ypml/insertQuestionMx.action", 
	        type:'post', 
	        dataType:'json', 
	        contentType:"application/json",
	        data:JSON.stringify(saveData),
	        complete:function(XMLHttpRequest){
	        	if(XMLHttpRequest.readyState==4){
	        		submitFlag = true;
	            }	
	        },
	        success : function(data){ 
	            tipAlert("提示","成功","确定");
	        } 
	    });
	}else{
		tipAlert("提示","正在保存请稍后...","确定");
		return;
	}
}
</script>
</html>