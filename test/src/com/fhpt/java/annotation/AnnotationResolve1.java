package com.fhpt.java.annotation;

import java.lang.reflect.Method;


/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年8月15日 下午4:17:36 
 */
public class AnnotationResolve1 {
	
	public static void resolve(Class<?> c) {
		for(Method m : c.getDeclaredMethods()) {
			if(m.getAnnotation(Student.class) != null) {
				Student stu = m.getAnnotation(Student.class);
				System.out.println(stu.id() + " - " + stu.description());
			}
		}
	}
	
	public static void main(String[] args) {
		resolve(StudentTest.class);
	}
}
