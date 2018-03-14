package com.fhpt.java.algorithms;
/** 
 * @author  libaoshen
 * @description  获取第i小的元素
 * @createdDate  2017年8月30日 上午11:52:12 
 */
public class GetMinI {
	
	/**
	 * 获取第i小的元素
	 * @param A 原数组
	 * @param p 起点
	 * @param r 终点
	 * @param i 要获取的第i小的元素
	 * @return
	 */
	public int getMinI(int[] A, int p, int r, int i) {
		if(p == r) {
			return A[p];
		}
		
		//划分
		int q = randomPartition(A, p, r);
		int k = q - p + 1;
		if(k == i) {
			return A[q];
		}
		
		if(i < k) {
			return getMinI(A, p, q - 1, i);
		}else {
			return getMinI(A, q + 1, r, i - k);
		}
	}
	
	/**
	 * 划分函数
	 * @param A
	 * @param p
	 * @param r
	 * @return
	 */
	public int randomPartition(int[] A, int p, int r) {
		int i = p - 1;
		int max = A[r];
		
		for(int k = p; k < r; k++) {
			if(A[k] < max) {
				i++;
				int temp = A[k];
				A[k] = A[i];
				A[i] = temp;
			}
		}
		
		int temp = A[i + 1];
		A[i + 1] = max;
		A[r] = temp;
		
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] A = {12, 1, 24, 5, 17, 24, 2, 9, 34, 7};
		GetMinI getMinI = new GetMinI();
		int i = getMinI.getMinI(A, 0, A.length - 1, 3);
		System.out.println(i);
	}
}
