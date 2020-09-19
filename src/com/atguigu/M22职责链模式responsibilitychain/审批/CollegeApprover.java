package com.atguigu.M22职责链模式responsibilitychain.审批;

import com.atguigu.M22职责链模式responsibilitychain.PurchaseRequest;

public class CollegeApprover extends Approver {

	// 当前处理人员名称
	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
	
}
