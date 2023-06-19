package mybatis_player;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.min.edu.model.ISoccerSelectDao;
import com.min.edu.model.SoccerSelectDaoImpl;
import com.min.edu.vo.SoccerVo;


public class gr_Select_JUnitTest {

	SqlSession session;
	private ISoccerSelectDao dao = new SoccerSelectDaoImpl();
	
//	@Test
	public void sel_sche() {
//		SoccerVo vo = new SoccerVo();
//		vo.setSche_date("20120818");
//		vo.getSche_date();
//		System.out.println(vo);
//		assertNotNull(vo);
		String schedule = "20120818";
	    List<SoccerVo> vo = dao.sel_sche(schedule);
	    assertNotNull(vo);
	    System.out.println(vo);
	}
	
//	@Test
	public void sel_period() {
		List<SoccerVo> vo = dao.sel_period();
	    System.out.println(vo);
	    assertNotNull(vo);
	}
	
//	@Test
	public void sel_awayratiohigh() {
		List<SoccerVo> vo = dao.sel_awayratiohigh();
	    System.out.println(vo);
	    assertNotNull(vo);
	}
	
	@Test
	public void sel_backno() {
		String backno = "24";
		List<SoccerVo> vo = dao.sel_backno(backno);
	    assertNotNull(vo);
	    System.out.println(vo);
	}

}
