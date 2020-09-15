package com.atguigu.M08组合模式composite;

public class Department extends OrganizationComponent {

	//没有集合
	public Department(String name, String des) {
		super(name, des);
	}

	//add , remove 就不用写了，因为他是叶子节点(因为父方法中已经使用默认实现了)
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getDes() {
		return super.getDes();
	}
	
	@Override
	protected void print() {
		System.out.println(getName());
	}

}
