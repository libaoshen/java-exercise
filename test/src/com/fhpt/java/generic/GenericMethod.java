package com.fhpt.java.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/** 
 * @author  libaoshen
 * @description  泛型方法
 * @createdDate  2017年10月10日 上午8:50:41 
 */
public class GenericMethod {
	// 基本的泛型方法
	public <T> void printType(T t, int i) {
		System.out.println(t.getClass());
		if(t instanceof Integer) {
			System.out.println(t + " is Integer");
		} else if(t instanceof String) {
			System.out.println(t + " is String");
		} else if(t instanceof Double) {
			System.out.println(t + " is Double");
		} else {
			System.out.println(t + " is other type");
		}
	}
	
	// 数组转List,可变长参数和泛型结合
	public static <T> List<T> makeList(T... args) {
		List<T> result = new ArrayList<T>();
		
		Stream.of(args).forEach(s -> result.add(s));
		
		return result;
	}
	
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		// 调用泛型方法,传入一个基本类型的参数时,将会使用自动包装机制
		gm.printType(1, 2);
		gm.printType("abc", 3);
		gm.printType(1.2, 4);
		gm.printType('a', 5);
		
		// 调用静态泛型方法
		GenericMethod.makeList("a", "b", "c").forEach(System.out::println);
		GenericMethod.makeList("a", "b", 1).forEach(System.out::println);
	}
}
