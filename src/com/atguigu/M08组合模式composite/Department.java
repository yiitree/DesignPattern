package com.atguigu.M08���ģʽcomposite;

public class Department extends OrganizationComponent {

	//û�м���
	public Department(String name, String des) {
		super(name, des);
	}

	//add , remove �Ͳ���д�ˣ���Ϊ����Ҷ�ӽڵ�(��Ϊ���������Ѿ�ʹ��Ĭ��ʵ����)
	
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
