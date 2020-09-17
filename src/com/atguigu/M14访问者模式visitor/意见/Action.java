package com.atguigu.M14访问者模式visitor.意见;

import com.atguigu.M14访问者模式visitor.人员.Man;
import com.atguigu.M14访问者模式visitor.人员.Woman;

public abstract class Action {
	
	//得到 男 的测评
	public abstract void getManResult(Man man);
	
	//得到 女的测评
	public abstract void getWomanResult(Woman woman);
	
}
