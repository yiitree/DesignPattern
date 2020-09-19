package com.atguigu.M16观察者模式observer.improve.接收方;

//观察者接口，有观察者来实现
public interface Observer {

	public void update(float temperature, float pressure, float humidity);
	
}
