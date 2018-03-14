package com.fhpt.java.jvm;
/** 
 * @author  libaoshen
 * @description  java类加载验证
 * @createdDate  2017年12月29日 上午10:30:04 
 */

/**
 * 主动触发和被动触发
 * java类加载的基本流程：加载->验证->准备->解析->初始化->卸载
 * *jvm只规范了java类初始化的触发事件：
 * 1.new一个class,读取或设置一个静态字段(final除外),调用一个静态方法；
 * 2.使用reflect包进行反射创对象时；
 * 3.初始化子类时，如果父类没有初始化，则初始化父类；
 * 4.虚拟机启动时会初始化
 * 
 * @author fhpt
 *
 */

class SuperClass {
	static {
		System.out.println("SuperClass init!");
	}
	
	public static int value = 128;
}

class SubClass extends SuperClass {
	static {
		System.out.println("SubClass init!");
	}
}

/**
 * 调用静态字段，只会触发直接定义该静态字段的类的初始化操作，所以可以看到只有父类被初始化了
 * @author fhpt
 *
 */
public class ClassLoadTest {
	public static void main(String[] args) {
		System.out.println(SubClass.value);
	}
}
