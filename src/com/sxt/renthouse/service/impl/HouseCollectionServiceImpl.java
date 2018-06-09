package com.sxt.renthouse.service.impl;

import java.util.List;

import com.sxt.renthouse.dao.HouseCollectionDao;
import com.sxt.renthouse.dao.impl.HouseCollectionDaoImpl;
import com.sxt.renthouse.entity.Housecollection;
import com.sxt.renthouse.service.HouseCollectionService;
/**
 * 房屋收藏业务接口实现类
 * @author xujia
 *
 */
public class HouseCollectionServiceImpl implements HouseCollectionService{
	HouseCollectionDao dao = new HouseCollectionDaoImpl();

	public int addHouseCollection(Housecollection hc) {
		return dao.addHouseCollection(hc);
	}

	public List<Housecollection> getAllHouseCollection(Housecollection hc) {
		return dao.getAllHouseCollection(hc);
	}

	public int updateHouseCollection(Housecollection hc) {
		return dao.updateHouseCollection(hc);
	}

	public int deleteHouseCollectionById(int id) {
		return dao.deleteHouseCollectionById(id);
	}
	
}
