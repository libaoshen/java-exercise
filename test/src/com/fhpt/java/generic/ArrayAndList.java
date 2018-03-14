package com.fhpt.java.generic;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  Array和list
 * @createdDate  2017年12月12日 上午11:02:07 
 */
public class ArrayAndList {
	public static void main(String[] args) {
		Object[] a1 = new Long[1];
		// Array是协变的, 子类数组是父类数组的子类型
		// 运行时报错
		// a1[0] = "123";
		
		// System.out.println(a1[0]);
		// List是不可变的, 子类List和父类List没有关系
		// 编译时报错
//		List<Object> a2 = new ArrayList<Long>();
		
		List<String> a3 = new ArrayList<String>();
		a3.add("hust");
		
		System.out.println(a3.get(0) instanceof String);
	}
}
