package com.sxt.renthouse.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.renthouse.dao.impl.TestUserDao;
import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.service.UserService;
import com.sxt.renthouse.service.impl.UserServiceImpl;
import com.sxt.renthouse.utils.PageUtils;

/**
 * 后台用户管理Servlet
 * @author cg
 *
 */
public class BgUserServlet extends BaseServlet {
	//用户dao
	TestUserDao userDao = new TestUserDao();
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
		//用户集合
		List<User> list = new ArrayList<User>();
		PageUtils page = null;
		try {
			//拿到分页的数据
			//1.总条数,查询数据库得到用户个数
			int totalRow = userDao.findUserCount();
			//2.当前页,由jsp传过来
			String currentPage = request.getParameter("current");
			//3.每页显示条数,由jsp传过来
			String pageSize = request.getParameter("pageSize");
			int current = 1;
			int size = 5;
			//当前页
			if(currentPage != null){
				current = Integer.valueOf(currentPage);
			}
			
			//每页显示多少
			if(pageSize != null){
				size = Integer.valueOf(pageSize);
			}
			System.out.println(totalRow+"--"+current+"--"+size);
			
			page = new PageUtils(totalRow,current,size);
			list = userDao.getAllByPage(page);
			page.setList(list);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		//传入request作用域
		request.setAttribute("page",page);
		//返回跳转
		return request.getRequestDispatcher("sys/bg/bgUser.jsp");
	}
	
	/*<%
	if(request.getAttribute("page") == null){
		request.getRequestDispatcher("../../BgUserServlet?method=list");
	}
%>*/
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
		
		//获得过滤条件
		String key = request.getParameter("key");
		//获得过滤条件值
		String val = request.getParameter("value");
		System.out.println(key+"----"+val);
		//根据条件得到数据集合
		List<User> list = new ArrayList<User>();
		if("0".equals(key)){//用户名
			
		}else if("1".equals(key)){//昵称
			
		}else if("2".equals(key)){//电话
			
		}
		for(int i = 0;i < 10;i++){
			User u = new User();
			u.setU_Id("1234");
			u.setU_Grade("5");
			u.setU_Name("qweqasd");
			u.setU_Pwd("********");
			u.setU_Phone("150xxxx5485");
			u.setU_Sex("男");
			u.setU_Status(0);
			u.setU_Type("普通用户");
			list.add(u);
		}
		
		//传入request作用域
		request.setAttribute("list",list);
		//返回跳转
	
		return request.getRequestDispatcher("sys/bg/bgUser.jsp");
	}
	
}
