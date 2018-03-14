package com.fhpt.java.serviceProviderFrame;
/** 
 * @author  libaoshen
 * @description  模拟客户端
 * @createdDate  2017年12月8日 上午11:37:59 
 */
public class ClientTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.fhpt.java.serviceProviderFrame.AllPurposeCardUndergroundServiceProviderImpl");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		UndergroundService service = ServiceManager.getService("一卡通");
		service.enter();
		service.exit();
	}
}
