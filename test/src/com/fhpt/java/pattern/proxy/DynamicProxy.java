package com.fhpt.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午4:37:51 
 */
public class DynamicProxy implements InvocationHandler {
	
	// 被代理的实例
	private Object object = null;
	
	public DynamicProxy(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(this.object, args);
		after();
		
		return result;
	}
	
	// 预处理
	private void before() {
		System.out.println("预处理");
	}
		
	// 善后处理
	private void after() {
		System.out.println("善后处理");
	}
}
