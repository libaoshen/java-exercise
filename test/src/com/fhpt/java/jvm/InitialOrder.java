package com.fhpt.java.jvm;
/** 
 * @author  libaoshen
 * @description  静态语句块的执行顺序和类静态变量的赋值顺序
 * @createdDate  2018年1月3日 下午2:44:29 
 */
public class InitialOrder {
	
	private static int a = 100;
	
	static {
		i = 2;
		System.out.println(a);
	}
	
	static int i = 1;
	
	public InitialOrder() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println(new InitialOrder().a);
	}
}
