package com.fhpt.java.java8.lambda;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/** 
 * @author  libaoshen
 * @description  λ表达式巩固3
 * @createdDate  2017年7月14日 上午10:07:49 
 */
public class FourthLambda {
	@FunctionalInterface
	interface Fun {
		void foo();
	}
	
	public static void main(String[] args) {
		
		/**
		 * Predicate对象
		 * Predicate也是一个函数接口,可以将λ表达式赋值给它,其主要方法是test,
		 * 用以检测输入是否满足λ表达式
		 */
		Predicate<String> predicate = (s) -> s.length() < 0;
		//判断
		System.out.println(predicate.test("foo"));
		//取当前条件的反面判断
		System.out.println(predicate.negate().test("foo"));
		
		Predicate<Boolean> nonNull = Objects::nonNull;
		System.out.println(nonNull.test(false));
		System.out.println(nonNull.test(true));
		System.out.println(nonNull.test(null));
		
		Predicate<Boolean> isNull = Objects::isNull;
		System.out.println(isNull.test(false));
		System.out.println(isNull.negate().test(true));
		
		/**
		 * Function对象
		 * Function也是一个函数接口,可以将λ表达式赋值给它,主要用于有一个输入和一个输出结果的函数
		 * 主要方法是apply,可以通过它使用λ表达式表示的函数
		 */
		
		Function<String, Integer> toInteger = Integer::parseInt;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);
		
		System.out.println(backToString.apply("1244"));
		
		/**
		 * Supplier对象
		 * Supplier也是一个函数接口,主要用于返回一个结果
		 * 主要方法是get,用于返回一个结果
		 */
		Supplier<String> stringSupplier = String::new;//() -> {return "12";};
		String getString = stringSupplier.get();
		System.out.println(getString);
		
		/**
		 * Consumer对象
		 * Consumer也是一个函数接口,主要用于接受一个参数
		 * 主要方法是accept,用于接受参数执行λ表达式对应的方法
		 */
		Consumer<String> stringConsumer = s -> System.out.println(s.length());
		stringConsumer.accept("libaoshen");
		
		/**
		 * 除了上面的Predicate、Function、Supplier和Consumer以外,
		 * 还有Comparator、Runnable和Callable 也是函数接口,也可以和
		 * λ表达式一起使用
		 */
		BiConsumer<String, Integer> printNameAge = (name, age) -> System.out.println(name + "-" + age);
		printNameAge.accept("libaoshen", 23);
	}
}
