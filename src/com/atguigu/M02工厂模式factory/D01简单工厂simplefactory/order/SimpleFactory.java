package com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.order;

import com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.pizza.CheesePizza;
import com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.pizza.GreekPizza;
import com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.pizza.PepperPizza;
import com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

	//更加orderType 返回对应的Pizza 对象
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}
	
	//简单工厂模式 也叫 静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式2");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
	}

}
