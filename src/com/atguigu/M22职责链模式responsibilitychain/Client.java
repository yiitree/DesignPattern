package com.atguigu.M22职责链模式responsibilitychain;

import com.atguigu.M22职责链模式responsibilitychain.审批.CollegeApprover;
import com.atguigu.M22职责链模式responsibilitychain.审批.DepartmentApprover;
import com.atguigu.M22职责链模式responsibilitychain.审批.SchoolMasterApprover;
import com.atguigu.M22职责链模式responsibilitychain.审批.ViceSchoolMasterApprover;

public class Client {

	public static void main(String[] args) {
		
		//创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 20000, 2);
		
		//创建相关的审批人（层级 + 层级中每一个人员名称）
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
	
		//需要将各个审批级别的下一个设置好 (处理人构成环形: )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		// 进行审批
		departmentApprover.processRequest(purchaseRequest);
//		viceSchoolMasterApprover.processRequest(purchaseRequest);
		
	}

}
