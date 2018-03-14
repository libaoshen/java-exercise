package com.fhpt.java.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  字符串比较
 * @createdDate  2017年6月5日 下午3:55:25 
 */
public class SubStringCompare {
	public static void main(String[] args) {
		List<String> handler = new ArrayList<String>();
		
		for (int i = 0; i < 1000000; i++) {
			HugeStr h = new HugeStr();
			//ImprovedHugeStr h = new ImprovedHugeStr();
			handler.add(h.getSubString(1, 5));
		}
	}
}

class HugeStr {
	private String str = new String(new char[100000]);
	
	public String getSubString (int begin, int end) {
		return str.substring(begin, end);
	}
}

class ImprovedHugeStr {
	private String str = new String(new char[100000]);
	
	public String getSubString(int begin, int end) {
		return new String(str.substring(begin, end));
	}
}
