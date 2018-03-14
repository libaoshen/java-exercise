package com.fhpt.java.jvm;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  jvm中各种内存溢出发生场景
 * @createdDate  2018年3月2日 上午10:04:03 
 */
public class OutOfMemoryErrorTest {
	
	private static int i = 0;
	
	/**
	 * 栈溢出
	 * -Xss2m
	 */
	private static void stackOverflowError() {
		i++;
		System.out.println(i);
		stackOverflowError();
	}
	
	/**
	 * 堆溢出
	 * -verbose:gc -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
	 */
	private static void heapOverflow() {
		List<String> lst = new ArrayList<>();
		while(true) {
			lst.add(new String("a"));
		}
	}
	
	/**
	 * -XX:PermSize=10m -XX:MaxPermSize=10m
	 * 方法区溢出
	 */
	private static void methodAreaOverflow() {
		List<String> lst = new ArrayList<>();
		
		while(true) {
			lst.add(String.valueOf(i++).intern());
		}
	}
	
	/**
	 * 使用intern intern函数只针对首次出现的常量，其从常量池中取出引用
	 * @param args
	 */
	private static void testStringIntern() {
		
		String str1 = new StringBuilder("软件").append("开发").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("软件1").append("开发").toString();
		System.out.println(str2.intern() == str2);
		
	}
	
	public static void main(String[] args) {
		// jvm参数设置： 堆大小限制 20m
		// 堆溢出
//		heapOverflow();
		// 栈溢出
//		stackOverflowError();
		// 方法区溢出
//		methodAreaOverflow();
		testStringIntern();
		
	}
}
