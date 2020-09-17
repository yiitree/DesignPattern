package com.atguigu.M15迭代器模式iterator.信息学院;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.atguigu.M15迭代器模式iterator.College;
import com.atguigu.M15迭代器模式iterator.Department;

// 信息工程学院
public class InfoCollege implements College {

	List<Department> departmentList;
	
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("信息安全专业", " 信息安全专业 ");
		addDepartment("网络安全专业", " 网络安全专业 ");
		addDepartment("服务器安全专业", " 服务器安全专业 ");
	}
	
	@Override
	public String getName() {
		return "信息工程学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	/**
	 * 返回此学院中的 系 的迭代器
	 */
	@Override
	public Iterator createIterator() {
		return new InfoColleageIterator(departmentList);
	}

}
