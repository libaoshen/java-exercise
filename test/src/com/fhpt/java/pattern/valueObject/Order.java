package com.fhpt.java.pattern.valueObject;

import java.io.Serializable;

/** 
 * @author  libaoshen
 * @description  实体类
 * @createdDate  2017年6月6日 上午11:28:11 
 */
public class Order implements Serializable {
	private static final long serialVersionUID = -805586989425134131L;
	private int orderId;
	private String clientName;
	private int number;
	private String productName;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
