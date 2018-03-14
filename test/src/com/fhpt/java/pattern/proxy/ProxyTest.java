package com.fhpt.java.pattern.proxy;
/** 
 * @author  libaoshen
 * @description  代理测试类
 * @createdDate  2017年12月11日 下午4:23:19 
 */
public class ProxyTest {
	public static void main(String[] args) {
		Subject subject = new Proxy(new RealSubject());
		
		subject.request();
	}
}
