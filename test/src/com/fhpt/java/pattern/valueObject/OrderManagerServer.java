package com.fhpt.java.pattern.valueObject;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/** 
 * @author  libaoshen
 * @description  rmi注册绑定
 * @createdDate  2017年6月6日 上午11:47:25 
 */
public class OrderManagerServer {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099); //注册RMI端口
			IOrderManager usermanager = new OrderManager(); //RMI远程对象
			Naming.rebind("OrderManager", usermanager); //绑定RMI对象
			System.out.println("OrderManager is ready.");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
