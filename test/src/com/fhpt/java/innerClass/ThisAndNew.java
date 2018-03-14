package com.fhpt.java.innerClass;
/** 
 * @author  libaoshen
 * @description  内部类中的.this和.new用法
 * @createdDate  2017年9月25日 下午1:48:19 
 */
public class ThisAndNew {
	
	private class First {
		
		//返回outer类对象
		public ThisAndNew outer() {
			//在内部类中通过ThisAndNew.this来获取外部类对象
			return ThisAndNew.this;
		}
		
	}
	
	
	public First inner() {
		return new First();
	}
	
	public void show() {
		System.out.println("Hello, innerClass");
	}
	
	public static void main(String[] args) {
		ThisAndNew thisAndNew = new ThisAndNew();
		First first = thisAndNew.inner();
		
		first.outer().show();
		
		//使用.new用法,创建内部类对象
		First second = thisAndNew.new First();
		second.outer().show();
	}
	
}
