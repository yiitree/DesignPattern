package com.atguigu.M05适配器模式adapter.D02对象适配器objectadapter;

public class Client {

	public static void main(String[] args) {
		System.out.println(" === 对象适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
//		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
