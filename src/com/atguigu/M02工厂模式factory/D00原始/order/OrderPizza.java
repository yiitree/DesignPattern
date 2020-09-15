package com.atguigu.M02����ģʽfactory.D00ԭʼ.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atguigu.M02����ģʽfactory.D00ԭʼ.pizza.*;

public class OrderPizza {

	// ������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // ��������������
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" ϣ������ ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" �������� ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("��������");
			} else {
				break;
			}
			//���pizza ��������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}
	
	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
