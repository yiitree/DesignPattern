package com.atguigu.M10��Ԫģʽflyweight;

//������վ
public class ConcreteWebSite extends WebSite {

	//����Ĳ��֣��ڲ�״̬
	private String type = ""; //��վ��������ʽ(����)

	//������
	public ConcreteWebSite(String type) {
		this.type = type;
	}

	@Override
	public void use(User user) {
		System.out.println("��վ�ķ�����ʽΪ:" + type + " ��ʹ���� .. ʹ������" + user.getName());
	}
	
}
