package com.fhpt.java.innerClass;
/** 
 * @author  libaoshen
 * @description  内部类:
 *  1.为什么要用到内部类?
 *  2.内部类用法
 *  3.内部类注意事项
 * @createdDate  2017年9月25日 上午11:24:55 
 */
public class FirstInnerClass {
	class First {
		String label = "李宝深";
		
		public void showLabel() {
			System.out.println("First ==> " + label);
		}
	}
	
	class Second {
		String label;
		
		public Second(String label) {
			this.label = label;
		}
		
		public void showLabel() {
			System.out.println("Second ==>" + label);
		}
	}
	
	public First newFirst() {
		return new First();
	}
	
	public Second newSecond(String label) {
		return new Second(label);
	}
	
	public void showLabel(String label) {
		First first = newFirst();
		Second second = newSecond(label);
		
		first.showLabel();
		second.showLabel();
	}
	
	public static void main(String[] args) {
		FirstInnerClass firstInnerClass = new FirstInnerClass();
		firstInnerClass.showLabel("第一个内部类");
		
		FirstInnerClass.First first = firstInnerClass.newFirst();
		FirstInnerClass.Second second = firstInnerClass.newSecond("修改完的内部类");
		
		first.showLabel();
		second.showLabel();
	}
}
