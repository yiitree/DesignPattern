package com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.order;

import com.atguigu.M02����ģʽfactory.D03���󹤳�absfactory.pizza.Pizza;

//һ�����󹤳�ģʽ�ĳ����(�ӿ�)
public interface AbsFactory {
	//������Ĺ��������� ����ʵ��
	public Pizza createPizza(String orderType);
}
