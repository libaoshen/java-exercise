package com.fhpt.java.generic;

import java.util.ArrayList;

/** 
 * @author  libaoshen
 * @description  泛型深入 - 边界符：限制某个类型,能在编译期就检查出问题
 * @createdDate  2017年10月10日 上午9:41:48 
 */
public class GenericMethod2 {
	
	public static <K extends String> K printLength(K k) {
		if(k instanceof String) {
			System.out.println(k.endsWith("1"));
		}
		
		return k;
	}
	
	public static void main(String[] args) {
		Class a = new ArrayList<String>().getClass();
		Class b = new ArrayList<Integer>().getClass();
		
		System.out.println(a == b);
		
		GenericMethod2.printLength("1");
	}
}
