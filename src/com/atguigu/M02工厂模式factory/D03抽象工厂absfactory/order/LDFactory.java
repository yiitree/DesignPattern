package com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.order;


import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.LDCheesePizza;
import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.LDPepperPizza;
import com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.pizza.Pizza;


public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~使用的是抽象工厂模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
