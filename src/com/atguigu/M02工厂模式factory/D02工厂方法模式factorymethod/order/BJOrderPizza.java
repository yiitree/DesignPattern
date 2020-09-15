package com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.order;

import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.BJCheesePizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.BJPepperPizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.Pizza;


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
