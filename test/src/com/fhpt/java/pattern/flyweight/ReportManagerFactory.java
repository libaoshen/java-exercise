package com.fhpt.java.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author  libaoshen
 * @description  享元工厂类
 * @createdDate  2017年6月5日 上午9:55:08 
 */
public class ReportManagerFactory {
	Map<String, IReportManager> financialReportManager = new HashMap<String, IReportManager>();
	Map<String, IReportManager> employeeReportManager = new HashMap<String, IReportManager>();
	
	IReportManager getFinancialReportManager(String tenantId) {
		IReportManager r = financialReportManager.get(tenantId);
		if(r == null) {
			r = new FinancialReportManager(tenantId);
			financialReportManager.put(tenantId, r);
		}
		
		return r;
	}
	
	IReportManager getEmployeeManager(String tanentId) {
		IReportManager r = employeeReportManager.get(tanentId);
		if(r == null) {
			r = new EmployeeReportManager(tanentId);
			employeeReportManager.put(tanentId, r);
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		ReportManagerFactory rmf = new ReportManagerFactory();
		IReportManager rm = rmf.getFinancialReportManager("A");
		IReportManager rm1 = rmf.getFinancialReportManager("A");
		System.out.println(rm.createReport());
		System.out.println(rm == rm1);
	}
}
