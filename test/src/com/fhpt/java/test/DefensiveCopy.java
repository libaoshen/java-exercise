package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月12日 上午11:26:35 
 */
public class DefensiveCopy {
	
	private String s;
	
	public void doSomething(String s) {
		this.s = s;
	}
	
	public void showS() {
		System.out.println(this.s);
	}
	
	public static void main(String[] args) {
		String a = "hust";;
		String s = a;
		DefensiveCopy defensiveCopy = new DefensiveCopy();
		defensiveCopy.doSomething(s);
		defensiveCopy.showS();
		defensiveCopy.showS();
	}
}
