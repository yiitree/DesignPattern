package com.atguigu.M07装饰者模式decorator.调料;

import com.atguigu.M07装饰者模式decorator.Drink;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
