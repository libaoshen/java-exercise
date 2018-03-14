package com.fhpt.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/** 
 * @author  libaoshen
 * @description  list遍历和设置
 * @createdDate  2017年7月17日 上午10:05:12 
 */
public class Stream7 {
	static class Foo {
		String name;
		List<Bar> barList = new ArrayList<>();
		
		public Foo(String name) {
			this.name = name;
		}
	}
	
	static class Bar {
		String name;
		
		public Bar(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		List<Foo> foos = new ArrayList<>();
		
		IntStream.range(1, 4).forEach(num -> foos.add(new Foo("Foo " + num)));
		
		foos.forEach(f -> IntStream.range(1, 4).forEach(num -> f.barList.add(new Bar("Bar " + num))));
		
		foos.stream()
			.flatMap(f -> f.barList.stream())
			.forEach(b -> System.out.println(b.name));
	}
	
}
