package com.atguigu.M05������ģʽadapter.D03�ӿ�������interfaceadapter;

public class Client {
	
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				System.out.println("ʹ����m1�ķ���");
			}
		};
		absAdapter.m1();
		
		
		
		Interface4 absAdapter1 = new Interface4() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				System.out.println("ʹ����m1�ķ���");
			}

			@Override
			public void m2() {
			}

			@Override
			public void m3() {
			}

			@Override
			public void m4() {
			}
		};
		absAdapter1.m1();
		
		
	}
}
