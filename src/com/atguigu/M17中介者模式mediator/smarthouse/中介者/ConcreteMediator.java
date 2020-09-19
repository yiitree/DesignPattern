package com.atguigu.M17�н���ģʽmediator.smarthouse.�н���;

import java.util.HashMap;

import com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����.Alarm;
import com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����.CoffeeMachine;
import com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����.Colleague;
import com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����.Curtains;
import com.atguigu.M17�н���ģʽmediator.smarthouse.ͬ����.TV;

//������н�����
public class ConcreteMediator extends Mediator {
	
	//���ϣ��������е�ͬ�¶���
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	/**
	 * ע�����е�ͬ��
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

	//�����н��ߵĺ��ķ���
	//1. ���ݵõ���Ϣ����ɶ�Ӧ����
	//2. �н��������������Э�����������ͬ�¶����������
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			//����������Ϣ
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			//�����Ȼ���Ϣ
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
		} else if (colleagueMap.get(colleagueName) instanceof TV) {
			//����TV��Ϣ
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			//��������Ϣ
		}
	}

	@Override
	public void SendMessage() {
	}

}
