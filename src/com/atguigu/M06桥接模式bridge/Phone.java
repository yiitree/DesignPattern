package com.atguigu.M06桥接模式bridge;

/**
 * 手机有：品牌、开机、关机、打电话
 * @author 77270
 *
 */
public abstract class Phone {
	
	//组合品牌
	private Brand brand;

	//构造器
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
