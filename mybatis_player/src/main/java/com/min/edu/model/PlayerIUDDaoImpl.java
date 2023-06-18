package com.min.edu.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.dto.Player_DTO;
import com.min.edu.mybatis.SqlDaoSupport;

public class PlayerIUDDaoImpl implements IPlayerIUDDao {
	private Logger logger=Logger.getLogger(this.getClass());
	private final String NS="com.min.edu.model.PlayerIUDDaoImpl.";
	private SqlSessionFactory manager= SqlDaoSupport.getFactory();
	@Override
	public int insert01(Player_DTO dto) {
		SqlSession session=manager.openSession(true);//true면 auto commit
		int n= session.insert(NS+"insert01",dto);
		return n;
		
	}

}
