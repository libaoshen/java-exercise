package com.fhpt.java.nio;

import java.io.File;
import java.io.IOException;

/** 
 * @author  libaoshen
 * @description  File类的使用:创建一个文件夹下的文件,其对应的文件夹必须存在,先要通过mkdir或mkdirs创建文件夹,再通过createNewFile创建具体的文件
 * @createdDate  2017年9月1日 上午9:18:04 
 */
public class FileTest {
	public static void main(String[] args) {
		File f1 = new File("E:\\java_test");
		File f2 = new File("E:\\java_test\\first.txt");
		File f3 = new File("E:\\java_test", "third.txt");
		System.out.println("separator = " + File.separator);
		
		try {
			if(!f1.exists() || !f2.exists() || !f3.exists()) {
				//创建必须的文件夹
				f1.mkdirs();
				//创建该文件
				f2.createNewFile();
				f3.createNewFile();
				//获取文件对应的属性
				System.out.println("path = " + f2.getPath());
				System.out.println("name = " + f2.getName());
				System.out.println("parent = " + f2.getParent());
				System.out.println("canonicalPath = " + f2.getCanonicalPath());
				System.out.println("absolutePath = " + f2.getAbsolutePath());
				System.out.println("totalSpace = " + f2.getTotalSpace());
				System.out.println("freeSpace = " + f2.getFreeSpace());
				System.out.println("usableSpace = " + f2.getUsableSpace());
				System.out.println("isDirectory = " + f2.isDirectory());
				System.out.println("isFile = " + f2.isFile());
				System.out.println("isAbsolute = " + f2.isAbsolute());
				System.out.println("isHidden = " + f2.isHidden());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
