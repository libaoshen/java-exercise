package com.fhpt.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 
 * @author  libaoshen
 * @description  反射服务
 * @createdDate  2017年11月9日 上午11:14:24 
 */
public class ReflectService {
	
	/**
	 * 服务方法
	 * @param name
	 */
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		//通过反射创建ReflectService对象
		Object service = Class.forName(ReflectService.class.getName()).newInstance();
		//获取服务方法
		Method method = service.getClass().getMethod("sayHello", String.class);
		//调用反射方法
		method.invoke(service, "libaoshen");
	}
	
}
