package com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.order;

public class PizzaStore {

	public static void main(String[] args) {
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory(),"cheese");
		
	}

}
