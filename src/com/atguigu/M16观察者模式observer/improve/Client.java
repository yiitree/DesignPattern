package com.atguigu.M16�۲���ģʽobserver.improve;

import com.atguigu.M16�۲���ģʽobserver.improve.���շ�.BaiduSite;
import com.atguigu.M16�۲���ģʽobserver.improve.���շ�.CurrentConditions;
import com.atguigu.M16�۲���ģʽobserver.improve.�ṩ��.WeatherData;

public class Client {

	public static void main(String[] args) {
		//����һ��WeatherData
		WeatherData weatherData = new WeatherData();
		
		//�����۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		
		//ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);
		
		//����
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
		weatherData.removeObserver(currentConditions);
		
		//����
		System.out.println();
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
