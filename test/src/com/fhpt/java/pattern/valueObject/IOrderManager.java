package com.fhpt.java.pattern.valueObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * @author  libaoshen
 * @description  实体操作接口
 * @createdDate  2017年6月6日 上午11:32:05 
 */
public interface IOrderManager extends Remote {
	//Value Object模式
	Order getOrder(int id) throws RemoteException;
	
	String getClientName(int id) throws RemoteException;
	int getNumber(int id) throws RemoteException;
	String getProductName(int id) throws RemoteException;
}
