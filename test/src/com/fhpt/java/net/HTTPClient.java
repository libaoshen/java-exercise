package com.fhpt.java.net;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/** 
 * @author  libaoshen
 * @description  获取服务器响应
 * @createdDate  2017年6月7日 下午2:21:42 
 */
public class HTTPClient {
	String host = "blog.csdn.net";
	int port = 80;
	Socket socket;
	
	public void createSocket() throws Exception {
		socket = new Socket(host, port);
	}
	
	
	/*Host: www.baidu.com
	User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:53.0) Gecko/20100101 Firefox/53.0
	Accept: text/plain, *; q=0.01
	Accept-Language: zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3
	Accept-Encoding: gzip, deflate, br
	X-Requested-With: XMLHttpRequest
	Referer: https://www.baidu.com/index.php?tn=monline_3_dg
	Cookie: BD_UPN=1352; BDUSS=1nS3RJUHJPRlcxWFpwdWJsZm8wTTh1SDJRd1FldlRkaXBtdjlkZDAxLVNSQ3BaSVFBQUFBJCQAAAAAAAAAAAEAAAD-Ekk7ucTAy9Ph0fMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAJK3AlmStwJZaC; BAIDUID=F7CF69CDA388956A93F75928667C093D:FG=1; BIDUPSID=C0119FDDA3F1DBD1B8E9EAA0B10C05F5; PSTM=1495781857; __cfduid=dd69cdd7356711e52e888202ca84cacdc1496282126; BDORZ=FFFB88E999055A3F8A630C64834BD6D0; H_PS_PSSID=1440_21123; BDRCVFR[dBqNArQW8Bt]=mk3SLVN4HKm; BD_CK_SAM=1; PSINO=3; BDRCVFR[Fc9oatPmwxn]=srT4swvGNE6uzdhUL68mv3; BDRCVFR[gltLrB7qNCt]=mk3SLVN4HKm; pgv_pvi=2500701184; pgv_si=s7212901376; H_PS_645EC=7c35dIXoj4%2BSJEgp3DG41J6%2BKm%2BN95bZ6ENdOsdZV0CG5u2y1vELCE00xV4TPtMoju%2B9; BD_HOME=1; sugstore=1
	Connection: keep-alive*/
	
	
	
	public void communicate() throws Exception {
		//构造HTTP请求头字符串
		StringBuffer sb = new StringBuffer();
		sb.append("get /kfanning/article/details/6062118/ HTTP/1.1");
		sb.append("Host:blog.csdn.net\r\n");
		sb.append("text/plain, */*; q=0.01\r\n");
		sb.append("Accept-Language: zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3\r\n");
		sb.append("Accept-Encoding: gzip, deflate, br\r\n");
		sb.append("User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:53.0) Gecko/20100101 Firefox/53.0\r\n");
		sb.append("Referer: http://blog.csdn.net/kfanning/article/details/6062118/");
		sb.append("Cookie: bdshare_firstime=1493084824539; uuid_tt_dd=6802747182800716277_20170425; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1496802048,1496803041,1496817993,1496818516; __message_sys_msg_id=0; __message_gu_msg_id=0; __message_cnel_msg_id=0; __utma=17226283.759173571.1493090225.1493090225.1493090225.1; __utmz=17226283.1493090225.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); UN=lbs1211; UE=\\\"490436248@qq.com\\\"; BT=1496723726350; UM_distinctid=15bfa86a4d6222-0a0425fb0856d38-173e7240-140000-15bfa86a4d7247; uuid=2ad7ed0d-2205-47ff-a426-10bf1a08ec42; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1496818516; avh=6062118; dc_tos=or60k5; dc_session_id=1496818517809");
		sb.append("Connection: keep-alive\r\n");
		//发送HTTP请求头
		OutputStream socketOut = socket.getOutputStream();
		socketOut.write(sb.toString().getBytes());
		//接受相应结果
		BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String s;
		System.out.println(socketIn.readLine());
		while((s = socketIn.readLine()) != null) {
			System.out.println(s);
		}
		socket.close();
	}
	
	public static void main(String[] args) throws Exception {
		HTTPClient client = new HTTPClient();
		client.createSocket();
		client.communicate();
	}
}
