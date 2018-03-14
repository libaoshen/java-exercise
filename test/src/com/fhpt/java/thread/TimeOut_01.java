package com.fhpt.java.thread;

import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description  多线程的等待超时监听模型:
 * 				 有一个超时监听线程,该线程记录超时时间和监听器状态,执行睡眠一个超时时间的操作,并且判断是否停用超时监听器;
 * 				其他的工作线程中持有一个超时监听器对象,再完成任务后修改超时监听器状态为停止
 * @createdDate  2017年10月18日 下午2:09:02 
 */


/**
 * 超时监听线程
 * @author fhpt
 *
 */
class TimeListener implements Runnable {
	//超时时间
	private int timeOut = 0;
	//监听状态
	private boolean flag = true;
	
	public TimeListener(int timeOut) {
		this.timeOut = timeOut;
	}
	
	/**
	 * 暂停监听
	 */
	public void setStop() {
		flag = false;
	}
	
	@Override
	public void run() {
		System.out.println("开始超时监听");
		try {
			//睡眠 timeOut ms
			TimeUnit.MILLISECONDS.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(flag) {
			System.out.println("操作超时===> " + timeOut + "ms");
		}
		
		System.out.println("超时监听结束");
	}
}

/**
 * 定义一个任务
 * @author fhpt
 *
 */
class Task implements Runnable {
	
	private TimeListener timeListener;
	
	public Task(TimeListener tt) {
		this.timeListener = tt;
	}
	
	@Override
	public void run() {
		//执行操作
		try {
			TimeUnit.MILLISECONDS.sleep(5000);
			//完成任务,修改监听器状态
			timeListener.setStop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class TimeOut_01 {
	
	public static void main(String[] args) {
		
		System.out.println("main===>开始");
		
		TimeListener tt = new TimeListener(5000);
		Thread time = new Thread(tt);
		Thread t = new Thread(new Task(tt));
		
		time.start();
		t.start();
		
		System.out.println("main===>结束");
	}
}
