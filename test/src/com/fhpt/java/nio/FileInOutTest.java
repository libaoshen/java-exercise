package com.fhpt.java.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/** 
 * @author  libaoshen
 * @description  文件输入输出测试
 * @createdDate  2017年9月1日 上午10:41:48 
 */
public class FileInOutTest {
	public static void main(String[] args) {
		try {
//			FileInputStream fis = new FileInputStream(new File("E:\\kafka-pga0.txt"));
//			InputStreamReader isr = new InputStreamReader(fis);
//			BufferedReader br = new BufferedReader(isr);
			//读取文件
			BufferedReader br = new BufferedReader(new FileReader("E:\\kafka-pga0.txt"));
			//写入文件
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\result.txt"));
			
			String line;
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				bw.write(line);
			}
			
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
