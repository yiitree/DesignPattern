package com.atguigu.M12ģ�巽��ģʽtemplate;

//�����࣬��ʾ����
public abstract class SoyaMilk {

	// ģ�巽��, make , ģ�巽����������final , ��������ȥ����.15
	final void make() {
		select(); 
		addCondiments();
		soak();
		beat();
	}
	
	//ѡ����
	void select() {
		System.out.println("��һ����ѡ��õ����ʻƶ�  ");
	}
	
	//��Ӳ�ͬ�����ϣ� ���󷽷�, �������ʵ��
	abstract void addCondiments();
	
	//����
	void soak() {
		System.out.println("�������� �ƶ������Ͽ�ʼ���ݣ� ��Ҫ3Сʱ ");
	}
	 
	void beat() {
		System.out.println("���Ĳ����ƶ������Ϸŵ�������ȥ����  ");
	}
	
}
