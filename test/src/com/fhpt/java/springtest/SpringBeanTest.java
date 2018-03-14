package com.fhpt.java.springtest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fhpt.java.entity.Student;


/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月29日 上午10:18:52 
 */
public class SpringBeanTest {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//		
//		Student bean = (Student)context.getBean("student");
//		boolean flag = context.isSingleton("student");
//		System.out.println(flag);
//		System.out.println(bean);
		// 配置xml
		ClassPathResource res = new ClassPathResource("spring-context.xml");
		System.out.println(res.getPath());
	    // 创建一个beanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 创建xmlbeandefinitionReader读取xml文件
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		System.out.println(factory.getBean("student"));
	}
	
	@Test
	public void testSpringBase() {
		// 配置xml
		ClassPathResource res = new ClassPathResource("spring-context.xml");
		// 创建一个beanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 创建xmlbeandefinitionReader读取xml文件
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		
		Student stu = (Student)factory.getBean("student");
		
		Assert.assertEquals("libaoshen", stu.getsName());
	}
}
