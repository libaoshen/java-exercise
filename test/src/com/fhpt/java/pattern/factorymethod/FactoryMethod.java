package com.fhpt.java.pattern.factorymethod;
/** 
 * @author  libaoshen
 * @description  描述信息
 * @createdDate  2017年11月29日 下午4:19:07 
 */

abstract class Product {
	public String getParentName() {
		return "product";
	}
	
	public abstract String getName();
}

class Product1 extends Product {
	@Override
	public String getName() {
		return "Product1";
	}
}

class Product2 extends Product {
	@Override
	public String getName() {
		return "Product2";
	}
}


abstract class CreateProduct {
	public abstract <T extends Product> T createProduct(Class<T> c);
}

class ConcreteCreateProduct extends CreateProduct {
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return (T)product;
	}
}

public class FactoryMethod {
	public static void main(String[] args) {
		CreateProduct createProduct = new ConcreteCreateProduct();
		Product p = createProduct.createProduct(Product1.class);
		System.out.println(p.getName());
	}
}
