package com.fhpt.java.pattern.decorator;
/** 
 * @author  libaoshen
 * @description  为具体组件加入http头
 * @createdDate  2017年6月6日 上午10:27:23 
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {

	public PacketHTTPHeaderCreator(IPackageCreator c) {
		super(c);
	}

	@Override
	public String handleContent() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Cache-Control:no-cache\n");
		sb.append("Date:Mon, 31Dec201204:25:57GMT\n");
		sb.append(component.handleContent());
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		IPackageCreator pc = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PackageBodyCreator()));
		
		System.out.println(pc.handleContent());
	}
}
