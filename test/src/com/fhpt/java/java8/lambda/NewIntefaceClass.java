package com.fhpt.java.java8.lambda;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月13日 下午4:12:00 
 */
public class NewIntefaceClass {
	
	public static void main(String[] args) {
		NewInterface newInterface = new NewInterface() {
			
			@Override
			public int calculate(int a, int b) {
				return sum(a, b);
			}
		};
		
		System.out.println(newInterface.calculate(1, 2));
		System.out.println(NewInterface.positive(-5));
	}
}
