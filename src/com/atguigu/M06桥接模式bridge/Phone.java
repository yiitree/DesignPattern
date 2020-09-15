package com.atguigu.M06�Ž�ģʽbridge;

/**
 * �ֻ��У�Ʒ�ơ��������ػ�����绰
 * @author 77270
 *
 */
public abstract class Phone {
	
	//���Ʒ��
	private Brand brand;

	//������
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
