package com.sxt.renthouse.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.renthouse.service.HouseService;

/**
 * Servlet implementation class SearchHouse
 */
public class SearchHouse extends BaseServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object searchDistrict(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(this.getServletName());
		List<String> district = new ArrayList<String>();
		district = houseService.getAllHouseDistrict();
		request.setAttribute("district", district);
		
		return request.getRequestDispatcher("/sys/main.jsp");//转发
	}
	

}
