package com.fhpt.java.pattern.proxy;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午4:18:29 
 */
public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("具体的实现");
	}
	
	@Override
	public void doSomething(String str) {
		System.out.println("do something ====> " + str);
	}
}
