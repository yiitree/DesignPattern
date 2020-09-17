package com.atguigu.M14访问者模式visitor.人员;

import com.atguigu.M14访问者模式visitor.意见.Action;

public abstract class Person {
	
	//提供一个方法，让访问者可以访问
	public abstract void accept(Action action);
}
