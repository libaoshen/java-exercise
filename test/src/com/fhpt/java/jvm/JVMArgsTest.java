package com.fhpt.java.jvm;
/** 
 * @author  libaoshen
 * @description  
 * JVM args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @createdDate  2018年3月5日 下午4:11:45 
 */
public class JVMArgsTest {
	
	private static final int _1MB = 1024 * 1024;
	
	public static void main(String[] args) {
		byte[] allo1, allo2, allo3, allo4;
		
//		allo1 = new byte[2 * _1MB];
//		allo2 = new byte[2 * _1MB];
//		allo3 = new byte[2 * _1MB];
		allo4 = new byte[4 * _1MB];
	}
	
}
