package com.atguigu.M21策略模式strategy.improve.实体类;

import com.atguigu.M21策略模式strategy.improve.行为.飞.NoFlyBehavior;

public class ToyDuck extends Duck{
	
	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

	//需要重写父类的所有方法
	public void quack() {
		System.out.println("玩具鸭不能叫~~");
	}
	
	public void swim() {
		System.out.println("玩具鸭不会游泳~~");
	}
	
}
