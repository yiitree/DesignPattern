package com.atguigu.M07װ����ģʽdecorator.����;

import com.atguigu.M07װ����ģʽdecorator.Drink;

//�����Decorator�� ������ǵ�ζƷ
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" �ɿ��� ");
		setPrice(3.0f); // ��ζƷ �ļ۸�
	}

}
