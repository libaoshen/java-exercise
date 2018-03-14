package com.fhpt.java.innerClass;

/** 
 * @author  libaoshen
 * @description  匿名内部类:匿名内部类包含两个不封：匿名和内部类
 * 				   匿名代表其没有名字;匿名内部类等同于创建了一个实现或继承了某个类的新类
 * @createdDate  2017年9月25日 下午2:33:51 
 */

class Show {
	public void show(){}
}

public class FirstAnonymousClass {
	public Show show() {
		return new Show() {
			String label = "第一个匿名内部类";
			public void show() {
				System.out.println(label);
			}
		};
	} 
	
	public static void main(String[] args) {
		FirstAnonymousClass firstAnonymousClass = new FirstAnonymousClass();
		firstAnonymousClass.show().show();
		
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(10);
//		list.add(20);
//		
//		list.sort(new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				return o2;}
//		});
	}
}
