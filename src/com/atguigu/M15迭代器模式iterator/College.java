package com.atguigu.M15������ģʽiterator;

import java.util.Iterator;

public interface College {

	// ѧԺ����
	public String getName();
	
	// ����ϵ�ķ���
	public void addDepartment(String name, String desc);
	
	// ���ش�ѧԺ�е� ϵ �ĵ�����
	public Iterator createIterator();
	
}
