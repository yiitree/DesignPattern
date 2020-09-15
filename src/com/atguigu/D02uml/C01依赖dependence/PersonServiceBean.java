package com.atguigu.D02uml.C01依赖dependence;

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

	// Department (违反迪米特法则)
	public void modify() {
		Department department = new Department();
	}

}
