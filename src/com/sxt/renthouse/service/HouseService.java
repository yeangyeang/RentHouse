package com.sxt.renthouse.service;

import java.util.List;

/**
 * 对房屋的处理服务
 * @author yang
 *
 */
public interface HouseService {

	/**
	 * 查询房源地区结果集
	 * @return
	 */
	public List<String> getAllHouseDistrict();
}
