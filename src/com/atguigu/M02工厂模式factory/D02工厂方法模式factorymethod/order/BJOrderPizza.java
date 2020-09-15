package com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.order;

import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.BJCheesePizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.BJPepperPizza;
import com.atguigu.M02工厂模式factory.D02工厂方法模式factorymethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
