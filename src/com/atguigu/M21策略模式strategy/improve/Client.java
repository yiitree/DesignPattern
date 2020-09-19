package com.atguigu.M21策略模式strategy.improve;

import com.atguigu.M21策略模式strategy.improve.实体类.PekingDuck;
import com.atguigu.M21策略模式strategy.improve.实体类.ToyDuck;
import com.atguigu.M21策略模式strategy.improve.实体类.WildDuck;
import com.atguigu.M21策略模式strategy.improve.行为.飞.NoFlyBehavior;

public class Client {

	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		
		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("北京鸭的实际飞翔能力");
		pekingDuck.fly();
	}

}
