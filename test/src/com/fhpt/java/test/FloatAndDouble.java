package com.fhpt.java.test;

import java.math.BigDecimal;
import java.math.BigInteger;

/** 
 * @author  libaoshen
 * @description  float和double
 * @createdDate  2017年12月18日 上午11:39:29 
 */
public class FloatAndDouble {
	public static void main(String[] args) {
		float f1 = 1.1f;
		float f2 = 1.0f;
		// float和double都是近似计算值
		System.out.println(f2 - f1);
		
		// 使用BigDecimal
		BigDecimal bigDecimal1 = new BigDecimal("1.12");
		BigDecimal bigDecimal2 = new BigDecimal("1.01");
		BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
		System.out.println(subtract);
	}
}
