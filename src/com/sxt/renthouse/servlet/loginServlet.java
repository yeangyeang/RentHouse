package com.sxt.renthouse.servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录注册页面
 * @author xujia
 *
 */
public class loginServlet extends BaseServlet {
	/**
	 * 根据验证登录身份[手机快捷登录或注册]
	 */
	public Object testIdentity(HttpServletRequest request, HttpServletResponse response){
		//获得输入进去的手机号
		String phone = request.getParameter("phone");
		//获得输入的验证码
		String code = request.getParameter("sms_code");
		Pattern phonePattern = Pattern.compile("^1\\d{10}$");
		Matcher matcher = phonePattern.matcher(phone);
		//判断手机号是否符合规范
		if(matcher.find()){
			if("123456".equals(phone)){
				
			}
		}else{
			return false;
		}
		
		return request.getRequestDispatcher("/main.jsp");//转发
	}
}
