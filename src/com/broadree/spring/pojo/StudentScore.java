package com.broadree.spring.pojo;

import java.io.Serializable;

/**
 * ѧ���ɼ�bean
 * @author ***
 *
 */
public class StudentScore implements Serializable {
	private static final long serialVersionUID = -6475428707988657827L;
	//�ɼ�ID
	private long id;
	//ѧ��ѧ��
	private long sid;
	//�γ�ID
	private long subid;
	//�÷�
	private String score;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public long getSubid() {
		return subid;
	}
	public void setSubid(long subid) {
		this.subid = subid;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
