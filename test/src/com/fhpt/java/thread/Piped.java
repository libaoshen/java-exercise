package com.fhpt.java.thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年10月18日 下午1:44:20 
 */
public class Piped {
	public static void main(String[] args) throws IOException {
		PipedWriter out = new PipedWriter();
		PipedReader in = new PipedReader();
		//将输出流和输入流进行连接,否则在使用时会抛出IOException
		in.connect(out);
		
		Thread printThread = new Thread(new Print(in), "PrintThread");
		
		printThread.start();

		int receive = 0;
		
		while((receive = System.in.read()) != -1) {
			out.write(receive);
		}
		
		out.close();
	}
	
	static class Print implements Runnable {
		
		private PipedReader in;
		
		public Print(PipedReader in) {
			this.in = in;
		}
		
		@Override
		public void run() {
			try {
				int receive = 0;
				while((receive = in.read()) != -1) {
					System.out.println("receive " + (char)receive);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
