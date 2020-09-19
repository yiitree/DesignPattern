package com.atguigu.M16�۲���ģʽobserver.improve.�ṩ��;

import java.util.ArrayList;

import com.atguigu.M16�۲���ģʽobserver.improve.���շ�.Observer;

/**
 * ����վ
 * 
 * ���Ǻ���
 * 1. �������µ����������Ϣ 
 * 2. ���� �۲��߼��ϣ�ʹ��ArrayList����
 * 3. �������и���ʱ���������ĵ���   ArrayList, ֪ͨ���еģ����뷽���Ϳ������µ���Ϣ
 */
public class WeatherData implements Subject {
	
	private float temperatrue;
	private float pressure;
	private float humidity;
	
	// �۲��߼���
	private ArrayList<Observer> observers;
	
	// �����µĹ۲���
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	// ���� ���뷽�� update
	public void dataChange() {
		notifyObservers();
	}

	// �������и���ʱ���͵��� setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//����dataChange�� �����µ���Ϣ ���͸� ���뷽 currentConditions
		dataChange();
	}

	//ע��һ���۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//�Ƴ�һ���۲���
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	//�������еĹ۲��ߣ���֪ͨ
	@Override
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
		}
	}
	
	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

}
