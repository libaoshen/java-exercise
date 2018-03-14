package com.fhpt.java.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/** 
 * @author  libaoshen
 * @description  lambda巩固1
 * @createdDate  2017年7月13日 下午4:15:49 
 */
public class SecondLambda {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		
//		Collections.sort(names, new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			};
//		});
		
		/**
		 * λ表达式作为匿名方法
		 */
//		Collections.sort(names, (x, y) -> { return x.compareTo(y);});
		Collections.sort(names, (x, y) -> x.compareTo(y));
		
		names.stream().forEach(System.out::println);
		
		List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "xenia");
		/**
		 * null比string大
		 */
		names2.sort(Comparator.nullsLast(String::compareTo));
		
		System.out.println(names2);
		
		List<String> names3 = Arrays.asList("peter", null, "anna", "mike", "xenia");
		/**
		 * null比string小
		 */
		names3.sort(Comparator.nullsFirst(String::compareTo));
		
		System.out.println(names3);
		
		List<String> names4 = Arrays.asList("peter", null, "anna", "mike", "xenia");
		
		Optional.ofNullable(names4).ifPresent(e -> {System.out.println(e);});
		
		System.out.println("213" + names4);
	}
}
