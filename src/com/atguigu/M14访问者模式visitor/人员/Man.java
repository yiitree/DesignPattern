package com.atguigu.M14������ģʽvisitor.��Ա;

import com.atguigu.M14������ģʽvisitor.���.Action;

public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}
