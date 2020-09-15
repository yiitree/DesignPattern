package com.atguigu.M07装饰者模式decorator.咖啡;

import com.atguigu.M07装饰者模式decorator.Drink;

/**
 * 咖啡
 * @author 77270
 *
 */
public class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}
	
}
