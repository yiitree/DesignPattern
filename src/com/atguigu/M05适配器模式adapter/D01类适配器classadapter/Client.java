package com.atguigu.M05适配器模式adapter.D01类适配器classadapter;

public class Client {

	public static void main(String[] args) {
		System.out.println(" === 类适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
