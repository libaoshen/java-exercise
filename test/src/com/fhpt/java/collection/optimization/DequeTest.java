package com.fhpt.java.collection.optimization;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/** 
 * @author  libaoshen
 * @description  使用队列
 * @createdDate  2017年9月28日 上午10:16:49 
 */
public class DequeTest {
	
	public static void main(String[] args) {
		//使用LinkedList实现栈
		Deque<String> deq = new LinkedList<String>();
		//压栈
		deq.push("libaoshen");
		deq.push("wangzhi");
		deq.push("zhangtianyu");
		deq.push("yanglin");
		deq.push("wangtao");
		//出栈
		System.out.println(deq.pop());
		System.out.println(deq.pop());
		System.out.println(deq.pop());	
		
		System.out.println("=============");
		
		//使用LinckedList实现队列
		Deque<String> deq2 = new LinkedList<String>();
		//入队
		deq2.addLast("yaohaoyu");
		deq2.addLast("zhangxueqing");
		deq2.addLast("majiangxia");
		//出队
		System.out.println(deq2.removeFirst());
		System.out.println(deq2.removeFirst());
		System.out.println(deq2.removeFirst());
		
		System.out.println("============");
		//使用ArrayDeque实现栈
		ArrayDeque<String> deq1 = new ArrayDeque<>();
		//压栈
		deq1.push("libaoshen");
		deq1.push("wangzhi");
		
		//出栈
		System.out.println(deq1.pop());
		System.out.println(deq1.pop());
		
		System.out.println("===========");
		//使用ArrayDeque实现队列
		Deque<String> deq3 = new ArrayDeque<>();
		//入队
		deq3.addLast("libaoshen");
		deq3.addLast("wangzhi");
		
		//出队
		System.out.println(deq3.removeFirst());
		System.out.println(deq3.removeFirst());		
	}
}
