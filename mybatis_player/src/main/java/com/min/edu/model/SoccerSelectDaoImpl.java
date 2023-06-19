package com.min.edu.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.min.edu.mybatis.SqlDaoSupport;
import com.min.edu.vo.SoccerVo;

public class SoccerSelectDaoImpl implements ISoccerSelectDao {

	private Logger logger = Logger.getLogger(this.getClass());
	private final String NS = "com.min.edu.model.SoccerSelectDaoImpl.";
	private SqlSessionFactory manager = SqlDaoSupport.getFactory();
	
	@Override
	public List<SoccerVo> sel_sche(String schedule) {
		SqlSession session = manager.openSession();
		List<SoccerVo> lists = session.selectList(NS+"sel_sche", schedule);
		logger.info("쿼리실행결과 : "+ lists);
		return lists;
	}

	@Override
	public List<SoccerVo> sel_period() {
		SqlSession session = manager.openSession();
		List<SoccerVo> lists = session.selectList(NS+"sel_period", null);
		logger.info("쿼리실행결과 : "+lists);
		return lists;
	}
	
	@Override
	public List<SoccerVo> sel_awayratiohigh() {
		SqlSession session = manager.openSession();
		List<SoccerVo> lists = session.selectList(NS+"sel_awayratiohigh", null);
		logger.info("쿼리실행결과 : "+lists);
		return lists;
	}
	
	@Override
	public List<SoccerVo> sel_backno(String backno) {
		SqlSession session = manager.openSession();
		List<SoccerVo> lists = session.selectList(NS+"sel_backno", backno);
		logger.info("쿼리실행결과 : "+ lists);
		return lists;
	}
}
