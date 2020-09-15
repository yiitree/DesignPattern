package com.atguigu.M10享元模式flyweight;

public abstract class WebSite {

	// 网站的使用者，是外部状态，使用的人员可能不会相同
	public abstract void use(User user);
	
}
