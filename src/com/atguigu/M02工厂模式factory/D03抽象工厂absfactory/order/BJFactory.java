package com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.order;

import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.BJCheesePizza;
import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.BJPepperPizza;
import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.Pizza;

//这是工厂子类
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
