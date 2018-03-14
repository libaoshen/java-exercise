package com.fhpt.java.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  自己实现字符串分割
 * @createdDate  2017年6月5日 下午4:28:49 
 */
public class ImplementSplit {
	public static List<String> split(String source, String delim) {
		List<String> result = new ArrayList<String>();
		while(true) {
			int j = source.indexOf(delim);
			//不存在
			if(j<0) {
				break;
			}else {
				result.add(source.substring(0, j));
				source = source.substring(j+1, source.length());
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<String> result = split("afas;sfdaf;12sf;453sd;dfsa1152", ";");
		for (String string : result) {
			System.out.println(string);
		}
	}
}
