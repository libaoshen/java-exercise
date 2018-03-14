package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  builder设计模式
 * @createdDate  2017年12月8日 下午3:18:00 
 */
public class Employee implements Cloneable {
	
	private Integer employeeId;
	private String employeeName;
	private String employeeDept;
	private Integer age;
	private String level;
	
	private Employee(Integer employeeId, String employeeName, String employeeDept, Integer age, String level) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.age = age;
		this.level = level;
	}
	
	private Employee(EmployeeBuilder builder) {
		this.employeeId = builder.employeeId;
		this.employeeName = builder.employeeName;
		this.employeeDept = builder.employeeDept;
		this.age = builder.age;
		this.level = builder.level;
	}

	public static class EmployeeBuilder {
		private Integer employeeId;
		private String employeeName;
		private String employeeDept;
		private Integer age;
		private String level;
		
		public EmployeeBuilder(Integer employeeId, String employeeName) {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}
		
		public EmployeeBuilder employeeDept(String employeeDept) {
			this.employeeDept = employeeDept;
			return this;
		}
		
		public EmployeeBuilder age(Integer age) {
			this.age = age;
			return this;
		}
		
		public EmployeeBuilder level(String level) {
			this.level = level;
			return this;
		}
		
		public Employee build() {
//			return new Employee(employeeId, employeeName, employeeDept, age, level);
			return new Employee(this);
		}
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", age=" + age + ", level=" + level + "]";
	}

	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder(1, "libaoshen")
				.employeeDept("sde").age(23).level("P6").build();
		System.out.println(employee);
	
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
