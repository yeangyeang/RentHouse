package com.sxt.renthouse.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.service.UserService;
import com.sxt.renthouse.service.impl.UserServiceImpl;

/**
 * 后台用户管理Servlet
 * @author cg
 *
 */
public class BgUserServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//用户操作service
	private UserService userService = new UserServiceImpl();
	
	/**
	 * 枚举索引用户
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public Object list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Object url = null;
		url = request.getRequestDispatcher("sys/bg/bgUser.jsp");
		//用户集合
		List<User> list = null;
		//传入request作用域
		request.setAttribute("list",list);
		return url;
	}
	
	/**
	 * 根据条件过滤用户
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public Object findBy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Object url = null;
		url = request.getRequestDispatcher("bgUser.jsp");
		//获得过滤条件
		String key = request.getParameter("key");
		//获得过滤条件值
		String val = request.getParameter("value");
		System.out.println(key+"----"+val);
		//根据条件得到数据集合
		List<User> list = null;
		if("0".equals(key)){//用户名
			
		}else if("1".equals(key)){//昵称
			
		}else if("2".equals(key)){//电话
			
		}
		//传入request作用域
		request.setAttribute("list",list);
		//返回跳转
		return url;
	}
	
}
