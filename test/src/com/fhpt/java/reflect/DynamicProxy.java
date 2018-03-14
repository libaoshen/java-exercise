package com.fhpt.java.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @author  libaoshen
 * @description  JDK默认的动态代理
 * @createdDate  2017年11月9日 上午11:40:19 
 */

interface HelloService {
	public void sayHello(String name);
}

class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
}

class HelloServiceProxy implements InvocationHandler {
	
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		//返回一个代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("######JDK动态代理######");
		Object result = null;
		//反射方法调用前
		System.out.println("sayHello前");
		//执行方法
		result = method.invoke(target, args);
		//反射方法调用后
		System.out.println("sayHello后");
		
		return result;
	}
}

public class DynamicProxy {
	public static void main(String[] args) {
		HelloServiceProxy proxy = new HelloServiceProxy();
		HelloService bind = (HelloService)proxy.bind(new HelloServiceImpl());
		
		bind.sayHello("libaoshen");
	}
}
