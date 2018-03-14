package com.fhpt.java.container;

import java.util.HashMap;

/** 
 * @author  libaoshen
 * @description  分析HashMap
 * @createdDate  2017年10月24日 上午9:48:55 
 */
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("libaoshen", "hust");
		
		System.out.println(map.get("libaoshen"));
		System.out.println(map.hashCode());
	}
}
