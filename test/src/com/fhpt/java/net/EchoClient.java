package com.fhpt.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/** 
 * @author  libaoshen
 * @description  客户端程序
 * @createdDate  2017年6月7日 上午10:07:44 
 */
public class EchoClient {
	private String host = "localhost";
	private int port = 8000;
	private Socket socket;
	
	public EchoClient() throws IOException {
		socket = new Socket(host, port);
		System.out.println("客户单启动");
	}
	
	private PrintWriter getWriter(Socket socket) throws IOException {
		OutputStream socketOut = socket.getOutputStream();
		return new PrintWriter(socketOut, true);
	}
	
	private BufferedReader getReader(Socket socket) throws IOException {
		InputStream socketIn = socket.getInputStream();
		return new BufferedReader(new InputStreamReader(socketIn));
	}
	
	//客户端的服务方法
	public void talk() {
		try {
			BufferedReader br = getReader(socket);
			PrintWriter pw = getWriter(socket);
			System.out.println("isConnect1: " + (socket.isConnected() && socket.isClosed()));
			BufferedReader localReader = new BufferedReader(new InputStreamReader(System.in));
			String msg = null;
			while((msg = localReader.readLine()) != null) {
				pw.println(msg);
				System.out.println("客户端" + br.readLine());
				if(msg.equals("bye")) {
					break;
				}
			}
			
			System.out.println("isConnect2: " + (socket.isConnected() && socket.isClosed()));
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
	
	public static void main(String[] args) throws IOException {
		new EchoClient().talk();
	}
}
