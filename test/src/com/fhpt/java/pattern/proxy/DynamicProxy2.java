package com.fhpt.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午5:26:19 
 */
public class DynamicProxy2<T> {
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
		if(true) {
			new BeforeAdvice().exec();
		}
		
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}

}
