package com.fhpt.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 * @author  libaoshen
 * @description  模拟服务端
 * @createdDate  2017年6月8日 上午8:19:00 
 */
public class EchoServer2 {
	private int port = 8000;
	private ServerSocket serverSocket;
	
	public EchoServer2() throws IOException {
		serverSocket = new ServerSocket(port);
	}
	
	public void service() {
		while (true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept(); //和客户端建立连接
				Thread socketThread = new Thread(new Handle(socket)); //为每个请求都创建一个工作线程
				socketThread.start(); //启动线程
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new EchoServer2().service();
	}
}

class Handle implements Runnable {
	private Socket socket;
	public Handle(Socket socket) {
		this.socket = socket;
	}
	
	public String echo(String msg) {
		return "echo : " + msg;
	}
	
	private PrintWriter getWriter(Socket socket) throws IOException {
		OutputStream socketOut = socket.getOutputStream();
		return new PrintWriter(socketOut, true);
	}
	
	private BufferedReader getReader(Socket socket) throws IOException {
		InputStream socketIn = socket.getInputStream();
		return new BufferedReader(new InputStreamReader(socketIn));
	}
	
	@Override
	public void run() {
		try {
			System.out.println("New connection created"+ socket.getInetAddress() + ":" + socket.getLocalPort() );
			PrintWriter pw = getWriter(socket);
			BufferedReader br = getReader(socket);
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
				pw.println(echo(msg));
				if(msg.equals("bye")) {
					break;
				}
			}
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
