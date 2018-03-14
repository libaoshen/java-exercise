package com.fhpt.java.jvm;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.hamcrest.core.IsInstanceOf;

/** 
 * @author  libaoshen
 * @description  自定义实现类加载器
 * @createdDate  2018年1月4日 上午11:33:55 
 */
public class ClassLoaderTest2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ClassLoader classLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				
				try {
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
					
					InputStream is = getClass().getResourceAsStream(fileName);
					
					if(is == null) {
						return super.loadClass(name);
					}
					
					byte[] b = new byte[is.available()];
					is.read(b);
					
					return defineClass(name, b, 0, b.length);
				} catch (ClassFormatError e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		
		Object obj = classLoader.loadClass("com.fhpt.java.jvm.ClassLoaderTest2").newInstance();
		// 一个类和其类加载器在jvm中唯一确定一个类
		System.out.println(obj instanceof com.fhpt.java.jvm.ClassLoaderTest2);
		
		System.out.println(obj.getClass().getClassLoader());
		System.out.println(new Object().getClass().getClassLoader());
		System.out.println(new ClassLoaderTest2().getClass().getClassLoader());
	}
}
