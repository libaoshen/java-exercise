package com.fhpt.java.reflect;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/** 
 * @author  libaoshen
 * @description  使用Cglib动态代理
 * @createdDate  2017年11月9日 下午1:54:26 
 */

class HelloService2 {
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
}

class HelloServiceCglib implements MethodInterceptor {
	
	private Object target;
	
	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		// 回调方法
		enhancer.setCallback(this);
		// 代理对象
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("###### CGLIB动态代理 ######");
		
		System.out.println("sayHello前");
		Object returnObj = arg3.invokeSuper(arg0, arg2);
		System.out.println("sayHello后");
		
		return returnObj;
	}
}


public class CglibProxy {
	public static void main(String[] args) {
		HelloServiceCglib proxy = new HelloServiceCglib();
		HelloService2 bind = (HelloService2)proxy.getInstance(new HelloService2());
		
		bind.sayHello("libaoshen");
	}
}
