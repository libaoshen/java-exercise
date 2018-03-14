package com.fhpt.java.pattern.proxy;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午4:19:10 
 */
public class Proxy implements Subject {
	// 要代理的实现类
	private Subject subject = null;
	
	public Proxy() {
	}
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	// 预处理
	private void before() {
		System.out.println("预处理");
	}
	
	// 善后处理
	private void after() {
		System.out.println("善后处理");
	}
	
	@Override
	public void doSomething(String str) {
		System.out.println("do something ===> " + str);
	}
}
