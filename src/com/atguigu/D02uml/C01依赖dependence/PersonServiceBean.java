package com.atguigu.D02uml.C01����dependence;

public class PersonServiceBean {
	
	// PersonDao
	private PersonDao personDao;

	// Person
	public void save(Person person) {
	}

	// IDCard
	public IDCard getIDCard(Integer personid) {
		return null;
	}

	// Department (Υ�������ط���)
	public void modify() {
		Department department = new Department();
	}

}
