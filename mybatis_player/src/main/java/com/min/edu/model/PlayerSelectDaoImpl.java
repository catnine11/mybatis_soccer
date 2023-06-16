package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.dto.Player_DTO;
import com.min.edu.mybatis.SqlDaoSupport;



public class PlayerSelectDaoImpl implements IPlayerSelectDao {
	private Logger logger=Logger.getLogger(this.getClass());
	private final String NS="com.min.edu.model.PlayerSelectDaoImpl.";
	private SqlSessionFactory manager= SqlDaoSupport.getFactory();
	@Override
	public Player_DTO select01(String player_id) {
		SqlSession session =manager.openSession();
		Player_DTO DTO=session.selectOne(NS+"select01",player_id);
		logger.info(DTO);
		return DTO;
	}
	
	
}
