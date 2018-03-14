package com.fhpt.java.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/** 
 * @author  libaoshen
 * @description  使用Nio读文件
 * @createdDate  2017年6月8日 上午10:02:51 
 * {@inheritDoc}
 */
public class ReadFile {
	public static void main(String[] args) throws Exception {
		nioCopyFile("C:\\Users\\fhpt\\Desktop\\net\\EchoClient.java", "C:\\Users\\fhpt\\Desktop\\net\\EchoClient1.java");
	}
	
	/**
	 * <ol>
	 * 	<li><i>first</i></li>
	 * <li>second</li>
	 * <li>third</li>
	 * </ol>
	 * {@link com.fhpt.java.nio.ReadFile#nioCopyFile() nioCopyFile}
	 * <a href="{@docRoot}/ReadFile.java">ReadFile</a>
	 * 
	 * @see FileTest
	 * @param source
	 * @param destination
	 * @throws Exception
	 */
	public static void nioCopyFile(String source, String destination) throws Exception {
		//创建文件输入输出流
		FileInputStream fis = new FileInputStream(new File(source));
		FileOutputStream fos = new FileOutputStream(new File(destination));
		//读写文件通道
		FileChannel ic = fis.getChannel();
		FileChannel oc = fos.getChannel();
		
		//读缓冲(缓冲中的三个参数:capacity缓冲大小,position当前缓冲位置,limit缓冲实际大小)
		//创建缓冲的方法
		//1.静态方法allocate从堆中分配缓冲
		//ByteBuffer buff = ByteBuffer.allocate(1024);
		//2.将一个数组包装为缓冲
		byte[] bytes = new byte[1024];
		ByteBuffer buff = ByteBuffer.wrap(bytes);
		
		System.out.println(buff.capacity() + "-" + buff.position() + ":" + buff.limit());
		
		while(true) {
			buff.clear();
			int len = ic.read(buff);
			System.out.println(buff.toString());
			if(len == -1) {
				break;
			}
			//将缓冲中的position置0,将limit置为缓冲实际大小
			buff.flip();
			System.out.println((char)buff.get());
			oc.write(buff); //写入文件
		}
		
		fis.close();
		fos.close();
		ic.close();
		oc.close();
	}
}
