<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>    
    <meta name="baidu-site-verification" content="e8abd676df9f995bc969ac138b1c0f4d">
    <meta name="sogou_site_verification" content="7rtgKfBjbl">
    <meta name="360-site-verification" content="f7b8b308108b2c1c2de2825948822256">
    <meta name="google-site-verification" content="drkSj5A3WGSgkMXwzh6UfezwLEMsEXoQlMHL25oE1kA">
    <meta baidu-gxt-verify-token="9e7961d9a5d01603e5c2ae9bccffb9c2">
    <meta name="shenma-site-verification" content="da9c53da88979ec98afae25b1ca3e43b">
    <link rel="stylesheet" rev="stylesheet" href="${pageContext.request.contextPath}/img/img_login/Member_Web_Login_Form.css" type="text/css">
    <link rel="shortcut icon" href="https://pages.anjukestatic.com/usersite/site/img/global/1/favicon.ico" type="image/ico">
    <link rel="icon" href="https://pages.anjukestatic.com/usersite/site/img/global/1/favicon.ico" type="image/ico">
<div>
	<iframe style="display:none" id="sojtracker0" name="sojtracker0" height="300" width="500">
	</iframe>
</div>
<form action="https://s.anjuke.com/stb?__site=anjuke&amp;" method="post" target="sojtracker0">
	<input type="hidden" name="p" value="Member_Web_Login_FormPage">
	<input type="hidden" name="h" value="https://login.anjuke.com/login/form?history=aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==">
	<input type="hidden" name="r" value="">
	<input type="hidden" name="site" value="anjuke">
	<input type="hidden" name="guid" value="492E131F-9DBD-9313-C64C-A68B2680EC79">
	<input type="hidden" name="ssid" value="5BDFAD87-48DD-3840-C819-7607CFE54241">
	<input type="hidden" name="uid" value="0">
	<input type="hidden" name="t" value="1528118069485">
	<input type="hidden" name="ctid" value="27">
	<input type="hidden" name="luid" value="67950225:1">
	<input type="hidden" name="m" value="">
	<input type="hidden" name="sc" value="{&quot;w&quot;:&quot;1349&quot;,&quot;h&quot;:&quot;599&quot;,&quot;r&quot;:&quot;0&quot;}">
	<input type="hidden" name="pn" value="Member_Web_Login_FormPage">
	<input type="hidden" name="cp" value="{}">
</form>
<div>
	<iframe style="display:none" id="sojtracker1" name="sojtracker1" height="300" width="500">
	</iframe>
</div>
<!-- <form action="https://s.anjuke.com/stb?__site=anjuke-npv&amp;" method="post" target="sojtracker1">
<input type="hidden" name="p" value="Member_Web_Login_FormPage_tracklog">
<input type="hidden" name="h" value="https://login.anjuke.com/login/form?history=aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==">
<input type="hidden" name="r" value="">
<input type="hidden" name="site" value="anjuke-npv">
<input type="hidden" name="guid" value="492E131F-9DBD-9313-C64C-A68B2680EC79">
<input type="hidden" name="ssid" value="5BDFAD87-48DD-3840-C819-7607CFE54241">
<input type="hidden" name="uid" value="0">
<input type="hidden" name="t" value="1528118070588">
<input type="hidden" name="ctid" value="27">
<input type="hidden" name="luid" value="67950225:1">
<input type="hidden" name="m" value="">
<input type="hidden" name="sc" value="{&quot;w&quot;:&quot;1349&quot;,&quot;h&quot;:&quot;599&quot;,&quot;r&quot;:&quot;0&quot;}">
<input type="hidden" name="pn" value="Member_Web_Login_FormPage_tracklog">
<input type="hidden" name="cp" value="{}">
</form> 
-->
</head>
<body>
    <!-- <div class="user-nav">
		    <a class="logo-link" href="http://anjuke.com/">
		    	<i class="ajk-icon user-iconfont"></i>
		    </a>
		    <a style="display: none" href="" class="user-register">
			    <i class="broker-icon user-iconfont"></i>
			    <span class="register-txt">经纪人注册</span>
		    </a>
	</div> -->
<div class="content" id="content" style="width: 100%;">
    <div class="login-wrap">
        <div class="iframe-layer-mask not-in-layer" id="iframeLoginMask">
            <div class="iframe-layer-bg"></div>
            <div class="iframe-login-wrap" id="iframeLoginWrap">
                <!-- loading -->
                <div class="loading-wrap none" id="loadingwrap">
                    <div class="loading-item">
                        <div class="spinner"> 
                        <div class="spinner-container container1">
                         <div class="circle1"></div> 
                         <div class="circle2"></div>
                         <div class="circle3"></div> 
                         <div class="circle4"></div> 
                        </div> 
                        <div class="spinner-container container2"> 
                         <div class="circle1"></div> 
                         <div class="circle2"></div> 
                         <div class="circle3"></div> 
                         <div class="circle4"></div> 
                        </div> 
                        <div class="spinner-container container3"> 
                          <div class="circle1"></div>
                          <div class="circle2"></div> 
                          <div class="circle3"></div> 
                          <div class="circle4"></div> 
                        </div> 
                      </div>
                    </div>
                    <p class="loading-tip">正在加载中，请稍后...</p>
                </div> <!-- loading end -->
                <iframe class="iframe-login-ifm" id="iframeLoginIfm" src="${pageContext.request.contextPath}/img/img_login/iframeform.html" frameborder="0" scrolling="no"></iframe>
            </div>
        </div>
    </div>
