
package com.min.edu.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlDaoSupport {
	private static SqlSessionFactory factory;
	public static SqlSessionFactory getFactory() {
	      return factory;
	   }
	
	static {
	      //myBatis의 환경설정 정보 xml의 위치를 상대적인 경로로 선언
	      String path = "com/min/edu/mybatis/configuration.xml";
	      
	      try {
	         Reader reader = Resources.getResourceAsReader(path);
	         factory = new SqlSessionFactoryBuilder().build(reader);
	         System.out.println("SqlSessionFactory 객체 생성");
	         reader.close();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	   }

}
