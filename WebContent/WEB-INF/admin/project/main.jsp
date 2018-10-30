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
<link rel="stylesheet" href="${ctx}/project/css/main.css">
<style type="text/css">

</style>
</head>
<body>
<div class="main">
	<div class="main-header">
		<div class="header-logo"></div>
		<div class="header-message" id="header-message">
			<div class="message-userInfo" id="message-userInfo">
				<img class="userInfo-tou" src="../common/images/defaulttou.png">
				<span class="userInfo-name">李岩</span>
			</div>
			<div class="message-select" id="message-select">
				<ul class="sel-ul">
					<li class="sel-li" onclick="logout()"><img src="../common/images/logout.png" style="height:23px;"><span>退出登录</span></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="main-menu">
		<div class="menu-content">
			<div class="menu-logo"></div>
			<div class="menu-name">功能管理</div>
		</div>
		<div class="menu-list" id="menu-list">
			<div class="leftMenu">
				<div class="main-ul" id="main-ul">
					<!-- <div class="main-li" id="1">
						<div class="list-content">
							<div class="list-img"></div>
							<div class="list-name">业务处理</div>
							<div class="list-jiantou"></div>
						</div>
						<div class="sMenuDivA" pid="1" style="display:none;">
							<div class="menuB">
								<div class="menuB-name">共享看板</div>
								<div class="menuC">
									<div class="menuC-a" data-menuid="1" data-uri="" onclick="openPage(this)">请假申请</div>
									<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>
									<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>
									<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>
								</div>
							</div>
						</div> 
					</div>
					<div class="main-li" id="2"><div class="list-content"><div class="list-img"></div><div class="list-name">单据传递</div><div class="list-jiantou"></div></div></div>
					<div class="main-li"><div class="list-content"><div class="list-img"></div><div class="list-name">信息管理</div><div class="list-jiantou"></div></div></div>
					<div class="main-li"><div class="list-content"><div class="list-img"></div><div class="list-name">知识管理</div><div class="list-jiantou"></div></div></div> -->
				</div>
			</div>
		</div>
	</div>
	<div class="main-container">
		<div class="navigation" id="navigation">
			<div class="nav-name" navid="0" onclick="changePage(this)">首页</div>
		</div>
		<div class="con-iframe" id="con-iframe">
			<iframe frameborder="0" frameid="0" class="iframecom" src="welcome.action"></iframe>
		</div>
	</div>
	<div class="main-bottom"></div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	init();
	showMenu();
});
function showMenu(){
	getMainData();
	$(".main-li").mouseover(function(e){
		var id=$(this).attr("id");
		$(this).addClass("main-lihover");
		if($.trim($(".sMenuDivA[pid='"+id+"']").html())!=""){
			$(".sMenuDivA[pid='"+id+"']").show();
		}
	});
	$(".main-li").mouseout(function(){
		var id=$(this).attr("id");
		$(".main-li[id='"+id+"']").removeClass("main-lihover");
		if($.trim($(".sMenuDivA[pid='"+id+"']").html())!=""){
			$(".sMenuDivA[pid='"+id+"']").hide();
		}
	});
}
//获取菜单数据
function getMainData(){
	$.ajax({ 
        url:"${ctx}/index/querySysMenusList.action", 
        type:'post', 
        dataType:'json',
        async : false
	}).done(function(data){
		createMenus(data);
		console.log(data);
	});
}
//创建菜单
function createMenu(menuData){
	var menuDatalength=menuData.length;
	for(var i=0;i<menuDatalength;i++){
		var ispid = true;
		var sysmenu = menuData[i];
		var sysFunc = menuData[i].sysFuns;
		var menuid=$("#"+menuData[i].fMenuId);
		if(sysmenu.fLevel==2 && menuid.length==0){
			//构建一级菜单
			var mainlihtml='<div class="main-li" id="'+sysmenu.fMenuId+'"><div class="list-content"><div class="list-img"></div><div class="list-name">'+sysmenu.fMenuName+'</div><div class="list-jiantou"></div></div></div>';
			$("#main-ul").append(mainlihtml);
		}
		var menupid = $(".sMenuDivA[pid='"+sysmenu.fMenuId+"']");
		if((sysmenu.fLevel==3 || sysmenu.fLevel==4)&&menupid.length==0){
			//构建二级级菜单
			$.each($(".sMenuDivA"),function(k,dom){
				var pid = $(dom).data("pid");
				if(sysmenu.fParent == pid){
					ispid = false;
				}
			});
			if(ispid){
				var menudivAhtml='<div class="sMenuDivA" pid="'+sysmenu.fParent+'" data-pid="'+sysmenu.fParent+'" style="display:none;">'
			  	  +'          <div class="menuB">'
			  	  +'              <div class="menuB-name">'+sysmenu.fMenuName+'</div>'
			  	  +'              <div class="menuC">'
			  	  +'              </div>'
			  	  +'          </div>'
			  	  +'      </div>';
				$("#menu-list").append(menudivAhtml);
			}
		}
		var menucDom = $(".sMenuDivA[pid='"+sysmenu.fParent+"']").find(".menuC");
		for(var z=0;z<sysFunc.length;z++){
			var menuchtml='<div class="menuC-a" data-menuid="'+sysFunc[z].fBh+'" data-url="'+sysFunc[z].fUrl+'" onclick="openPage(this)">'+sysFunc[z].fMc+'</div>';
			menucDom.append(menuchtml);
		}
	}
}

