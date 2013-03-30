package com.broadree.spring.pojo;

import java.io.Serializable;

/**
 * 学生课程bean
 * @author ***
 *
 */
public class StudentCourse implements Serializable {
	private static final long serialVersionUID = -2118508286632249554L;
	//课程ID
	private long id;
	//课程名称
	private String name;
	//课程学分
	private String credits;
	//代课老师ID
	private long teacherId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	
}
