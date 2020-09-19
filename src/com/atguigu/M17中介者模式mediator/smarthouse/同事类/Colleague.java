package com.atguigu.M17中介者模式mediator.smarthouse.同事类;

import com.atguigu.M17中介者模式mediator.smarthouse.中介者.Mediator;

// 同事抽象类
public abstract class Colleague {
	
	/**
	 * 中介者
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
	 * 调用中介者的消息
	 */
	public abstract void SendMessage(int stateChange);
	
}
