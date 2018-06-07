package com.sxt.renthouse.service;

import java.util.List;

import com.sxt.renthouse.entity.HouseCollection;
/**
 * 房屋收藏业务接口
 * @author xujia
 *
 */
public interface HouseCollectionService {
	/**
	 * 添加一条用户记录
	 * @param HouseCollection 
	 * @return 返回受影响的行
	 */
	public int addHouseCollection(HouseCollection hc);
	
	/**
	 * 根据条件查询所有的餐桌
	 * @param HouseCollection  条件
	 * @return
	 */
	public List<HouseCollection> getAllHouseCollection(HouseCollection hc);
	
	/**
	 * 根据id 跟新一条记录
	 * @param HouseCollection
	 * @return
	*/
	public int updateHouseCollection(HouseCollection hc);
	
	/**
	 * 根据ID删除一条记录
	 */
	public int deleteHouseCollectionById(int id);
}
