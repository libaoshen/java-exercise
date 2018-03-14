package com.fhpt.java.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/** 
 * @author  libaoshen
 * @description  lambda初识
 * @createdDate  2017年7月13日 上午9:04:47 
 */
public class FirstLambda {
	public static void main(String[] args) throws Exception {
		//lamda两种用法:
		//1.代替内部匿名类
		Thread lambdaThread = new Thread(()->{
			System.out.println("this is a thread");
		});
		
		lambdaThread.run();
		
		//2.集合迭代
		List<String> lambdaList = new ArrayList<>();
		lambdaList.add("libaoshen");
		lambdaList.add("wangzhi");
		lambdaList.add("zhangtianyu");
		lambdaList.add("wangtao");
		lambdaList.add("yanglin");
		lambdaList.add("wangzhi");
		lambdaList.add("wangtao");
		lambdaList.add("zhangtianyu");
		
		List<Integer> lambdaList2 = new ArrayList<>();
		lambdaList2.add(1);
		lambdaList2.add(5);
		lambdaList2.add(20);
		lambdaList2.add(5);
		lambdaList2.add(47);
		lambdaList2.add(31);
		lambdaList2.add(20);
		lambdaList2.add(18);
		
		System.out.println("----first----");
		lambdaList.stream().forEach(e->{System.out.println(e);});//forEach函数实现内部迭代
		System.out.println("----second---");
		lambdaList.stream()
			.filter(s->s.length() > 7)
			.forEach(System.out::println);
		System.out.println("----third----");
		/**
		 * 流式方法可分为两种:一种是eager,一种是lazy.lazy方法只有当遇到eager方法后才会开始执行
		 * 同时多种方法流式组合,看上去经历了多重循环,起始他们是一个管道,只不过是管道中的不同流程.
		 * eager方法: collect,forEach,toArray,reduce
		 * lazy方法: map,filter
		 * 这些流式方法的入参是函数接口,可以使用λ表达式
		 */
		List<String> result = lambdaList.stream()
			.map(e -> new String(e))
			.filter(e -> e.length() > 7)
			.distinct()
			.collect(Collectors.toList());
		System.out.println(result);
		System.out.println("----fourth----");
		Map<String, Integer> result2 = lambdaList.stream()
				.map(e -> new String(e))
				.filter(e -> e.length() > 7)
				.collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1)));
		System.out.println(result2);
		System.out.println("----fifth----");
		int result3 = lambdaList2.stream()
			.map(e -> new Integer(2))
			.filter(e -> e > 2)
			.distinct()
			.reduce(0, (x,y) -> x+y);
		System.out.println(result3);
		/**
		 * λ表达式的其他应用
		 */
		System.out.println("----sixth----");
		Callable<Runnable> f1 = ()->()->{System.out.println("welcome");};
		f1.call().run();
		
		Callable<Integer> f2 = true ? () -> 0 : () -> 1;
		System.out.println(f2.call());
		
		FirstLambda firstLambda = new FirstLambda();
		System.out.println(firstLambda.factorial.apply(3));
		
	}
	
	//递归函数
	protected UnaryOperator<Integer> factorial = i -> i == 0 ? 1 : i * this.factorial.apply( i - 1 );
}
