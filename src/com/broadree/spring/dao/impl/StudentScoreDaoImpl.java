package com.broadree.spring.dao.impl;

import java.io.IOException;
import java.io.Reader;

import com.broadree.spring.dao.StudentScoreDao;
import com.broadree.spring.pojo.StudentScore;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class StudentScoreDaoImpl implements StudentScoreDao {
	private static SqlMapClient sqlMapClient=null;
	// ∂¡»°≈‰÷√Œƒº˛
	static {
	try {
	Reader reader = Resources.getResourceAsReader("ibatis/SqlMapConfig.xml");
	sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
	reader.close();
	} catch (IOException e) {
	e.printStackTrace();
	}
	}
	
	public StudentScore selectStudentScoreBySid(long id) {
		return null;
	}

}



