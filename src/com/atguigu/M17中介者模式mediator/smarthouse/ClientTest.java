package com.atguigu.M17中介者模式mediator.smarthouse;

import com.atguigu.M17中介者模式mediator.smarthouse.中介者.ConcreteMediator;
import com.atguigu.M17中介者模式mediator.smarthouse.中介者.Mediator;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.Alarm;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.CoffeeMachine;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.Curtains;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.TV;

public class ClientTest {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		
		//创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		
		//创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		//创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");
		
		//让闹钟发出消息
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
