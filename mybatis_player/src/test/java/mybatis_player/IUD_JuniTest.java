package mybatis_player;

import static org.junit.Assert.*;

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
	@Test
	public void insert01() {
	Player_DTO dto = new Player_DTO("2023061", "태승","k07", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	int n=dao.insert01(dto);
	assertEquals(n, 1);
		
	}

}
