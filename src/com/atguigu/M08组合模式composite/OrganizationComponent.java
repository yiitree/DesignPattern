package com.atguigu.M08���ģʽcomposite;

public abstract class OrganizationComponent {

	// ����
	private String name; 
	// ˵��
	private String des; 
	
	//������
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	
	// ����print, ���ɳ����, ���඼��Ҫʵ��
	//��дһ��Ĭ��ʵ����Ϊ�ˣ�Ҷ�ӽڵ��ǲ���Ҫadd��remove�����ģ����������Ϳ�����Ҷ�ӽڵ㲻��Ҫ��д��Щ�����ˣ�
	protected abstract void print();
	
	//Ĭ��ʵ��
	protected  void add(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	//Ĭ��ʵ��
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
