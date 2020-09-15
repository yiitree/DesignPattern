package com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atguigu.M02工厂模式factory.D01简单工厂simplefactory.pizza.Pizza;

public class OrderPizza {

	//定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//构造器 - 自动设置一个工厂
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	// 设置工厂
	// 聚合模式，需要传递所需要的的工厂，而不是直接new一个工厂
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //用户输入的
		this.simpleFactory = simpleFactory; //设置简单工厂对象
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			//输出pizza
			if(pizza != null) { //订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" 订购披萨失败 ");
				break;
			}
		}while(true);
	}
	
	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
