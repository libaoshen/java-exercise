package com.fhpt.java.polymorphism;
/** 
 * @author  libaoshen
 * @description  多态：子类重写父类的私有方法,不会发生动态绑定
 * @createdDate  2017年9月6日 下午5:17:38 
 */
public class PrivateOverride {
	private void f() {
		System.out.println("private f()"); 
	}
	
	public static void main(String[] args) {
		PrivateOverride privateOverride = new Derived();
		privateOverride.f();
	}
}

class Derived extends PrivateOverride{
	public void f() {
		System.out.println("public f()");
	}
}
