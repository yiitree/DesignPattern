package com.atguigu.M15������ģʽiterator.�����ѧԺ;

import java.util.Iterator;

import com.atguigu.M15������ģʽiterator.Department;

public class ComputerCollegeIterator implements Iterator {

	//����������ҪDepartment ���������ķ�ʽ���=>����
	Department[] departments;
	//������λ��
	int position = 0; 
	
	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}

	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if(position >= departments.length || departments[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		Department department = departments[position];
		position += 1;
		return department;
	}
	
	//ɾ���ķ�����Ĭ�Ͽ�ʵ��
	public void remove() {
	}

}
