package com.fhpt.java.algorithms;
/** 
 * @author  libaoshen
 * @description  会飞的猪:给定每天的股票交易金额,只能交易两次,即两次的买入卖出机会,求能获取的最大收益
 * @createdDate  2017年8月31日 上午9:56:59 
 */
public class FlyPig {
	//求最大和子数组
	public int[] getMaxSubArray(int[] A, int p, int q) {
		if(p == q) {
			int[] result = new int[3];
			result[0] = A[p];
			result[1] = p;
			result[2] = q;
			return result;
		}
		
		//求中点
		int mid = (int)Math.floor((p+q)/2.0);
		
		int[] sum1 = getMaxCrossMid(A, p, q, mid);
		int[] sum2 = getMaxSubArray(A, p, mid);
		int[] sum3 = getMaxSubArray(A, mid+1, q);
		
		if(sum1[0] > sum2[0] && sum1[0] > sum3[0]) {
			return sum1;
		}
		if(sum2[0] > sum1[0] && sum2[0] > sum3[0]) {
			return sum2;
		}
		
		return sum3;
	}
	
	//求跨越中点的最大和子数组
	public int[] getMaxCrossMid(int[] A, int p, int q, int mid) {
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		int leftIndex = mid;
		int rightIndex = mid;
		
		for(int i = mid; i >= p; i--) {
			sum += A[i];
			if(sum > leftSum) {
				leftSum = sum;
				leftIndex = i;
			}
		}
		
		int rightSum = Integer.MIN_VALUE;
		sum = 0;
		
		for(int i = mid + 1; i <= q; i++) {
			sum += A[i];
			if(sum > rightSum) {
				rightSum = sum;
				rightIndex = i;
			}
		}
		
		int[] result = new int[3];
		result[0] = leftSum + rightSum;
		result[1] = leftIndex;
		result[2] = rightIndex;
		
		return result;
	}
	//求最优的结果
	public int[] getOptim(int[] A) {
		int sum = 0;
		int[] result = new int[5]; 
		result[0] = Integer.MIN_VALUE;
		for(int i = 0; i < A.length - 1; i++) {
			for(int j = i; j < A.length - 1; j++) {
				int first = 0;
				for(int k = i; k <=j; k++) {
					first += A[k];
				}
				
				int[] second = getMaxSubArray(A, j+1, A.length-1);
				sum = first + second[0];
				
				if(sum > result[0]) {
					result[0] = sum;
					result[1] = i;
					result[2] = j;
					result[3] = second[1];
					result[4] = second[2];
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] A = {3,8,5,2,7,8,20,12,14,66,56,57,50,48,61,31,58,52,42,57,58,60,62,64,66,56,57,50,48,40};
		long begin = System.currentTimeMillis();
		int[] B = new int[A.length-1];
		for(int i = 0; i < B.length; i++) {
			B[i] = A[i+1] - A[i];
		}
		FlyPig flyPig = new FlyPig();
		int[] result = flyPig.getOptim(B);
		
		result[2] += 1;
		result[4] += 1;
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - begin);
	}
}
