package com.atguigu.M12ģ�巽��ģʽtemplate.improve;

public class Client {

	public static void main(String[] args) {
		//�����춹����
		System.out.println("----�����춹����----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("----������������----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		
		System.out.println("----����������----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
