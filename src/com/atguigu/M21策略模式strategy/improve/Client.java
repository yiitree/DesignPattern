package com.atguigu.M21����ģʽstrategy.improve;

import com.atguigu.M21����ģʽstrategy.improve.ʵ����.PekingDuck;
import com.atguigu.M21����ģʽstrategy.improve.ʵ����.ToyDuck;
import com.atguigu.M21����ģʽstrategy.improve.ʵ����.WildDuck;
import com.atguigu.M21����ģʽstrategy.improve.��Ϊ.��.NoFlyBehavior;

public class Client {

	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		
		//��̬�ı�ĳ���������Ϊ, ����Ѽ ���ܷ�
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("����Ѽ��ʵ�ʷ�������");
		pekingDuck.fly();
	}

}
