package com.fhpt.java.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * @author  libaoshen
 * @description  求解一未排序数组的排序后两连续元素之间的最大距离
 * @createdDate  2017年12月15日 下午2:10:38 
 */
public class MaxDistanceBetweenConstantNumber {
	public static void main(String[] args) {
		List<Integer> target = getInput();
		
		int result = getMaxDistance(target);
		
		System.out.println(result);
	}
	
	/**
	 * 获取输入整型数组
	 * @return
	 */
	public static List<Integer> getInput() {
		// 获取输入
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// 处理输入,转化为整型List
		String[] splitInput = input.split(" ");
		List<Integer> inputList = new ArrayList<Integer>();
		for(String si : splitInput) {
			inputList.add(Integer.parseInt(si));
		}
		
		return inputList;
	}
	
	public static int getMaxDistance(List<Integer> inputList) {
		int[] temp = new int[65536];
		// 使用temp中间数组,存储下标为输入数组值,其值为1
		for(Integer input : inputList) {
			temp[input] = 1;
		}
		// 遍历数组temp求最大的距离
		int maxDis = 0;
		int first = -1;
		int second = -1;
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == 1) {
				first = second;
				second = i;
				
				if(first != -1) {
					int tp = second - first;
					maxDis = maxDis < tp ? tp : maxDis;
				}
			}
		}
		
		return maxDis;
	}
}
