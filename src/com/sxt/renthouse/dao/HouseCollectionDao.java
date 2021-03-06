package com.sxt.renthouse.dao;

import java.util.List;

import com.sxt.renthouse.entity.Housecollection;
import com.sxt.renthouse.entity.User;

public interface HouseCollectionDao {
	/**
	 * 添加一条用户记录
	 * @param HouseCollection 
	 * @return 返回受影响的行
	 */
	public int addHouseCollection(Housecollection hc);
	
	/**
	 * 根据条件查询所有的餐桌
	 * @param HouseCollection  条件
	 * @return
	 */
	public List<Housecollection> getAllHouseCollection(Housecollection hc);
	
	/**
	 * 根据id 跟新一条记录
	 * @param HouseCollection
	 * @return
	*/
	public int updateHouseCollection(Housecollection hc);
	
	/**
	 * 根据ID删除一条记录
	 */
	public int deleteHouseCollectionById(int id);
}
