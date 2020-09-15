package com.atguigu.M08组合模式composite;

public abstract class OrganizationComponent {

	// 名字
	private String name; 
	// 说明
	private String des; 
	
	//构造器
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	
	// 方法print, 做成抽象的, 子类都需要实现
	//（写一个默认实现是为了：叶子节点是不需要add、remove方法的，所以这样就可以让叶子节点不需要重写这些方法了）
	protected abstract void print();
	
	//默认实现
	protected  void add(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	//默认实现
	protected  void remove(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
}
