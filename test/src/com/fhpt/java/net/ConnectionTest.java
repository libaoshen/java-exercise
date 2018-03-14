package com.fhpt.java.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

/** 
 * @author  libaoshen
 * @description  连接测试,获取连接socket的信息
 * @createdDate  2017年6月7日 下午2:06:22 
 */
public class ConnectionTest {
	public static void main(String[] args) throws Exception {
		String host = "www.baidu.com";
		int port = 80;
		Long start = System.currentTimeMillis();
		Socket socket = new Socket();
		SocketAddress add = new InetSocketAddress(host, port);
		socket.connect(add, 1000);
		System.out.println("本地地址" + socket.getLocalAddress() + "本地端口" + socket.getLocalPort() + ",连接耗时:" + (System.currentTimeMillis() - start) + "ms");
	}
}
