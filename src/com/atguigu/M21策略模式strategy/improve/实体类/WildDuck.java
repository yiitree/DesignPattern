package com.atguigu.M21����ģʽstrategy.improve.ʵ����;

import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.GoodFlyBehavior;

public class WildDuck extends Duck {
	
	//������������FlyBehavor �Ķ���
	public  WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println(" ����ҰѼ ");
	}

}
