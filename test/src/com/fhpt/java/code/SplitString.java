package com.fhpt.java.code;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年8月22日 下午1:54:22 
 */
public class SplitString {
	public static void main(String[] args) {
		String s = "117,";
		
		String[] ss = s.split(",");
		System.out.println(ss.length);
	}
}
