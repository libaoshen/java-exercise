package com.fhpt.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description  使用ThreadFactory实现自定义实现线程
 * @createdDate  2017年10月13日 上午10:51:44 
 */

class DaemonThreadFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		
		return t;
	}
}

public class ThreadFactoryEx implements Runnable {
	
	@Override
	public void run() {
		System.out.println("执行线程");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool(new DaemonThreadFactory());
		
		executor.execute(new ThreadFactoryEx());
		
		//main是一个非后台线程,要看到后台线程的执行情况,需要对main线程sleep,否则整个过程将结束
		//当所有的非后台线程结束时,整个程序也将结束
		TimeUnit.MILLISECONDS.sleep(1000);
	}
}
