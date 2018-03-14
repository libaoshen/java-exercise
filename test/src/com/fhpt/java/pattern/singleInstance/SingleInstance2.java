package com.fhpt.java.pattern.singleInstance;
/** 
 * @author  libaoshen
 * @description  懒汉
 * @createdDate  2017年11月29日 下午3:47:47 
 */
public class SingleInstance2 {
	private static SingleInstance2 singleInstance2 = null;
	
	private SingleInstance2() {
		
	}
	
	public static SingleInstance2 getSingleInstance() {
		synchronized (singleInstance2) {
			if(singleInstance2 == null) {
				return new SingleInstance2();
			}
			return singleInstance2;
		}
	}
	
	public static SingleInstance2 getSingleInstance2() {
		if(singleInstance2 == null) {
			synchronized (singleInstance2) {
				if(singleInstance2 == null) {
					return new SingleInstance2();
				}
			}
		}
		
		return singleInstance2;
	}
}
