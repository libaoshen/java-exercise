package com.fhpt.java.thread;
/** 
 * @author  libaoshen
 * @description  线程中yield方法的使用
 * @createdDate  2017年10月13日 上午9:33:55 
 */
public class Thread3 implements Runnable {
	
	public Thread3() {
		System.out.println("======启动线程======");
	}
	
	@Override
	public void run() {
		System.out.println("执行线程");
		//yield方法:向线程调度器建议,表明自己任务已经执行完成,可以让出cpu,但是这种建议是选择性的
		Thread.yield();
		System.out.println("执行线程");
		Thread.yield();
		System.out.println("执行线程");
		Thread.yield();
		
		System.out.println("======关闭线程======");
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Thread(new Thread3()).start();
		}
	}
	
}
