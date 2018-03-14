package com.fhpt.java.test;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年5月17日 下午5:25:44 
 */
public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("libaoshen", 22);
		treeMap.put("xinhao", 30);
		treeMap.put("wangzhi", 22);
		treeMap.put("wangtao", 26);
		treeMap.put("yanglin", 23);
		
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastKey());
		System.out.println(treeMap.hashCode());
		System.out.println(treeMap.size());
		System.out.println(treeMap.entrySet());
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		
		for(Entry<String, Integer> e : treeMap.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		System.out.println(treeMap.subMap("libaoshen", "wangzhi"));
	}
}
