package com.fhpt.java.innerClass;
/** 
 * @author  libaoshen
 * @description  使用内部类实现一个迭代器
 * @createdDate  2017年9月25日 上午11:42:44 
 */

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object o) {
		if(next < items.length) {
			items[next++] = o;
		}
	}
	
	private class SelectedSequence implements Selector {
		private int i = 0;
		@Override
		public Object current() {
			return items[i];
		}
		@Override
		public boolean end() {
			return i == items.length;
		}
		@Override
		public void next() {
			if(i < items.length) {
				i++;
			}
		}
	}
	
	public Selector selector() {
		return new SelectedSequence();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++ ) {
			sequence.add(Integer.valueOf(i));
		}
		
		Selector selector = sequence.selector();
		//遍历
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}
