package com.fhpt.java.container;

import java.util.LinkedList;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2018年2月5日 下午4:38:02 
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> stringLinkedList = new LinkedList<>();
		
		stringLinkedList.add("libaoshen");
		stringLinkedList.add("wangzhi");
		
		for(String s : stringLinkedList) {
			System.out.println(s);
		}
	}
}
