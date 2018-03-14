package com.fhpt.java.java8.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** 
 * @author  libaoshen
 * @description  几种不同的求平均值的方法
 * @createdDate  2017年7月17日 上午9:55:55 
 */
public class Stream5 {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
	}
	
	static void test4() {
		Stream.of(new BigDecimal("1.2"), new BigDecimal("2.4"))
			  .mapToDouble(BigDecimal::doubleValue)
			  .average()
			  .ifPresent(System.out::println);
	}
	
	static void test3() {
		IntStream
			.range(0, 10)
			.average()
			.ifPresent(System.out::println);
	}
	
	static void test2() {
		IntStream
			.builder()
			.add(1)
			.add(3)
			.add(7)
			.add(11)
			.build()
			.average()
			.ifPresent(System.out::println);
	}
	
	static void test1() {
		int[] ints = {1, 3, 5, 7, 11};
		Arrays
			.stream(ints)
			.average()
			.ifPresent(System.out::println);
	}
}
