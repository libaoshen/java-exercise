package com.fhpt.java.serviceProviderFrame;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年12月8日 上午11:35:25 
 */
public class AllPurposeCardUndergroundServiceProviderImpl implements UndergroundServiceProviderInterface {

	static {
		ServiceManager.registerProvider("一卡通", new AllPurposeCardUndergroundServiceProviderImpl());
	}
	
	@Override
	public UndergroundService getUndergroundService() {
		return new AllPurposeCardUndergroundServiceImpl();
	}
}
