package com.atguigu.M21����ģʽstrategy.improve.ʵ����;

import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.BadFlyBehavior;

public class PekingDuck extends Duck {

	/**
	 * ��Щ�������û�д˷���������ڹ��캯������ӣ�����������ʵ��
	 */
	//���籱��Ѽ���Է��裬���Ƿ��輼��һ��
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
	}
	
	/**
	 * ���еķ���������ʵ�ֲ�һ��
	 */
	@Override
	public void display() {
		System.out.println("~~����Ѽ~~~");
	}

}
