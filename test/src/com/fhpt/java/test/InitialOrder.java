package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  类的初始化流程：1.为InitialOrder、A、B类分配空间，初始化所有的成员变量；
 * 						    2.调用A类构造函数和B类构造函数；
 * 							3.调用Object的构造函数
 * 							4.初始化B类成员变量并赋值
 * 							5.执行输出((A)this).a
 * 							6.初始化A类成员变量并赋值a=100
 * 							7.输出a=100
 * 							8.赋值a=200
 * 							9.输出a=200
 * 
 * ***********成员变量初始化是在父类构造函数调用完后，在此之前，成员变量的值均是默认值**************
 * @createdDate  2017年12月22日 上午10:51:54 
 */
public class InitialOrder {
	public static void main(String[] args) {
		System.out.println(new A().a);
	}
}

class B {
	public B() {
		System.out.println(((A)this).a);
	}
}

class A extends B {
	public int a = 100;
	
	public A() {
		super();
		System.out.println(a);
		a = 200;
	}
}
