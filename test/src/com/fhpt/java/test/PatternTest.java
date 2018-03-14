package com.fhpt.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月4日 下午4:03:12 
 */
public class PatternTest {
	public static void main(String[] args) {
		String result = "dsfas\nsdfa";
		Pattern pattern = Pattern.compile("\n");
		Matcher match = pattern.matcher(result);
		
		System.out.println(match.replaceAll("12"));
		
		System.out.println(result.replaceAll("[^\\]?\\n", "12"));
	}
}
