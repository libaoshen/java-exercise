package com.fhpt.java.enums;
/** 
 * @author  libaoshen
 * @description  枚举
 * @createdDate  2017年7月20日 下午3:50:50 
 */
public enum SingleColor {
	/**
	 * 1.枚举也是一个类,关键字是enum,当编译执行时,就会生成一个继承于java.lang.enum的类
	 * 2.枚举分成两部分,一部分是枚举实例,本质上是final static变量,必须最先定义,并且如果需要添加方法,实例必须以;结束;另一部分是对这些实例的操作,
	 * 包括构造器\setter\getter等其他方法
	 * 3.enum中常用的方法:values 获得包含所有枚举实例的数组; valueOf 通过枚举实例名或枚举实例; name 获取枚举实例的名称;
	 * ordinal 获取枚举实例的序(从0开始);
	 */
	RED(1, "红色"), BLUE(2, "蓝色"), YELLOW(3, "黄色");
	
	private int code;
	private String desc;
	/**
	 * 私有构造器
	 * @param code
	 * @param desc
	 */
	private SingleColor(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	
	
	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public static void main(String[] args) {
		for(SingleColor color : SingleColor.values()) {
			System.out.println(color.getCode() + ":" + color.getDesc());
			System.out.println(color.ordinal());
			System.out.println(color.name());
			//System.out.println(color.valueOf("RED"));
			System.out.println(SingleColor.values()[0]);
			
		}
	}
}
