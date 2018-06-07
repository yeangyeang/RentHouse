package com.sxt.renthouse.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sxt.renthouse.dao.HouseCollectionDao;
import com.sxt.renthouse.entity.HouseCollection;
import com.sxt.renthouse.entity.User;
import com.sxt.renthouse.utils.ComPoolUtil;
/**
 * 房屋收藏dao接口实现类
 * @author xujia
 *
 */
public class HouseCollectionDaoImpl implements HouseCollectionDao{

	public int addHouseCollection(HouseCollection hc) {
		int count = 0; //受影响的行
		try {
			count = ComPoolUtil.getQueryRunner().update(
					"insert into HouseCollection(H_id,H_date) values (?,now())",
					hc.getH_id());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

	public List<HouseCollection> getAllHouseCollection(HouseCollection hc) {
		List<HouseCollection> cs = null; 
		try {
			cs = ComPoolUtil.getQueryRunner().query(
					"select * from HouseCollection",
					new BeanListHandler<HouseCollection>(HouseCollection.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return cs;
	}

	public int updateHouseCollection(HouseCollection hc) {
		return 0;
	}

	public int deleteHouseCollectionById(int id) {
		return 0;
	}
	
}
