package com.fhpt.java.net;

import java.net.Socket;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年6月7日 下午1:42:59 
 */
public class SimpleClient {
	public static void main(String[] args) throws Exception {
		Socket socket1 = new Socket("localhost", 8000);
		System.out.println("第一次连接");
		Socket socket2 = new Socket("localhost", 8000);
		System.out.println("第二次连接");
		Socket socket3 = new Socket("localhost", 8000); //会报错,因为服务端允许连接的最大长度为2
		System.out.println("第三次连接");
	}
}
