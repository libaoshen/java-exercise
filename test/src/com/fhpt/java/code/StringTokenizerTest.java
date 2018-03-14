package com.fhpt.java.code;

import java.util.StringTokenizer;

/** 
 * @author  libaoshen
 * @description  用来分割字符串的StringTokenizer
 * @createdDate  2017年6月5日 下午4:20:37 
 */
public class StringTokenizerTest {
	public static void main(String[] args) {
		String source = "lbs;wz;zty;yl;";
		//生成分割字符串的类StringTokenizer的对象
		StringTokenizer st = new StringTokenizer(source, ";");
		//获取分割后的字符串
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
