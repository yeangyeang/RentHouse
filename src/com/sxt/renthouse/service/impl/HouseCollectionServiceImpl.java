package com.sxt.renthouse.service.impl;

import java.util.List;

import com.sxt.renthouse.dao.HouseCollectionDao;
import com.sxt.renthouse.dao.impl.HouseCollectionDaoImpl;
import com.sxt.renthouse.entity.HouseCollection;
import com.sxt.renthouse.service.HouseCollectionService;
/**
 * 房屋收藏业务接口实现类
 * @author xujia
 *
 */
public class HouseCollectionServiceImpl implements HouseCollectionService{
	HouseCollectionDao dao = new HouseCollectionDaoImpl();

	public int addHouseCollection(HouseCollection hc) {
		return dao.addHouseCollection(hc);
	}

	public List<HouseCollection> getAllHouseCollection(HouseCollection hc) {
		return dao.getAllHouseCollection(hc);
	}

	public int updateHouseCollection(HouseCollection hc) {
		return dao.updateHouseCollection(hc);
	}

	public int deleteHouseCollectionById(int id) {
		return dao.deleteHouseCollectionById(id);
	}
	
}
