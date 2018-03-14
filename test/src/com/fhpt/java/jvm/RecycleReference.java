package com.fhpt.java.jvm;
/** 
 * @author  libaoshen
 * @description  循环引用中的gc
 * @createdDate  2018年3月5日 上午9:45:27 
 */
public class RecycleReference {
	private Object instance;
	
	private final static int size = 1024 * 1024;
	
	private byte[] bigByte = new byte[20 * size];
	
	public static void main(String[] args) {
		RecycleReference ra = new RecycleReference();
		RecycleReference rb = new RecycleReference();
		
		ra.instance = rb;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ;
		rb.instance = ra; 
		
		ra = null;
		rb = null;
		
		System.gc();
		/**
		 * GC堆栈日志： -XX:+PrintGCDetails
		 * [Full GC (System.gc()) [PSYoungGen: 728K->0K(38400K)] [ParOldGen: 20488K->617K(87552K)] 21216K->617K(125952K), [Metaspace: 2661K->2661K(1056768K)], 0.0033344 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
		 * 
		 * GC前后堆内存变化 21216K->617K,说明该虚拟机对循环引用的对象进行了回收,说明其采用的不是 引用计数法来判断对象是否可用
		 */
		
	}
}
