package com.fhpt.java.thread;
/** 
 * @author  libaoshen
 * @description  使用线程执行器Executor管理线程
 * @createdDate  2017年10月13日 上午9:43:30 
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定义一个任务
 * @author fhpt
 *
 */
class Job implements Runnable {
	
//	public Job() {
//		System.out.println("======启动线程======");
//	}
	
	@Override
	public void run() {
		System.out.println("执行线程");
		
		System.out.println("======线程结束======");
	}
	
}

public class ThreadExecutor {
	public static void main(String[] args) {
		//使用Executor来完成线程的生命周期的管理(为每一个任务都创建一个线程)
//		ExecutorService executor = Executors.newCachedThreadPool();
		//固定线程分配,有限的线程
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//单一线程,多个任务使用该线程时会排队
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		for(int i = 0; i < 10; i++) {
			executor.execute(new Job());
		}
		
		executor.shutdown();
	}
}
