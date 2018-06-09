package com.sxt.renthouse.dao.impl;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sxt.renthouse.dao.UserDao;
import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.utils.ComPoolUtil;

/**
 * 用户接口的实现类
 * @author xujia
 *
 */
public class UserDaoImpl implements UserDao {
	
	public int addUser(User u) {
		int count = 0; //受影响的行
		try {
			count = ComPoolUtil.getQueryRunner().update(
					"insert into User(U_id,U_phone) values (?,?)",
					u.getuId(),u.getuPhone());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

	public List<User> getAllUser(User u) {
		List<User> us = null; 
		try {
			us = ComPoolUtil.getQueryRunner().query(
					"select * from User",
					new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return us;
	}

	public int updateUser(User u) {
		return 0;
	}

	public User findUserByPhone(String phone) {
		User u = null; 
		try {
			u = ComPoolUtil.getQueryRunner().query(
					"select * from User where U_phone =?",
					new BeanHandler<User>(User.class),
					phone);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return u;
	}

	public int deleteUserById(int id) {
		return 0;
	}
	
}
