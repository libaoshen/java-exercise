package com.fhpt.java.test;

import java.util.LinkedHashMap;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年5月17日 下午5:41:18 
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		//按照插入顺序排序
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("wangzhi", 11);
		linkedHashMap.put("zhangtianyu", 12);
		linkedHashMap.put("libaoshen", 33);
		linkedHashMap.put("zhangxueqing", 20);
		linkedHashMap.put("yaohaoyu", 21);
		
		System.out.println(linkedHashMap);
		//填入转载因子和确定是否按照LRU排序
		linkedHashMap = new LinkedHashMap<>(10, 0.75f, true);
		linkedHashMap.put("wangzhi1", 23);
		linkedHashMap.put("libaoshen1", 24);
		linkedHashMap.put("yaohaoyu1", 25);
		linkedHashMap.put("zhangxueqing1", 20);
		linkedHashMap.put("zhangtianyu1", 12);
		
		System.out.println(linkedHashMap);
		
		linkedHashMap.get("wangzhi1");
		linkedHashMap.get("zhangtianyu1");
		
		System.out.println(linkedHashMap);
	}
}
