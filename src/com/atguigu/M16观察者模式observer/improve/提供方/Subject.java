package com.atguigu.M16观察者模式observer.improve.提供方;

import com.atguigu.M16观察者模式observer.improve.接收方.Observer;

//接口, 让WeatherData 来实现 
public interface Subject {
	
	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 删除观察者
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 遍历所有的观察者，并通知
	 */
	public void notifyObservers();
	
}
