package com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����;

import com.atguigu.M17�н���ģʽmediator.smarthouse.�н���.Mediator;

// ͬ�³�����
public abstract class Colleague {
	
	/**
	 * �н���
	 */
	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	/**
	 * �����н��ߵ���Ϣ
	 */
	public abstract void SendMessage(int stateChange);
	
}
