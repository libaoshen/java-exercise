package com.fhpt.java.pattern.observer;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年6月6日 上午11:07:11 
 */
public class Main {
	public static void main(String[] args) {
		ISubject subject = new ConcreteSubject();
		
		//创建三个观察者
		IObserver observer1 = new ConcreteObserver("观察者1");
		IObserver observer2 = new ConcreteObserver("观察者2");
		IObserver observer3 = new ConcreteObserver("观察者3");
		
		subject.add(observer1);
		subject.add(observer2);
		subject.add(observer3);
		
		subject.inform("第一次通知");
		subject.inform("点击事件");
		subject.inform("取消事件");
	}
}
