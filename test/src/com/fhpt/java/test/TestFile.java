package com.fhpt.java.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author libaoshen
 * @description 描述信息
 * @createdDate 2017年5月16日 上午10:05:59
 */
public class TestFile {
	
	/**
	 * 读文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static String readfile(String filePath) {
		FileInputStream file = null;
		BufferedReader reader = null;
		InputStreamReader inputFileReader = null;
		String content = "";
		String tempString = null;

		try {
			file = new FileInputStream(filePath);
			inputFileReader = new InputStreamReader(file, "GBK");
			reader = new BufferedReader(inputFileReader);
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				content += tempString;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {

				}
			}
		}
		return content;

	}
	
	public static void test() {
        boolean result=false;
        try {
            //String url ="http://fhpt.decayjoy.com/interf/data_inf/inf?url=http://trs.cnhubei.com:8000/wcm/docbypubtime?last_time=1495069288";
            String url = "http://dx.cnhubei.com/mcp/spec/news/2017-05-05/2017-05-05/c12630c6236e7485d8342d24f70d89e8";
        	String json= getHttpResponse(url);
            System.out.println(json);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
     
     
     
public static String getHttpResponse(String allConfigUrl) {
        BufferedReader in = null;
        StringBuffer result = null;
        try {
             
            URI uri = new URI(allConfigUrl);
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
         
            connection.connect();
             
            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
             
            return result.toString();
             
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
         
        return null;
         
    }
	
	public static void main(String[] args) {
//		Long id;
//		do {
//			id = UUID.randomUUID().getMostSignificantBits();
//		}while(id > 2147483647 || id < -2147483648);
//		
//		System.out.println(id);
//		Date d = new Date(1493254165);
//		System.out.println(d.getYear());
		
		String s = "c12630c6236e7485d8342d24f70d89e8";
		System.out.println(s.length());
		
		
		//test();
		
	}
}
