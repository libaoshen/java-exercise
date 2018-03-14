package com.fhpt.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年8月15日 下午4:03:12 
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Student {
	public int id();
	public String description() default "new Student";
}
