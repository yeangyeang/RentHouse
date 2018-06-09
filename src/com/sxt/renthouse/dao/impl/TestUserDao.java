package com.sxt.renthouse.dao.impl;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.utils.ComPoolUtil;
import com.sxt.renthouse.utils.PageUtils;

/**
 * 测试用户dao，实现后台用户管理所需要功能
 * @author cg
 *
 */
public class TestUserDao {
	
	public static int findUserCount(){
		Connection conn = null;
		//创建查询器赋给数据库
		QueryRunner qr=new QueryRunner();
		Long total_row=0L;
		try {
			String sql="select count(*) as total_row from user";
			conn = ComPoolUtil.dataSource.getConnection();
			total_row = (Long)qr.query(conn,sql, new ScalarHandler("total_row"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total_row.intValue();
	}
	
	public static List<User> getAllByPage(PageUtils pageUtils){
		//创建查询器赋给数据库
		Connection conn = null;
		QueryRunner qr= null;
		String sql = "select * from user order by uid desc limit ?,?";
		
		qr = ComPoolUtil.getQueryRunner();
		List<User> userList=null;
		try {
			conn = ComPoolUtil.dataSource.getConnection();
			userList = qr.query(conn, "select * from user order by u_id desc limit ?,?", new BeanListHandler<User>(User.class),pageUtils.getStartRow(),pageUtils.getPageSize());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public static void main(String[] args) {
		int rowNum = findUserCount();
		PageUtils page = new PageUtils(rowNum,0,5);
		List<User> list = getAllByPage(page);
		for (User user : list) {
			System.out.println(user.getuName());
		}
		//page.
	}
}
