package com.fhpt.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @author  libaoshen
 * @description  定义注解Test
 * @createdDate  2017年8月15日 上午11:26:54 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	//最基本的注解:
	//1.@Target : 注解作用在什么地方
	//2.@Retention : 注解的作用域
	
	//没有元素的注解成为标记注解(marker annotation)
}
