package com.broadree.spring.dao.impl;


import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;


import com.broadree.spring.dao.StudentDao;
import com.broadree.spring.pojo.Student;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class StudentDaoImpl implements StudentDao {
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
	public Student selectStudentById(int id) {
		Student student = null;
		try {
			student=(Student)sqlMapClient.queryForObject("selectStudentById", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

}
