package com.atguigu.M22ְ����ģʽresponsibilitychain;

import com.atguigu.M22ְ����ģʽresponsibilitychain.����.CollegeApprover;
import com.atguigu.M22ְ����ģʽresponsibilitychain.����.DepartmentApprover;
import com.atguigu.M22ְ����ģʽresponsibilitychain.����.SchoolMasterApprover;
import com.atguigu.M22ְ����ģʽresponsibilitychain.����.ViceSchoolMasterApprover;

public class Client {

	public static void main(String[] args) {
		
		//����һ������
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 20000, 2);
		
		//������ص������ˣ��㼶 + �㼶��ÿһ����Ա���ƣ�
		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("١У��");
	
		//��Ҫ�����������������һ�����ú� (�����˹��ɻ���: )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		// ��������
		departmentApprover.processRequest(purchaseRequest);
//		viceSchoolMasterApprover.processRequest(purchaseRequest);
		
	}

}
