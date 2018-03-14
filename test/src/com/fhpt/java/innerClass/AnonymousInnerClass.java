package com.fhpt.java.innerClass;
/** 
 * @author  libaoshen
 * @description  匿名内部类的使用:1.构造器传参;2.在匿名内部类中加入构造器
 * @createdDate  2017年9月25日 下午2:50:26 
 */

abstract class Show2 {
	String i;
	
	public Show2(String i) {
		System.out.println("outerClass");
		this.i = i;
	}
	
	public abstract void show();
}

public class AnonymousInnerClass {
	
	public Show2 getShow(String i) {
		//使用构造器传参
		return new Show2(i) {
			//匿名构造器
			{
				System.out.println("innerClass");
			}
			@Override
			public void show() {
				System.out.println(i);
			}
		};
	}
	
	public static void main(String[] args) {
		AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
		anonymousInnerClass.getShow("Hello,world").show();
	}
}
