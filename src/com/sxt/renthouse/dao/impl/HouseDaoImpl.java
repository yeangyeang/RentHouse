package com.sxt.renthouse.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.sql.filter.SynchronizedFilterCallableStatement;
import com.sxt.renthouse.dao.HouseDao;
import com.sxt.renthouse.entity.HouseSearch_y;
import com.sxt.renthouse.utils.ComPoolUtil;
/**
 * 实现对房屋dao的操作
 * @author yang
 *
 */
public class HouseDaoImpl implements HouseDao {

	@Override
	public List<String> getAllHouseDistrict() {
		List<Object[]> districts = null;
		List<String> districtss = new ArrayList<String>();
		
		try {
			StringBuilder sb = new StringBuilder("select h_district from houseLocation group by h_district");
			
			String sql = sb.toString();
			System.out.println("sql:"+sql);
			districts = ComPoolUtil.getQueryRunner().query(sql,
					new ArrayListHandler());
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		for (Object[] str : districts) {
			for (Object object : str) {
				districtss.add(object.toString());
			}
			
		}
		
		
		return districtss ;
	}

	@Override
	public List<HouseSearch_y> getAllHouseByKeyWord(String str) {
		List<HouseSearch_y> list = null;
		try {
			StringBuilder sb = new StringBuilder("SELECT house.H_id,house.U_id,house.A_id,house.H_title,house.H_type,house.H_style,house.H_rent,house.H_custodyPay,house.H_floor,house.H_face,house.H_area,house.H_time,house.H_status,house.H_servey,houselocation.H_city,houselocation.H_community,houselocation.H_district,houselocation.H_location,housepicture.Hp_type,`user`.U_name from house join houselocation join housepicture join user on house.u_id=user.u_id and house.H_id=houselocation.H_id and house.H_id=housepicture.H_id and housepicture.H_mp is not null where house.H_title like '%"+str+"%'");
			
			String sql = sb.toString();
			System.out.println("sql:"+sql);
			list=ComPoolUtil.getQueryRunner().query(sql,
					new BeanListHandler<HouseSearch_y>(HouseSearch_y.class));
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return list;
	}

}
