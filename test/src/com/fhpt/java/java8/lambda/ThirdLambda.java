package com.fhpt.java.java8.lambda;
/** 
 * @author  libaoshen
 * @description  λ表达式巩固2
 * @createdDate  2017年7月14日 上午9:35:33 
 */
public class ThirdLambda {
	
	@FunctionalInterface
	public interface Converter<F, T> {
		T convert(F form);
	}
	
	static class Something {
		String startWith(String s) {
			return String.valueOf(s.charAt(0));
		}
	}
	
	public static void main(String[] args) {
		/**
		 * 使用λ表达式
		 */
		Converter<String, Integer> integerConverter1 = from -> Integer.valueOf(from);
		System.out.println(integerConverter1.convert("1234"));
		
		/**
		 * 使用方法引用
		 */
		Converter<String, Integer> converter2 = Integer::valueOf;
		System.out.println(converter2.convert("5667"));
		
		Something something = new Something();
		Converter<String, String> startWith = something::startWith;
		System.out.println(startWith.convert("sadflibaoshen"));
	}
	
}
