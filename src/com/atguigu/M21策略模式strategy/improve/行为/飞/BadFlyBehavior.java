package com.atguigu.M21策略模式strategy.improve.行为.飞;

public class BadFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" 飞翔技术一般 ");
	}
}
