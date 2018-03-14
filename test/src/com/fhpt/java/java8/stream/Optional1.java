package com.fhpt.java.java8.stream;

import java.util.Optional;

/** 
 * @author  libaoshen
 * @description  optional初识
 * @createdDate  2017年7月14日 上午11:04:57 
 */
public class Optional1 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("libaoshen");
		
		System.out.println(optional.get());
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("wangzhi"));
		
		optional.ifPresent(s -> System.out.println(s.substring(0, 1)));
	}
}
