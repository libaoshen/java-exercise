package com.fhpt.java.pattern.flyweight;
/** 
 * @author  libaoshen
 * @description  财务报表
 * @createdDate  2017年6月5日 上午9:49:02 
 */
public class FinancialReportManager implements IReportManager {
	
	protected String tenantId = null;
	
	public FinancialReportManager(String tenantId) {
		this.tenantId = tenantId;
	}
	
	@Override
	public String createReport() {
		return "This is a financial report";
	}
	
}
