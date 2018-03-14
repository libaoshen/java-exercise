package com.fhpt.java.generic;
/** 
 * @author  libaoshen
 * @description  泛型实现二元组
 * @createdDate  2017年10月10日 上午9:24:04 
 */
public class Tuple<K, V> {
	
	private final K k;
	private final V v;
	
	public Tuple(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	public K getK() {
		return this.k;
	}
	
	public V getV() {
		return this.v;
	}
	
	public static <K, V> Tuple<K, V> tuple(K k, V v) {
		return new Tuple<K, V>(k, v);
	}
	
	@Override
	public String toString() {
		return "Tuple [k = " + k + ", v = " + v + "]";
	}
	
	public static void main(String[] args) {
		Tuple<String, Integer> firstTuple = Tuple.tuple("1", 2);
		System.out.println(firstTuple.toString());
	}
}
