package com.atguigu.M05������ģʽadapter.D01��������classadapter;

public class Client {

	public static void main(String[] args) {
		System.out.println(" === ��������ģʽ ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
