package com.fhpt.java.pattern.decorator;
/** 
 * @author  libaoshen
 * @description  具体的装饰器,负责对核心发布的内容进行HTML格式化
 * @createdDate  2017年6月6日 上午10:23:35 
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {

	public PacketHTMLHeaderCreator(IPackageCreator c) {
		super(c);
	}

	@Override
	public String handleContent() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<body>");
		sb.append(component.handleContent());
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
}
