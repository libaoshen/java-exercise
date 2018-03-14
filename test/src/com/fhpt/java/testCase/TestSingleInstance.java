package com.fhpt.java.testCase;


import org.junit.Assert;
import org.junit.Test;

import com.fhpt.java.pattern.singleInstance.SingleInstance;


/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月29日 下午5:16:27 
 */
public class TestSingleInstance {

	@Test
	public void test() {
		// arrange 计划
		SingleInstance singleInstance = SingleInstance.getSingleInstance();
		SingleInstance singleInstance2 = SingleInstance.getSingleInstance();
		// act 执行
		boolean flag = singleInstance == singleInstance2;
		// assert 断言
		Assert.assertEquals(true, flag);
		
	}

}
