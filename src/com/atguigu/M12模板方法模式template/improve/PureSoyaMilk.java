package com.atguigu.M12ģ�巽��ģʽtemplate.improve;

public class PureSoyaMilk extends SoyaMilk{

	// ����Ҫ��ӵ��ϣ�����һ����ʵ��
	@Override
	void addCondiments() {
		//��ʵ��
	}
	
	// �ѹ��ӷ�������false�����е��÷�����ʱ��Ϳ���������һ����
	@Override
	boolean customerWantCondiments() {
		return false;
	}
 
}
