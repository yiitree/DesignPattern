package com.atguigu.M15迭代器模式iterator;

import java.util.Iterator;

public interface College {

	// 学院名称
	public String getName();
	
	// 增加系的方法
	public void addDepartment(String name, String desc);
	
	// 返回此学院中的 系 的迭代器
	public Iterator createIterator();
	
}
