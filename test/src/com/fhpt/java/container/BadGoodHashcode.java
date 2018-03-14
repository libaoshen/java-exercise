package com.fhpt.java.container;

import java.util.HashMap;

/** 
 * @author  libaoshen
 * @description  不同的hashcode方法,HashMap的效率也不一样
 * @createdDate  2017年6月6日 下午2:42:43 
 */
public class BadGoodHashcode {
	
	public static void main(String[] args) {
		HashMap<BadHash, Integer> map = new HashMap<BadHash, Integer>();
		Long begin = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			BadHash bh = new BadHash(1.0);
			map.put(bh, 1);
		}
		System.out.println("BasHash put time: " + (System.currentTimeMillis() - begin));
		
		begin = System.currentTimeMillis();
		HashMap<GoodHash, Integer> map2 = new HashMap<GoodHash, Integer>();
		for(int i = 0; i < 10000; i++) {
			GoodHash gh = new GoodHash(1.0);
			map2.put(gh, 1);
		}
		System.out.println("GoodHash put time: " + (System.currentTimeMillis() - begin));
		
		//获取
		begin = System.currentTimeMillis();
		for (BadHash bh : map.keySet()) {
			map.get(bh);
		}
		System.out.println("BasHash get time: " + (System.currentTimeMillis() - begin));
		
		begin = System.currentTimeMillis();
		for(GoodHash gh : map2.keySet()) {
			map2.get(gh);
		}
		System.out.println("GoodHash get time: " + (System.currentTimeMillis() - begin));
	}
}

class BadHash {
	double d;
	public BadHash(double d) {
		this.d = d;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}

class GoodHash {
	double d;
	public GoodHash(double d) {
		this.d = d;
	}
}
