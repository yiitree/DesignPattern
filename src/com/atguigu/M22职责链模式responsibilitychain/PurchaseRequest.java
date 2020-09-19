package com.atguigu.M22职责链模式responsibilitychain;

//请求类
public class PurchaseRequest {

	//请求类型
	private int type = 0; 
	//请求金额
	private float price = 0.0f;
	//请求的编号
	private int id = 0;
	
	//构造器
	public PurchaseRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}
	
	public int getType() {
		return type;
	}
	public float getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	
}
