package com.fhpt.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午5:31:11 
 */
public class ProxyTest2 {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new DynamicProxy(subject);
		
		Subject newProxyInstance = (Subject) DynamicProxy2.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		
		newProxyInstance.doSomething("你好");
	}
}
