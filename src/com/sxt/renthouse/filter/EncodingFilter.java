package com.sxt.renthouse.filter;


import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一处理中文编码的过滤器
 * @author 张春兰
 *
 */
public class EncodingFilter implements Filter {


	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {

		final HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		//处理post请求的中乱乱�?
		request.setCharacterEncoding("utf-8");
		//处理浏览器按指定的编码方式打�?
		response.setContentType("text/html;charset=utf-8");
		//处理响应的指定编码格�?
		response.setCharacterEncoding("utf-8");
		
		/**
		    get request.getParameter("")  出现乱码
		            �? HttpServletRequest（目标）            
		    Proxy.newProxyInstance     给目标创建一个代理对�? 
		    **/
		
		HttpServletRequest httpRequest= (HttpServletRequest) Proxy.newProxyInstance(
				HttpServletRequest.class.getClassLoader(),//�?��目标对象的类加载�?
				new Class[]{HttpServletRequest.class},
				new InvocationHandler() {  //处理器，看成是一个监�?  目标对象  上所有的       方法（method）�?
					/**
					 *  Method method :   目标对象上的�?��     �?�?     
					 *  Object[] args�?          目标对象上方法所有的 参数  
					 *  
					 *  例如�?              目标方法                 getParameter(String name);
					 *  
					 *          method =  getParameter
					 *          
					 *          args   = new  Object[]{name}
					 *  
					 *  
					 */
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
//						System.out.println("request目标对象的方法："+method.getName());
						//�?目标对象�?getParameter 方法扩展
						if("getParameter".equals(method.getName())){
							//得到request.getParameter("username") 的结�?
							String username = request.getParameter(args[0].toString());  //此处会乱码，如果是get请求，post不乱�?
							
							//如果是get请求�?解决乱码问题
							if("get".equalsIgnoreCase(request.getMethod())){
								
								if(username != null && !"".equals(username)){
									username = new String(username.getBytes("iso-8859-1"),"utf-8"); //解决乱码问题
								}
								
								return username;
							}else{
								return method.invoke(request, args);//直接调用原目标对象的方法，不做任何处�?
							}
						}else{
							return method.invoke(request, args);//直接调用原目标对象的方法，不做任何处�?
						}
					}
				});
		
		//执行servlet
		chain.doFilter(httpRequest, response);
		
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
	
	public void destroy() {

	}	

}
