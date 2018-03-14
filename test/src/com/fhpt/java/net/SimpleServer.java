package com.fhpt.java.net;

import java.io.IOException;
import java.net.ServerSocket;

/** 
 * @author  libaoshen
 * @description  简单服务器程序,设置连接队列的长度为2
 * @createdDate  2017年6月7日 下午1:43:10 
 */
public class SimpleServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8000, 2);
		Thread.sleep(60000);
	}
}
