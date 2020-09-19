package com.atguigu.M22职责链模式responsibilitychain.审批;

import com.atguigu.M22职责链模式responsibilitychain.PurchaseRequest;

/**
 * 处理流
 */
public abstract class Approver {

	// 当前流程审批人姓名
	String name;
	// 下一个处理流
	Approver approver;
	
	// 传递下一个处理人员名称
	public Approver(String name) {
		this.name = name;
	}
	
	// 处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
	public abstract void processRequest(PurchaseRequest purchaseRequest);

	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
}
