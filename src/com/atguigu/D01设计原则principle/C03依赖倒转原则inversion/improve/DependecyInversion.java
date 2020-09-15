package com.atguigu.D01���ԭ��principle.C03������תԭ��inversion.improve;

public class DependecyInversion {
	public static void main(String[] args) {
		//�ͻ�������ı�
		Person person = new Person();
		
		IReceiver receiver = new Email();
		person.receive(receiver);
		
		person.receive(new Email());
		person.receive(new WeiXin());
	}
}
// �е������ڷ�������

class Person {
	//���������ǶԽӿڵ�����
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}

//����ӿ�
// �൱��һ�������
interface IReceiver {
	public String getInfo();
}

// ����
class Email implements IReceiver {
	public String getInfo() {
		return "�����ʼ���Ϣ: hello,world";
	}
}

// ΢��
class WeiXin implements IReceiver {
	public String getInfo() {
		return "΢����Ϣ: hello,ok";
	}
}


