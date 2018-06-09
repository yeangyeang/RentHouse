package com.sxt.renthouse.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sxt.renthouse.dao.HouseDao;
import com.sxt.renthouse.dao.impl.HouseDaoImpl;
import com.sxt.renthouse.service.HouseService;
/**
 * 
 * @author yang
 *
 */
public class HouseServiceImpl implements HouseService {
	
	private HouseDao dao=new HouseDaoImpl();
	public List<String> getAllHouseDistrict(){
		return dao.getAllHouseDistrict();
		
	}
}
