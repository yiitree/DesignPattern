package com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.order;


import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.LDCheesePizza;
import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.LDPepperPizza;
import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.Pizza;


public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
