package com.fhpt.java.pattern.decorator;
/** 
 * @author  libaoshen
 * @description  具体的组件类
 * @createdDate  2017年6月6日 上午10:02:47 
 */
public class PackageBodyCreator implements IPackageCreator {

	@Override
	public String handleContent() {
		return "Content of Packet"; //只构造数据，不包括格式
	}
	
}
