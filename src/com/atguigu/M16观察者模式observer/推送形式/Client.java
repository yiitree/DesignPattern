package com.atguigu.M16�۲���ģʽobserver.������ʽ;

public class Client {
	
	public static void main(String[] args) {
		//�������뷽 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//���� WeatherData ���� ���뷽 currentConditions ���ݵ� WeatherData��
		WeatherData weatherData = new WeatherData(currentConditions);
		
		weatherData.setData(30, 150, 40);
		weatherData.setData(40, 160, 20);
	}
	
}
