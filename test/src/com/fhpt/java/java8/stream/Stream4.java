package com.fhpt.java.java8.stream;

import java.util.Arrays;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月14日 下午2:17:29 
 */
public class Stream4 {
	public static void main(String[] args) {
		List<String> strings =
	            Arrays.asList("d2", "a2", "b1", "b3", "c");

//	        test1(strings);
//	        test2(strings);
//	        test3(strings);
//	        test4(strings);
	        test5(strings);
//	        test6(strings);
//	        test7(strings);
//	        test8(strings);
	}
	
	static void test5(List<String> stringCollection) {
		stringCollection
        .stream()
        .filter(s -> {
            System.out.println("filter:  " + s);
            return s.toLowerCase().startsWith("a");
        })
        .sorted((s1, s2) -> {
            System.out.printf("sort:    %s; %s\n", s1, s2);
            return s1.compareTo(s2);
        })
        .map(s -> {
            System.out.println("map:     " + s);
            return s.toUpperCase();
        })
        .forEach(s -> System.out.println("forEach: " + s));
	}
	
	static void test4(List<String> stringCollection) {
		stringCollection
			.stream()
			.sorted((x, y) -> {
				System.out.printf("sorted :  %s %s\n", x, y);
				return x.compareTo(y);
			})
			.filter(s -> {
				System.out.println("filter : " + s);
				return s.toUpperCase().startsWith("A");
			})
			.forEach(System.out::println);;
	}
	
	static void test3(List<String> stringCollection) {
		stringCollection
        .stream()
        .filter(s -> {
            System.out.println("filter:  " + s);
            return s.startsWith("a");
        })
        .map(s -> {
            System.out.println("map:     " + s);
            return s.toUpperCase();
        })
        .forEach(s -> System.out.println("forEach: " + s));
	}
	
	static void test2(List<String> stringCollection) {
		stringCollection
			.stream()
			.map(s -> {
				System.out.println("map : " + s);
				return s.toUpperCase();
			})
			.filter(s -> {
				System.out.println("filter : " + s);
				return s.startsWith("A");
			})
			.forEach(s -> {
				System.out.println("forEach : " + s);
			});
	}
	
	static void test1(List<String> stringCollection) {
		stringCollection
			.stream()
			.filter(s -> {
				System.out.println("filter : " + s);
				return true;
			})
			.forEach(s -> {
				System.out.println("forEach : " + s);
			});
	}
}
