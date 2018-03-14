package com.fhpt.java.jvm;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2018年1月3日 下午3:37:42 
 */
public class StaticDispatch {
	static class Human {
		
	}
	
	static class Man extends Human {
		
	}
	
	static class Woman extends Human {
		
	}
	
	private void sayHello(Human human) {
		System.out.println("human");
	}
	
	private void sayHello(Man human) {
		System.out.println("man");
	}
	
	private void sayHello(Woman human) {
		System.out.println("Woman");
	}
	
	public static void main(String[] args) {
		StaticDispatch sd = new StaticDispatch();
		sd.sayHello(new Man());
		sd.sayHello(new Woman());
		// man的外观类型是Human,其实际类型是Man,重载调用使用的是外观类型
		Human man = new Man();
		Human woman = new Woman();
		
		sd.sayHello(man);
		sd.sayHello(woman);
	}
}
