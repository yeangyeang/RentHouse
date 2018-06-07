package com.sxt.renthouse.dao;


import java.util.List;

import com.sxt.renthouse.entity.User;


/**
 * 用户连接数据库dao接口
 * @author xujia
 *
 */
public interface UserDao {
	/**
	 * 添加一条用户记录
	 * @param User 
	 * @return 返回受影响的行
	 */
	public int addUser(User u);
	
	/**
	 * 根据条件查询所有的餐桌
	 * @param User  条件
	 * @return
	 */
	public List<User> getAllUser(User u);
	
	/**
	 * 根据id 跟新一条记录
	 * @param User
	 * @return
	*/
	public int updateUser(User u);
	
	/**
	 * 根据电话查找一条记录
	 */
	public User findUserByPhone(String phone);
	
	/**
	 * 根据ID删除一条记录
	 */
	public int deleteUserById(int id);
}
