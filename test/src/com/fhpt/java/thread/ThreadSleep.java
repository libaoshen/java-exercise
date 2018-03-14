package com.fhpt.java.thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description 线程休眠 
 * @createdDate  2017年10月13日 上午10:26:10 
 */
public class ThreadSleep implements Runnable {
	@Override
	public void run() {
		System.out.println("执行线程");
		/**
		 * 线程内部的异常必须在run方法里面处理,无法抛出
		 */
		try {
			Random rand = new Random();
			int time = rand.nextInt(1000);
			//old sleep
//			Thread.sleep(time);
			//new sleep
			TimeUnit.MILLISECONDS.sleep(1000);
			
			System.out.println("休眠了" + time + "ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 10; i++) {
			executor.execute(new ThreadSleep());
		}
	}
}
