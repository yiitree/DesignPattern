package com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.order;

import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.BJCheesePizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.BJPepperPizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.LDCheesePizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.LDPepperPizza;
import com.atguigu.M02����ģʽfactory.D02��������ģʽfactorymethod.pizza.Pizza;


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
