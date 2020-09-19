package com.atguigu.M17中介者模式mediator.smarthouse.同事类;

import com.atguigu.M17中介者模式mediator.smarthouse.中介者.Mediator;

public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

}
