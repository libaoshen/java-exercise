package com.fhpt.java.googleguava;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** 
 * @author  libaoshen
 * @description  发现在java中遇到的一些问题
 * @createdDate  2017年8月3日 上午11:10:14 
 */
public class FindQuestion {
	public static void main(String[] args) {
		Map<String, Integer> nameAge = new HashMap<>();
		
		nameAge.put("libaoshen", 23);
		nameAge.put("wangtao", null);
		
		//下面输出都为null,但是两种不同的情况,一种是该key对应的值为null;一种是该key就不存在
		//这里出现的问题就是null的含义模糊,不清楚
		//在某些情况下,不要在Set中使用null和不要把null作为map的键值。使用特殊值代表null会让查找操作的语义更清晰。
		System.out.println(nameAge.get("wangzhi"));
		System.out.println(nameAge.get("wangtao"));
		
		//针对上面的问题提出了Optional类
		//使用Optional强迫编程者考虑null和不存在两种情况
		Optional<Integer> possible = Optional.of(5);
		System.out.println(possible.isPresent() + " - " + possible.get());
		//创建指定引用的Optional实例，若引用为null则快速失败,会抛空指针异常
//		Optional<Integer> possible2 = Optional.of(null);
//		System.out.println(possible2.isPresent());
		
		System.out.println(Optional.empty().isPresent());
	}
}
