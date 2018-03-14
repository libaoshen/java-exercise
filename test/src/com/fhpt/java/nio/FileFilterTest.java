package com.fhpt.java.nio;

import java.io.File;
import java.io.FilenameFilter;

/** 
 * @author  libaoshen
 * @description  文件过滤器使用,主要的过滤器接口FilenameFilter接口.关键方法accept,用于过滤的方法;
 * @createdDate  2017年9月1日 上午10:03:27 
 */
public class FileFilterTest {
	public static void main(String[] args) {
		File[] files = File.listRoots();
		
		for(File f : files) {
			System.out.println(f.getPath());
			if(f.isDirectory()) {
				String[] files2 = f.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.startsWith("Program");
					}
				});
				for(String f2 : files2) {
					System.out.println(f2);
				}
//				File[] files2 = f.listFiles();
//				for(File f2 : files2) {
//					System.out.println(f2.getName());
//				}
			}
		}
	}
}
