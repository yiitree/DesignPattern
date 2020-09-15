package com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.order;

import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.BJCheesePizza;
import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.BJPepperPizza;
import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.Pizza;

//���ǹ�������
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
