package com.fhpt.java.serviceProviderFrame;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** 
 * @author  libaoshen
 * @description  服务提供者注册类
 * @createdDate  2017年12月8日 上午11:28:19 
 */
public class ServiceManager {
	
	public ServiceManager() {
	
	}
	
	public static final Map<String, UndergroundServiceProviderInterface> provider = new ConcurrentHashMap<>();

	public static void registerProvider(String name, UndergroundServiceProviderInterface p) {
		provider.put(name, p);
	}
	
	public static UndergroundService getService(String name) {
		UndergroundServiceProviderInterface undergroundServiceProviderInterface = provider.get(name);
		
		if(undergroundServiceProviderInterface == null) {
			throw new IllegalArgumentException("No provider registered with name " + name);
		}
		
		return undergroundServiceProviderInterface.getUndergroundService();
	}
}
