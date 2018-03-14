package com.fhpt.java.pattern.singleInstance;
/** 
 * @author  libaoshen
 * @description  饿汉单例
 * @createdDate  2017年11月29日 下午3:36:46 
 */
public class SingleInstance {
	
	private final static SingleInstance singleInstance = new SingleInstance();
	
	private SingleInstance() {
		
	}
	
	public static SingleInstance getSingleInstance() {
		return singleInstance;
	}
}
