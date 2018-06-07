package com.sxt.renthouse.service.impl;

import java.util.List;

import com.sxt.renthouse.dao.UserDao;
import com.sxt.renthouse.dao.impl.UserDaoImpl;
import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.service.UserService;
/**
 * 用户业务实现类
 * @author xujia
 *
 */
public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();
	public int addUser(User u) {
		return dao.addUser(u);
	}

	public List<User> getAllUser(User u) {
		return dao.getAllUser(u);
	}

	public int updateUser(User u) {
		return dao.updateUser(u);
	}

	public User findUserByPhone(String phone) {
		return dao.findUserByPhone(phone);
	}

	public int deleteUserById(int id) {
		return dao.deleteUserById(id);
	}
	
}
