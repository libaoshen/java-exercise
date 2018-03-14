package com.fhpt.java.thread;

import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年10月18日 上午11:01:00 
 */
public class SynchronizedTest implements Runnable {
	
	//剩余票数
	private static volatile int leftCount;
	
	public SynchronizedTest(int count) {
		leftCount = count;
	}
	
	@Override
	public void run() {
		synchronized (this) {
			try {
				leftCount--;
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "购票一张 " + "还剩余 " + leftCount + "条");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//现在当前对象是锁,一个对象就是一个锁
		SynchronizedTest synchronizedTest = new SynchronizedTest(20);
		Thread t1 = new Thread(synchronizedTest, "first");
		Thread t2 = new Thread(synchronizedTest, "second");
		
		t1.start();
		t2.start();
//		SynchronizedTest synchronizedTest1 = new SynchronizedTest(20);
//		SynchronizedTest synchronizedTest2 = new SynchronizedTest(20);
//		Thread t1 = new Thread(synchronizedTest1, "first");
//		Thread t2 = new Thread(synchronizedTest2, "second");
//		
//		t1.start();
//		t2.start();
	}
}
