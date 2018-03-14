package com.fhpt.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2018年3月14日 下午1:59:37 
 */
public class ReentrantLockTest {
	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThread thread1 = new MyThread(myService);
		MyThread thread2 = new MyThread(myService);
		MyThread thread3 = new MyThread(myService);
		MyThread thread4 = new MyThread(myService);
		MyThread thread5 = new MyThread(myService);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}

class MyService {
	private Lock lock = new ReentrantLock();
	
	public void testMethod() {
		lock.lock();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + (i + 1));
		}
		
		lock.unlock();
	}
}

class MyThread extends Thread {
	private MyService myService;
	
	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.testMethod();
	}
}

