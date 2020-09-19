package com.atguigu.M21策略模式strategy.improve.实体类;

import com.atguigu.M21策略模式strategy.improve.行为.飞.BadFlyBehavior;

public class PekingDuck extends Duck {

	/**
	 * 有些子类可能没有此方法，因此在构造函数中添加，并声明具体实现
	 */
	//假如北京鸭可以飞翔，但是飞翔技术一般
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
	}
	
	/**
	 * 都有的方法，但是实现不一样
	 */
	@Override
	public void display() {
		System.out.println("~~北京鸭~~~");
	}

}
