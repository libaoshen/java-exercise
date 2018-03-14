package com.fhpt.java.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/** 
 * @author  libaoshen
 * @description  java定时器类
 * @createdDate  2017年10月19日 下午1:56:15 
 */

/**
 * 定义一个定时任务
 * @author fhpt
 *
 */
class MyTask1 extends TimerTask {
	@Override
	public void run() {
		System.out.println("执行任务 date = " + System.currentTimeMillis());
		this.cancel();//从任务队列中移除
	}
}

public class Timer_01 {
	
	public static void main(String[] args) {
		//定义一个定时器(默认是用户线程)
		Timer timer = new Timer();
		//设置为后台线程(main线程结束后就将结束)
//		Timer timer = new Timer(true);
		
		//TimerTask,long,long ==>定时任务,delay时间,运行周期
		timer.schedule(new MyTask1(), 0, 1000);
		//TimerTask,date,long ==>定时任务,开始时间,运行周期
		timer.schedule(new MyTask1(), new Date(), 1000);
		//TimerTask,long ==>定时任务,delay时间
		timer.schedule(new MyTask1(), 1000);
		
		
		System.out.println("===main===");
	}
}
