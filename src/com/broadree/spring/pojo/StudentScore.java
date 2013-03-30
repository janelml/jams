package com.broadree.spring.pojo;

import java.io.Serializable;

/**
 * 学生成绩bean
 * @author ***
 *
 */
public class StudentScore implements Serializable {
	private static final long serialVersionUID = -6475428707988657827L;
	//成绩ID
	private long id;
	//学生学号
	private long sid;
	//课程ID
	private long subid;
	//得分
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
