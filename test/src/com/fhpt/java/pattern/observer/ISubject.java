package com.fhpt.java.pattern.observer;
/** 
 * @author  libaoshen
 * @description  主题接口,申明添加、删除和通知观察者
 * @createdDate  2017年6月6日 上午11:00:34 
 */
public interface ISubject {
	void add(IObserver observer); //添加观察者
	void remove(IObserver observer); //移除观察者
	void inform(String msg); //通知所有的观察者
}
