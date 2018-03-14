package com.fhpt.java.encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年7月27日 上午9:44:15 
 */
public class EncodeTest {
	public static void main(String[] args) {
		String s1 = "你好";
		
		try {
			byte[] bs1 = s1.getBytes("GBK"); //编码为gbk
			System.out.println(Arrays.toString(bs1));
			
			String s2= new String(bs1,"ISO8859-1");//解码:字节数组变成字符串,String参数(数组,编码表) 输出
	        System.out.println("s1="+s2);
	        
	        byte[] bs2 = s2.getBytes("ISO8859-1");//编码为ISO8859-1
	        System.out.println(Arrays.toString(bs2));
	        
	        String s3 = new String(bs2, "GBK");
	        System.out.println(s3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
