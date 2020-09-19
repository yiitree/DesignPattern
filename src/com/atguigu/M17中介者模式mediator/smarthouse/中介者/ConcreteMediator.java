package com.atguigu.M17中介者模式mediator.smarthouse.中介者;

import java.util.HashMap;

import com.atguigu.M17中介者模式mediator.smarthouse.同事类.Alarm;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.CoffeeMachine;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.Colleague;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.Curtains;
import com.atguigu.M17中介者模式mediator.smarthouse.同事类.TV;

//具体的中介者类
public class ConcreteMediator extends Mediator {
	
	//集合，放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	/**
	 * 注册所有的同事
	 */
	@Override
	public void Register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);
		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}
	}

	//具体中介者的核心方法
	//1. 根据得到消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			//处理闹钟消息
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			//处理咖啡机消息
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
		} else if (colleagueMap.get(colleagueName) instanceof TV) {
			//处理TV消息
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			//处理窗帘消息
		}
	}

	@Override
	public void SendMessage() {
	}

}
