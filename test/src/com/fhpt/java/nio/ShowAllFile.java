package com.fhpt.java.nio;

import java.io.File;

/** 
 * @author  libaoshen
 * @description  显示所有的文件:递归遍历所有的文件
 * @createdDate  2017年9月1日 上午10:17:06 
 */
public class ShowAllFile {
	public static void main(String[] args) {
		showAllFile(new File("C:\\Program Files"));
	}
	
	public static void showAllFile(File f) {
		File[] files = f.listFiles();
		if(files == null) {
			return;
		}
		for(File f2 : files) {
			if(f2!= null && f2.isDirectory()) {
				showAllFile(f2);
			}else {
				System.out.println(f2.getName());
			}
		}
	}
}
