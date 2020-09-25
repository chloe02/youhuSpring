package com.tis.persistence;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DAOMyBatisBase {

	public SqlSessionFactory getSqlSessionFactory() {
		String resource="info/config/mybatis-config.xml"; 
		InputStream is=null;
		
		try {
			is=Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder(); 
			SqlSessionFactory factory=builder.build(is);
			return factory;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}//---------------------------
	
	public void close(SqlSession ses) {
		if(ses!=null) ses.close();
	}
}
