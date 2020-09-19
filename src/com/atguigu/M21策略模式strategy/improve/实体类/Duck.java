package com.atguigu.M21策略模式strategy.improve.实体类;

import com.atguigu.M21策略模式strategy.improve.行为.叫.QuackBehavior;
import com.atguigu.M21策略模式strategy.improve.行为.飞.FlyBehavior;

public abstract class Duck {
	
	public Duck() {}
	
	/**
	 * 1、都有的方法，且实现一样
	 * 直接写即可
	 */
	public void swim() {
		System.out.println("鸭子会游泳~~");
	}
	
	/**
	 * 2、都有的方法，但实现不一样
	 * 写一个接口，子类都需要实现
	 */
	//显示鸭子信息
	public abstract void display();
	
	/**
	 * 3、有些子类可能没有此方法
	 * 策略接口
	 * 其实就是自定义接口，每个具体实现方法可能不一样
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void quack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}
	}
	
	public void fly() {
		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	/**
	 * 可以设置set方法，这样就可以在调用的时候使用匿名内部类直接重写方法
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
