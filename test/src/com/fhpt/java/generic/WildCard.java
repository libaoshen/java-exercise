package com.fhpt.java.generic;

import java.util.Arrays;
import java.util.List;

/** 
 * @author  libaoshen
 * @description  通配符
 * @createdDate  2018年1月5日 上午10:13:20 
 */

class Fruit {
	
}

class Apple extends Fruit {
	
}

class Orange extends Fruit {
	
}

public class WildCard {
	static List<Apple> apples = Arrays.asList(new Apple());
	static List<Fruit> fruit = Arrays.asList(new Fruit());
	
	static class Reader<T> {
		// 通配符?:代表任何类型，这里加入了一个下界限制
		T readExact(List<? extends T> list) {
			return list.get(0);
		}
	}
	
	static void f1() {
		Reader<Fruit> fruitReader = new Reader<>();
//		Fruit f = fruitReader.readExact(fruit);
		Fruit f = fruitReader.readExact(apples);
	}
	
	public static void main(String[] args) {
		f1();
	}
}
