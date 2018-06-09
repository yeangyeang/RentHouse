package service;

import java.util.List;

import org.junit.Test;

import com.sxt.renthouse.dao.HouseDao;
import com.sxt.renthouse.dao.impl.HouseDaoImpl;
import com.sxt.renthouse.service.HouseService;
import com.sxt.renthouse.service.impl.HouseServiceImpl;

public class HouseServiceImplTest {
	
	public HouseService houseService = new HouseServiceImpl();
	@Test
	public void getAllHouseDistrict(){
		List<String> list = houseService.getAllHouseDistrict();
		System.out.println(list.size());
		for (String str : list) {
			System.out.println(str);
		}
		
	}
}
