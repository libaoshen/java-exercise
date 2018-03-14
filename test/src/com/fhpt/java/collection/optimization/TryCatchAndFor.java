package com.fhpt.java.collection.optimization;
/** 
 * @author  libaoshen
 * @description  比较trycatch在循环内和循环外,把trycatch块放在循环外比放在循环内效率更高
 * @createdDate  2017年6月8日 上午11:06:37 
 */
public class TryCatchAndFor {
	public static void main(String[] args) {
		int a = 0;
		Long begin = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			try {
				a++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("trycatch在for内部:" + (System.nanoTime() - begin));
		a = 0;
		begin = System.nanoTime();
		try {
			for (int i = 0; i < 100; i++) {
				a++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("trycatch在for外部:" + (System.nanoTime() - begin));
	}
}
