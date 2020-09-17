package com.atguigu.M15������ģʽiterator.��ϢѧԺ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.atguigu.M15������ģʽiterator.College;
import com.atguigu.M15������ģʽiterator.Department;

// ��Ϣ����ѧԺ
public class InfoCollege implements College {

	List<Department> departmentList;
	
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("��Ϣ��ȫרҵ", " ��Ϣ��ȫרҵ ");
		addDepartment("���簲ȫרҵ", " ���簲ȫרҵ ");
		addDepartment("��������ȫרҵ", " ��������ȫרҵ ");
	}
	
	@Override
	public String getName() {
		return "��Ϣ����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	/**
	 * ���ش�ѧԺ�е� ϵ �ĵ�����
	 */
	@Override
	public Iterator createIterator() {
		return new InfoColleageIterator(departmentList);
	}

}
