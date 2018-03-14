package com.fhpt.java.serviceProviderFrame;
/** 
 * @author  libaoshen
 * @description  使用一卡通实现地铁服务
 * @createdDate  2017年12月8日 上午11:22:12 
 */
public class AllPurposeCardUndergroundServiceImpl implements UndergroundService {
	
	@Override
	public boolean enter() {
		System.out.println("使用一卡通进入地铁");
		
		/**
		 * 一些判断操作,是否放行
		 */
		
		return true;
	}
	
	@Override
	public boolean exit() {
		System.out.println("使用一卡通进入地铁");
		
		/**
		 * 一些判断操作,是否放行
		 */
		
		return true;
	}
}
