<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="robots" content="noindex,nofollow">
<link rel="stylesheet" rev="stylesheet" href="./Member_Web_Login_IframeForm.css" type="text/css">
<!--<script type="text/javascript" src="/rentHouse/WebContent/WEB-INF/lib/jquery-2.1.1.js" charset="utf-8"></script>-->
<script type="text/javascript" src="./jquery-2.1.1.js"></script>
<script type="text/javascript" crossorigin="" src="./jquery-underscore.min.js"></script>
<script type="text/javascript" crossorigin="" src="./Json2.js"></script>
<script type="text/javascript" crossorigin="" src="./bbv10.js"></script>
<script type="text/javascript" crossorigin="" src="./md5.js"></script>
<script type="text/javascript" crossorigin="" src="./sha1.js"></script>
<script type="text/javascript" crossorigin="" src="./sha256.js"></script>
<script type="text/javascript" crossorigin="" src="./Member_Web_Login_IframeForm.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0,user-scalable=no,minimal-ui">
<title>用户登录</title>
</head>
<body>


<!-- login-content -->
<div class="login-content not-in-layer  ">
            <div class="head">
        <h3>登录易租房</h3>
</div>
    
    <!-- form-content -->
    <div class="form-content" id="ifmFormContent">
                <div class="tab-wrap">
                        <a class="cur" id="smsTab" href="javascript:void(0);">手机快捷登录或注册</a>
                        <i></i>
                        <a class="" id="pwdTab" href="javascript:void(0);">账号密码登录</a>
    </div>
<!-- form-wrap -->
<div class="form-wrap">
<!-- sms form -->
<form  action="${pageContext.request.contextPath}/loginServlet">
	<input type="hidden" name="method" value="testIdentity" />
                    <div class="item itemNode">
                            <p class="hidden error errorItem" id="errorItemTop">错误～</p>
                        <div class="control-item-wrap">
                            <div class="control-item controlItemNode">
                                <i class="iconfont phone-icon"></i>
                                <i class="split phone-split">|</i>
                                <input class="ipt" id="phoneIpt" name="phone" type="text" maxlength="11" placeholder="请输入手机号码" value="" tabindex="1">
                            </div>
                        </div>
                        <i class="hidden iconfont icon-ok iconOK"></i>
                    </div>
                    <div class="item itemNode">
                        <p class="hidden error errorItem">错误～</p>
                        <div class="control-item-wrap">
                            <div class="sms-transition" id="smsTransitionNode">
                                <div class="control-item control-item-md control-item-sms controlItemNode">
                                    <i class="iconfont lock-icon" tabindex="-1"></i>
                                    <i class="split" tabindex="-1">|</i>
                                    <input class="ipt" id="smsIpt" name="sms_code" type="text" placeholder="请输入验证码">
                                </div>
                                 <a class="sms-btn" id="SmsBtn" href="javascript:void(0);">获取验证码</a>
                               
                            </div>
                        </div>
                    </div>
                    <div class="check-item">
                        <label id="smsCheckboxLabel">
                            <input id="smsCheckbox" type="checkbox" checked="checked">
                            <span class="checkbox-fake checkbox-fake-checked">
                                <i class="iconfont"></i>
                            </span>
                            <span>我已阅读并接受</span>
                        </label>
                            <a href="https://kfzx.anjuke.com/faqDetail/queryDetail?faqId=104&amp;faqTypeId=10" target="_blank">
                                	《易租房用户服务协议》
                            </a>
                        	    及
                            <a href="https://kfzx.anjuke.com/faqDetail/queryDetail?faqId=104&amp;faqTypeId=10" target="_blank">
                                	《易租房隐私权政策》
                            </a>
                       </div>
                    <input class="submit-btn" id="smsSubmitBtn"  type="submit" value="立即登录">
</form> 
<!-- sms form end -->
            
