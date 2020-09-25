package com.atguigu.M02工厂模式factory.D03抽象工厂absfactory.order;

public class PizzaStore {

	public static void main(String[] args) {
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory(),"cheese");
		
	}

}
