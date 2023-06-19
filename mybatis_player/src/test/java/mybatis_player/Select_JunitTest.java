package mybatis_player;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import com.min.edu.dto.Player_DTO;
import com.min.edu.model.IPlayerSelectDao;
import com.min.edu.model.PlayerSelectDaoImpl;
import com.min.edu.mybatis.SqlDaoSupport;



public class Select_JunitTest {
	SqlSession session;
	private IPlayerSelectDao dao = new PlayerSelectDaoImpl();

//	@Test
	public void test() {
	Player_DTO DTO= new Player_DTO();
	DTO.setTeam_id("k07");
	DTO.getTeam_id();
	System.out.println(DTO);
	assertNotNull(DTO);
	}
	@Before
	public void createSqlSession() {
		SqlSessionFactory manager =SqlDaoSupport.getFactory();
	session	=manager.openSession();//openSession의 기본 auto-commit이 false
		assertNotNull(manager);
	}
	
	//select03 메서드를 호출하여 id를 인자로 전달합니다. 
	/*
	 *팀별 평균키 조회 
	 */
	@Test
	public void select01() {
		//에러가 날씨에 첫번째 방법 알리아스 사용을 한다.
		String Team_id="K07";
		List<Player_DTO> one =dao.select01(Team_id);
		assertNotNull(one);
	}
	/*
	 * SELECT02 팀이름 구장이름 좌석수
	 * 
	 */
	//@Test
	public void select02() {
		//에러가 날씨에 첫번째 방법 알리아스 사용을 한다.
		String team_name="전북현대";
		List<Player_DTO> one =dao.select02(team_name);
		assertNotNull(one);
	}
	
	

}
