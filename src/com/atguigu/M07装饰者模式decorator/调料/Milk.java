package com.atguigu.M07װ����ģʽdecorator.����;

import com.atguigu.M07װ����ģʽdecorator.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes(" ţ�� ");
		setPrice(2.0f); 
	}

}
