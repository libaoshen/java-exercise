package com.fhpt.java.pattern.adaptor;
/** 
 * @author  libaoshen
 * @description  适配器
 * @createdDate  2017年12月13日 下午2:50:36 
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}
