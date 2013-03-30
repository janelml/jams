package com.broadree.spring.pojo;

import java.io.Serializable;

/**
 * 学生信息bean
 * @author ***
 *
 */
public class Student implements Serializable {
	private static final long serialVersionUID = -3768111824267094810L;
	private long id;
	private String name;
	private String sid;
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
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sid=" + sid + "]";
	}
	
}
