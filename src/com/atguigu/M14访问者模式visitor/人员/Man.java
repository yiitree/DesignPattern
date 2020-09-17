package com.atguigu.M14访问者模式visitor.人员;

import com.atguigu.M14访问者模式visitor.意见.Action;

public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}
