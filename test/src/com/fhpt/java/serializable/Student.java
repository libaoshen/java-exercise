package com.fhpt.java.serializable;

import java.io.Serializable;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月20日 下午4:42:09 
 */
public class Student implements Serializable {
	
	String sid;
	String sname;
	Integer age;
	String sdept;
	
	public Student() {

	}
	
	public Student(String sid, String sname, Integer age, String sdept) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sdept = sdept;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[sid = ");
		sb.append(sid);
		sb.append("sname = ");
		sb.append(sname);
		sb.append("age = ");
		sb.append(age);
		sb.append("sdept = ");
		sb.append(sdept);
		sb.append("]");
		
		return sb.toString();
	}
}
