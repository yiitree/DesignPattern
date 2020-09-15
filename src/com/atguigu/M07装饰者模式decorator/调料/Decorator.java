package com.atguigu.M07装饰者模式decorator.调料;

import com.atguigu.M07装饰者模式decorator.Drink;

/**
 * 调料（装饰者）
 * @author 77270
 *
 */
public class Decorator extends Drink {
	
	private Drink obj;
	
	//组合
	public Decorator(Drink obj) { 
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// getPrice自己调料的价格 + 单品咖啡的价格
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// 自己调料的描述 + obj.getDes() 输出被装饰者的信息
		return obj.getDes() + super.getDes();
	}
	
}
