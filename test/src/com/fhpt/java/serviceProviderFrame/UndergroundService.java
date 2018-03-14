package com.fhpt.java.serviceProviderFrame;
/** 
 * @author  libaoshen
 * @description  地铁服务接口
 * @createdDate  2017年12月8日 上午11:17:55 
 */
public interface UndergroundService {
	/**
	 * 进入地铁
	 * @return
	 */
	boolean enter();
	/**
	 * 出地铁
	 * @return
	 */
	boolean exit();
}
