package com.broadree.spring.dao;

import com.broadree.spring.pojo.StudentScore;

public interface StudentScoreDao {
	public StudentScore selectStudentScoreBySid(long id);
}
