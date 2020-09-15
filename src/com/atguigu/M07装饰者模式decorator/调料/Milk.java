package com.atguigu.M07装饰者模式decorator.调料;

import com.atguigu.M07装饰者模式decorator.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes(" 牛奶 ");
		setPrice(2.0f); 
	}

}
