package com.fhpt.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午4:45:36 
 */
public class DynamicProxyTest {
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new DynamicProxy(subject);
		
		// 获取类的class loader
		ClassLoader cl = subject.getClass().getClassLoader();
		// 动态产生一个代理者
		Subject proxy = (Subject) Proxy.newProxyInstance(cl, new Class[] { Subject.class }, handler);
		
		proxy.request();
		
	}
	
}
