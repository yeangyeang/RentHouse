<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>用户管理</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/bgImg/images/icons/favicon.ico">
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/bgImg/images/icons/favicon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="${pageContext.request.contextPath}/bgImg/images/icons/favicon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="${pageContext.request.contextPath}/bgImg/images/icons/favicon-114x114.png">
    <!--Loading bootstrap css-->
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
    <link type="text/css" rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/jquery-ui-1.10.4.custom.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/font-awesome.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/animate.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/all.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/main.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/style-responsive.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/zabuto_calendar.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/pace.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/bgImg/styles/jquery.news-ticker.css">
    <!-- 导入jquery -->
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery-1.10.2.min.js"></script>
</head>

<script>
    // 窗口大小改变时,动态修改导航下面的区域高度
    $(window).resize(function () {
        var h = document.body.clientHeight;
        $("#sidebar").height(h - 50);
    });
    // 窗口大小改变时,动态修改导航下面的区域高度

    // 启动时,动态设置导航下面的区域高度
    $(function () {
        var h = document.body.clientHeight;
        $("#sidebar").height(h - 50);
    });
    // 启动时,动态设置导航下面的区域高度
</script>

<style>
    /* 确保可以取到可视区高度 */

    html {
        height: 100%;
    }

    body {
        height: 100%;
    }

    /* 确保可以取到可视区高度 */
</style>

<%
	if(request.getAttribute("page") == null){
		request.getRequestDispatcher("../../BgUserServlet?method=list");
	}
%>

