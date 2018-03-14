package com.fhpt.java.pattern.template;
/** 
 * @author  libaoshen
 * @description  模板方法
 * @createdDate  2017年11月30日 下午5:08:49 
 */

abstract class Template {
	
	protected abstract void goA();
	
	protected abstract void goB();
	
	protected Boolean isGoShoping() {
		return true;
	}
	
	
	public void goHome() {
		this.goA();
		
		if(isGoShoping()) {
			this.goB();			
		}
	}
}

class Concrete1 extends Template {
	
	private Boolean isGoShoping = true;
	
	@Override
	protected void goA() {
		System.out.println("by bus");
	}
	
	@Override
	protected void goB() {
		System.out.println("by underground");
	}
	
	public void setGoShoping(Boolean goShoping) {
		this.isGoShoping = goShoping;
	}
	
	protected Boolean isGoShoping() {
		return this.isGoShoping;
	}
}

class Concrete2 extends Template {
	
	private Boolean isGoShoping = true;
	
	@Override
	protected void goA() {
		System.out.println("by boat");
	}
	
	@Override
	protected void goB() {
		System.out.println("bu airlines");
	}
	
	public void setGoShoping(Boolean goShoping) {
		this.isGoShoping = goShoping;
	}
	
	protected Boolean isGoShoping() {
		return this.isGoShoping;
	}
}

public class TemplateMethod {
	public static void main(String[] args) {
		Concrete1 temp1 = new Concrete1();
		Concrete2 temp2 = new Concrete2();
		
		temp1.setGoShoping(false);
		temp1.goHome();
		temp2.goHome();
	}
}
