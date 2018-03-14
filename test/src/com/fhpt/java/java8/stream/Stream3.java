package com.fhpt.java.java8.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/** 
 * @author  libaoshen
 * @description  stream巩固2
 * @createdDate  2017年7月14日 下午1:52:54 
 */
public class Stream3 {
	public static void main(String[] args) {
		int max = 1000000;
		/**
		 * 打印奇数 -- 通常方法
		 */
		long begin = System.nanoTime();
		for (int i = 0; i < max; i++) {
			if(i % 2 == 1) {
				//System.out.print(i);
			}
		}
		
		System.out.println("time : " + (System.nanoTime() - begin));
		
		/**
		 * 使用λ表达式
		 */
		begin = System.nanoTime();
		IntStream.range(0, max)
			.forEach(i -> {
				if(i % 2 == 1) {
					//System.out.print(i);
				}
			});
		System.out.println("time : " + (System.nanoTime() - begin));
		
		begin = System.nanoTime();
		IntStream.range(0, max)
			.filter(i -> i % 2 == 1);
			//.forEach(System.out::print);
		System.out.println("time : " + (System.nanoTime() - begin));
		
		OptionalInt reduce = IntStream.range(0, max)
			.reduce((x, y) -> x + y);
		System.out.println(reduce.getAsInt());
		
		//在8的基础上操作
		int reduce2 = IntStream.range(0, max)
			.reduce(10, (x, y) -> x + y);
		System.out.println(reduce2);
	}
}
