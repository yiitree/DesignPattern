package com.atguigu.M21����ģʽstrategy.improve.ʵ����;

import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.NoFlyBehavior;

public class ToyDuck extends Duck{
	
	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("���Ѽ");
	}

	//��Ҫ��д��������з���
	public void quack() {
		System.out.println("���Ѽ���ܽ�~~");
	}
	
	public void swim() {
		System.out.println("���Ѽ������Ӿ~~");
	}
	
}
