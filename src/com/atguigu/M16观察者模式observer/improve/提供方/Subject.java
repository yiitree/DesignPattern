package com.atguigu.M16�۲���ģʽobserver.improve.�ṩ��;

import com.atguigu.M16�۲���ģʽobserver.improve.���շ�.Observer;

//�ӿ�, ��WeatherData ��ʵ�� 
public interface Subject {
	
	/**
	 * ע��۲���
	 */
	public void registerObserver(Observer o);
	
	/**
	 * ɾ���۲���
	 */
	public void removeObserver(Observer o);
	
	/**
	 * �������еĹ۲��ߣ���֪ͨ
	 */
	public void notifyObservers();
	
}
