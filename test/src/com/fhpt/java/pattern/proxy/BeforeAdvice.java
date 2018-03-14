package com.fhpt.java.pattern.proxy;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月11日 下午5:29:37 
 */
public class BeforeAdvice implements IAdvice {
	@Override
	public void exec() {
		System.out.println("我是一个前置通知");
	}
}
