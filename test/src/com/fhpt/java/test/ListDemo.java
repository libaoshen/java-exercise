package com.fhpt.java.test;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  listDemo
 * @createdDate  2017年12月7日 上午10:06:36 
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("1", "3", "5", "7");
		
		List<String> stringList2 = stringList.subList(0, 2);
		System.out.println(stringList2);
		// Arrays.asList返回的是Arrays的内部类ArrayList,有些方法并未实现
		stringList.add("asfda");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("libaoshen");
		arrayList.add("wangzhi");
		arrayList.add("yanglin");
		arrayList.add("zhangtianyu");
		arrayList.add("shice");
		// subList返回的是ArrayList内部类SubList,继承自List,不能强转为ArrayList
		List<String> s = arrayList.subList(0, 3);
		s.add("asfda");
		System.out.println(s);
		
	}
}
