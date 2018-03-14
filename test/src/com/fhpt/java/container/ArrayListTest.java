package com.fhpt.java.container;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  ArrayList源码探究
 * @createdDate  2018年2月5日 下午3:45:03 
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		
		stringList.add("libaoshen");
		stringList.add("wangzhi");
		stringList.add(null);
		
		for(String s : stringList) {
			System.out.println(s);
		}
	}
}
