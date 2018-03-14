package com.fhpt.java.wrapper;
/** 
 * @author  libaoshen
 * @description  基本类型的包装类使用
 * @createdDate  2017年9月27日 上午9:14:32 
 */
public class WrapperClass {
	public static void main(String[] args) {
		//装箱操作
		//装箱操作是通过编译器实现的,编译期会调用Integer.valueOf()方法来装箱,
		//通过观察valueOf()方法的源码可以看到,数值在-128~127之间的会直接使用IntegerCache.cache数组中的值
		//范围之外的新创建一个Integer对象
		Integer i1 = 100;
		Integer i2 = 100;
		
		Integer j1 = 200;
		Integer j2 = 200;
		
		System.out.println(i1 == i2);
		System.out.println(j1 == j2);
		
		//Double
		Double d1 = 100.0;
		Double d2 = 100.0;
		
		Double d3 = 200.0;
		Double d4 = 200.0;
		
		System.out.println(d1 == d2);
		System.out.println(d3 == d4);
		//装箱逻辑分为三类:
		//1.Integer,Short,Byte,Character,Long
		//2. Double,Float 正常逻辑,创建一个新对象
		//3. Boolean
		//Boolean.valueOf()的原理是返回一个静态常量Boolean对象
		Boolean b1 = false;
		Boolean b2 = false;
		
		System.out.println(b1 == b2);
		
		
		//==和equals
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Long e = 3L;
		Long f = 2L;
		
		System.out.println("=============");
		System.out.println(c == d);
		System.out.println(c.equals(d));
		System.out.println(c == (a + b));
		System.out.println(c.equals(a + b));
		System.out.println(e == (a + b));
		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		System.out.println("==============");
		System.out.println(a == 1);
		System.out.println(e == 3);
		
	}
}
