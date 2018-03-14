package com.fhpt.java.pattern.adaptor;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月13日 下午2:53:35 
 */
public class Client {
	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();
		
		Target target2 = new Adapter();
		target2.request();
	}
}
