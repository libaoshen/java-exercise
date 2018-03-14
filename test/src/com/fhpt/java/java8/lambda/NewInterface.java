package com.fhpt.java.java8.lambda;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月13日 下午4:09:31 
 */
public interface NewInterface {
	int calculate(int a, int b);
	
	/**
	 * 接口里的默认方法,jdk8.0后可以在接口中定义方法实现体,该方法必须用default或static修饰
	 * @param a
	 * @param b
	 * @return
	 */
	default int sum(int a, int b) {
		return a + b;
	}
	
	default int multi(int a, int b) {
		return a * b;
	}
	
	default int sub(int a, int b) {
		return a - b;
	}
	
	default double div(int a, int b) {
		return a*1.0 / b;
	}
	
	static int positive(int a) {
		return a > 0 ? a : 0;
	}
}
