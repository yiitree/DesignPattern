package com.atguigu.M15������ģʽiterator.�����ѧԺ;

import java.util.Iterator;

import com.atguigu.M15������ģʽiterator.College;
import com.atguigu.M15������ģʽiterator.Department;

// �����ѧԺ
public class ComputerCollege implements College {

	Department[] departments;
	// ���浱ǰ����Ķ������(ϵ�ĸ���)
	int numOfDepartment = 0 ;
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Javaרҵ", " Javaרҵ ");
		addDepartment("PHPרҵ", " PHPרҵ ");
		addDepartment("������רҵ", " ������רҵ ");
	}
	
	@Override
	public String getName() {
		return "�����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[numOfDepartment] = department;
		numOfDepartment += 1;
	}

	/**
	 * ���ش�ѧԺ�е� ϵ �ĵ�����
	 */
	@Override
	public Iterator createIterator() {
		return new ComputerCollegeIterator(departments);
	}

}
