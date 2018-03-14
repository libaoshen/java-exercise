package com.fhpt.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

/** 
 * @author  libaoshen
 * @description  对本地的端口扫描
 * @createdDate  2017年6月7日 上午11:31:32 
 */
public class PortScanner {
	public static void main(String[] args) {
		String host = "localhost";
		if(args.length > 0) {
			host = args[0];
		}
		
		new PortScanner().scan(host);
	}
	
	public void scan(String host) {
//		Socket socket = null;
		Socket socket = new Socket();
		//循环和1024以类的端口建立连接
		for (int port = 1; port < 1024; port++) {
			try {
				InetAddress ia = InetAddress.getByName("www.baidu.com");
				System.out.println(ia.getHostName() + ia.getCanonicalHostName() + ia.getHostAddress() + ia.getAddress());
				SocketAddress remoteAdd = new InetSocketAddress(host, port);
				socket.connect(remoteAdd, 60000); //设定连接超时时间为一分钟
				//socket = new Socket(host, port);
				System.out.println("There is a server on port " + port);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(socket != null) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
