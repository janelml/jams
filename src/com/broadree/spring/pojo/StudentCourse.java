package com.broadree.spring.pojo;

import java.io.Serializable;

/**
 * ѧ���γ�bean
 * @author ***
 *
 */
public class StudentCourse implements Serializable {
	private static final long serialVersionUID = -2118508286632249554L;
	//�γ�ID
	private long id;
	//�γ�����
	private String name;
	//�γ�ѧ��
	private String credits;
	//������ʦID
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
