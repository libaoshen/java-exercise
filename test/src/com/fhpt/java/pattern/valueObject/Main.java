package com.fhpt.java.pattern.valueObject;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/** 
 * @author  libaoshen
 * @description  模拟客户端
 * @createdDate  2017年6月6日 上午11:50:45 
 */
public class Main {
	public static void main(String[] args) {
		try {
			IOrderManager usermanager = (IOrderManager)Naming.lookup("OrderManager");
			long begin = System.currentTimeMillis();
			for (int i = 0; i < 1000; i++) {
				usermanager.getOrder(i);
			}
			
			System.out.println("getOrder spend:" + (System.currentTimeMillis() - begin));
			
			begin = System.currentTimeMillis();
			for(int i = 0; i < 1000; i++) {
				usermanager.getClientName(i);
				usermanager.getNumber(i);
				usermanager.getProductName(i);
			}
			
			System.out.println("getOrder spend:" + (System.currentTimeMillis() - begin));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
