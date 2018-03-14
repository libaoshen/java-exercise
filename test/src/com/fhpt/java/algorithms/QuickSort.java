package com.fhpt.java.algorithms;
/** 
 * @author  libaoshen
 * @description  快速排序的java实现
 * @createdDate  2017年8月28日 下午3:21:47 
 */
public class QuickSort {
	public void quickSort(int[] A, int p, int q) {
		if(p < q) {
			int r = partition(A, p, q);
			quickSort(A, p, r-1);
			quickSort(A, r+1, q);			
		}
	}
	
	/**
	 * 划分函数,返回一个下标r,使得A中的小于小标r的数小于A[r],使得A中的大于下标r的数大于A[r]
	 * @param A 待划分数组
	 * @param p 起点
	 * @param q 终点
	 * @return r 划分点
	 */
	int partition(int[] A, int p, int q) {
		//选择最后一个数作为划分数
		int partition = A[q];
		//i作为记录当前小于partition的下标最大的元素的下标
		int i = p - 1;
		
		for(int k = p; k < q; k++) {
			//<或>控制最后生成的数组的顺序
			if(A[k] < partition) {
				i++;
				int temp = A[i];
				A[i] = A[k];
				A[k] = temp;
			}
		}
		
		int temp = A[i + 1];
		A[i + 1] = partition;
		A[q] = temp;
		
		return i + 1;
	}
	
	public static void main(String[] args) {
		int[] A = {12, 31, 12, 34, 1, 3, -23};
		QuickSort qs = new QuickSort();
		qs.quickSort(A, 0, A.length - 1);
//		System.out.println(qs.partition(A, 0, A.length - 1));
		for(int a : A) {
			System.out.print(a + " ");
		}
	}
}
