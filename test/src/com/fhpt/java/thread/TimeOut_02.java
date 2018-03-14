package com.fhpt.java.thread;
/** 
 * @author  libaoshen
 * @description  超时模型2:使用Future的get方法使用超时判断
 * @createdDate  2017年10月18日 下午2:51:38 
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 定义一个任务
 * @author fhpt
 *
 */
class Task2 implements Callable<String> {
	@Override
	public String call() throws Exception {
		TimeUnit.MILLISECONDS.sleep(3000);
	
		return "here";
	}
}


public class TimeOut_02 {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//使用future.get方法实现超时监听
		Future<String> submit = executor.submit(new Task2());
		
		try {
			String result = submit.get(2000, TimeUnit.MILLISECONDS);
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("timeOut");
			e.printStackTrace();
		}
	}
	
	
}
