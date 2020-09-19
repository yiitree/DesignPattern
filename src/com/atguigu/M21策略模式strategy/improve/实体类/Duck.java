package com.atguigu.M21����ģʽstrategy.improve.ʵ����;

import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.QuackBehavior;
import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.FlyBehavior;

public abstract class Duck {
	
	public Duck() {}
	
	/**
	 * 1�����еķ�������ʵ��һ��
	 * ֱ��д����
	 */
	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}
	
	/**
	 * 2�����еķ�������ʵ�ֲ�һ��
	 * дһ���ӿڣ����඼��Ҫʵ��
	 */
	//��ʾѼ����Ϣ
	public abstract void display();
	
	/**
	 * 3����Щ�������û�д˷���
	 * ���Խӿ�
	 * ��ʵ�����Զ���ӿڣ�ÿ������ʵ�ַ������ܲ�һ��
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
	 * ��������set�����������Ϳ����ڵ��õ�ʱ��ʹ�������ڲ���ֱ����д����
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
