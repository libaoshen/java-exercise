package com.fhpt.java.pattern.singleInstance;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月29日 下午3:38:49 
 */
public class SingleInstanceTest {
	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {
			SingleInstance2 singleInstance2 = SingleInstance2.getSingleInstance2();
			System.out.println("1" + singleInstance2);
		});
		
		Thread t2 = new Thread(() -> {
			SingleInstance2 singleInstance2 = SingleInstance2.getSingleInstance2();
			System.out.println("2" + singleInstance2);
		});
		
		t.start();
		t2.start();
		
//		Thread t = new Thread(() -> {
//			SingleInstance singleInstance2 = SingleInstance.getSingleInstance();
//			System.out.println("1" + singleInstance2);
//		});
//		
//		Thread t2 = new Thread(() -> {
//			SingleInstance singleInstance2 = SingleInstance.getSingleInstance();
//			System.out.println("2" + singleInstance2);
//		});
//		
//		t.start();
//		t2.start();
		
//		SingleInstance singleInstance2 = SingleInstance.getSingleInstance();
//		SingleInstance singleInstance = SingleInstance.getSingleInstance();
//		
//		System.out.println(singleInstance == singleInstance2);
	}
}
