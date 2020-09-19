package com.atguigu.M16观察者模式observer.推送形式;

public class Client {
	
	public static void main(String[] args) {
		//创建接入方 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);
		
		weatherData.setData(30, 150, 40);
		weatherData.setData(40, 160, 20);
	}
	
}
