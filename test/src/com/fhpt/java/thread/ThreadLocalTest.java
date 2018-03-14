package com.fhpt.java.thread;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description  ThreadLocal线程变量,记录一个键值对,通过set/get方法使用
 * @createdDate  2017年10月19日 上午10:14:27 
 */
public class ThreadLocalTest {
	private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();
	
	public static final void begin() {
		TIME_THREADLOCAL.set(System.currentTimeMillis());
	}
	
	public static final long end() {
		return System.currentTimeMillis() - TIME_THREADLOCAL.get();
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadLocalTest.begin();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Cost: " + ThreadLocalTest.end() + " mills");
		
		/**
		 * 定时调度器(1000ms后结束)
		 */
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("124");
//				System.exit(0);
			}
		}, 1000, 1000);
		
	}
}
