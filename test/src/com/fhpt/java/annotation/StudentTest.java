package com.fhpt.java.annotation;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年8月15日 下午4:14:22 
 */
public class StudentTest {
	
	@Student(id=1,description="wangzhi")
	public String getStudent1Info() {
		return "1" + ": wangzhi";
	}
	
	@Student(id=2, description="libaoshen")
	public String getStudent2Info() {
		return "2" + ": libaoshen";
	}
	
	@Student(id=3, description="wangtao")
	public String getStudent3() {
		return "3" + ": wangtao";
	}
}
