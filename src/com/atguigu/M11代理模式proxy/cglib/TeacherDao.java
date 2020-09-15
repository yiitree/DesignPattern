package com.atguigu.M11代理模式proxy.cglib;

public class TeacherDao {
	
	public String teach(Integer a) {
		System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 " + a);
		return "hello";
	}
	
}
