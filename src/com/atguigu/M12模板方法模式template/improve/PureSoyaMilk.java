package com.atguigu.M12模板方法模式template.improve;

public class PureSoyaMilk extends SoyaMilk{

	// 不需要添加调料，就来一个空实现
	@Override
	void addCondiments() {
		//空实现
	}
	
	// 把钩子方法返回false，进行调用方法的时候就可以跳过这一步骤
	@Override
	boolean customerWantCondiments() {
		return false;
	}
 
}
