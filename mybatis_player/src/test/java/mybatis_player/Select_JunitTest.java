package mybatis_player;

import static org.junit.Assert.*;



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

	//@Test
	public void test() {
	Player_DTO DTO= new Player_DTO();
	DTO.setTeam_id("K07");
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
	//이 메서드는 데이터베이스에서 해당 id에 해당하는 JobVo 객체를 조회하여 반환합니다.
	//조회된 결과는 one 변수에 할당됩니다.
	@Test
	public void select01() {
		//에러가 날씨에 첫번째 방법 알리아스 사용을 한다.
		String Team_id="K07";
		Player_DTO one =dao.select01(Team_id);
		assertNotNull(one);
	}

}
