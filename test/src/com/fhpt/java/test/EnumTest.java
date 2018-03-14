package com.fhpt.java.test;
/** 
 * @author  libaoshen
 * @description  枚举类
 * @createdDate  2017年12月14日 上午10:21:29 
 */

enum Planet {
	MARS(6.419E+23, 3.393E6) ,
	VENUS(4.869E+24, 6.052E6);
	
	private final double mass;
	private final double radius;
	private final double surfaceGravity;
	
	private static final double G = 6.67300E-11;
	
	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = G * mass / (radius * radius);
	}

	public double getMass() {
		return mass;
	}

	public double getRadius() {
		return radius;
	}

	public double getSurfaceGravity() {
		return surfaceGravity;
	}
	
	public double getSurfaceWeight() {
		return mass * surfaceGravity;
	}
}

// 使用枚举类实现计算器基本操作
enum CalculatorOperation {
	PLUS { @Override double apply(double x, double y) {return x + y;} }, 
	MINUS { @Override double apply(double x, double y) {return x - y;} }, 
	MULTIPLY { @Override double apply(double x, double y) {return x * y;} }, 
	SUBSTRACT { @Override double apply(double x, double y) {return x / y;} };
	
	abstract double apply(double x, double y);
}

public class EnumTest {
	public static void main(String[] args) {
//		double weight = Planet.MARS.getSurfaceWeight();
//		System.out.println(weight);
//		
//		for(Planet p : Planet.values()) {
//			System.out.println(p);
//			System.out.println(p.name());
//			System.out.println(p.ordinal());
//		}
		
		double result = CalculatorOperation.PLUS.apply(1, 2);
		System.out.println(result);
		System.out.println(1L << 63L);
	}
}
