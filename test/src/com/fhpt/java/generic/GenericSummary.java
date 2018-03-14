package com.fhpt.java.generic;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  泛型汇总
 * 泛型只能用于编译期的静态类型检查，在运行时会进行原有类型的擦除，使用Object来代替泛型
 * 1.不能创建泛型数组
 * 2.对于泛型代码，java编译器会为其生成一个桥接方法
 * 3.不能直接创建泛型对象
 * 4.无法对泛型对象使用instanceof
 * @createdDate  2018年1月5日 上午10:33:10 
 */
public class GenericSummary {
	
	// ? 加入下界限制，只能是继承自Number的类
	public static void fun1(List<? extends Number> lst) {
		// 能使用get泛型方法
//		lst.get(0);
	}
	
	// ? 加入上界限制，只能是Integer的父类	
	public static void fun2(List<? super Integer> lst) {
		// 能使用add泛型方法
		lst.add(new Integer("1"));
	}
	
	// 不能直接创建泛型,由于泛型存在类型擦除
	public static<T, E> void fun3(T t, Class<E> c) throws InstantiationException, IllegalAccessException {
//		T t1 = new T();
		E t2 = c.newInstance();
		System.out.println("asfd" + t2);
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		GenericSummary.fun1(new ArrayList<Integer>());
		GenericSummary.fun1(new ArrayList<Double>());
//		GenericSummary.fun1(new ArrayList<String>()); // 不能通过
		
		GenericSummary.fun2(new ArrayList<Number>());
		GenericSummary.fun2(new ArrayList<Object>());
//		GenericSummary.fun2(new ArrayList<String>()); // 不能通过
		
		GenericSummary.fun3(new String(), String.class);
		
	}
}
