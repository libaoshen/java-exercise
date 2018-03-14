package com.fhpt.java.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
 * @author  libaoshen
 * @description  获取流的操作
 * @createdDate  2017年10月9日 上午9:07:58 
 */
public class Stream8 {
	public static void main(String[] args) {
		//数组
		//1
		Stream<String> stream = Stream.of("a", "b", "c");
		
//		stream.forEach(s -> {
//			System.out.println(s);
//		});
		
		String[] strArray = new String[] {"a", "b", "c"};
		//2
		Stream<String> stream2 = Stream.of(strArray);
//		stream2.forEach(s -> {
//			System.out.println(s);
//		});
		//3
		Stream<String> stream3 = Arrays.stream(strArray);
//		stream3.forEach(s -> {
//			System.out.println(s);
//		});
		
		//集合
		List<String> list = Arrays.asList("a", "b", "c");
		list.stream().forEach(s -> {
			System.out.println(s);
		});
		
		//流转数组或集合、字符串
		//1.数组
//		String[] strArray2 =stream.toArray(String[]::new);
//		System.out.println(strArray2[2]);
		//2.集合
		List<String> strList = stream2.collect(Collectors.toList());
		System.out.println(strList.get(0));
		
		List<String> strList2 = stream3.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(strList2.get(1));
		
		//3.String
		String str = stream.collect(Collectors.joining()).toString();
		System.out.println(str);
	}
}
