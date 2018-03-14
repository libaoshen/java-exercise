package com.fhpt.java.java8.stream;

import java.util.Arrays;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  关于流的操作
 * 1.Intermediate:
 *  map, filter, parallel, sorted, peek, findFirst
 * 2.terminal:
 *  sum, count, forEach, toArray, reduce, collect, min, max
 * @createdDate  2017年10月9日 上午9:20:33 
 */
public class Stream9 {
	public static void main(String[] args) {
		//1.map(map的用法:由一个流转换为另一个流)
		//转换大小写
		List<String> list = Arrays.asList("abc", "Bc", "cd", "Ef");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//平方数
		List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 9, 11);
		list2.stream().map(s -> s*s).forEach(System.out::println);
		
		//2.filter(filter的用法:满足条件的通过,不满条件的去掉)
		list.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);
		
		//3.forEach(forEach的用法:forEach是terminal操作,只能执行一次,如果需要多次遍历可以使用peek操作)
		List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9, 11);
		list3.stream().filter(s -> s > 5).peek(e -> System.out.println(e)).count();
		list3.stream().peek(System.out::println).count();
		
		//4.findFirst
		List<Integer> list4 = Arrays.asList(1, 3, 5, 7, 9, 11);
		int i = list4.stream().findFirst().orElse(-1);
		System.out.println(i);
		
		//5.reduce(组合操作)
		List<Integer> list5 = Arrays.asList(1, 3, 5, 7, 9, 11);
		int sum = list5.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		List<String> list6 = Arrays.asList("abc", "Bc", "cd", "Ef");
		String str3 = list6.stream().reduce("", String::concat);
		System.out.println(str3);
		
		//6.limit/skip(limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素)
		List<String> list7 = Arrays.asList("abc", "Bc", "cd", "Ef");
		list7.stream().limit(3).skip(2).forEach(System.out::println);;
	}
}
