package com.fhpt.java.thread;
/** 
 * @author  libaoshen
 * @description  在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。因为每当使用java命令执行一个类的时候，实际上都会启动一个jvm，每一个jvm实际就是在操作系统中启动了一个进程。
 * @createdDate  2017年8月28日 下午4:38:32 
 */

class Thread2 implements Runnable {
	
	String name;
	
	public Thread2(String name) {
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

public class TestThread2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Thread2("A"));
		Thread thread2 = new Thread(new Thread2("B"));
		thread1.start();
		thread2.start();
	}
}
