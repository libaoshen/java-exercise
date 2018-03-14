package com.fhpt.java.pattern.decorator;
/** 
 * @author  libaoshen
 * @description  装饰器抽象类
 * @createdDate  2017年6月6日 上午10:05:01 
 */
public abstract class PacketDecorator implements IPackageCreator {
	IPackageCreator component;
	public PacketDecorator(IPackageCreator c) {
		component = c;
	}
}
