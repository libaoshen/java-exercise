package com.fhpt.java.googleguava;

import com.google.common.base.Preconditions;

/** 
 * @author  libaoshen
 * @description  方法的前置条件判断:前置条件判断采用方法,多个前置条件判断时,可以再多行调用多个前置条件判断方法
 * @createdDate  2017年8月3日 上午11:42:11 
 */
public class FindQuestion2 {
	public static void main(String[] args) {
		int a = 1, b = 2;
		//1.bool条件判断
		//bool判断,判断表达式是否是true,如果是false就抛异常
		try {
			Preconditions.checkArgument(a > b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//bool判断,和上面的类似,只不过多加了一个异常提示信息
		try {
			Preconditions.checkArgument(a > b, "a should less than b");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Preconditions.checkArgument(a > b, "%s should less than %s", a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//2.null判断
		try {
			String s = null;
			System.out.println(Preconditions.checkNotNull(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3.检查对象状态
		boolean flag = false;
		Preconditions.checkState(flag);
	}
}
