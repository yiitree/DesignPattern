package com.atguigu.M21策略模式strategy.improve.实体类;

import com.atguigu.M21策略模式strategy.improve.行为.飞.GoodFlyBehavior;

public class WildDuck extends Duck {
	
	//构造器，传入FlyBehavor 的对象
	public  WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println(" 这是野鸭 ");
	}

}
