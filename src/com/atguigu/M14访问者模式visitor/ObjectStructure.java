package com.atguigu.M14访问者模式visitor;

import java.util.LinkedList;
import java.util.List;

import com.atguigu.M14访问者模式visitor.人员.Person;
import com.atguigu.M14访问者模式visitor.意见.Action;

//数据结构，管理很多人（Man , Woman）
public class ObjectStructure {

	//维护了一个集合
	private List<Person> persons = new LinkedList<>();
	
	//增加到list
	public void attach(Person p) {
		persons.add(p);
	}
	
	//移除
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//显示测评情况
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
