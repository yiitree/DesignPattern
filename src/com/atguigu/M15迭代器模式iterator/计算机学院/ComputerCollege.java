package com.atguigu.M15迭代器模式iterator.计算机学院;

import java.util.Iterator;

import com.atguigu.M15迭代器模式iterator.College;
import com.atguigu.M15迭代器模式iterator.Department;

// 计算机学院
public class ComputerCollege implements College {

	Department[] departments;
	// 保存当前数组的对象个数(系的个数)
	int numOfDepartment = 0 ;
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Java专业", " Java专业 ");
		addDepartment("PHP专业", " PHP专业 ");
		addDepartment("大数据专业", " 大数据专业 ");
	}
	
	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[numOfDepartment] = department;
		numOfDepartment += 1;
	}

	/**
	 * 返回此学院中的 系 的迭代器
	 */
	@Override
	public Iterator createIterator() {
		return new ComputerCollegeIterator(departments);
	}

}
