package com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.order;

import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.BJCheesePizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.BJPepperPizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.LDCheesePizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.LDPepperPizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.Pizza;


public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
