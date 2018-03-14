package com.fhpt.java.entity;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月29日 上午10:12:10 
 */
public class Student {
	private Integer sid;
	private String sName;
	private Integer age;
	private String discipline;
	
	public Student() {
	}
	
	public Student(Integer sid, String sName, Integer age, String discipline) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.age = age;
		this.discipline = discipline;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", age=" + age + ", discipline=" + discipline + "]";
	}
	
	
}
