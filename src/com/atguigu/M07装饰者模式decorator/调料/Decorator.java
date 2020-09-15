package com.atguigu.M07װ����ģʽdecorator.����;

import com.atguigu.M07װ����ģʽdecorator.Drink;

/**
 * ���ϣ�װ���ߣ�
 * @author 77270
 *
 */
public class Decorator extends Drink {
	
	private Drink obj;
	
	//���
	public Decorator(Drink obj) { 
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// getPrice�Լ����ϵļ۸� + ��Ʒ���ȵļ۸�
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// �Լ����ϵ����� + obj.getDes() �����װ���ߵ���Ϣ
		return obj.getDes() + super.getDes();
	}
	
}
