package mybatis_player;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.min.edu.dto.Player_DTO;
import com.min.edu.model.IPlayerIUDDao;
import com.min.edu.model.PlayerIUDDaoImpl;
import com.min.edu.mybatis.SqlDaoSupport;

public class IUD_JuniTest {
	private SqlSession session;
	private IPlayerIUDDao dao;
		
	@Before
	public void createSqlSession() {
		dao =new PlayerIUDDaoImpl();
		SqlSessionFactory manager =SqlDaoSupport.getFactory();
	session	=manager.openSession();//openSession의 기본 auto-commit이 false
		assertNotNull(manager);
	}
	/*
	 * 신규 선수를 등록하는 기능 
	 */
	//@Test
	public void insert01() {
	Player_DTO dto = new Player_DTO("2023061", "태승","k07", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	int n=dao.insert01(dto);
	assertEquals(n, 1);
		
	}
	/*
	 * 선수를 삭제 하는 기능으로 삭제시 은퇴 테이블에 선수 정보와 은퇴날짜가 들어가는 트리거발생 
	 */
	@Test
	   public void delete01() {
	   Map<String,Object> map =new HashMap<String, Object>();
	   map.put("player_id","2016178");
	   int  n= dao.delete01(map);
	   assertEquals(n, 1);

}
	/* 선수의 팀을 변경하는 기능
	 *  player_id는 그대로 유지
	 */
//	@Test 
	   public void update01() {
	   Map<String, Object> map = new HashMap<String, Object>();
	   map.put("team_id", "k08");
	   map.put("player_id", "2016178");
	   int n =dao.update01(map);
	   assertEquals(1, n);
	      
	   }

	
}
