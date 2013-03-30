package com.broadree.spring.dao;

import com.broadree.spring.pojo.Student;

public interface StudentDao {
	public Student selectStudentById(int id);
}
