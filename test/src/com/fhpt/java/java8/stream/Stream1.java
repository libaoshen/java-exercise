package com.fhpt.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** 
 * @author  libaoshen
 * @description  stream初识
 * @createdDate  2017年7月14日 上午11:47:16 
 */
public class Stream1 {
	
	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		//filter：过滤
		stringCollection
			.stream()
			.filter(s -> s.startsWith("a"))
			.forEach(System.out::println);;
		
		//sort: 排序
		stringCollection
			.stream()
			.sorted()
			.forEach(System.out::println);
		
		//map： 映射
		stringCollection
			.stream()
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);
		
		//match : 匹配
		boolean anyMatch = stringCollection
				.stream()
				.anyMatch(s -> s.startsWith("a"));
		System.out.println(anyMatch);
		
		boolean allMatch = stringCollection
				.stream()
				.allMatch(s -> s.startsWith("a"));
		System.out.println(allMatch);
		
		boolean noneMatch = stringCollection
			.stream()
			.noneMatch(s -> s.startsWith("z"));
		System.out.println(noneMatch);
		
		//count ： 计数
		long count1 = stringCollection
			.stream()
			.filter(s -> s.startsWith("a"))
			.count();
		System.out.println(count1);
		
		//reduce : 缩减整合
		Optional<String> result = stringCollection
			.stream()
			.filter(s -> s.startsWith("a"))
			.reduce((a, b) -> a + "#" + b);
		
		result.ifPresent(System.out::println);
	}
}
