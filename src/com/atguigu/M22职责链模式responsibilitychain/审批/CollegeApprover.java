package com.atguigu.M22ְ����ģʽresponsibilitychain.����;

import com.atguigu.M22ְ����ģʽresponsibilitychain.PurchaseRequest;

public class CollegeApprover extends Approver {

	// ��ǰ������Ա����
	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
			System.out.println(" ������ id= " + purchaseRequest.getId() + " �� " + this.name + " ����");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
	
}
