package com.atguigu.M15������ģʽiterator.��ϢѧԺ;

import java.util.Iterator;
import java.util.List;

import com.atguigu.M15������ģʽiterator.Department;

// ��Ϣ����ѧԺ
public class InfoColleageIterator implements Iterator {
	
	// ��Ϣ����ѧԺ����List��ʽ���ϵ
	List<Department> departmentList; 
	//����
	int index = -1;
	
	public InfoColleageIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	//�ж�list�л���û����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if(index >= departmentList.size() - 1) {
			return false;
		} else {
			index += 1;
			return true;
		}
	}

	@Override
	public Object next() {
		return departmentList.get(index);
	}
	
	//��ʵ��remove
	public void remove() {
		
	}

}
