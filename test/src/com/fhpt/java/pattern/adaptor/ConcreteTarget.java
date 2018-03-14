package com.fhpt.java.pattern.adaptor;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月13日 下午2:51:38 
 */
public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("concrete do something");
	}
}
