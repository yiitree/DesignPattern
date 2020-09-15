package com.atguigu.M06桥接模式bridge;

public class Client {

	public static void main(String[] args) {
		
		//获取手机 (品牌)
		Brand x = new XiaoMi();
		x.open();
		x.call();
		x.close();
		
		System.out.println("==============");
		
		//获取折叠式手机 (样式 + 品牌)
		Phone phone1 = new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.call();
		phone1.close();
		
		System.out.println("=======================");
		
		Phone phone2 = new FoldedPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		
		System.out.println("==============");
		
		UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
		phone3.open();
		phone3.call();
		phone3.close();
		
		System.out.println("==============");
		
		UpRightPhone phone4 = new UpRightPhone(new Vivo());
		phone4.open();
		phone4.call();
		phone4.close();
		
		
	}

}
