package com.atguigu.M11����ģʽproxy.cglib;

public class Client {

	public static void main(String[] args) {
		//����Ŀ�����
		TeacherDao target = new TeacherDao();
		//��ȡ��������󣬲��ҽ�Ŀ����󴫵ݸ��������
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		//ִ�д������ķ���������intecept �������Ӷ�ʵ�� ��Ŀ�����ĵ���
		String res = proxyInstance.teach(1);
		System.out.println("res=" + res);
	}

}