function createMenus(menuData){
	var menuDatalength=menuData.length;
	var pid = [];
	for(var i=0;i<menuDatalength;i++){
		var ispid = true;
		var sysmenu = menuData[i];
		var sysFunc = menuData[i].sysFuns;
		var menuid=$("#"+menuData[i].fMenuId);
		if(sysmenu.fLevel==2 && menuid.length==0 && $.inArray(sysmenu.fMenuId,pid)==-1){
			//构建一级菜单
			var mainlihtml='<div class="main-li" id="'+sysmenu.fMenuId+'">'
						  +'	<div class="list-content">'
						  +'		<div class="list-img"></div>'
						  +'		<div class="list-name">'+sysmenu.fMenuName+'</div>'
						  +'		<div class="list-jiantou"></div>'
						  +'	</div>'
						  +'	<div class="sMenuDivA" pid="'+sysmenu.fMenuId+'" style="display:none;">'
						  /*+'		<div class="menuB">'
						   +'			<div class="menuB-name">共享看板</div>'
						  +'			<div class="menuC">'
						   +'				<div class="menuC-a" data-menuid="1" data-uri="" onclick="openPage(this)">请假申请</div>'
						  +'				<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>'
						  +'				<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>'
						  +'				<div class="menuC-a" data-menuid="" data-uri="" onclick="openPage(this)">每日之星</div>' 
						  +'			</div>'
						  +'		</div>'*/
						  +'	</div>'
						  +'</div>';
			$("#main-ul").append(mainlihtml);
			pid.push(sysmenu.fMenuId);
		}
		if(sysmenu.fLevel==3){
			var menubDom = $(".sMenuDivA[pid='"+sysmenu.fParent+"']");
			var menubhtml = '<div class="menuB" tid="'+sysmenu.fMenuId+'">'
							+'	<div class="menuB-name" id="'+sysmenu.fMenuId+'">'+sysmenu.fMenuName+'</div>'
							+'	<div class="menuC"></div>'
							+'</div>';
			menubDom.append(menubhtml);
		}
		if(sysmenu.fLevel==4){
			var menucDom = $(".menuB[tid='"+sysmenu.fParent+"']").find(".menuC");
			var menuchtml = '<div class="menuC-a" data-menuid="'+sysmenu.sysFuns[0].fBh+'" data-url="'+sysmenu.sysFuns[0].fUrl+'" onclick="openPage(this)">'+sysmenu.fMenuName+'</div>';
			menucDom.append(menuchtml);
		}
	}
}

function init(){
	/* $("#wddjspan").on("click",function(){
		var userId=1;
	    $.ajax({ 
	        url:"${ctx}/leave/queryTask.action?userId="+userId, 
	        type:'post', 
	        dataType:'json', 
	        success : function(data){ 
	            if(data.leavebill.length>0){
	            	$.each(data.leavebill,function(k,v){
	            		var li = '<li class="item">'
                            +'<div class="check_box"></div>'
                            +'<div class="item_xh "></div>'
                            +'<div class="item_content">'
                            +'<div class="item_djlx"><span>'+v.name+'</span>/'+v.id+'</div>'
                            +'<div class="item_djzt"><span class="nameSapn">状态：</span>'+v.state+'</div>'
                            +'<div class="item_djje"><span class="nameSapn">金额：</span><span class="nameSapn">--</span></div>'
                            +'<div class="item_tbrq"><span class="nameSapn">日期：</span>'+v.leavedate+'</div>'
                            +'<div class="item_tbr"><span class="nameSapn">填报人：</span>'+v.userid+'</div>'
                            +'</div>'
                            +'</li>';
                        $("#wddj-ul-list").append(li);
	            	});
	            }
	        } 
	    });
	}); */
	$("#header-message").bind("mouseover", function(){
		$("#message-select").show();
	});
	$("#header-message").bind("mouseout", function(){
		$("#message-select").hide();
	});
	/* $(".main-li").bind("mouseover", function(){
		var pid = $(this).attr("id");
		var menucDom = $(".sMenuDivA[pid='"+pid+"']").show();
	});
	$(".main-li").bind("mouseout", function(){
		var pid = $(this).attr("id");
		var menucDom = $(".sMenuDivA[pid='"+pid+"']").hide();
	}); */
}
//打开页面
function openPage(self){
	var title=$(self).text();//获取导航条名称
	var menuid=$(self).data("menuid"); //获取菜单id
	var url=$(self).data("url");//获取url
	var iframeArr=$(".iframecom[frameid='"+menuid+"']");
	$(".iframecom").hide(); //隐藏所有iframe
	if(iframeArr.length==0){
		var html='<iframe frameborder="0" class="iframecom" frameid="'+menuid+'" src="${ctx}/'+url+'"></iframe>'
		var titlehtml='<div class="nav-name" navid="'+menuid+'" onclick="changePage(this)">'+title+'<div class="closebtn" navid="'+menuid+'" onclick="closePage(this)"></div></div>';
		$("#con-iframe").append(html);
		$("#navigation").append(titlehtml);
	}else{
		$(iframeArr).show();
	}
}
//关闭页面
function closePage(self){
	var navid=$(self).attr("navid");
	$(".iframecom[frameid='"+navid+"']").remove();
	$(".iframecom[frameid='"+(navid-1)+"']").show();
	$(self).parent().remove();
	event.stopPropagation();
}
//导航栏之间的切换
function changePage(self){
	var navid=$(self).attr("navid");
	//标题高亮
	$(".nav-name").removeClass("nav-namehighlight");
	$(self).addClass("nav-namehighlight");
	$(".iframecom").hide(); //隐藏所有iframe
	$(".iframecom[frameid='"+navid+"']").show();
}
//退出登录
function logout(){
	location.reload();
	$.ajax({ 
        url:"${ctx}/index/clientLoginOut.action", 
        type:'post', 
        dataType:'json',
        async : false
	}).done(function(data){
		
	});
}
</script>
</html>