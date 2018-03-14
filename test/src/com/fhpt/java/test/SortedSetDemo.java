package com.fhpt.java.test;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年5月17日 下午3:26:35 
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		ss.addAll(Arrays.asList(50,12,32,14,15,60,45));
		for (Integer i : ss) {
			System.out.println(i.intValue());
		}
	}
}
