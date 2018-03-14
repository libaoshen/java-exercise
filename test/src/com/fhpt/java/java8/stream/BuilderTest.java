package com.fhpt.java.java8.stream;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月27日 下午4:43:58 
 */
public class BuilderTest {
	public static void main(String[] args) {
		Student student = new Student.StudentBuilder().setSid("1").setName("libaoshen").setSex("male").setAge("22").setDiscipline("it").setAddress("hubeiwuhan").builder();
		
		System.out.println(student);
	}
}

class Student {
	private String sid;
	private String name;
	private String age;
	private String sex;
	private String address;
	private String discipline;
	
	public Student(String sid, String name, String age, String sex, String address, String discipline) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.discipline = discipline;
	}
	
	public static class StudentBuilder {
		private String sid;
		private String name;
		private String age;
		private String sex;
		private String address;
		private String discipline;

		public StudentBuilder setSid(String sid) {
			this.sid = sid;
			return this;
		}
		
		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder setAge(String age) {
			this.age = age;
			return this;
		}
		
		public StudentBuilder setSex(String sex) {
			this.sex = sex;
			return this;
		}
		
		public StudentBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public StudentBuilder setDiscipline(String discipline) {
			this.discipline = discipline;
			return this;
		}
		
		public Student builder() {
			return new Student(sid, name, age, sex, address, discipline);
		}
	}
	
	
	@Override
	public String toString() {
		return sid + " " + name;
	}
}
