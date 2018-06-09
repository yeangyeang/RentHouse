package com.sxt.renthouse.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 数据库工具类
 * 
 * @author wenber
 * 
 */
public class DBCommon {
	
	private static DataSource ds = new ComboPooledDataSource();
	
	public static DataSource getDS(){
		return ds;
	}
	
	//线程变量
	private static ThreadLocal<Connection>  tc=new ThreadLocal<Connection>();
	
	/**
	 * 取得数据库连接
	 * @return 返回连接
	 */
	public static Connection getConn(){
		Connection conn=tc.get();
		try {
			//如果线程变量中没有则创建一个新的
			if(conn==null){
				conn=ds.getConnection();
				//与当前线程绑定
				tc.set(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * 关闭数据库
	 * @param conn 数据库连接
	 * @param stat Sql执行器
	 * @param rs 结果
	 */
	public static void close(Connection conn,Statement stat,ResultSet rs){
		try {
			if(rs!=null)rs.close();
			if(stat!=null)stat.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//解除当前绑定
			tc.remove();
		}
	}
	
	/**
	 * 关闭数据库
	 * @param conn 数据库连接
	 * @param stat Sql执行器
	 */
	public static void close(Connection conn,Statement stat){
		try {
			if(stat!=null)stat.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
