package com.sxt.renthouse.dao;

import java.util.List;

/**
 * 对房子的增删改查都在这里面
 * @author yang
 *
 */
public interface HouseDao {

	/**
	 * 得到已经发布房源的所有区域位置集合
	 * @return
	 */
	List<String> getAllHouseDistrict();
	/**
	 * 根据关键字得到已经发布房源
	 * @return
	 */
	List<String> getAllHouseByKeyWord(String str);
	
}