<!-- pwd form -->
                <form class="form none" autocomplete="off" id="pwdLoginForm" action="https://login.anjuke.com/login/submit?hidehead=" method="post">
                    <div class="item itemNode">
                                                <p class="hidden error errorItem" id="errorItemTopPwd">错误～</p>
                                                <div class="control-item-wrap auto-list-item-wrap">
                            <div class="control-item controlItemNode">
                                <i class="iconfont user-icon"></i>
                                <i class="split user-split">|</i>
                                <input class="ipt" id="pwdUserNameIpt" type="text" name="username" maxlength="30" placeholder="请输入手机号码" value="" tabindex="1">
                            </div>
                            <ul class="auto-ul none" id="autoUl">
                                <li><span class="domain domainNode"></span><span class="mail emailNode">@qq.com</span></li>
                                <li><span class="domain domainNode"></span><span class="mail emailNode">@163.com</span></li>
                                <li><span class="domain domainNode"></span><span class="mail emailNode">@126.com</span></li>
                                <li><span class="domain domainNode"></span><span class="mail emailNode">@sina.com</span></li>
                                <li><span class="domain domainNode"></span><span class="mail emailNode">@sohu.com</span></li>
                            </ul>
                        </div>
                        <i class="hidden iconfont icon-ok iconOK"></i>
                    </div>
                    <div class="item itemNode">
                        <p class="hidden error errorItem">错误～</p>
                        <div class="control-item-wrap">
                            <div class="sms-transition" id="pwdTransitionNode">
                                <div class="control-item controlItemNode">
                                    <i class="iconfont lock-icon" tabindex="-1"></i>
                                    <i class="split lock-split" tabindex="-1">|</i>
                                    <input class="ipt" id="pwdIpt" type="password" name="password" maxlength="40" placeholder="请输入密码" tabindex="2">
                                </div>
                                <!-- <div class="control-item control-item-md controlItemNode">
                                    <i class="iconfont img-icon" tabindex="-1"></i>
                                    <i class="split" tabindex="-1">|</i>
                                    <input class="ipt" id="pwdCaptchaIpt" name="captcha" type="text" maxlength="4" placeholder="请输入图片验证码" tabindex="-1">
                                </div>
                                <img class="captcha captchaNode" src="./captcha" alt="验证码" tabindex="-1">
                                <a href="javascript:void(0);" class="refresh-btn iconfont" id="pwdCaptchaRefreshBtn" tabindex="-1"></a> -->
                            </div>
                        </div>
                    </div>
                    <div class="check-item">
                            <label id="pwdCheckboxLabel">
                            <input id="pwdCheckbox" checked="checked" type="checkbox">
                            <span class="checkbox-fake checkbox-fake-checked">
                                <i class="iconfont"></i>
                            </span><span>我已阅读并接受</span>
                        </label>
                       <a href="https://kfzx.anjuke.com/faqDetail/queryDetail?faqId=104&amp;faqTypeId=10" target="_blank">用户服务协议</a>
                    </div>
                    <input type="hidden" name="style" value="1">
                    <input type="hidden" name="third_parts" value="111">
                    <input type="hidden" name="other_parts" value="111">
                    <input type="hidden" name="forms" value="11">
                    <input type="hidden" name="login_type" value="2">
                    <input type="hidden" name="history" value="aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==">
                    <input type="hidden" name="check_bind_phone" value="1">
                    <input type="hidden" name="token" value="MGYzMDNiNDcwNTkwNzBkNTUxMGRhYTVjODI0M2Y3Yjc=">
                    <input id="token2NodePwd" type="hidden" name="token2" value="3785a6bf0fcf5d7cf2153840939a7dfcdfe9b6adf91d1a355cd5edc9cbb650f6">
                    <input type="hidden" name="multi_form" value="0">
                    <input class="submit-btn" id="pwdSubmitBtn" type="submit" value="立即登录">
                </form>
<!-- pwd form end -->
            

</div> 
<!-- form-wrap end -->
</div> 
<!-- form-content end -->
<!-- 第三方登录模块展示开始 -->
            <div class="third-login-title" id="thirdLoginTitle">
            <p class="line"></p>
            <p class="doc"><span>其他账户登录</span></p>
        </div>
    
        <div class="thirds-wrap" id="thirdsWrap">
        <!-- QQ登录展示 -->
                <a id="QQLogin" class="qq iconfont" href="https://login.anjuke.com/login/extlogin?login_type=qq&amp;check_bind_phone=1&amp;history=aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==" target="_blank" _soj="login_page_qq"></a>
        
        <!-- 微博登录展示 -->
                <a id="weiboLogin" class="weibo iconfont" href="https://login.anjuke.com/login/extlogin?login_type=weibo_pc&amp;check_bind_phone=1&amp;history=aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==" target="_blank" _soj="login_page_weibo"></a>
        
        <!-- 微信登录展示 -->
                <a id="weixinLogin" class="weixin iconfont" href="https://login.anjuke.com/login/extlogin?login_type=weixin_pc&amp;check_bind_phone=1&amp;history=aHR0cHM6Ly9jcy5hbmp1a2UuY29tLw==" target="_blank" _soj="login_page_weichat"></a>
            </div>
<!-- 第三方登录模块展示结束 -->

<!-- 其他登录模块展示开始 -->
        <div class="other-login-wrap" id="otherLoginWrap">
        <p class="title">客户登录</p>

                <p><i class="iconfont"></i><a href="https://svip.fang.anjuke.com/login" target="_blank" _soj="login_anjuke">房易通帐号 <i>&gt;</i></a></p>
        
                <p><i class="iconfont"></i><a href="http://my.anjuke.com/fxb/login" target="_blank" _soj="login_anjuke">新房分销帐号 <i>&gt;</i></a></p>
        
                <p><i class="iconfont"></i><a href="http://vip.anjuke.com/user/brokerhome" target="_blank" _soj="login_anjuke">经纪人帐号 <i>&gt;</i></a></p>
            </div>
<!-- 其他登录模块展示结束 -->
</div> <!-- login-content end -->

<div class="login-success none" id="iframeLoginSuccess">
    <div class="success-tip">
        <i class="iconfont"></i>
    </div>
    <p>登录成功，正在跳转...</p>
    <div class="success-btn-wrap">
        <a href="main.jsp" target="_top">立即跳转</a>
    </div>
</div>

<script>
$(function(){
	$("#SmsBtn").bind("click",function(){
		 $.post("../../loginServlet",{method:'getCode',phone:$("#phoneIpt").val()});
		// window.location.href = "loginServlet?method=getCode";
	 });
    ajk.loginInner = new ajk.LoginIframe({
        submiting_text  : "", // 登陆中时按钮显示的文案
        phoneCheckApi   : "/login/checkphone",
        captchaCheckApi : "/general/checkcaptcha",
        sendsmsApi      : "/login/sendsms",
        showCaptchaApi  : "/login/checkshowcaptcha",
        algo            : "algo3",
        token           : "MGYzMDNiNDcwNTkwNzBkNTUxMGRhYTVjODI0M2Y3Yjc=",
        continueCountTime : "", // 提交表单失败时让发送短信的倒计时可连续
        multi_form      : "0"
    });

    // 通知外层文档ready
    ajk.loginInner.send({
        name : "logincontentLoaded"
    });

    ajk.Logger.addLinkSoj();
    
});
</script>

</body></html>