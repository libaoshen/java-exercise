package com.fhpt.java.pattern.flyweight;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年6月5日 上午9:52:01 
 */
public class EmployeeReportManager implements IReportManager {
	
	protected String talentId = null;
	
	public EmployeeReportManager(String tenantId) {
		this.talentId = tenantId;
	}
	
	@Override
	public String createReport() {
		return "This is a employee report";
	}
	
}
