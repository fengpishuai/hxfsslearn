<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统功能权限</title>
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
.con-left{
	position: absolute;
	top: 44px;
	left: 0px;
	bottom: 0px;
	width: 245px;
	font-size: 14px;
	color: #333;
}
.left-search {
    height: 30px;
    border-bottom: 1px solid #CCCCCC;
    padding-bottom: 4px;
    padding-top: 4px;
    margin-left: 6px;
    margin-right: 6px;
}
.left-content{
	position: absolute;
    top: 39px;
    left: 0px;
    bottom: 3px;
    width: 245px;
}
.search-name {
    display: inline-block;
    vertical-align: top;
    margin: 5px 4px 0px 8px;
}
#searchContent {
    display: inline-block;
    vertical-align: top;
    margin-top: 2px;
    border-radius: 2px;
    border: 1px solid #CCCCCC;
    height: 22px;
    width: 180px;
}
.selectuser-title {
    padding-left: 8px;
    padding-top: 4px;
    height: 22px;
}
.seltitle{
    display: inline-block;
    vertical-align: top;
    padding-left: 3px;
}
.tdcommon{
    text-overflow: ellipsis;
    white-space: nowrap;
    overflow: hidden;
    word-break: break-all;
    width: 92px;
}
.con-containor{
	position: absolute;
	top: 44px;
	left: 241px;
	right: 0px;
	bottom: 0px;
}
.left-selectuser {
    position: relative;
    left: 2px;
    height: 50%;
    width: 240px;
    margin-left: 1px;
}
.left-selectrole{
	position: relative;
    left: 2px;
    height: 50%;
    width: 240px;
    margin-left: 1px;
}
.selectuser-title {
    padding-left: 8px;
    padding-bottom: 6px;
    height: 22px;
}
.selectuser-grid{
    position: absolute;
    top: 31px;
    width: 239px;
    bottom: 0px;
    border: 1px solid #CCCCCC;
    border-radius: 2px;
    background-color: #FFFAFA;
    overflow-y: auto;
}
.selectuser-grid table{
	width: 100%;
    border-radius: 2px;
}
.selectuser-grid th{
    border-bottom: 1px solid #CCCCCC;
}
.checkcom{
	text-align: center;
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
.webcontainor{
	display: inline;
    float: right;
}
.userli:hover{
	background-color: #6FA3D3;
}
.userliActive{
	background-color: #6FA3D3;
}
.roleli:hover{
	background-color: #6FA3D3;
}
.roleliActive{
	background-color: #6FA3D3;
}
</style>
</head>
<body>
<div class="content">
    <div class="con-header">
        <div class="con-fl con-cf">
            <div class="fl-img"></div>
            <div class="am-text-primary am-text-lg">系统功能权限</div>
        </div>
        <div class="con-button">
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="addRow()"><span class="ico_btn_add"></span><span> 新  增 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="delRow()"><span class="ico_btn_add"></span><span> 删  除 </span></a>
	        <a class="webbtn" href="javaScript:void(0)" style="" onclick="saveData()"><span class="ico_btn_add"></span><span> 保  存 </span></a>
	    </div>
    </div>
    <div class="con-left">
    	<div class="left-search">
    		<span class="search-name">搜索:</span><input type="text" id="searchContent">
    	</div>
    	<div class="left-content">
	    	<div class="left-selectuser">
	    		<div class="selectuser-title">
	    			<img src="${ctx}/common/css/images/oneperson.png" style="height:18px;"><span class="seltitle">已选用户</span>
	    			<div class="webcontainor">
		    			<a class="webminbtn" href="javaScript:void(0)" onclick="addUser()"><span class="min_btn_add"></span></a>
		    			<a class="webminbtn" href="javaScript:void(0)"><span class="min_btn_delete"></span></a>
	    			</div>
	    		</div>
	    		<div class="selectuser-grid" id="selectUser">
	    			<table cellspacing="0" style="width: 100%;">
		    			<thead>
			    			<tr style="background-color:#efefef;">
		    					<th style="width:31px;border-right:1px solid #ccc;"><input type="checkbox"></td>
		    					<th>编号</td>
		    					<th>姓名</td>
		    				</tr>
		    			</thead>
	    				<tbody></tbody>
	    			</table>
	    		</div>
	    	</div>
	    	<div class="left-selectrole">
	    		<div class="selectuser-title">
	    			<img src="${ctx}/common/css/images/moreperson.png" style="height:18px;"><span class="seltitle">已选角色</span>
	    			<div class="webcontainor">
		    			<a class="webminbtn" href="javaScript:void(0)" onclick="addRoles()"><span class="min_btn_add"></span></a>
		    			<a class="webminbtn" href="javaScript:void(0)"><span class="min_btn_delete"></span></a>
	    			</div>
	    		</div>
	    		<div class="selectuser-grid" id="selectRoles">
	    			<table cellspacing="0" style="width: 100%;">
		    			<thead>
			    			<tr style="background-color:#efefef;">
		    					<th style="width:31px;border-right:1px solid #ccc;"><input type="checkbox"></td>
		    					<th>编号</td>
		    					<th>角色</td>
		    				</tr>
		    			</thead>
	    				<tbody></tbody>
	    			</table>
	    		</div>
	    	</div>
    	</div>
    </div>
    <div class="con-containor">
	    <div class="side" id="side" style="top: 0px;">
	        <table class="grid" id="jqGrid"></table>
	        <div id="pager"></div>
	    </div>
    </div>
</div>
</body>
<script type="text/javascript">
    var dom = "",
    	fUserId = "",
    	fRoleId = "",
    	userList = [],
    	roleList = [],
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
    	var input = $("#searchContent");
     	input.keypress(function (e) {
     	    var key = e.which; //e.which是按键的值Enter
     	    if (key == 13) {
     	    	searchs();
     	    }
     	}).focus(function(){
     		var $this = $(this);
     		setTimeout(function(){
     			$this.select();
     		},0);
     	});
    	createGrid();
    }
    function createGrid(){
    	dom.hlicGrid({
			"url"      : "${ctx}/base/querySysUserRoleFuncList.action",
            "width"    : conWidth-5,
            "height"   : conHeight-56,
            "colNames" : ["功能编号","功能名称","是否启用"],
            "colModel" : [ 
         		{name:'fBh',index:'fBh',editable: false, width:60}, 
                {name:'fFuncName',index:'fFuncName',editable: false,align:"center", width:90},
                {name:'fDisable',index:'fDisable',editable: true,edittype:'checkbox',formatter:'checkbox', align:"center", width:90}
       		]
		});
    	dom.bind("hlicGrid_loadCompleteTrigger",function(){
    		console.log(111);
    	});
	}
    //添加用户
    function addUser(){
    	commonjs.commonGridHelp("用户帮助","/hxfsslearn/user/queryuserhelp.action", function callBack(data){
    		var userli = $(".userli");
    		var flag = true;
    		if(userli.length > 0){
    			//如果用户存在不在添加
    			$.each(userli,function(k,v){
        			var userId = $(v).data("userid");
        			if(userId == data.usrUsrid){
        				flag = false;
        			}
        		});
    			if(flag){
    				var html = '<tr class="userli" onclick="userActive(this)" data-userid="'+data.usrUsrid+'">'
	    				+'	<td class="checkcom"><input type="checkbox" class="checkbox" onclick="selectUser(this)"></td>'
	    				+'	<td><div class="tdcommon">'+data.usrUsrid+'</div></td>'
	    				+'	<td><div class="tdcommon">'+data.usrName+'</div></td>'
	    				+'</tr>';
	        		$("#selectUser tbody").append(html);
	        		fUserId = data.usrUsrid;
	        		dom.jqGrid('setGridParam',{postData:{"fUserId":fUserId}}).trigger('reloadGrid'); 
    			}
    		}else{
    			//第一次添加用户
    			var html = '<tr class="userli" onclick="userActive(this)" data-userid="'+data.usrUsrid+'">'
					+'	<td class="checkcom"><input type="checkbox" class="checkbox" onclick="selectUser(this)"></td>'
					+'	<td><div class="tdcommon">'+data.usrUsrid+'</div></td>'
					+'	<td><div class="tdcommon">'+data.usrName+'</div></td>'
					+'</tr>';
	    		$("#selectUser tbody").append(html);
	    		fUserId = data.usrUsrid;
	    		dom.jqGrid('setGridParam',{postData:{"fUserId":fUserId}}).trigger('reloadGrid');
    		}
    	});
    }
    //添加角色
    function addRoles(){
    	commonjs.commonGridHelp("角色帮助","/hxfsslearn/base/sysroleshelp.action", function callBack(data){
    		var roleli = $(".roleli");
    		var flag = true;
    		if(roleli.length > 0){
    			//如果用户存在不在添加
    			$.each(roleli,function(k,v){
        			var roleId = $(v).data("roleid");
        			if(roleId == data.fRoleid){
        				flag = false;
        			}
        		});
    			if(flag){
    				var html = '<tr class="roleli" onclick="roleActive(this)" data-roleid="'+data.fRoleid+'">'
	    				+'	<td class="checkcom" ><input type="checkbox" class="checkbox" onclick="selectRole(this)"></td>'
	    				+'	<td><div class="tdcommon">'+data.fRoleid+'</div></td>'
	    				+'	<td><div class="tdcommon">'+data.fRolemc+'</div></td>'
	    				+'</tr>';
	        		$("#selectRoles tbody").append(html);
	        		fRoleId = data.fRoleid;
	        		dom.jqGrid('setGridParam',{postData:{"fRoleId":fRoleId}}).trigger('reloadGrid');
    			}
    		}else{
    			var html = '<tr class="roleli" onclick="roleActive(this)" data-roleid="'+data.fRoleid+'">'
					+'	<td class="checkcom" ><input type="checkbox" class="checkbox" onclick="selectRole(this)"></td>'
					+'	<td><div class="tdcommon">'+data.fRoleid+'</div></td>'
					+'	<td><div class="tdcommon">'+data.fRolemc+'</div></td>'
					+'</tr>';
	    		$("#selectRoles tbody").append(html);
	    		fRoleId = data.fRoleid;
	    		dom.jqGrid('setGridParam',{postData:{"fRoleId":fRoleId}}).trigger('reloadGrid');
    		}
    		
    	});
    }
    //搜索
    function searchs(){
    	var searchVal = $("#searchContent").val();
    	var sqlWhere = {};
    	sqlWhere.fFuncName = $.trim(searchVal);
    	if(fRoleId != "" && fUserId != ""){
    		return;
    	}
   		sqlWhere.fRoleId = fRoleId;
   		sqlWhere.fUserId = fUserId;
    	dom.jqGrid('setGridParam',{"postData":sqlWhere}).trigger('reloadGrid');
    }
    //根据选择用户获取功能信息
    function userActive(self){
    	$(".userli").removeClass("userliActive");
    	$(self).addClass("userliActive");
    	var userId = $(self).data("userid");
    	dom.jqGrid('setGridParam',{postData:{"fUserId":userId}}).trigger('reloadGrid'); 
    }
    //选择用户
    function selectUser(self){
    	var flag = true;
    	var userid = $(self).parent().parent().data("userid");
    	if($(self).is(":checked")){
        	for(var i=0; i < userList.length; i++){
        		if(userList[i] == userid){
        			flag = false;
        		}
        	} 
        	if(flag){
        		userList.push(userid);
        	}
    	}else{
    		for(var i=0; i < userList.length; i++){
        		if(userList[i] == userid){
        			userList.splice(i,1);
        		}
        	} 
    	}
    }
    //根据选择用户获取功能信息
    function roleActive(self){
    	$(".roleli").removeClass("roleliActive");
    	$(self).addClass("roleliActive");
    	var roleId = $(self).data("roleid");
    	dom.jqGrid('setGridParam',{postData:{"fRoleId":roleId}}).trigger('reloadGrid'); 
    }
    //选择用户
    function selectRole(self){
    	var flag = true;
    	var roleid = $(self).parent().parent().data("roleid");
    	if($(self).is(":checked")){
        	for(var i=0; i < roleList.length; i++){
        		if(roleList[i] == roleid){
        			flag = false;
        		}
        	} 
        	if(flag){
        		roleList.push(roleid);
        	}
    	}else{
    		for(var i=0; i < roleList.length; i++){
        		if(roleList[i] == roleid){
        			roleList.splice(i,1);
        		}
        	} 
    	}
    }
    function addRow(){
    	dom.hlicGrid("addNewRow",{});
    }
    
    function delRow(){
    	dom.hlicGrid("deleteRow");
    }
    
    function saveData() {
    	var sendData = [];
    	if(userList.length == 0 && roleList.length == 0){
    		commonjs.tipAlert("提示","请选择用户或角色");
    		return;
    	}
    	var saveData = dom.hlicGrid("getSaveData");
    	if($.isEmptyObject(saveData)){
    		commonjs.tipAlert("提示","请选择功能。");
    		return;
    	}
    	//已选用户功能绑定
		if(userList.length > 0){
    		for(var i=0;i<userList.length;i++){
        		var dataObj = {};
    			dataObj.userId = userList[i];
    			dataObj.funcList = saveData["editSave"];
    			sendData.push(dataObj);
    		}
    	}
    	//已选角色功能绑定
    	if(roleList.length > 0){
    		for(var i=0;i<roleList.length;i++){
        		var dataObj = {};
    			dataObj.roleId = roleList[i];
    			dataObj.funcList = saveData["editSave"];
    			sendData.push(dataObj);
    		}
    	}
    	$.ajax({ 
            url:"${ctx}/base/sysfuncrolessave.action", 
            type:'post', 
            dataType:'json', 
            contentType:"application/json",
            data:JSON.stringify(sendData)
    	}).done(function(data){
    		
    	});
    }
</script>
</html>