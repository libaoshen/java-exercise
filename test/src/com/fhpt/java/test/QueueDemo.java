package com.fhpt.java.test;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年5月17日 下午3:31:18 
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("asfda");
		queue.offer("12");
		queue.offer("525sfd");
		queue.add("asfdasdfa");
		
		for (String string : queue) {
			System.out.println(string);
		}
	}
}
