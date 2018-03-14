package com.fhpt.java.innerClass;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年9月25日 下午2:24:40 
 */

interface Base {
	void show(String label);
}

public class ScopeInnerClass {
	public Base show() {
		//在方法中使用内部类,该内部类只能在对应的作用域中使用
		class InnerClass implements Base {
			@Override
			public void show(String label) {
				System.out.println(label);
			}
		}
		
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		ScopeInnerClass scopeInnerClass = new ScopeInnerClass();
		scopeInnerClass.show().show("hello,world");
	}
}
