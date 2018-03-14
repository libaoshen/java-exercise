package com.fhpt.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/** 
 * @author  libaoshen
 * @description  stream巩固1 -- 串行流和并行流
 * @createdDate  2017年7月14日 下午1:37:42 
 */
public class Stream2 {
	
	public static final int MAX = 1000000;
	
	public static void main(String[] args) {
		sortSequential();
		sortParallel();
	}
	
	public static void sortSequential() {
		List<String> values = new ArrayList<>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}
		
		//sequential
		
		long t0 = System.nanoTime();
		
		long count = values.stream().sorted().count();
		System.out.println(count);
		
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println("sequential : " + millis);
	}
	
	
	public static void sortParallel() {
		List<String> values = new ArrayList<>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}
		
		//parallel
		
		long t0 = System.nanoTime();
		
		long count = values.parallelStream().sorted().count();
		System.out.println(count);
		
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println("parallel : " + millis);
	}
	
	
}
