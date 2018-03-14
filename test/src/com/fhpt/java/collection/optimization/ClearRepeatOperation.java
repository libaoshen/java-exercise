package com.fhpt.java.collection.optimization;

import java.util.Arrays;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  去除重复操作,for循环集合时,定义一些变量去除重复的操作能够提升性能
 * @createdDate  2017年6月8日 上午9:42:09 
 */
public class ClearRepeatOperation {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("libaoshen", "wangzhi", "wangtao", "yanglin", "wangzhi", "wangtao");
		
		int count = 0;
		Long begin = System.nanoTime();
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).equals("wangzhi") || list.get(i).equals("wangzhi")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println("一般写法用时:" + (System.nanoTime() - begin));
		
		count = 0;
		begin = System.nanoTime();
		int size = list.size();
		for(int i = 0; i < size ; i++) {
			if(list.get(i).equals("wangzhi") || list.get(i).equals("wangzhi")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println("size通用用时:" + (System.nanoTime() - begin));
		
		count = 0;
		begin = System.nanoTime();
		size = list.size();
		for(int i = 0; i < size ; i++) {
			String ele = list.get(i);
			if(ele.equals("wangzhi") || ele.equals("wangzhi")) {
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println("get通用用时:" + (System.nanoTime() - begin));
		
	}
}