</div>

<!-- 底部显示 start -->
<div id="footer" class="footer">
    <ul class="links">
        <li>
            <a rel="nofollow" href="https://kfzx.anjuke.com/faqList/defaultQue?faqKinds=2">关于易租房</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a rel="nofollow" href="https://kfzx.anjuke.com/faqDetail/queryDetail?faqId=95&amp;faqTypeId=11">联系我们</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a rel="nofollow" href="https://kfzx.anjuke.com/faqDetail/queryDetail?faqId=104&amp;faqTypeId=10">用户协议</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a href="javascript:void(0);" data-target="loan_link">价钱计算器</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a href="javascript:void(0);" data-target="seo_qa">最新问答</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a href="javascript:void(0);" data-target="map_link">网站地图</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a href="javascript:void(0);" data-target="house_link">最新房源</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a href="javascript:void(0);" data-target="other_city">其它城市</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a rel="nofollow" href="https://cs.anjuke.com/friendlink">友情链接</a>
            <em class="spe-lines">|</em>
        </li>
        <li>
            <a rel="nofollow" target="_blank" href="http://www.zx110.org/cxs/index.html">放心搜</a>
            <em class="spe-lines">|</em>
        </li>
        <li></li>
        <li>
            <a rel="nofollow" target="_blank" href="https://biz.anjuke.com/biz/index">渠道招商</a>
        </li>
    </ul>
	    <div class="cp-mod">
	        <a rel="nofollow" href="https://kfzx.anjuke.com/" target="_blank">客户服务中心</a>   
	           邮箱： <a href="mailto:service@58ganji.com" target="_blank" rel="nofollow">service@58ganji.com</a>   
	        Copyright&nbsp;©&nbsp;2007-2018 www.yijufang.com All Rights Reserved   <a href="http://www.miibeian.gov.cn/" rel="nofollow">ICP号：沪 B2-20090008</a>
	    </div>
</div>
<!-- 底部显示 end -->
<!-- 侧边栏 start -->
<div class="sidebar" style="display: block; right: 0px;">
    <div class="sidebar-mod sidebar-nav">
        <a href="https://www.anjuke.com/propsale/" rel="nofollow" class="sid-nav" data-soj="right_sidebar" target="_blank">
            <span class="iconfont iconfont22"></span>
            <p>卖房</p>
            <em class="nav-arrow"></em>
            <div class="sidebar-nav-hover">房东卖房</div>
        </a>
        <a href="https://kfzx.anjuke.com/" rel="nofollow" class="sid-nav" data-soj="right_sidebar" target="_blank">
            <span class="iconfont"></span>
            <p>帮助</p>
            <em class="nav-arrow"></em>
            <div class="sidebar-nav-hover">使用帮助</div>
        </a>
        <a href="https://www.wenjuan.com/s/NbqIZr" id="sid_survey" class="sid-nav" rel="nofollow" target="_blank">
            <span class="iconfont"></span>
            <p>调研</p>
            <em class="nav-arrow"></em>
            <div class="sidebar-nav-hover">用户调研</div>
        </a>
        <a href="javascript:void(0);" class="sid-nav">
            <span class="iconfont"></span>
            <p>下载</p>
            <em class="nav-arrow nav-sao"></em>
            <div class="sidebar-nav-hover sidebar-sao">下载安居客APP</div>
        </a>
        <a href="https://about.anjuke.com/chanpin/" class="sid-nav" data-soj="right_sidebar" target="_blank">
            <span class="iconfont"></span>
            <p>推广</p>
            <em class="nav-arrow"></em>
            <div class="sidebar-nav-hover">推广咨询</div>
        </a>
    </div>
</div>
<!-- 侧边栏 end -->
	<script src="${pageContext.request.contextPath}/img/img_login/push.js"></script>
	<script type="text/javascript" async="" src="${pageContext.request.contextPath}/img/img_login/s.js"></script>
	<script type="text/javascript" crossorigin="" src="${pageContext.request.contextPath}/img/img_login/jquery-underscore.min.js"></script>
	<script type="text/javascript" crossorigin="" src="${pageContext.request.contextPath}/img/img_login/bbv10.js"></script>
	<script type="text/javascript" crossorigin="" src="${pageContext.request.contextPath}/img/img_login/Member_Web_Login_Form.js"></script>
	<script type="text/javascript" async="" src="${pageContext.request.contextPath}/img/img_login/referrer_anjuke_pc.js"></script>
</body>
</html>