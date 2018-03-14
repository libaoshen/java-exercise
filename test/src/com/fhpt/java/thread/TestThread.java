package com.fhpt.java.thread;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年8月28日 下午4:23:49 
 */
class Thread1 extends Thread {
	
	String name;
	
	public Thread1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(this.name + "线程" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class TestThread {
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1("A");
		Thread1 thread2 = new Thread1("B");
		
		thread1.start();
		thread2.start();
	}
}
