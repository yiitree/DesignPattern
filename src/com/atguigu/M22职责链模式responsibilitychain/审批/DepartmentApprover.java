package com.atguigu.M22职责链模式responsibilitychain.审批;

import com.atguigu.M22职责链模式responsibilitychain.PurchaseRequest;

public class DepartmentApprover extends Approver {

	public DepartmentApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() <= 5000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}

}
