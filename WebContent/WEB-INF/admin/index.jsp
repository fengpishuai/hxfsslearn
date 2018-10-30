<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
  <link rel="icon" type="image/png" href="${ctx}/admin/common/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="${ctx}/admin/common/i/app-icon72x72@2x.png">
  <link rel="stylesheet" href="${ctx}/admin/common/css/amazeui.min.css"/>
  <link rel="stylesheet" href="${ctx}/admin/common/css/admin.css">
  <style type="text/css">
    .container{
        position: absolute;
	    top: 50px;
	    left: 261px;
	    right: 0px;
	    bottom: 30px;
    }
    .footer{
        position: absolute;
	    bottom: 0px;
	    left: 260px;
	    right: 0px;
	    height: 30px;
    }
  </style>
</head>
<body>

<header class="am-topbar am-topbar-inverse admin-header">
  <div class="am-topbar-brand">
    <strong>PANSOFT</strong> <small>内控管理系统</small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
      <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li><a href="admin-index.html"><span class="am-icon-home"></span> 首页</a></li>
        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 我的任务 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav">
            <li>
              <a href="#" class="am-cf" data-am-collapse="{target: '#collapse-nav2'}"><span class="am-icon-check"></span> 个人资料<span class="am-icon-angle-right am-fr am-margin-right"></span></a>
              <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav2">
	            <li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
	            <li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
	            <li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
	            <li><a href="admin-log.html"><span class="am-icon-calendar"></span> 系统日志</a></li>
	            <li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
	          </ul>
            </li>
            <li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
            <li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
            <li><a href="admin-log.html"><span class="am-icon-calendar"></span> 系统日志</a></li>
            <li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
          </ul>
        </li>
        <li>
          <a href="#" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-money"></span> 员工报销<span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav1">
            <li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
            <li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
            <li><a href="admin-log.html"><span class="am-icon-calendar"></span> 系统日志</a></li>
            <li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
          </ul>
        </li>
        <li><a href="#"><span class="am-icon-strikethrough"></span> 支付申请</a></li>
        <li><a href="#"><span class="am-icon-clock-o"></span> 预算管理</a></li>
        <li><a href="#"><span class="am-icon-briefcase"></span> 合同管理</a></li>
        <li><a href="#"><span class="am-icon-area-chart"></span> 查询统计</a></li>
        <li><a href="#"><span class="am-icon-user"></span> 个人设置</a></li>
        <li><a href="#"><span class="am-icon-cog"></span> 系统管理</a></li>
        <li><a href="#"><span class="am-icon-edit"></span> 数据初始化</a></li>
      </ul>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-bookmark"></span> 公告</p>
          <p>时光静好，与君语；细水流年，与君同。—— Amaze UI</p>
        </div>
      </div>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-tag"></span> wiki</p>
          <p>Welcome to the Amaze UI wiki!</p>
        </div>
      </div>
    </div>
  </div>
  <!-- sidebar end -->

  <!-- content start -->
  <div class="container">
	  <iframe class="tabsIframe-content-default tabsIframe-content-select" id="pansoft-2" src="${ctx}/admin/common/welcome.jsp" height="100%" width="100%">
	
	  </iframe>
  </div>
</div>
  <!-- content end -->
<div class="footer">
    <p class="am-padding-left" style="margin: 5px;">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</div>


</body>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${ctx}/admin/common/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="${ctx}/admin/common/js/amazeui.min.js"></script>
<script src="${ctx}/admin/common/js/app.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
    	
    });
</script>
</html>