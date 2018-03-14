package com.fhpt.java.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** 
 * @author  libaoshen
 * @description  序列化和反序列化
 * @createdDate  2017年12月20日 下午4:43:53 
 */
public class StudentSerializableTest {
	public static void main(String[] args) {
		Student s = new Student("001", "libaoshen", 23, "mse");
		File f = new File("d://serializable.txt");
		
		
		try {
			// 序列化
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			oos.flush();
			oos.close();
			fos.close();
			
			// 反序列化
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student st = (Student) ois.readObject();
			System.out.println(st);
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
