package com.fhpt.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
 * @author  libaoshen
 * @description  有返回值的线程
 * @createdDate  2017年10月13日 上午10:11:49 
 */
public class ThreadCallable<T> implements Callable<T> {
	
	private T id;
	
	public ThreadCallable(T id) {
		this.id = id;
	}
	
	@Override
	public T call() throws Exception {
		return id;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 10; i++) {
			Future<String> result = executor.submit(new ThreadCallable<String>(i + ""));
			
			System.out.println(result.get());
		}
	}
}
