package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  拷贝demo
 * @createdDate  2017年12月11日 上午10:30:38 
 */
public class CloneDemo {
	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder(1, "libaoshen")
				.employeeDept("sde").age(23).level("P6").build();
		Employee e2 = employee;
		try {
			// 浅拷贝
			Employee e3 = (Employee) employee.clone();
			System.out.println(employee == e3);
			System.out.println(employee.getEmployeeDept() == e3.getEmployeeDept());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(employee == e2);
	}
}
