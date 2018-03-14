package com.fhpt.java.java8.stream;

import java.util.Optional;
import java.util.function.Supplier;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月14日 上午11:16:28 
 */
public class Optional2 {
	static class Inner {
		String foo = "libaoshen";

		public String getFoo() {
			return this.foo;
		}
	}
	
	static class Nested {
		Inner inner = new Inner();

		public Inner getInner() {
			return inner;
		}
	}
	
	static class Outer {
		Nested nested = new Nested();

		public Nested getNested() {
			return nested;
		}
	}
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	static <T> Optional<T> resolve(Supplier<T> supplier) {
		T result = supplier.get();
		return Optional.ofNullable(result);
	}
	
	static void test1() {
		Outer outer = new Outer();
		
		resolve(() -> outer.getNested().getInner().getFoo())
			.ifPresent(System.out::println);;
	}
	
	static void test2() {
		Optional.of(new Outer())
			.map(Outer::getNested)
			.map(Nested::getInner)
			.map(Inner::getFoo)
			.ifPresent(System.out::println);
		
	}
	
	static void test3() {
		Optional.of(new Outer())
			.flatMap(o -> Optional.ofNullable(o.nested))
			.flatMap(n -> Optional.ofNullable(n.inner))
			.flatMap(i -> Optional.ofNullable(i.foo))
			.ifPresent(System.out::println);
	}
}