<body>
    <div>
        <!--BEGIN THEME SETTING-->
        <div id="theme-setting">
            <a href="#" data-toggle="dropdown" data-step="1" data-intro="&lt;b&gt;Many styles&lt;/b&gt; and &lt;b&gt;colors&lt;/b&gt; be created for you. Let choose one and enjoy it!"
                data-position="left" class="btn-theme-setting">
                <i class="fa fa-cog"></i>
            </a>
            <div class="content-theme-setting">
                <select id="list-style" class="form-control">
                    <option value="style1">Flat Squared style</option>
                    <option value="style2">Flat Rounded style</option>
                    <option value="style3" selected="selected">Flat Border style</option>
                </select>
            </div>
        </div>
        <!--END THEME SETTING-->
        <!--BEGIN BACK TO TOP-->
        <a id="totop" href="#">
            <i class="fa fa-angle-up"></i>
        </a>
        <!--END BACK TO TOP-->
        <!--BEGIN TOPBAR-->
        <div id="header-topbar-option-demo" class="page-header-topbar">
            <nav id="topbar" role="navigation" style="margin-bottom: 0;" data-step="3" class="navbar navbar-default navbar-static-top">
                <div class="navbar-header">
                    <button type="button" data-toggle="collapse" data-target=".sidebar-collapse" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a id="logo" href="index.html" class="navbar-brand">
                        <span class="fa fa-rocket"></span>
                        <span class="logo-text">安居客后台管理</span>
                        <span style="display: none" class="logo-text-icon">µ</span>
                    </a>
                </div>
                <div class="topbar-main">
                    <a id="menu-toggle" href="#" class="hidden-xs">
                        <i class="fa fa-bars"></i>
                    </a>

                    <form id="topbar-search" action="" method="" class="hidden-sm hidden-xs">
                        <div class="input-icon right text-white">
                            <a href="#">
                                <i class="fa fa-search"></i>
                            </a>
                            <input type="text" placeholder="Search here..." class="form-control text-white" />
                        </div>
                    </form>
                    <ul class="nav navbar navbar-top-links navbar-right mbn">
                        <li class="dropdown topbar-user">
                            <a data-hover="dropdown" href="#" class="dropdown-toggle">
                                <img src="${pageContext.request.contextPath}/bgImg/images/avatar/48.jpg" alt="" class="img-responsive img-circle" />&nbsp;
                                <span class="hidden-xs">Robert John</span>&nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-user pull-right">
                                <li>
                                    <a href="#">
                                        <i class="fa fa-user"></i>My Profile</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-calendar"></i>My Calendar</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-envelope"></i>My Inbox
                                        <span class="badge badge-danger">3</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-tasks"></i>My Tasks
                                        <span class="badge badge-success">7</span>
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-lock"></i>Lock Screen</a>
                                </li>
                                <li>
                                    <a href="Login.html">
                                        <i class="fa fa-key"></i>Log Out</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            <!--BEGIN MODAL CONFIG PORTLET-->
            <div id="modal-config" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" data-dismiss="modal" aria-hidden="true" class="close">
                                &times;</button>
                            <h4 class="modal-title">
                                Modal title</h4>
                        </div>
                        <div class="modal-body">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend et nisl eget porta. Curabitur elementum sem molestie
                                nisl varius, eget tempus odio molestie. Nunc vehicula sem arcu, eu pulvinar neque cursus
                                ac. Aliquam ultricies lobortis magna et aliquam. Vestibulum egestas eu urna sed ultricies.
                                Nullam pulvinar dolor vitae quam dictum condimentum. Integer a sodales elit, eu pulvinar
                                leo. Nunc nec aliquam nisi, a mollis neque. Ut vel felis quis tellus hendrerit placerat.
                                Vivamus vel nisl non magna feugiat dignissim sed ut nibh. Nulla elementum, est a pretium
                                hendrerit, arcu risus luctus augue, mattis aliquet orci ligula eget massa. Sed ut ultricies
                                felis.
                            </p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" data-dismiss="modal" class="btn btn-default">
                                Close</button>
                            <button type="button" class="btn btn-primary">
                                Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--END MODAL CONFIG PORTLET-->
        </div>
        <!--END TOPBAR-->
        <div id="wrapper">
            <!--BEGIN SIDEBAR MENU-->
            <nav id="sidebar" role="navigation" data-step="2" data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;" data-position="right"
                class="navbar-default navbar-static-side">
                <div class="sidebar-collapse menu-scroll">
                    <ul id="side-menu" class="nav">

                        <div class="clearfix"></div>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/bg/网站详情.html">
                                <i class="fa fa-tachometer fa-fw">
                                    <div class="icon-bg bg-orange"></div>
                                </i>
                                <span class="menu-title">网站详情</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/bg/房源管理.html">
                                <i class="fa fa-send-o fa-fw">
                                    <div class="icon-bg bg-green"></div>
                                </i>
                                <span class="menu-title">房源管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/bg/bgAgent.jsp">
                                <i class="fa fa-edit fa-fw">
                                    <div class="icon-bg bg-violet"></div>
                                </i>
                                <span class="menu-title">经纪人管理</span>
                            </a>
                        </li>
                        <li class="active">
                            <a href="${pageContext.request.contextPath}/sys/bg/bgUser.jsp">
                                <i class="fa fa-th-list fa-fw">
                                    <div class="icon-bg bg-blue"></div>
                                </i>
                                <span class="menu-title">用户管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/bg/问答管理.html">
                                <i class="fa fa-database fa-fw">
                                    <div class="icon-bg bg-red"></div>
                                </i>
                                <span class="menu-title">问答管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/bg/系统消息.html">
                                <i class="fa fa-envelope-o">
                                    <div class="icon-bg bg-primary"></div>
                                </i>
                                <span class="menu-title">系统消息</span>
                            </a>
                            <li>
                                <a href="${pageContext.request.contextPath}/sys/bg/系统设置.html">
                                    <i class="fa fa-slack fa-fw">
                                        <div class="icon-bg bg-green"></div>
                                    </i>
                                    <span class="menu-title">系统设置</span>
                                </a>
                            </li>
                    </ul>
                </div>
            </nav>
            <!--END SIDEBAR MENU-->
            <!--BEGIN CHAT FORM-->
            <div id="chat-form" class="fixed">
                <div class="chat-inner">
                    <h2 class="chat-header">
                        <a href="javascript:;" class="chat-form-close pull-right">
                            <i class="glyphicon glyphicon-remove">
                            </i>
                        </a>
                        <i class="fa fa-user"></i>&nbsp; Chat &nbsp;
                        <span class="badge badge-info">3</span>
                    </h2>
                    <div id="group-1" class="chat-group">
                        <strong>Favorites</strong>
                        <a href="#">
                            <span class="user-status is-online"></span>
                            <small>
                                Verna Morton</small>
                            <span class="badge badge-info">2</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-online"></span>
                            <small>Delores Blake</small>
                            <span class="badge badge-info is-hidden">
                                0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-busy"></span>
                            <small>Nathaniel Morris</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-idle"></span>
                            <small>Boyd Bridges</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-offline"></span>
                            <small>Meredith Houston</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                    </div>
                    <div id="group-2" class="chat-group">
                        <strong>Office</strong>
                        <a href="#">
                            <span class="user-status is-busy"></span>
                            <small>
                                Ann Scott</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-offline"></span>
                            <small>Sherman Stokes</small>
                            <span class="badge badge-info is-hidden">
                                0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-offline"></span>
                            <small>Florence Pierce
                            </small>
                            <span class="badge badge-info">1</span>
                        </a>
                    </div>
                    <div id="group-3" class="chat-group">
                        <strong>Friends</strong>
                        <a href="#">
                            <span class="user-status is-online"></span>
                            <small>
                                Willard Mckenzie</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-busy"></span>
                            <small>Jenny Frazier</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-offline"></span>
                            <small>Chris Stewart</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                        <a href="#">
                            <span class="user-status is-offline"></span>
                            <small>Olivia Green</small>
                            <span class="badge badge-info is-hidden">0</span>
                        </a>
                    </div>
                </div>
                <div id="chat-box" style="top: 400px">
                    <div class="chat-box-header">
                        <a href="#" class="chat-box-close pull-right">
                            <i class="glyphicon glyphicon-remove">
                            </i>
                        </a>
                        <span class="user-status is-online"></span>
                        <span class="display-name">Willard Mckenzie
                        </span>
                        <small>Online</small>
                    </div>
                    <div class="chat-content">
                        <ul class="chat-box-body">
                            <li>
                                <p>
                                    <img src="${pageContext.request.contextPath}/bgImg/images/avatar/128.jpg" class="avt" />
                                    <span class="user">John Doe</span>
                                    <span class="time">09:33</span>
                                </p>
                                <p>
                                    Hi Swlabs, we have some comments for you.</p>
                            </li>
                            <li class="odd">
                                <p>
                                    <img src="${pageContext.request.contextPath}/bgImg/images/avatar/48.jpg" class="avt" />
                                    <span class="user">Swlabs</span>
                                    <span class="time">09:33</span>
                                </p>
                                <p>
                                    Hi, we're listening you...</p>
                            </li>
                        </ul>
                    </div>
                    <div class="chat-textarea">
                        <input placeholder="Type your message" class="form-control" />
                    </div>
                </div>
            </div>
            <!--END CHAT FORM-->
            <div class="copyrights">Collect from
                <a href="http://www.cssmoban.com/">手机网站模板</a>
            </div>
            <!--BEGIN PAGE WRAPPER-->
            <div id="page-wrapper">
                <!--BEGIN TITLE & BREADCRUMB PAGE-->
                <div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
                    <div class="page-header pull-left">
                        <div class="page-title">
                            用户管理</div>
                    </div>
                    <ol class="breadcrumb page-breadcrumb pull-right">
                        <li>
                            <i class="fa fa-home"></i>&nbsp;
                            <a href="dashboard.html">主页</a>&nbsp;&nbsp;
                            <i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
                        <li class="hidden">
                            <a href="#">用户管理</a>&nbsp;&nbsp;
                            <i class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
                        <li class="active">用户管理</li>
                    </ol>
                    <div class="clearfix">
                    </div>
                </div>
                <!--END TITLE & BREADCRUMB PAGE-->

                <!--BEGIN CONTENT-->
                <div class="page-content">
                    <div id="tab-general">
                        <div class="row mbl">
                            <div class="col-lg-12">

                                <div class="col-md-12">
                                    <div id="area-chart-spline" style="width: 100%; height: 300px; display: none;">
                                    </div>
                                </div>

                            </div>
                            
                            <div class="col-lg-12">
                                <div class="row">
                                    <div class="col-lg-10">
                                        <div class="row">
                                        	<form action="${pageContext.request.contextPath}/BgUserServlet?method=findBy" method="post">
	                                            <div class="col-lg-4">
	                                                <div class="form-group">
	                                                    <label for="user" class="col-lg-4 control-label" style="line-height: 34px;height: 34px;">过滤条件</label>
	                                                    <div class="col-lg-8" style="padding: 0px!important;">
	                                                        <select class="form-control" name="key">
	                                                            <option name="key" value="0">用户名</option>
	                                                            <option name="key" value="1">昵称</option>
	                                                            <option name="key" value="2">电话</option>
	                                                        </select>
	                                                    </div>
	                                                </div>
	                                            </div>
	                                            <div class="col-lg-4" style="padding: 0px!important;">
	                                                <div class="form-group">
	                                                    <div class="col-lg-8" style="padding: 0px!important;">
	                                                        <input type="text" class="form-control" name="value" value="">
	                                                    </div>
	                                                    <div class="col-lg-4" style="padding: 0px!important;">
	                                                        <button class="form-control btn btn-info" type="submit">搜索</button>
	                                                    </div>
	                                                </div>
	                                            </div>
                                            </form>
                                            <div class="col-lg-4"></div>
                                        </div>
                                    </div>
                                    <div class="col-lg-2" style="margin-bottom: 10px;line-height: 34px;height: 34px;">
                                        <select name="" id="">
                                            <option value="">10</option>
                                            <option value="">20</option>
                                            <option value="">50</option>
                                            <option value="">100</option>
                                        </select>
                                        <span>每页记录</span>
                                    </div>
                                </div>
                                <!-- 用户表格 -->
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="panel panel-yellow">
                                            <div class="panel-heading">用户列表</div>
                                            <div class="panel-body">
                                                <table class="table table-hover">
                                                    <thead>
                                                        <tr>
                                                            <th>用户名</th>
                                                            <th>密码</th>
                                                            <th>昵称</th>
                                                            <th>性别</th>
                                                            <th>等级</th>
                                                            <th>电话</th>
                                                            <th>种类</th>
                                                            <th>状态</th>
                                                            <th>操作</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
	                                                    <c:forEach items="${page.list}" var="User">
														   <tr>
	                                                            <td>${User.u_Id}</td>
	                                                            <td>${User.u_Pwd}</td>
	                                                            <td>${User.u_Name}</td>
	                                                            <td>${User.u_Sex}</td>
	                                                            <td>${User.u_Grade}</td>
	                                                            <td>${User.u_Phone}</td>
	                                                            <td>${User.u_Type}</td>
	                                                            <td><span class="label label-sm label-success">正常 </span></td>
	                                                            <td><a class="a btn-sm btn-info" href="#">删除 </a></td>
	                                                        </tr>
														</c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <center>
                                <ul class="pagination mtm mbm">
                                    <li><a href="${pageContext.request.contextPath}/BgUserServlet?method=list&current=${page.firstPage}">&laquo;</a></li>
                                    <li><a href="${pageContext.request.contextPath}/BgUserServlet?method=list&current=${page.prePage}">&lt;</a></li>
                                    <li><a href="#">${page.currentPage}/${page.pageCount}</a></li>
                                    <li><a href="${pageContext.request.contextPath}/BgUserServlet?method=list&current=${page.nextPage}">&gt;</a></li>
                                    <li><a href="${pageContext.request.contextPath}/BgUserServlet?method=list&current=${page.lastPage}">&raquo;</a></li>
                                </ul>
                            </center>
                        </div>
                    </div>
                </div>
                <!--END CONTENT-->

            </div>
            <!--END PAGE WRAPPER-->
        </div>
    </div>

    <script src="${pageContext.request.contextPath}/bgImg/script/jquery-migrate-1.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery-ui.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/bootstrap-hover-dropdown.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/respond.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.slimscroll.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/icheck.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/custom.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.news-ticker.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.menu.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/pace.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/holder.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/responsive-tabs.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.categories.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.pie.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.tooltip.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.fillbetween.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.stack.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/jquery.flot.spline.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/zabuto_calendar.min.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/index.js"></script>
    <!--LOADING SCRIPTS FOR CHARTS-->
    <script src="${pageContext.request.contextPath}/bgImg/script/highcharts.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/data.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/drilldown.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/exporting.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/highcharts-more.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/charts-highchart-pie.js"></script>
    <script src="${pageContext.request.contextPath}/bgImg/script/charts-highchart-more.js"></script>
    <!--CORE JAVASCRIPT-->
    <script src="${pageContext.request.contextPath}/bgImg/script/main.js"></script>


</body>

</html>