package com.fhpt.java.pattern.observer;
/** 
 * @author  libaoshen
 * @description  具体的观察者
 * @createdDate  2017年6月6日 上午11:04:57 
 */
public class ConcreteObserver implements IObserver {
	String name = null;
	
	public ConcreteObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String msg) {
		System.out.println("观察者" + name + ":" + msg);
	}
	
}
