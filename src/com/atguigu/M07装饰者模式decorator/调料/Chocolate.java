package com.atguigu.M07装饰者模式decorator.调料;

import com.atguigu.M07装饰者模式decorator.Drink;

//具体的Decorator， 这里就是调味品
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" 巧克力 ");
		setPrice(3.0f); // 调味品 的价格
	}

}
