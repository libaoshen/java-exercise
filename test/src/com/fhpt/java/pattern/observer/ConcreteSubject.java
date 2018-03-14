package com.fhpt.java.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  具体的主题类
 * @createdDate  2017年6月6日 上午11:01:42 
 */
public class ConcreteSubject implements ISubject {
	
	List<IObserver> observers = new ArrayList<IObserver>();
	
	
	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void inform(String msg) {
		for(IObserver observer : observers) {
			observer.update(msg);
		}
	}
	
}
