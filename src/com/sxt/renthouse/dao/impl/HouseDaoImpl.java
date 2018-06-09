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
	public List<String> getAllHouseByKeyWord() {
		
		return null;
	}

}
