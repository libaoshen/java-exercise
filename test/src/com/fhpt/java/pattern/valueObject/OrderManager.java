package com.fhpt.java.pattern.valueObject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * @author  libaoshen
 * @description  实体操作类
 * @createdDate  2017年6月6日 上午11:42:50 
 */
public class OrderManager extends UnicastRemoteObject implements IOrderManager{
	
	private static final long serialVersionUID = 8581778825732367589L;

	protected OrderManager() throws RemoteException {
		super();
	}

	@Override
	public Order getOrder(int id) throws RemoteException {
		Order order = new Order();
		order.setClientName("libaoshen");
		order.setNumber(20);
		order.setProductName("nongfuguoyuan");
		
		return order;
	}

	@Override
	public String getClientName(int id) throws RemoteException {
		return "bilibili";
	}

	@Override
	public int getNumber(int id) throws RemoteException {
		return 20;
	}

	@Override
	public String getProductName(int id) throws RemoteException {
		return "nongfuguoyuan";
	}
	
}
