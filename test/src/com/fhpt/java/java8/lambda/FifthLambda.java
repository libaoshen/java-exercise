package com.fhpt.java.java8.lambda;

import java.util.stream.Stream;

/** 
 * @author  libaoshen
 * @description  λ表达式巩固4 -- 使用外部变量
 * @createdDate  2017年7月14日 上午10:43:46 
 */
public class FifthLambda {
	static int outerStaticNum;
	
	int outerNum;
	
	void testScopes() {
		int num = 1;
		
		ThirdLambda.Converter<Integer, String> stringConverter = 
				(from) -> String.valueOf(from + num);
		
		System.out.println(stringConverter.convert(1234));
		
		ThirdLambda.Converter<Integer, String> stringConverter2 = 
				(from) -> { outerNum = 123; return String.valueOf(from);};
		System.out.println(stringConverter2.convert(12344) + " " + outerNum);
	
		String[] array = new String[1];
		ThirdLambda.Converter<Integer, String> stringConveter3 = 
				(from) -> { array[0] = "libaoshen"; return String.valueOf(from);};
				
		System.out.println(stringConveter3.convert(1244544));
		Stream.of(array).forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		new FifthLambda().testScopes();
	}
}
