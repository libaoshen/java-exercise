package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年5月17日 下午4:50:39 
 */
public class MapImpl<K,V> {
	private Object[][] pairs;
	private int index;
	public MapImpl(int length) {
		pairs = new Object[length][2];
	}
	
	public void put(K key, V value) {
		if(index > pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			pairs[index++] = new Object[]{key, value};
		}
	}

	@SuppressWarnings("unchecked")
	public V get(K key) {
		for(int i = 0; i < pairs.length; i++) {
			if(pairs[i][0].equals(key)) {
				return (V)pairs[i][1];
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i < index; i++) {
			sb.append("{" + pairs[i][0] + ":" + pairs[i][1] + "},");
		}
		sb.append("}]");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		MapImpl<String, Integer> age = new MapImpl<>(10);
		age.put("libaoshen", 22);
		age.put("wangtao", 26);
		age.put("zhangtianyu", 23);
		age.put("yanglin", 23);
		
		System.out.println(age);
	}
	
}
