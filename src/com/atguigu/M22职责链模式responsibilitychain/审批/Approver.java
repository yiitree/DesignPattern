package com.atguigu.M22ְ����ģʽresponsibilitychain.����;

import com.atguigu.M22ְ����ģʽresponsibilitychain.PurchaseRequest;

/**
 * ������
 */
public abstract class Approver {

	// ��ǰ��������������
	String name;
	// ��һ��������
	Approver approver;
	
	// ������һ��������Ա����
	public Approver(String name) {
		this.name = name;
	}
	
	// ������������ķ������õ�һ������, ������������ɣ���˸÷������ɳ���
	public abstract void processRequest(PurchaseRequest purchaseRequest);

	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
}
