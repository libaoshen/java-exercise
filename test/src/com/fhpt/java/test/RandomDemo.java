package com.fhpt.java.test;

import java.util.Random;

/** 
 * @author  libaoshen
 * @description  Random类demo
 * @createdDate  2017年12月7日 上午10:56:35 
 */
public class RandomDemo {
	public static void main(String[] args) {
		// Math.random()返回值在0到1(不包含1)
		double d = Math.random();
		System.out.println(d);
		Random rand = new Random(47);
		System.out.println(rand.nextInt(11));
	}
}
