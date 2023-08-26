package com.min.edu.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.dto.Player_DTO;
import com.min.edu.mybatis.SqlDaoSupport;


//12

public class PlayerSelectDaoImpl implements IPlayerSelectDao {
	
	private Logger logger=Logger.getLogger(this.getClass());
	private final String NS="com.min.edu.model.PlayerSelectDaoImpl.";
	private SqlSessionFactory manager= SqlDaoSupport.getFactory();
	@Override
	public List<Player_DTO> select01(String player_id) {
		SqlSession session =manager.openSession();
		List<Player_DTO> DTO=session.selectList(NS+"select01",player_id);
		logger.info(DTO);
		return DTO;
	}
	@Override
	public List<Player_DTO> select02(String team_name) {
		SqlSession session =manager.openSession();
		List<Player_DTO> DTO=session.selectList(NS+"select02",team_name);
		logger.info(DTO);

		//테스트용 주석처리

		return DTO;
	}
	
	
	
}
