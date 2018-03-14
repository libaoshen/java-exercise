package com.fhpt.java.algorithms;
/** 
 * @author  libaoshen
 * @description  计数排序
 * @createdDate  2017年8月29日 下午3:29:30 
 */
public class CountingSort {
	/**
	 * 计数排序
	 * @param A 原数组
	 * @param B 排好序的数组
	 * @param k 数组中数的上界
	 */
	public static void CountSort(int[] A, int[] B, int k) {
		int[] C = new int[k];
		//初始化C数组,用于记录A中的每个元素出现次数
		for(int i = 0; i < C.length; i++) {
			C[i] = 0;
		}
		
		//计算C数组
		for(int i = 0; i < A.length; i++) {
			C[A[i]] += 1;
		}
		
		//计算C数组
		for(int i = 1; i < C.length; i++) {
			C[i] += C[i - 1] ;
		}
		
		//计算B数组,B数组用于记录最后排好序的数组
		for(int i = A.length - 1; i >=0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]] -= 1;
		}
	}
	
	public static void main(String[] args) {
		int[] A = {12, 1, 45, 1, 2, 3, 12, 12, 22, 30, 5, 0, 9};
		int[] B = new int[A.length];
		
		System.out.println("排序前:");
		for(int a : A) {
			System.out.print(a + " ");
		}
		CountSort(A, B, 46);
		System.out.println("\n排序后:");
		for(int b : B) {
			System.out.print(b + " ");
		}
	}
}
