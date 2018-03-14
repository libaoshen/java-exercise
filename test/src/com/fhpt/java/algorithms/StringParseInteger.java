package com.fhpt.java.algorithms;

import java.util.Scanner;

/** 
 * @author  libaoshen
 * @description  数字字符串转整数
 * @createdDate  2017年12月15日 下午2:52:28 
 */
public class StringParseInteger {
	
	public static void main(String[] args) {
		String input = getInput();
		int result = parseInt(input);
		
		System.out.println(result);
	}
	
	// 获取输入
	public static String getInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	
	// 数字字符串转数字
	public static int parseInt(String target) {
		int result = 0;
		int length = target.length();
		int k = 0;
		boolean negative = false;
		
		char firstChar = target.charAt(k);
		if(firstChar < '0') {
			if(firstChar == '+') {
				negative = false;
				k++;
			}else if(firstChar == '-') {
				negative = true;
				k++;
			}
		}
		
		for(int i = length - 1; i >= k; i--) {
			result += (target.charAt(i) - '0') * Math.pow(10, length - i - 1);
		}
		
		return negative ? -result : result;
	}
}
